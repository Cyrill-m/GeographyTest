package by.mastudio.geographytest;

public class Question {
    public int mQuestionTextId;
    public int mAnswerTrue;
    public int[] mAnswersId;

    public Question(int questionTextId, int answerId1, int answerId2, int answerId3, int answerId4){
        mQuestionTextId = questionTextId;
        mAnswerTrue = 0;
        mAnswersId = new int[] {answerId1, answerId2, answerId3, answerId4};
    }

    public Question(int questionTextId, int answerId1, int answerId2, int answerId3, int answerId4, int code){

        mQuestionTextId = questionTextId;

        switch (code){
            case 1:
                mAnswerTrue = 1;
                mAnswersId = new int[] {answerId4, answerId1, answerId2, answerId3};
                break;
            case 2:
                mAnswerTrue = 2;
                mAnswersId = new int[] {answerId3, answerId4, answerId1, answerId2};
                break;
            case 3:
                mAnswerTrue = 3;
                mAnswersId = new int[] {answerId2, answerId3, answerId4, answerId1};
                break;
            default:
                mAnswerTrue = 0;
                mAnswersId = new int[] {answerId1, answerId2, answerId3, answerId4};
        }
    }
}
