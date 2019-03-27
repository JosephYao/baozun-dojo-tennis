package com.baozun;

public class StubScoreTextRepo implements ScoreTextRepo {

    @Override
    public String[] findAllText() {
        return new String[]{"AnotherLove"};
    }
}
