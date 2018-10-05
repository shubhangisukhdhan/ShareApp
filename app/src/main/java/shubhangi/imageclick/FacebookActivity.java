package shubhangi.imageclick;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacebookActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
    }


    public void facebook(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("\"https://www.facebook.com/karthikofficialpage\""));
        startActivity(browserIntent);



    }
}


