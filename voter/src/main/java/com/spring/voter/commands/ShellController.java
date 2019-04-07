package com.spring.voter.commands;

import com.spring.voter.datasource.entity.Voting;
import com.spring.voter.datasource.repository.VotingRepository;
import com.spring.voter.domain.VoterService;
import com.spring.voter.domain.VoterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.validation.constraints.Size;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ShellComponent
public class ShellController {

    @Autowired
    VotingRepository votingRepository;

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    VoterService voterService = null;

    @ShellMethod("newVote")
    public void newVote(@Size(min = 3) String name){
        voterService = new VoterServiceImpl(name);
    }

    @ShellMethod("endVote")
    public void endVote(){
        votingRepository.save(new Voting(voterService.getVoteYes(),voterService.getVoteNo(),voterService.getName(), new Date()));
    }

    @ShellMethod("getName")
    public String getName(){
        if(voterService!=null){
            return voterService.getName();
        }else{
            return "There is no voting";
        }
    }

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
