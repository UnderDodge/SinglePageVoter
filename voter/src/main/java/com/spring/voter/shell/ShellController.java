package com.spring.voter.shell;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellController {

    public Integer voteYes = 0;
    public Integer voteNo = 0;

    @ShellMethod("results")
    public void results(){
        System.out.println("Yes: " + voteYes + "   |   No: "+voteNo);
        System.out.println("Total votes: " +(voteYes+voteNo));
    }


    @ShellMethod("reset")
    public void reset(){
        System.out.println("Reseting votes");
        voteYes=0;
        voteNo=0;
    }

    @ShellMethod("yes")
    public void yes(){
        addYes();
    }

    @ShellMethod("no")
    public void no(){
        addNo();
    }


    public void addYes(){
        voteYes++;
    }

    public void addNo(){
        voteNo++;
    }


}
