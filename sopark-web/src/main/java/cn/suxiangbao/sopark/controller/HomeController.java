package cn.suxiangbao.sopark.controller;

import cn.suxiangbao.sopark.web.entity.Point;
import cn.suxiangbao.sopark.web.service.GeoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/12/18.
 */
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GeoService geoService;
    @RequestMapping("near_park")
    @ResponseBody
    public List<Point> nearPark(HttpServletRequest request, HttpServletResponse response, Double longitude, Double latitude, Integer distance){
        if (distance == null) {
            distance = 100;
        }
        return geoService.nearPark(longitude,latitude,distance);
    }



}
