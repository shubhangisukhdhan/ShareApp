package shubhangi.imageclick;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CallingActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private EditText edtPhone;
    private ImageView image_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);


        edtPhone = findViewById(R.id.edtPhone);
        image_call = findViewById(R.id.image_call);


        image_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makePhoneCall();
            }
        });

    }
    private void makePhoneCall(){



        String number = edtPhone.getText().toString();
        if (number.trim().length()>0){

            if (ContextCompat.checkSelfPermission(CallingActivity.this,
                    Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){


                ActivityCompat.requestPermissions(CallingActivity.this,new String[]{

                        Manifest.permission.CALL_PHONE},REQUEST_CALL);

            }else {

                String dial = "tel:"+number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
        else {
            Toast.makeText(CallingActivity.this,"Enter Phone number",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode==REQUEST_CALL){


            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                makePhoneCall();
            }else {

                Toast.makeText(this,"Permission Dinied",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

