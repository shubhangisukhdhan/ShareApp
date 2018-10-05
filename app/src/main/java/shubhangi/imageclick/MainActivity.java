package shubhangi.imageclick;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnCall,btnSms,btnEmail,btnGoogle,btnWhatsapp,btnFacebook;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCall = findViewById(R.id.btnCall);
        btnSms = findViewById(R.id.btnSms);
        btnEmail = findViewById(R.id.btnEmail);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnWhatsapp = findViewById(R.id.btnWhatsapp);
        btnFacebook = findViewById(R.id.btnFacebook);



    }

    public void browser2(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/whatsappphonenumber/?text=urlencodedtext"));
        startActivity(browserIntent);



    }
        public void facebook(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shubhangisukhdhanofficialpage"));
        startActivity(browserIntent);

    }

    public void calling(View view) {
        Intent intent = new Intent(this, CallingActivity.class);
        startActivity(intent);
    }

    public void sms(View view) {

        Intent intent = new Intent(this,SendSmsActivity.class);
        startActivity(intent);
    }
    public void email(View view) {

        Intent intent = new Intent(this,EmailActivity.class);
        startActivity(intent);
    }
    public void google(View view) {

        Intent intent = new Intent(this,GoogleActivity.class);
        startActivity(intent);
    }

}
