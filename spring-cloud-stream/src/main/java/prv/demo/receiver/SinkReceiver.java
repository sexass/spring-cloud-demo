package prv.demo.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import prv.demo.SinkSender;

/**
 * @Author:郭友文
 * @Data:2018/10/19 15:45
 * @Description:
 */
@EnableBinding(value = {Sink.class,SinkSender.class})
public class SinkReceiver {
    private static Logger logger=LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received:"+payload);
    }
}
