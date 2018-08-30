package com.example.app8;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * MySMSReceiver 이용.
 * **/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 권한 부여 여부를 확인. 한번 확인 받으면 계속 사용.
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);

        // 권한 부여 되었을 시, 권한이 있는지 체크하는 코드
        if(permissionCheck == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "SMS 수신 권한 부여 됨", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "SMS 수신 권한 없음", Toast.LENGTH_LONG).show();

            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.RECEIVE_SMS)){
                Toast.makeText(this, "SMS 권한 설명 요구 됨", Toast.LENGTH_LONG).show();
            }else{ // 권한이 없을 경우 대화 상자를 띄어 사용자에게 권한을 부여 해 줄 수 있게 하는 부분
                // 대화 상자를 띄우는 코드. 사용자에게 물어봄
                ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.RECEIVE_SMS}, 1);
            }
        }

    }

    // 권한 수락이나 혹은 거부 되었을 때.
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 1 : {
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "SMS 권한 승인 됨", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "SMS 권한 거부", Toast.LENGTH_LONG).show();
                }
            }
            return;
        }

    }
}
