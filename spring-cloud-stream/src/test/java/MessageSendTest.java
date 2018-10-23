import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import prv.demo.SinkSender;
import prv.demo.SpringCloudStreamApplication;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author:郭友文
 * @Data:2018/10/22 16:14
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudStreamApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageSendTest {
    @Autowired
    private WebApplicationContext context;
    @Autowired
    private SinkSender sender;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).alwaysExpect(status().isOk()).build();
    }

    @Test
    public void sendTest(){
        sender.output().send(MessageBuilder.withPayload("hello from test").build());
    }
}
