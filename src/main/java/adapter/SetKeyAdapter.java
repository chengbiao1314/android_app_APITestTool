package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import bean.KeyBean;

/**
 * Created by Ricky on 16/4/14.
 */
public class SetKeyAdapter extends BaseAdapter {
    private Context context;
    private List<KeyBean> list;

    public SetKeyAdapter(Context context,List<KeyBean> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return 0;
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
        return null;
    }
}
