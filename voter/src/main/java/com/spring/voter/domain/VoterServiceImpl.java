package com.spring.voter.domain;

public class VoterServiceImpl implements VoterService{

        Integer voteYes;
        Integer voteNo;

        String name = "";

        public VoterServiceImpl(String name){
            this.voteYes = 0;
            this.voteNo = 0;
            this.name = name;
        }

        public void toStringResults(){
            System.out.println("Yes: " + voteYes + "   |   No: "+voteNo);
            System.out.println("Total votes: " +(voteYes+voteNo));
        }


        public void resetVotes(){
            System.out.println("Reseting votes");
            voteYes=0;
            voteNo=0;
        }

    public void addYes(){
        voteYes++;
    }

    public void addNo(){
        voteNo++;
    }

    public Integer getVoteYes() {
        return voteYes;
    }

    public Integer getVoteNo() {
        return voteNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
