package by.mastudio.geographytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestClimate {
    private static TestClimate sTestClimate;
    private List<Question> mQuestionList;

    public static List<Question> getTestList(){
        sTestClimate = new TestClimate();
        List<Question> mTestList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++){
            mTestList.add(sTestClimate.mQuestionList.remove(rnd.nextInt(sTestClimate.mQuestionList.size())));
        }

        return mTestList;
    }


    private TestClimate(){
        mQuestionList = new ArrayList<>();
        Random rnd = new Random();

        mQuestionList.add(new Question(R.string.climate_q01,
                R.string.climate_a01_1, R.string.climate_a01_2, R.string.climate_a01_3, R.string.climate_a01_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q02,
                R.string.climate_a02_1, R.string.climate_a02_2, R.string.climate_a02_3, R.string.climate_a02_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q03,
                R.string.climate_a03_1, R.string.climate_a03_2, R.string.climate_a03_3, R.string.climate_a03_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q04,
                R.string.climate_a04_1, R.string.climate_a04_2, R.string.climate_a04_3, R.string.climate_a04_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q05,
                R.string.climate_a05_1, R.string.climate_a05_2, R.string.climate_a05_3, R.string.climate_a05_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q06,
                R.string.climate_a06_1, R.string.climate_a06_2, R.string.climate_a06_3, R.string.climate_a06_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q07,
                R.string.climate_a07_1, R.string.climate_a07_2, R.string.climate_a07_3, R.string.climate_a07_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q08,
                R.string.climate_a08_1, R.string.climate_a08_2, R.string.climate_a08_3, R.string.climate_a08_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q09,
                R.string.climate_a09_1, R.string.climate_a09_2, R.string.climate_a09_3, R.string.climate_a09_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q10,
                R.string.climate_a10_1, R.string.climate_a10_2, R.string.climate_a10_3, R.string.climate_a10_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q11,
                R.string.climate_a11_1, R.string.climate_a11_2, R.string.climate_a11_3, R.string.climate_a11_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q12,
                R.string.climate_a12_1, R.string.climate_a12_2, R.string.climate_a12_3, R.string.climate_a12_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q13,
                R.string.climate_a13_1, R.string.climate_a13_2, R.string.climate_a13_3, R.string.climate_a13_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q14,
                R.string.climate_a14_1, R.string.climate_a14_2, R.string.climate_a14_3, R.string.climate_a14_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q15,
                R.string.climate_a15_1, R.string.climate_a15_2, R.string.climate_a15_3, R.string.climate_a15_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q16,
                R.string.climate_a16_1, R.string.climate_a16_2, R.string.climate_a16_3, R.string.climate_a16_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q17,
                R.string.climate_a17_1, R.string.climate_a17_2, R.string.climate_a17_3, R.string.climate_a17_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q18,
                R.string.climate_a18_1, R.string.climate_a18_2, R.string.climate_a18_3, R.string.climate_a18_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q19,
                R.string.climate_a19_1, R.string.climate_a19_2, R.string.climate_a19_3, R.string.climate_a19_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q20,
                R.string.climate_a20_1, R.string.climate_a20_2, R.string.climate_a20_3, R.string.climate_a20_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q21,
                R.string.climate_a21_1, R.string.climate_a21_2, R.string.climate_a21_3, R.string.climate_a21_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q22,
                R.string.climate_a22_1, R.string.climate_a22_2, R.string.climate_a22_3, R.string.climate_a22_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q23,
                R.string.climate_a23_1, R.string.climate_a23_2, R.string.climate_a23_3, R.string.climate_a23_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q24,
                R.string.climate_a24_1, R.string.climate_a24_2, R.string.climate_a24_3, R.string.climate_a24_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q25,
                R.string.climate_a25_1, R.string.climate_a25_2, R.string.climate_a25_3, R.string.climate_a25_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q26,
                R.string.climate_a26_1, R.string.climate_a26_2, R.string.climate_a26_3, R.string.climate_a26_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q27,
                R.string.climate_a27_1, R.string.climate_a27_2, R.string.climate_a27_3, R.string.climate_a27_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q28,
                R.string.climate_a28_1, R.string.climate_a28_2, R.string.climate_a28_3, R.string.climate_a28_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.climate_q29,
                R.string.climate_a29_1, R.string.climate_a29_2, R.string.climate_a29_3, R.string.climate_a29_4,
                rnd.nextInt(4)));
    }
}
