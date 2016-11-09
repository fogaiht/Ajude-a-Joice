package fogaiht.ajudeajoice;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by thiag on 05/10/2016.
 */

public class Loja extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

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
    }
}
