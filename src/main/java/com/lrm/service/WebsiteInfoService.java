package com.lrm.service;

public interface WebsiteInfoService {

    /**
     * 网站总访问量加1
     * @return 累加之后的访问量
     */
    public Long addOneForViews();

}
