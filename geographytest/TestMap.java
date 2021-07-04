package by.mastudio.geographytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestMap {
    private static TestMap sTestMap;
    private List<Question> mQuestionList;

    public static List<Question> getTestList(){
        sTestMap = new TestMap();
        List<Question> mTestList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++){
            mTestList.add(sTestMap.mQuestionList.remove(rnd.nextInt(sTestMap.mQuestionList.size())));
        }

        return mTestList;
    }


    private TestMap(){
        mQuestionList = new ArrayList<>();
        Random rnd = new Random();

        mQuestionList.add(new Question(R.string.map_q01,
                R.string.map_a01_1, R.string.map_a01_2, R.string.map_a01_3, R.string.map_a01_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q02,
                R.string.map_a02_1, R.string.map_a02_2, R.string.map_a02_3, R.string.map_a02_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q03,
                R.string.map_a03_1, R.string.map_a03_2, R.string.map_a03_3, R.string.map_a03_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q04,
                R.string.map_a04_1, R.string.map_a04_2, R.string.map_a04_3, R.string.map_a04_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q05,
                R.string.map_a05_1, R.string.map_a05_2, R.string.map_a05_3, R.string.map_a05_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q06,
                R.string.map_a06_1, R.string.map_a06_2, R.string.map_a06_3, R.string.map_a06_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q07,
                R.string.map_a07_1, R.string.map_a07_2, R.string.map_a07_3, R.string.map_a07_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q08,
                R.string.map_a08_1, R.string.map_a08_2, R.string.map_a08_3, R.string.map_a08_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q09,
                R.string.map_a09_1, R.string.map_a09_2, R.string.map_a09_3, R.string.map_a09_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q10,
                R.string.map_a10_1, R.string.map_a10_2, R.string.map_a10_3, R.string.map_a10_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q11,
                R.string.map_a11_1, R.string.map_a11_2, R.string.map_a11_3, R.string.map_a11_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q12,
                R.string.map_a12_1, R.string.map_a12_2, R.string.map_a12_3, R.string.map_a12_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q13,
                R.string.map_a13_1, R.string.map_a13_2, R.string.map_a13_3, R.string.map_a13_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q14,
                R.string.map_a14_1, R.string.map_a14_2, R.string.map_a14_3, R.string.map_a14_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q15,
                R.string.map_a15_1, R.string.map_a15_2, R.string.map_a15_3, R.string.map_a15_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q16,
                R.string.map_a16_1, R.string.map_a16_2, R.string.map_a16_3, R.string.map_a16_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q17,
                R.string.map_a17_1, R.string.map_a17_2, R.string.map_a17_3, R.string.map_a17_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q18,
                R.string.map_a18_1, R.string.map_a18_2, R.string.map_a18_3, R.string.map_a18_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q19,
                R.string.map_a19_1, R.string.map_a19_2, R.string.map_a19_3, R.string.map_a19_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q20,
                R.string.map_a20_1, R.string.map_a20_2, R.string.map_a20_3, R.string.map_a20_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q21,
                R.string.map_a21_1, R.string.map_a21_2, R.string.map_a21_3, R.string.map_a21_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q22,
                R.string.map_a22_1, R.string.map_a22_2, R.string.map_a22_3, R.string.map_a22_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q23,
                R.string.map_a23_1, R.string.map_a23_2, R.string.map_a23_3, R.string.map_a23_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q24,
                R.string.map_a24_1, R.string.map_a24_2, R.string.map_a24_3, R.string.map_a24_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q25,
                R.string.map_a25_1, R.string.map_a25_2, R.string.map_a25_3, R.string.map_a25_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q26,
                R.string.map_a26_1, R.string.map_a26_2, R.string.map_a26_3, R.string.map_a26_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q27,
                R.string.map_a27_1, R.string.map_a27_2, R.string.map_a27_3, R.string.map_a27_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q28,
                R.string.map_a28_1, R.string.map_a28_2, R.string.map_a28_3, R.string.map_a28_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q29,
                R.string.map_a29_1, R.string.map_a29_2, R.string.map_a29_3, R.string.map_a29_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q30,
                R.string.map_a30_1, R.string.map_a30_2, R.string.map_a30_3, R.string.map_a30_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q31,
                R.string.map_a31_1, R.string.map_a31_2, R.string.map_a31_3, R.string.map_a31_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q32,
                R.string.map_a32_1, R.string.map_a32_2, R.string.map_a32_3, R.string.map_a32_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q33,
                R.string.map_a33_1, R.string.map_a33_2, R.string.map_a33_3, R.string.map_a33_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q34,
                R.string.map_a34_1, R.string.map_a34_2, R.string.map_a34_3, R.string.map_a34_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q35,
                R.string.map_a35_1, R.string.map_a35_2, R.string.map_a35_3, R.string.map_a35_4,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.map_q36,
                R.string.map_a36_1, R.string.map_a36_2, R.string.map_a36_3, R.string.map_a36_4,
                rnd.nextInt(4)));
    }
}
