package com.study.app5;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickBtn1(View view) {

        // 컴포넌트를 이용
        Intent intent = new Intent();
        ComponentName name = new ComponentName("com.study.app5", "com.study.app5.subActivity");
        intent.setComponent(name); // 설정한 컴포넌트 세팅
        // 부가 데이터 보냄
        intent.putExtra("name", "떡볶이");
        intent.putExtra("age", 31);

        // 객체 데이터 보내기, 객체를 보낼 때는 해당 객체에서 인터페이스로 Serializable를 사용
        Person person1 = new Person("스테이크", 300);
        intent.putExtra("person", person1);

        startActivity(intent);

    }
}
