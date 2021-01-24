package com.lrm.po;

import javax.persistence.*;

/*网站信息*/
@Entity
@Table(name = "t_website_info")
public class WebsiteInfo {

    @Id
    private String views;


    /**
     * 网站总浏览量
     */
    private Long value;

    public WebsiteInfo() {
    }


    @Override
    public String toString() {
        return "WebsiteInfo{" +
                "views='" + views + '\'' +
                ", value=" + value +
                '}';
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
