package com.ww.controller.autowired;

import com.ww.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ww on 2020/3/16.
 */
@RestController
@RequestMapping("/ribbon")
public class AutowireTest {

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext();
//    }
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public UserDO getTest(){
        UserDO forObject = restTemplate.getForObject("http://producer-server/provider/getList", UserDO.class);
    return forObject;
    }
}
