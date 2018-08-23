package com.study.myapp_basic2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 버튼 액션 메소드
    public void btn1(View view) {

        addLayout();

    }

    // activity_main.xml에 추가하는 메소드
    private void addLayout(){

        LinearLayout add_layout = findViewById(R.id.addLayout);

        // 인플레이션. 서비스 단에서 제공.
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // inflate 메소드 1. 메모리에 올리고자 하는 것을 올린다. 2. 부모 컨테이너
        inflater.inflate(R.layout.add, add_layout, true);

        // add.xml에 버튼 객체 참조
        Button btnTest = findViewById(R.id.btnTest);
        final CheckBox agree = findViewById(R.id.agree);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 체크가 되어 있다면
                if(agree.isChecked()){
                    agree.setChecked(false);
                }else{
                    agree.setChecked(true);
                }
            }
        });

    }
}
