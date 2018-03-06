package io.github.kagol.geoquiz;

/**
 * Created by Administrator on 2018/3/4.
 */

public class Question {
    private int mTextId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
