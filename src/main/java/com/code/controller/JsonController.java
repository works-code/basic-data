package com.code.controller;

import com.code.service.BizService;
import com.code.vo.Code;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class JsonController {

    @Autowired
    private BizService bizService;

    @Value("${test.data}")
    private String text;

    @RequestMapping("/color/{code}")
    public Object getColorByCode(@PathVariable String code){
        log.error("### => {}", text);
        return bizService.getColorByCode(new Code.request(){{
            setCode(code);
        }});
    }

    @RequestMapping("/color")
    public Object getColor(){
        return bizService.getColor();
    }

    @RequestMapping("/device/{code}")
    public Object getDeviceByCode(@PathVariable String code){
        return bizService.getDeviceByCode(new Code.request(){{
            setCode(code);
        }});
    }

    @RequestMapping("/device")
    public Object getDevice(){
        return bizService.getDevice();
    }

}
