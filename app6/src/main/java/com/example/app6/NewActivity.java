package com.example.app6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import kr.co.callinggroup.app6.R;

public class NewActivity extends AppCompatActivity {

    private String TAG = "LifeCycle";

    @Override
    /**
     * Bundle savedInstanceState
     * : 엑티비티의 상태에 따라 저장. 시스템에서 강제로 정지, 또는 일시정지, 중지를 할 수 있다.
     *   중지 상태일 때, 시스템에서 리소스 자원을 확보하기 위해서 강제적으로 해당 엑티비티를 종료 시킬 수 있다.
     *   강제 종료 발생 했을 시 엑티비티가 가지고 있던 정보가 사라짐.
     *   처음부터 다시 실행 할 수 있다. 이런 것을 방지 하기 위해 Bundle savedInstanceState을 가지고 있다.
     *   강제 종료되기전 번들 객체에 해당 정보를 저장. 종료 되어도 이전 상태로 되돌아 올 수 있게 해준다.
     * **/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Log.i(TAG,"onCreate()");
        Toast.makeText(this, "onCreate() 메소드 호출", Toast.LENGTH_SHORT).show();

    }

    /**
     * onCreate() 호출뒤에 호출 되는 메소드
     *
     * **/
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");
        Toast.makeText(this, "onStart() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart()");
        Toast.makeText(this, "onRestart() 메소드 호출", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume() ");
        Toast.makeText(this, "onResume() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");
        Toast.makeText(this, "onPause() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");
        Toast.makeText(this, "onStop() 메소드 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy() ");
        Toast.makeText(this, "onDestroy() 메소드 호출", Toast.LENGTH_SHORT).show();
    }
}
