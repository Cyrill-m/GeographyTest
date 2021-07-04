package by.mastudio.geographytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_levels);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TestLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){
                    //
                }
            }
        });

        Button btnTest01 = findViewById(R.id.btnTest01);
        btnTest01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TestLevels.this, TestUniversal.class);
                    intent.putExtra("test", "capital");
                    startActivity(intent);
                    finish();
                } catch (Exception e){
                    //
                }
            }
        });

        Button btnTest02 = findViewById(R.id.btnTest02);
        btnTest02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TestLevels.this, TestUniversal.class);
                    intent.putExtra("test", "map");
                    startActivity(intent);
                    finish();
                } catch (Exception e){
                    //
                }
            }
        });

        Button btnTest03 = findViewById(R.id.btnTest03);
        btnTest03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TestLevels.this, TestUniversal.class);
                    intent.putExtra("test", "climate");
                    startActivity(intent);
                    finish();
                } catch (Exception e){
                    //
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        try {
            Intent intent = new Intent(TestLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            //
        }
    }
}
