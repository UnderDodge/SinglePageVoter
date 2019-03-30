package com.spring.voter.commands;

import com.spring.voter.domain.VoterService;
import com.spring.voter.domain.VoterServiceImpl;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellController {

    VoterService voterService = new VoterServiceImpl();

    @ShellMethod("results")
    public void results(){
        voterService.toStringResults();
    }

    @ShellMethod("reset")
    public void reset(){
        voterService.resetVotes();
    }

    @ShellMethod("yes")
    public void yes(){
        voterService.addYes();
    }

    @ShellMethod("no")
    public void no(){
        voterService.addNo();
    }




}
