package cn.cunzhao.api.controller;

import cn.cunzhao.api.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class operateController {
    @GetMapping("/get")
    public Result test(){
        return Result.error("2");
    }
}
