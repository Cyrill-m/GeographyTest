package by.mastudio.geographytest;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestUniversal extends AppCompatActivity {

    public Button btnAnswer1;
    public Button btnAnswer2;
    public Button btnAnswer3;
    public Button btnAnswer4;
    public TextView tvQuestion1;
    public TextView tvQuestion2;
    public TextView tvAnswer;
    public List<TextView> tvProgress;

    private List<Question> mTestList;
    private int currentQuestion = 0;
    private int rightQuestionCount = 0;
    private int answerTrue;
    private Boolean firstStart;

    private Dialog uiDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_universal);

        // Инициализация элементов UI
        Button btnBack = findViewById(R.id.btnBackToLevels);
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);
        btnAnswer4 = findViewById(R.id.btnAnswer4);
        tvQuestion1 = findViewById(R.id.tvQuestion1);
        tvQuestion2 = findViewById(R.id.tvQuestion2);
        tvAnswer = findViewById(R.id.tvAnswer);
        firstStart = true;

        // Инициализация строки индикации правильных ответов
        tvProgress = new ArrayList<>();
        tvProgress.add((TextView)findViewById(R.id.tv01));
        tvProgress.add((TextView)findViewById(R.id.tv02));
        tvProgress.add((TextView)findViewById(R.id.tv03));
        tvProgress.add((TextView)findViewById(R.id.tv04));
        tvProgress.add((TextView)findViewById(R.id.tv05));
        tvProgress.add((TextView)findViewById(R.id.tv06));
        tvProgress.add((TextView)findViewById(R.id.tv07));
        tvProgress.add((TextView)findViewById(R.id.tv08));
        tvProgress.add((TextView)findViewById(R.id.tv09));
        tvProgress.add((TextView)findViewById(R.id.tv10));
        tvProgress.add((TextView)findViewById(R.id.tv11));
        tvProgress.add((TextView)findViewById(R.id.tv12));
        tvProgress.add((TextView)findViewById(R.id.tv13));
        tvProgress.add((TextView)findViewById(R.id.tv14));
        tvProgress.add((TextView)findViewById(R.id.tv15));
        tvProgress.add((TextView)findViewById(R.id.tv16));
        tvProgress.add((TextView)findViewById(R.id.tv17));
        tvProgress.add((TextView)findViewById(R.id.tv18));
        tvProgress.add((TextView)findViewById(R.id.tv19));
        tvProgress.add((TextView)findViewById(R.id.tv20));

        // Определение варианта теста для загрузки
        Intent intent = getIntent();
        switch (intent.getStringExtra("test")){
            case "capital":
                mTestList = TestCapital.getTestList();
                tvQuestion2.setAllCaps(true);
                break;
            case "map":
                mTestList = TestMap.getTestList();
                tvAnswer.setText(R.string.map_answer);
                tvQuestion1.setText(R.string.map_question);
                btnAnswer1.setTextSize(18);
                btnAnswer2.setTextSize(18);
                btnAnswer3.setTextSize(18);
                btnAnswer4.setTextSize(18);
                break;
            case "climate":
                mTestList = TestClimate.getTestList();
                tvAnswer.setText(R.string.climate_answer);
                tvQuestion1.setText(R.string.climate_question);
                btnAnswer1.setTextSize(18);
                btnAnswer2.setTextSize(18);
                btnAnswer3.setTextSize(18);
                btnAnswer4.setTextSize(18);
                break;
            default:
                mTestList = TestCapital.getTestList();
                break;
        }

        // Диалоговое окно (пользовательское)
        uiDialog = new Dialog(TestUniversal.this);
        uiDialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрываем стандартный заголовок
        uiDialog.setContentView(R.layout.dialog_msg); //Устанавливаем пользовательский вариант окна
        Objects.requireNonNull(uiDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //прозрачный фон вокруг окна
        uiDialog.setCancelable(false); //нельзя закрыть кнопкой BACK
        //uiDialog.show();
        Button uiDialogBtn = uiDialog.findViewById(R.id.dialog_msg_btn);
        uiDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiDialog.dismiss();

                Intent intent = new Intent(TestUniversal.this, TestLevels.class);
                startActivity(intent);
                finish();
            }
        });

        // Диалоговое окно (стандартное)
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(TestUniversal.this);
        adBuilder.setTitle(R.string.msg_title)
                //.setMessage(getString(R.string.msg_text, currentQuestion, rightQuestionCount))
                .setCancelable(false)
                .setNegativeButton(R.string.msg_btn,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();

                                Intent intent = new Intent(TestUniversal.this, TestLevels.class);
                                startActivity(intent);
                                finish();
                            }
                        });

        // Установка вопроса и ответов
        setQuestion();

        // Обработчик нажатия кнопки ответа1
        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTrue == 0){
                    showToast(true);
                    tvProgress.get(currentQuestion).setText(R.string.answer_true);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorGreenTrue));
                    tvProgress.get(currentQuestion).setTextColor(0xE58BC34A);
                    rightQuestionCount++;

                } else {
                    showToast(false);
                    tvProgress.get(currentQuestion).setText(R.string.answer_false);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorRedFalse));
                    tvProgress.get(currentQuestion).setTextColor(0xE5F44336);
                }
                // пауза - 0,5 секунды
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (nextQuestion()){
                    setQuestion();
                    showButtons();
                } else {
                    showFinishMsg();
                }
            }
        });

        // Обработчик нажатия кнопки ответа2
        btnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTrue == 1){
                    showToast(true);
                    tvProgress.get(currentQuestion).setText(R.string.answer_true);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorGreenTrue));
                    tvProgress.get(currentQuestion).setTextColor(0xE58BC34A);
                    rightQuestionCount++;

                } else {
                    showToast(false);
                    tvProgress.get(currentQuestion).setText(R.string.answer_false);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorRedFalse));
                    tvProgress.get(currentQuestion).setTextColor(0xE5F44336);
                }
                // пауза - 0,5 секунды
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (nextQuestion()){
                    setQuestion();
                    showButtons();
                } else {
                    showFinishMsg();
                }
            }
        });

        // Обработчик нажатия кнопки ответа3
        btnAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTrue == 2){
                    showToast(true);
                    tvProgress.get(currentQuestion).setText(R.string.answer_true);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorGreenTrue));
                    tvProgress.get(currentQuestion).setTextColor(0xE58BC34A);
                    rightQuestionCount++;

                } else {
                    showToast(false);
                    tvProgress.get(currentQuestion).setText(R.string.answer_false);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorRedFalse));
                    tvProgress.get(currentQuestion).setTextColor(0xE5F44336);
                }
                // пауза - 0,5 секунды
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (nextQuestion()){
                    setQuestion();
                    showButtons();
                } else {
                    showFinishMsg();
                }
            }
        });

        // Обработчик нажатия кнопки ответа4
        btnAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTrue == 3){
                    showToast(true);
                    tvProgress.get(currentQuestion).setText(R.string.answer_true);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorGreenTrue));
                    tvProgress.get(currentQuestion).setTextColor(0xE58BC34A);
                    rightQuestionCount++;

                } else {
                    showToast(false);
                    tvProgress.get(currentQuestion).setText(R.string.answer_false);
                    //tvProgress.get(currentQuestion).setTextColor(getResources().getColor(R.color.colorRedFalse));
                    tvProgress.get(currentQuestion).setTextColor(0xE5F44336);
                }
                // пауза - 0,5 секунды
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (nextQuestion()){
                    setQuestion();
                    showButtons();
                } else {
                    showFinishMsg();
                }
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFinishMsg();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (firstStart) showButtons();
        firstStart = false;
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        try {
            Intent intent = new Intent(TestUniversal.this, TestLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            //
        }
    }

    public void setQuestion(){
        tvQuestion2.setText(mTestList.get(currentQuestion).mQuestionTextId);
        btnAnswer1.setText(mTestList.get(currentQuestion).mAnswersId[0]);
        btnAnswer2.setText(mTestList.get(currentQuestion).mAnswersId[1]);
        btnAnswer3.setText(mTestList.get(currentQuestion).mAnswersId[2]);
        btnAnswer4.setText(mTestList.get(currentQuestion).mAnswersId[3]);

        btnAnswer1.setVisibility(View.INVISIBLE);
        btnAnswer2.setVisibility(View.INVISIBLE);
        btnAnswer3.setVisibility(View.INVISIBLE);
        btnAnswer4.setVisibility(View.INVISIBLE);

        answerTrue = mTestList.get(currentQuestion).mAnswerTrue;
    }

    public boolean nextQuestion(){
        currentQuestion++;
        return (currentQuestion < 20);
    }

    public void showButtons(){
        ShowButtons showButtons = new ShowButtons();
        showButtons.execute();
    }

    public void showFinishMsg(){
        try {
            //adBuilder.setMessage(getString(R.string.msg_text, currentQuestion, rightQuestionCount));
            //AlertDialog alert = adBuilder.create();
            //alert.show();

            TextView uiDialogTxt = uiDialog.findViewById(R.id.dialog_msg_text);
            uiDialogTxt.setText(getString(R.string.msg_text, currentQuestion, rightQuestionCount));
            uiDialog.show();

        } catch (Exception e){
            //
        }
    }

    @SuppressLint("ShowToast")
    public void showToast(Boolean rightToast){
        Toast toastAnswer;
        if (rightToast){
            toastAnswer = Toast.makeText(getBaseContext(), R.string.toast_true, Toast.LENGTH_SHORT);
        } else {
            toastAnswer = Toast.makeText(getBaseContext(), R.string.toast_false, Toast.LENGTH_SHORT);
        }
        toastAnswer.setGravity(Gravity.TOP, 0, 0);
        toastAnswer.show();
    }


    private class ShowButtons extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try{
                int counter = 0;

                for(int i = 0; i < 4; i++){
                    //getFloor(counter);
                    TimeUnit.MILLISECONDS.sleep(200);
                    publishProgress(counter++);
                }
                //TimeUnit.MILLISECONDS.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values){
            super.onProgressUpdate(values);
            Animation a = AnimationUtils.loadAnimation(TestUniversal.this, R.anim.scale_anim);
            switch (values[0]){
                case 0: btnAnswer1.setVisibility(View.VISIBLE); btnAnswer1.startAnimation(a); break;
                case 1: btnAnswer2.setVisibility(View.VISIBLE); btnAnswer2.startAnimation(a); break;
                case 2: btnAnswer3.setVisibility(View.VISIBLE); btnAnswer3.startAnimation(a); break;
                case 3: btnAnswer4.setVisibility(View.VISIBLE); btnAnswer4.startAnimation(a); break;
                default: break;
            }

        }
    }
}
