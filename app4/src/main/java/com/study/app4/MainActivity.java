package com.study.app4;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 101;

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTxt);
        textView = findViewById(R.id.txt1);

    }

    public void clickBtn1(View v){

        // editText의 값을 문자열로 가져옴
        String telNumber = editText.getText().toString();

        /** 인텐트 생성 방법 **/

        /*
        *   암시적 인텐트. ACTION_DIAL 전화 관련
        *   명시적으로 클래스를 지정 한 것이 아니다.
        *   안드로이드 시스템에서 이와 관련된 다른 어플리케이션을 알아서 대상자를 지정한다.
        */
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telNumber)); // 해당 시스템에서 참조한다.
        startActivity(intent);

        // 명시적 인텐트. SecondActivity라는 클래스를 지정.
//        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivityForResult(intent, REQUEST_CODE);

        // 컴포넌트를 이용한 방법
//        Intent intent = new Intent();
//        ComponentName name = new ComponentName("com.study.app4", "com.study.app4.SecondActivity");  // 패키지 명과, 패키지명.액티비티 클래스를 문자열로 적어준다.
//        intent.setComponent(name);
//        startActivityForResult(intent, REQUEST_CODE);
    }

}
