package com.example.piyush.geoquiz;

/**
 * Created by Piyush on 18-Feb-16.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsAnswerCheated;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mIsAnswerCheated = false;
    }

    public boolean isAnswerCheated() {
        return mIsAnswerCheated;
    }

    public void setIsAnswerCheated(boolean isAnswerCheated) {
        mIsAnswerCheated = isAnswerCheated;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
