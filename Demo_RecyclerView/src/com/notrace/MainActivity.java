package com.notrace;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

	
	private SwipeRefreshLayout swipeRefreshLayout;
	
	private List<String>list;
	 RecyclerAdapter mAdapter;
	private static final String TAG = MainActivity.class
		      .getSimpleName();

		  private RecyclerView mRecyclerView;


		  @Override
		  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);

		    
		    swipeRefreshLayout=(SwipeRefreshLayout) findViewById(R.id.swipe);
		    
		    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

		    LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//				layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
		    // 设置布局管理器
		    mRecyclerView.setLayoutManager(layoutManager);

		    list=new ArrayList<String>();
		    for (int i = 0; i < 20; i++) {
		      list.add("item" + i);
		    }
		     mAdapter = new RecyclerAdapter(list);
		    mRecyclerView.setAdapter(mAdapter);
		    
		    
		    
		    swipeRefreshLayout.setColorScheme(android.R.color.holo_blue_dark, android.R.color.holo_blue_light, android.R.color.holo_green_light, android.R.color.holo_green_light);
		    swipeRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
				
				@Override
				public void onRefresh() {
					
					swipeRefreshLayout.setRefreshing(true);
	                ( new Handler()).postDelayed(new Runnable() {
	                    @Override
	                    public void run() {
	                    swipeRefreshLayout.setRefreshing(false);
	   					 list.add("item" +"6");
	   					 list.add("item" +"66");
	   					 list.add("item" +"666");
	   					 list.add("item" +"6666");
	   					 mAdapter.notifyDataSetChanged();
	                    }
	                }, 3000);
		
				}
			});
		  }
		  
		  
		  

		}
