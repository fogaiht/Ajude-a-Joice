package fogaiht.ajudeajoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import fogaiht.ajudeajoice.DataBase.NovoActivity;

public class Ajude extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajude);

        ImageButton iniciar = (ImageButton) findViewById(R.id.vakinha);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Help.class));
            }
        });

        ImageButton iniciar2 = (ImageButton) findViewById(R.id.comments);
        iniciar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), NovoActivity.class));
            }
        });
    }
}
