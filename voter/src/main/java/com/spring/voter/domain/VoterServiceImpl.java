package com.spring.voter.domain;

public class VoterServiceImpl implements VoterService{

        Integer voteYes;
        Integer voteNo;

        public VoterServiceImpl(){
            this.voteYes = 0;
            this.voteNo = 0;
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


}
