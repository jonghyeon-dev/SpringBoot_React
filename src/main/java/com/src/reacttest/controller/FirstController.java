package com.src.reacttest.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.reacttest.model.UserVO;
import com.src.reacttest.model.common.ResponseData;
import com.src.reacttest.repository.UserRepository;

@RestController
public class FirstController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public String test(){
        return "Fisrt Controller";
    }

    @GetMapping("/showMe")
    public List<String> showMe(){
        return Arrays.asList("첫번째 인사","두번째 인사");
    }

    @GetMapping("/getData")
    public ResponseData getData (){
        ResponseData js = new ResponseData();
        HashMap<String, Object> resMap = new HashMap<>();
        resMap.put("id","1");
        resMap.put("name","kim");
        js.setData(resMap);
        js.setSucceed(true);
        js.setMessage("메시지");
        return js;
    }

    @GetMapping("/getUser")
    public UserVO getUser(){
        UserVO userVO = userRepository.findByUserId("admin");
        userVO.setSeq(null);
        userVO.setUserGrant("");
        userVO.setUserPwd("");
        return userVO;
    }
}
