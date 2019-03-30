package com.spring.voter.domain;

public interface VoterService {

    void toStringResults();
    void resetVotes();

    void addYes();
    void addNo();

}
