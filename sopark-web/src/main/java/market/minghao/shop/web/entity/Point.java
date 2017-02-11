package market.minghao.shop.web.entity;

/**
 * Created by Administrator on 2017/1/2.
 */
public class Point {
    private double longitude;
    private double latitude;

    public Point() {
    }

    public Point(double longitude, double latitude) {

        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Point{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
