package spcgroup.siripongss.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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
        //ListViewController
        ListViewController();


    }

    private void ListViewController() {
        //for Icon
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //for
        String[] titleStings = new String[20];
        titleStings[0] = "หัวข้อที่ 1";
        titleStings[1] = "หัวข้อที่ 2";
        titleStings[2] = "หัวข้อที่ 3";
        titleStings[3] = "หัวข้อที่ 4";
        titleStings[4] = "หัวข้อที่ 5";
        titleStings[5] = "หัวข้อที่ 6";
        titleStings[6] = "หัวข้อที่ 7";
        titleStings[7] = "หัวข้อที่ 8";
        titleStings[8] = "หัวข้อที่ 9";
        titleStings[9] = "หัวข้อที่ 10";
        titleStings[10] = "หัวข้อที่ 11";
        titleStings[11] = "หัวข้อที่ 12";
        titleStings[12] = "หัวข้อที่ 13";
        titleStings[13] = "หัวข้อที่ 14";
        titleStings[14] = "หัวข้อที่ 15";
        titleStings[15] = "หัวข้อที่ 16";
        titleStings[16] = "หัวข้อที่ 17";
        titleStings[17] = "หัวข้อที่ 18";
        titleStings[18] = "หัวข้อที่ 19";
        titleStings[19] = "หัวข้อที่ 20";

//for detail
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        Myadatper objMyadatper = new Myadatper(MainActivity.this, titleStings, detailStrings, intIcon);
        trafficeListView.setAdapter(objMyadatper);
    }//listViewer


    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ทำ sound
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                buttonMediaPlayer.start();
                //Intent go to web
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/mK0mJXTq7a8"));
                startActivity(objIntent);

            }
        });
    }

    private void bindWidget() {
        trafficeListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
}
