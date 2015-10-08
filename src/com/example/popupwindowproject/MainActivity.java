package com.example.popupwindowproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;

@SuppressLint("NewApi")
public class MainActivity extends AppCompatActivity {
	
	private android.support.v7.app.ActionBar mActionBar;
	protected LayoutInflater mLayoutInflater;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_main);
		initView();
	}
	
	private void initView(){
		mLayoutInflater = LayoutInflater.from(MainActivity.this);
		initActionBar("µ¯´°²Ëµ¥",true);
	}
	
	@SuppressLint("NewApi")
	private void initActionBar(final String str,boolean isShow){
		mActionBar =getSupportActionBar();
		if(mActionBar != null){
			if(!isShow){
				mActionBar.hide();
				return;
			}
			mActionBar.setDisplayHomeAsUpEnabled(false);
			mActionBar.setDisplayShowCustomEnabled(true);
			mActionBar.setDisplayShowHomeEnabled(false);
			mActionBar.setDisplayShowTitleEnabled(true);
		}
		View view = mLayoutInflater.inflate(R.layout.actionbar, null);
		setContentView(view);
		TextView backView = (TextView)view.findViewById(R.id.actionbar_back);
		TextView titleView = (TextView)view.findViewById(R.id.actionbar_title);
		backView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
		titleView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if(AppUtil.isNotEmpty(str)){
					
				}
			}
		});
	}
	
	private void initMenu(){
		TextView btnCopy  = (TextView)findViewById(R.id.actionbar_menu_item1);
		TextView btnCut   = (TextView)findViewById(R.id.actionbar_menu_item2);
		TextView btnPaste = (TextView)findViewById(R.id.actionbar_menu_item3);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
