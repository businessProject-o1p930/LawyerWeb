package com.hyg.service;


import com.hyg.mapper.AgencyMapper;
import com.hyg.pojo.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agencyService")
public class AgencyServiceImpl extends AgencyService{
    @Autowired
    @Qualifier("deleteMapper")
    private AgencyMapper agencyMapper;

    @Override
    public List<Agency> findTopAgency(){
        return agencyMapper.findTopAgency();
    }
}