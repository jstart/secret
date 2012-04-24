package com.truman.trippy;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MenuFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(new MenuListAdapter(getActivity(),
				android.R.layout.simple_list_item_1, new String[] { CurrentUser.getUser().getFirstName() +" "+ CurrentUser.getUser().getLastName(), " Activity", " Your Trips", " Friend Trips", " Create a Trip", " Log Out"}));
//		getListView().setCacheColorHint(0);
		ColorDrawable divider = new ColorDrawable(this.getResources().getColor(R.color.divider));
		getListView().setDivider(divider);
		getListView().setDividerHeight(1);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
//		((MenuActivity)getActivity()).getSlideoutHelper().close();
	}
private class MenuListAdapter extends ArrayAdapter<String>{

	public MenuListAdapter(Context context, int resource, String[] strings) {
		super(context, resource, strings);
		// TODO Auto-generated constructor stub
	}

	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        String text = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(this.getContext());
            if (text.equalsIgnoreCase(CurrentUser.getUser().getFirstName() + " " + CurrentUser.getUser().getLastName())){
                convertView = inflater.inflate(R.layout.title_list_item, parent, false);
            }else{
            	convertView = inflater.inflate(R.layout.menu_list_item, parent, false);
            }
            holder = new ViewHolder();

            holder.text = (TextView)convertView.findViewById(R.id.content);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text.setText(text);
        return convertView;
    }

}

	static class ViewHolder{
		TextView text;
	}
	
}
