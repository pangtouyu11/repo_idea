package com.lagou.service;

import com.lagou.domain.Test;

import java.util.List;

public interface TestService {

    /*
    对Test表查询所有
     */
    public List<Test> findAllTest();

}
