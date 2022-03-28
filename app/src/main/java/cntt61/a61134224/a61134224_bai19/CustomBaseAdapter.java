package cntt61.a61134224.a61134224_bai19;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listCity[];
    int listImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] cityList, int [] images) {
        this.context = ctx;
        this.listCity = cityList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listCity.length;
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
    public View getView(int position, View converView, ViewGroup parent) {
        converView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView) converView.findViewById(R.id.textView);
        ImageView cityImg = (ImageView) converView.findViewById(R.id.imageIcon);
        txtView.setText(listCity[position]);
        cityImg.setImageResource(listImages[position]);
        return converView;
    }
}
