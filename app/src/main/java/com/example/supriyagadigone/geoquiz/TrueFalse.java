package com.example.supriyagadigone.geoquiz;

/**
 * Created by supriyagadigone on 2017-01-21.
 */
public class TrueFalse {
    private int mQuestion; //hold the resource ID of a string for the question
    private boolean mTrueQuestion;//will indicate if a question is true or false

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}

