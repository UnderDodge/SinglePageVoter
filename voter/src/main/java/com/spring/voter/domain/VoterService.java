package com.spring.voter.domain;

public interface VoterService {

    void toStringResults();
    void resetVotes();

    void addYes();
    void addNo();

    String getName();
    void setName(String name);

    public Integer getVoteYes();
    public Integer getVoteNo();



}
