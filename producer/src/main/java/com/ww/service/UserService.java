package com.ww.service;

import com.ww.model.UserDO;

import java.util.List;

/**
 * @author ww
 * @date 2020-02-15
 */
//@FeignClient(value="zuul-server")
public interface UserService {

    List<UserDO> getList();

//    @RequestMapping(value = "getFeignList",method = RequestMethod.GET)
//@RequestMapping(value="/api/producer/getFeignList",method = RequestMethod.GET)
UserDO getFeignList();

    void getcc(String... cc);
}
