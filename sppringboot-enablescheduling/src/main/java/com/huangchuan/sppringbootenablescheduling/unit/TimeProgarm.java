package com.huangchuan.sppringbootenablescheduling.unit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-18:35
 */
@Component
public class TimeProgarm {

    @Scheduled(cron="30 45 15 08 07 *")
    public void myTask(){
        System.out.println("程序执行了");
    }
}
