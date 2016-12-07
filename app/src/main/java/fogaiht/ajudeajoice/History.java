package fogaiht.ajudeajoice;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Fogaiht on 01/10/2016.
 */

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton iniciar = (ImageButton) findViewById(R.id.help2);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Help.class));
            }
        });

        ImageButton iniciarv = (ImageButton) findViewById(R.id.video);
        iniciarv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), VideoGalery.class));
            }
        });

        ImageButton iniciarfb = (ImageButton) findViewById(R.id.fb);
        iniciarfb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), VideoGalery.class));

                try {
                    //try to open page in facebook native app.
                    String uri = "fb://page/" + "154872428254593";
                    Intent intenti = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(intenti);
                } catch (ActivityNotFoundException ex) {
                    //facebook native app isn't available, use browser.
                    String uri = "http://m.facebook.com/" + "ajudeajoice";  //Normal URL
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(i);
                }

            }
        });


//
//        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
//        if (launchIntent != null) {
//            startActivity(launchIntent);//null pointer check in case package name was not found
//        }

    }

//    protected void launchApp(String packageName) {
//        Intent mIntent = getPackageManager().getLaunchIntentForPackage(
//                packageName);
//        if (mIntent != null) {
//            try {
//                startActivity(mIntent);
//            } catch (ActivityNotFoundException err) {
//                Toast t = Toast.makeText(getApplicationContext(),
//                        R.string.app_not_found, Toast.LENGTH_SHORT);
//                t.show();
//            }
//        }
//    }
}