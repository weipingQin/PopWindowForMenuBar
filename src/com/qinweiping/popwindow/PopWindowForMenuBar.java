package com.qinweiping.popwindow;

import com.qinweiping.common.AppUtil;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;

@SuppressLint("NewApi")
public class PopWindowForMenuBar extends AppCompatActivity {

	private android.support.v7.app.ActionBar mActionBar;
	protected LayoutInflater mLayoutInflater;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
	}

	private void initView(){
		mLayoutInflater = LayoutInflater.from(PopWindowForMenuBar.this);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
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
	
}
