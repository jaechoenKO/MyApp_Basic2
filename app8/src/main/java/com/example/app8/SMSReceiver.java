package com.example.app8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 리시버는 브로드 캐스트를 상속 받아서 구현
 * **/
public class SMSReceiver extends BroadcastReceiver{

    public SMSReceiver(){

    }

    /**
     * 해당 인텐트 SMS가 오면 Broadcast 호출 되면서 자동으로 실행
     * API23 버전 이하부터는 자동으로 호출 되었지만 API23(마시멜로우) 이상 버전 부터는 호출 되지 않는다.
     * 마시멜로우 버전 부터 실행 할 때 권한 부여 때문에 그렇다. 즉 위험 권한 적용.
     * *권한이란?1)
     * **/
    @Override
    public void onReceive(Context context, Intent intent) {

        // 백그라운드에서 실행 되기 때문에 동작 하는지 모를 수 있다. 동작을 확인하는 로그
        Log.d("SMSReceiver", "onReceiver() 호출");

    }

    /**
     * 1) 앱을 설치 할 때 물어 보는 권한을 일반 권한. (설치 시점에서 물어본다)
     *    앱을 실행 할 때 물어 보는 권한을 위험 권한. (앱을 사용 하는 시점에서 물어본다 즉 실행 권한, 개인정보에 관한 것들이 많다.)
     * **/
}
