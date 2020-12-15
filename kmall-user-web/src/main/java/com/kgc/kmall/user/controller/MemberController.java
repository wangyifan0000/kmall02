package com.kgc.kmall.user.controller;

import com.kgc.kmall.bean.Member;
import com.kgc.kmall.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wangyifan
 * @create 2020-12-15 19:02
 */
@Controller
public class MemberController {
    @Reference
    MemberService memberService;
    @ResponseBody
    @RequestMapping("/showlist")
    public List<Member> showList(){
        return memberService.getMemberlist();
    }
}
