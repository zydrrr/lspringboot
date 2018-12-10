package com.learn;

import com.content.KafkaConsz;
import com.data.Mongoz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackageClasses ={KafkaConsz.class,Mongoz.class})
public class Lspringt implements CommandLineRunner {

    @Autowired
    private KafkaConsz kc;
    @Autowired
    private Mongoz mz;
    public static void main(String[] args){
        SpringApplication.run(Lspringt.class, args);

    }
    public void run(String... args) {
        System.out.println("running");
        this.kc.doCosuming();
        mz.init();
    }

}
