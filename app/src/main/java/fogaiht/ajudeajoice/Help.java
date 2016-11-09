package fogaiht.ajudeajoice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Fogaiht on 24/09/2016.
 */
public class Help extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        ImageButton iniciar = (ImageButton) findViewById(R.id.button);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), Vakinha.class));

                String uri = "https://www.vakinha.com.br/vaquinha/ajude-a-joice";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
    }
}
