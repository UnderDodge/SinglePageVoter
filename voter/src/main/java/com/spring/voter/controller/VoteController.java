package com.spring.voter.controller;


import com.spring.voter.commands.ShellController;
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
    public void voteYes() { shell.yes();
    }

    @RequestMapping(value = "vote/no" , method = RequestMethod.GET)
    public void voteNo() {
        shell.no();
    }

    @RequestMapping(value = "vote/name" , method = RequestMethod.GET)
    public @ResponseBody String voteName() {
        return shell.getName();
    }




}
