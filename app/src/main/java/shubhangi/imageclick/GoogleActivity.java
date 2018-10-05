package shubhangi.imageclick;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
    }

    public void browser1(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.kh"));
        startActivity(browserIntent);



    }
}
