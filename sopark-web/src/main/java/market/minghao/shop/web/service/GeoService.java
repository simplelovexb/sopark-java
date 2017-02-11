package market.minghao.shop.web.service;

import market.minghao.shop.web.entity.Point;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/2.
 */
@Service
public class GeoService {

    public List<Point> nearPark(Double longitude, Double latitude, Integer distance) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(longitude+0.005,latitude+0.001));
        list.add(new Point(longitude+0.005,latitude-0.001));
        list.add(new Point(longitude-0.005,latitude-0.001));
        list.add(new Point(longitude-0.005,latitude+0.001));
        return list;
    }

}
