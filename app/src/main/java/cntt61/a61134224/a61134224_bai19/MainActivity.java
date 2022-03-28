package cntt61.a61134224.a61134224_bai19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String cityList[] = {"Hà Nội", "Huế", "Sapa", "Côn Sơn", "Vũng Tàu", "Đà Nẵng"};
    int cityImages [] = {R.drawable.earth, R.drawable.star, R.drawable.star, R.drawable.earth, R.drawable.earth, R.drawable.earth};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), cityList, cityImages);
        listView.setAdapter(customBaseAdapter);
    }
}