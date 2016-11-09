package fogaiht.ajudeajoice;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoGalery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_galery);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        VideoView video = (VideoView) findViewById(R.id.vv);
        Uri src = Uri.parse("android.resource://fogaiht.ajudeajoice/raw/share");
        video.setVideoURI(src);

        video.setMediaController(new MediaController(this));


    }
}
