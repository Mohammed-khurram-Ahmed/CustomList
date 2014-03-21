package com.redbytes.customlistview;


import java.util.ArrayList;

import com.redbytes.model.CustomListAdapter;
import com.redbytes.model.DataObject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ListView;

public class HomeActivity extends Activity {
	Context con;
	ListView lvHome;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		con = this;
		ArrayList<DataObject> arrData = loadListData();
		lvHome = (ListView) findViewById(R.id.lvCustomData);
		CustomListAdapter cstmAdapt =  new CustomListAdapter(arrData, con);
		lvHome.setAdapter(cstmAdapt);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	
	public ArrayList<DataObject> loadListData() {
		ArrayList<DataObject> arrData = new ArrayList<DataObject>();
		arrData.add(new DataObject("Aaaaaaa", "First Letter", true));
		arrData.add(new DataObject("Bbbbbbb", "Second Letter", false));
		arrData.add(new DataObject("Ccccccc", "Third Letter", true));
		arrData.add(new DataObject("Ddddddd", "Fourth Letter", false));
		arrData.add(new DataObject("Eeeeeee", "Fifth Letter", false));

		arrData.add(new DataObject("fffffff", "Sixth Letter", true));
		arrData.add(new DataObject("gggggg", "Seventh Letter", false));
		arrData.add(new DataObject("hhhhhh", "Eightth Letter", true));
		arrData.add(new DataObject("iiiiii", "Ninth Letter", false));

		arrData.add(new DataObject("jjjjjj", "10th Letter", false));

		arrData.add(new DataObject("kkkkkk", "11th Letter", false));
		arrData.add(new DataObject("llllll", "12th Letter", true));
		arrData.add(new DataObject("mmmmmm", "13th Letter", true));
		arrData.add(new DataObject("nnnnnn", "14th Letter", true));
		arrData.add(new DataObject("oooooo", "15th Letter", false));

		arrData.add(new DataObject("Pppppp", "16th Letter", true));
		arrData.add(new DataObject("qqqqq", "17th Letter", false));
		arrData.add(new DataObject("rrrrrr", "18th Letter", false));
		arrData.add(new DataObject("ssssss", "19th Letter", true));
		arrData.add(new DataObject("tttttt", "20th Letter", true));

		arrData.add(new DataObject("Uuuuuu", "21st Letter", true));
		arrData.add(new DataObject("vvvvvv", "22nd Letter", false));
		arrData.add(new DataObject("wwwwww", "23rd Letter", false));
		arrData.add(new DataObject("xxxxxx", "24th Letter", true));
		arrData.add(new DataObject("yyyyyy", "25th Letter", true));
		arrData.add(new DataObject("zzzzzz", "26th Letter", true));
		return arrData;
	}

}
