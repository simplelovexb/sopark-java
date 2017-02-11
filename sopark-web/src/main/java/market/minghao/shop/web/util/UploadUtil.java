package market.minghao.shop.web.util;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

public class UploadUtil {
	
	public static String  upload(HttpServletRequest request,String folderPath,String fileName) throws IllegalStateException, IOException{
		//创建一个通用的多部分解析器  
		
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求
        if(multipartResolver.isMultipart(request)){
            //转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();  
            if(iter.hasNext()){  
                //记录上传过程起始时的时间，用来计算上传时间  
                MultipartFile file = multiRequest.getFile(iter.next());  
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println(myFileName);  
                        //重命名上传后的文件名
                        //定义上传路径  
                        String path = folderPath + fileName;
                        File localFile = new File(path);  
                        file.transferTo(localFile);  
                    }  
                }  
             
            }  
            return fileName;
        }  
        return null; 
	}
}
