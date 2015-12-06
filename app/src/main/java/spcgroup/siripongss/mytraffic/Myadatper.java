package spcgroup.siripongss.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by siripong.ss on 6/12/2558.
 */
public class Myadatper extends BaseAdapter {
    //ประกาศตัวแปร
    private Context objContext;
    private String[] titleStrings, detailStrings;
    private int[] iconInts;

    public Myadatper(Context objContext, String[] titleStrings, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //openservice
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //setup TextView
        View view = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        TextView titleTextView = (TextView)view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);

        TextView detailTextView = (TextView)view.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);

        //setup img
        ImageView iconImageView = (ImageView)view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);
        return view;
    }
}//MainClass
