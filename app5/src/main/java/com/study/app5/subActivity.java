package com.study.app5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // putExtra로 보낸 값을 가져오기
        Intent intent = getIntent();

        // intent가 null이 아니라면
        if(intent != null){
            // 보낸 키값으로 받아온다.
            String name = intent.getStringExtra("name");
            //  int에선 파라미터가 2개 들어간다. int 값이 없을 때 0으로 초기화.
            int age = intent.getIntExtra("age", 0);

            // 객체를 받아 올때는 getSerializableExtra 메소드 사용
            Person person1 = (Person) intent.getSerializableExtra("person");

//            Toast.makeText(this, "name : " + name + " " + "age" + age, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "person : " + person1.getName() + ", " + person1.getAge(), Toast.LENGTH_LONG).show();

        }

    }
}
