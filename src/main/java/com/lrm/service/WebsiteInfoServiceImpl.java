package com.lrm.service;

import com.lrm.dao.WebsiteInfoRepository;
import com.lrm.po.WebsiteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteInfoServiceImpl implements WebsiteInfoService {

    @Autowired
    private WebsiteInfoRepository websiteInfoRepository;

    @Override
    public Long addOneForViews() {
        /*获取当前浏览量*/
        WebsiteInfo views = websiteInfoRepository.findByViews("views");

        /*递增*/
        views.setValue(views.getValue()+1);
        websiteInfoRepository.save(views);

        /*返回*/
        return views.getValue();
    }
}
