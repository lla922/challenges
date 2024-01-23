package com.zenith.exampleservice.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;


import java.util.Date;




@Service
public class Aservice {


    //Scheduled annotation ornegi
    //-----------------------------------------------------
    @Scheduled(cron = "${cron-string}" ,scheduler = "korkuncScheduler")
    public void exampleScheduledMethod(){
        Logger logger = LoggerFactory.getLogger("Aservice.class logger");
        logger.info("hello");
    }

    @Bean
    public ThreadPoolTaskScheduler komikScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("komikScheduler");
        return scheduler;
    }

    @Bean
    public ThreadPoolTaskScheduler korkuncScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("korkuncScheduler");
        return scheduler;
    }


}


