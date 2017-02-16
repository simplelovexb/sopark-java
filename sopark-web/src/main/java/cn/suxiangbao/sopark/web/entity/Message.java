package cn.suxiangbao.sopark.web.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/25.
 */
public class Message<K,V> {
    private int status;
    private Map<K,V> data ;

    public Message() {
        data = new HashMap<>();
    }

    public Message(int status) {
        this();
        this.status = status;
    }

    public Message(int status, Map<K, V> data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<K, V> getData() {
        return data;
    }

    public void setData(Map<K, V> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
