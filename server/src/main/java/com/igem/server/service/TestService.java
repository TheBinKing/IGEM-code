package com.igem.server.service;


import com.igem.server.domain.Test;
import com.igem.server.domain.TestExample;
import com.igem.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        TestExample testExample = new TestExample();
//        testExample.createCriteria().andIdEqualTo("1");
//        testExample.setOrderByClause("id asc");
        return testMapper.selectByExample(null);
    }

}
