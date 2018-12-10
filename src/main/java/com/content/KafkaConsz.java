package com.content;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsz {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String m_topic;
    private String m_name;

    @Autowired
    public KafkaConsz(Propo pp){
        m_name = "fuck";
        m_topic = "f_topic";
        pp.init();
        pp.printProp();
    }

    public void doCosuming(){
        System.out.println(m_name+"Consuming ... "+m_topic);
        logger.debug("debug log fuck m_topic:"+m_topic);
        logger.info(" info fuck log");
        logger.error("errrorr fuck log");
        //pp.printProp();
    }

}
