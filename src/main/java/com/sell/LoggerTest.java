package com.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/******
 *author:hyb
 *date:2019/1/18  23:24
 *description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
        String name = "hyb";
        String password = "123456";
        log.debug("我是debug级别");
        log.error("我是error..........");
        log.info("我是info.................");
        log.info("name: {}, password: {}",name,password);
    }
}

