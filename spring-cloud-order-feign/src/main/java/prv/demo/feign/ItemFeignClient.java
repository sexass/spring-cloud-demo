package prv.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author:郭友文
 * @Data:2018/6/5 10:59
 * @Description:
 */

@FeignClient("item-service")
public interface ItemFeignClient {

    @RequestMapping(value = "/item/{id}",method = RequestMethod.GET)
    String findById(@PathVariable("id") Long id);
}