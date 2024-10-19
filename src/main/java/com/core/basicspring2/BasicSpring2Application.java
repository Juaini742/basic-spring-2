package com.core.basicspring2;

import com.core.basicspring2.bean.AppConfigBean;
import com.core.basicspring2.bean.UserControllerBean;
import com.core.basicspring2.singleton.UserControllerSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


/**
 * 00:23:47 - Singleton
 * 00:28:10 - Bean
 * 00:53:20 - Dependency Injection
 * 01:07:51 - Circular Dependencies
 * 02:08:52 - Scan
 * 02:14:19 - Annotation
 * 03:00:28 - Inheritance
 * 03:05:07 - Bean Factory
 * 03:12:22 - Bean Post Processor
 * 03:23:58 - Ordered
 * 03:30:24 - Aware
 * 03:37:28 - Bean Factory Post Processor
 * 03:44:15 - Event Listener
 * 03:58:13 - Event Listener Annotation
 * 04:04:00 - Spring Boot Application
 * 04:11:49 - Startup Failure
 * 04:16:34 - Banner
 * 04:19:11 - Customizing Spring Application
 * 04:22:59 - Spring Application Event
 * 04:27:52 - Command Line Runner
 * 04:34:30 - Application Runner
 * 04:39:49 - Spring Boot Plugin
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.core.basicspring2.inheritance"}) // change name after basicspring2.nameFolder to run the app
public class BasicSpring2Application {

//    @Autowired
//    private UserControllerSingleton userControllerSingleton;

    public static void main(String[] args) {
        SpringApplication.run(BasicSpring2Application.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//    }
}
