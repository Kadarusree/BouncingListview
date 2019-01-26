package mahesh.cubex.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class MainActivity extends Activity {


    ListView mListView,mListView2;

    ArrayList<String> mList;
    boolean canclick=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listView);
        mListView2= findViewById(R.id.listView2);

        mList = new ArrayList<>();
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");
        mList.add("AAA");

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,mList);
        mListView.setAdapter(mAdapter);


        ListAdapter mlListAdapter = new ListAdapter(MainActivity.this, mList);
        mListView2.setAdapter(mlListAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (canclick)
                {
                    Toast.makeText(getApplicationContext(),i+"",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (canclick)
                {
                    Toast.makeText(getApplicationContext(),i+"",Toast.LENGTH_SHORT).show();
                }
            }
        });

        OverScrollDecoratorHelper.setUpOverScroll(mListView);
        OverScrollDecoratorHelper.setUpOverScroll(mListView2);


    }
}
