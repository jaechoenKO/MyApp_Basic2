package com.study.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        prevButton = findViewById(R.id.prevBtn);

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent resIntent = new Intent();
                /*
                * Intent로 값을 전달 하기 위한 putExtra 메소드
                * 첫번째 파라미터로 name, 두번째 파라미터로 value가 들어감
                * (name, value)
                * */
                resIntent.putExtra("id", "test");

                /*
                * 응답을 하기 위한 메소드
                * onRestlutActivity와 비슷한 기능의 메소드 setResult
                * RESULT_OK 성공, intent 값을 넣는다.
                * */
                setResult(RESULT_OK, resIntent);
                // 현재 화면을 없앤다. 소멸 할때는 onDestory()메소드를 사용하기도 한다.
                finish();
            }
        });

    }
}
