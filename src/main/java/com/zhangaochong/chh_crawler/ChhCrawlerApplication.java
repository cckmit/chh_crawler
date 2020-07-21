package com.zhangaochong.chh_crawler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class ChhCrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChhCrawlerApplication.class, args);
        log.info("启动成功");
    }

}
