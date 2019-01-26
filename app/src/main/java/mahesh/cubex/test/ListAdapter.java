package mahesh.cubex.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListAdapter extends BaseAdapter {
    MainActivity mainActivity;
    ArrayList<String> mList;
    public ListAdapter(MainActivity mainActivity, ArrayList<String> mList) {
        this.mainActivity =mainActivity;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(mainActivity).inflate(R.layout.list_item,null);
        TextView mtTextView = v.findViewById(R.id.mText);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainActivity,i+"",Toast.LENGTH_SHORT).show();
            }
        });
        mtTextView.setText(mList.get(i));
        return v;
    }


}
