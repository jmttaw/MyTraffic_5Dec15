package spcgroup.siripongss.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView trafficeListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindWidget();
        //button
        buttonController();

    }

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ทำ sound
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.lion);
                buttonMediaPlayer.start();
            }
        });
    }

    private void bindWidget() {
        trafficeListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
}
