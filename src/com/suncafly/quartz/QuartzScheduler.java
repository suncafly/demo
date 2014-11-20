package com.suncafly.quartz;

import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzScheduler {

	public void startScheduler() throws Exception {
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		JobDetail jobDetail = new JobDetail("anotherJob", "SimpleGroup",
				QuartzTest.class);
//		Trigger trigger = TriggerUtils.makeSecondlyTrigger();
		Trigger trigger = new CronTrigger("AnotherCronTrigger",null,"0/2 * * * * ?");//每两秒运行一次
		trigger.setName("simpleTrgger");
		trigger.setStartTime(new Date());
		scheduler.scheduleJob(jobDetail, trigger);
		scheduler.start();
	}
	
	public static void main(String[] args) throws Exception {
		new QuartzScheduler().startScheduler();
	}
	
}
