package com.redbytes.model;

import java.util.ArrayList;

import com.redbytes.customlistview.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter{
	ArrayList<DataObject> arrData;
	Context con;
	private static LayoutInflater inflater;
	public CustomListAdapter(ArrayList<DataObject> arrData, Context con) {
		super();
		inflater = LayoutInflater.from(con);
		this.arrData = arrData;
		this.con = con;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrData.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arrData.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int arg0, View convertView, ViewGroup arg2) {
		final ViewHolder holder;		
		if(convertView ==  null)
		{
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.lv_custom_child, null);
			holder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
			holder.tvDesc = (TextView) convertView.findViewById(R.id.tvDesc);
			holder.tvEnteredValue = (TextView) convertView.findViewById(R.id.tvEnteredValue);
			holder.etData = (EditText) convertView.findViewById(R.id.etData);
			holder.ivColorDot = (ImageView) convertView.findViewById(R.id.ivColorDot);
			holder.btnOk = (Button) convertView.findViewById(R.id.btnOk);
			 convertView.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) convertView.getTag();
		}
		System.out.println("arrData.get(arg0).getTopic() : "+arrData.get(arg0).getTopic());
		holder.tvTitle.setText(arrData.get(arg0).getTopic());
		holder.tvDesc.setText(arrData.get(arg0).getDesc());
		holder.tvEnteredValue.setText(arrData.get(arg0).getUserValue());
		
		holder.etData.setText(arrData.get(arg0).getUserValue());
		if(arrData.get(arg0).getIsRed())
		     holder.ivColorDot.setImageResource(R.drawable.red_dot);
		else
			holder.ivColorDot.setImageResource(R.drawable.green_dot);
		
		holder.btnOk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(holder.etData.getText().toString().length()>0)
				{
					arrData.get(arg0).setUserValue(holder.etData.getText().toString());
					holder.tvEnteredValue.setText(holder.etData.getText().toString());
				}
				
			}
		});
		
		return convertView;
	}
	public class ViewHolder{
		TextView tvTitle, tvDesc, tvEnteredValue;
		EditText etData;
		Button btnOk; 
		ImageView ivColorDot;
	}

}
