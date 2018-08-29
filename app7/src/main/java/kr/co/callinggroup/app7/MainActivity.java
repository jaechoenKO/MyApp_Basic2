package kr.co.callinggroup.app7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 앱의 결과 확인은
 * 애뮬레이터 dev tool에서
 *
 * **/


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.startBtn);
        startButton.setOnClickListener(this);

        Button stopButton = findViewById(R.id.stopBtn);
        stopButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        /**
         * v.getId()는 10진 수 값을 가지는데 R 파일에서는 16진 수 값을 가진다.
         * 변환 해보면 값이 같다.
         * **/
        Log.i("id", String.valueOf(v.getId()));
        switch (v.getId()){

            // 데몬 서비스를 시작 할 때.
            case R.id.startBtn:
                intent = new Intent(this, DaemonService.class); // 명시적 선언
                startService(intent);
                break;

            // 데몬 서비스를 종료 할 때.
            case R.id.stopBtn:
                intent = new Intent(this, DaemonService.class);
                stopService(intent);
                break;

            default: break;

        }

    }
}
