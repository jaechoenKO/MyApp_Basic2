package kr.co.callinggroup.app7;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * 데몬 서비스 클래스 Service 클래스를 상속 받아야 한다.
 * **/
public class DaemonService extends Service{

    private final String TAG = "DaemonCycle";

    /**
     * 데몬 서비스를 실행하면 onCreate() 호출이 된다.
     * 데몬 서비스가 실행 할 때 최초 1번 호출 된다.
     * **/
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate()");
        Toast.makeText(this, "onCreate() 메소드 호출", Toast.LENGTH_SHORT).show();

    }


    /**
     * onCreate() 호출이 된 후 시작 된다.
     * 자물쇠를 예로 들면 추가 될 때마다 감시하는 앱 목록을 갱신.
     * 즉 데몬 서비스에서 변경 사항이 있을 시 마다 그 때 그 때 마다 다시 한번 호출.
     * **/
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //return super.onStartCommand(intent, flags, startId);

        Log.i(TAG, "onStartCommand()");
        Toast.makeText(this, "onStartCommand() 메소드 호출", Toast.LENGTH_SHORT).show();

        /**
         * 데몬 서비스가 함수를 통해서 받은 정보를 가지고 동작해서 반환하는 값에 따라
         * START_STICKY, START_NOT_STICKY, START_REDELIVER_INTENT가 있다.
         * START_STICKY : 시스템에 의해서, 서비스가 강제 종료 될 때. 다시 재시작 시킨다. NUll 값으로 초기화 해서 재시작.
         *                즉 Intent 안에 있던 내용들이 모드 초기화 되어 onStartCommand()를 시작한다.
         * START_NOT_STICKY : 강제 종료 된 서비스가 재시작 하지 않는다.
         * START_REDELIVER_INTENT : START_STICKY와 비슷하다. 다시 서비스 할 때 Intent 값을 그대로 유지.
         * **/
        return START_STICKY;
    }

    /***
     * Nullness annotations는 2개의 Annotations이 있다.
     * @NonNull : null을 허용하지 않을 경우
     * @Nullable : null을 허용할 경우
     ***/
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        Toast.makeText(this, "onDestory() 메소드 호출", Toast.LENGTH_SHORT).show();

    }
}
