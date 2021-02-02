package com.lrm.service;

public interface WebsiteInfoService {

    /**
     * 网站总访问量加1
     * @return 累加之后的访问量
     */
    public Long addOneForViews();

    /**
     * 获取关于我页面的图片地址
     * @return
     */
    public String getAboutMeImageUrl();

    public String updateAboutMeImageUrl(String aboutMeImageUrl);

}
