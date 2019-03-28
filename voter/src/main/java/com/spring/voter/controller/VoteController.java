package com.spring.voter.controller;


import com.spring.voter.shell.ShellController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VoteController {

    @Autowired
    ShellController shell;

    @RequestMapping(value = "vote/yes" , method = RequestMethod.GET)
    public void voteYes() {
        shell.addYes();
    }

    @RequestMapping(value = "vote/no" , method = RequestMethod.GET)
    public void voteNo() {
        shell.addNo();
    }


}
