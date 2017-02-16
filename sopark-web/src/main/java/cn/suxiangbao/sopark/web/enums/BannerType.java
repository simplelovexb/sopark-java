package cn.suxiangbao.sopark.web.enums;

/**
 * Created by Administrator on 2016/12/18.
 */
public enum BannerType {
    PHONE_PAD(0),TV_BOX(1),ROUTE_INTELLIGENT(2),OTHER(9);

    int value;

    private BannerType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BannerType findByValue(int value) {
        BannerType type;
        switch (value) {
            case 0:
                type =  PHONE_PAD;
                break;
            case 1:
                type = TV_BOX;
                break;
            case 2:
                type = ROUTE_INTELLIGENT;
                break;
            default:
                type = OTHER;
                break;
        }
        return type;
    }
}
