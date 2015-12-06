package spcgroup.siripongss.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {


    private TextView titalTextView, dataiTextView;
    private ImageView traffiImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bindWidget

        bindWidget();
        //Showview
        showView();


    }

    private void showView() {
        //inputdata form intent
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);
        titalTextView.setText(strTitle);
        traffiImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        dataiTextView.setText(strDetail[intIndex]);

    }

    private void bindWidget() {
        titalTextView = (TextView) findViewById(R.id.textView4);
        dataiTextView = (TextView) findViewById(R.id.textView5);
        traffiImageView = (ImageView) findViewById(R.id.imageView2);


    }
}
