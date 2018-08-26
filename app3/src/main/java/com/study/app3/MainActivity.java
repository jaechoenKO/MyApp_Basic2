package com.study.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // requestCode 선언
    public static final int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1Clicked(View view) {
        /**
         * context를 MainActivity.this 해도 되고, getApplicationContext(), getBaseContext()로 context정보를 가져 올 수 있다.
         * Intent intent = new Intent(MainActivity.this, secondActivity.class);
         * Intent intent = new Intent(getApplicationContext(), secondActivity.class);
         * Intent intent = new Intent(getBaseContext(), secondActivity.class);
         */
        Intent intent = new Intent(getBaseContext(), secondActivity.class);
        // startActivity(intent); // startActivity는 단순 화면 전화이기에 값을 받아오거나 하지 않는다.
        startActivityForResult(intent, REQUEST_CODE);


    }

    // second Activity에서 돌아올 때 응답을 있을 시 자동으로 호출 되는 메소드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){
            Toast.makeText(getApplicationContext(), "응답이 있음 요청코드 : " + requestCode + ", 결과 코드 : " + REQUEST_CODE, Toast.LENGTH_LONG).show();

            // 응답해준 데이터를 전달 받기 위해서 RESULT_OK일 때 처리해 줄 메소드가 있다.
            if(resultCode == RESULT_OK){
                String id = data.getStringExtra("id");
                Toast.makeText(this, "응답 ID : " + id, Toast.LENGTH_LONG).show();
            }

        }

    }
}
