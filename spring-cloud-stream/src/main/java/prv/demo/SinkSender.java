package prv.demo;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;


/**
 * @Author:郭友文
 * @Data:2018/10/22 15:04
 * @Description: 消息发送
 */

public interface SinkSender {

    @Output(value = Sink.INPUT)
    MessageChannel output();

}
