package com.notrace;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends Adapter<RecyclerAdapter.ViewHolder> {
	 private List<String>  mDataset;

	  /**
	   * @Description: TODO
	   */
	  public RecyclerAdapter(List<String> dataset) {
	    mDataset = dataset;
	  }

	  public static class ViewHolder extends RecyclerView.ViewHolder {

	    public TextView textview1,textview2;

	    /**
	     * @Description: TODO
	     * @param itemView
	     */
	    public ViewHolder(View itemView) {
	      super(itemView);
	      textview1 = (TextView) itemView.findViewById(R.id.textview1);
	      textview2 = (TextView) itemView.findViewById(R.id.textview2);
	    }
	  }

	  /**
	   * @Method: getItemCount
	   * @Description: TODO
	   * @return
	   * @see android.support.v7.widget.RecyclerView.Adapter#getItemCount()
	   */
	  @Override
	  public int getItemCount() {
	    return mDataset.size();
	  }

	  /**
	   * @Method: onBindViewHolder
	   * @Description: TODO
	   * @param holder
	   * @param position
	   * @see android.support.v7.widget.RecyclerView.Adapter#onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder,
	   *      int)
	   */
	  @Override
	  public void onBindViewHolder(ViewHolder holder, int position) {
	    holder.textview1.setText(mDataset.get(position));
	    holder.textview2.setText(mDataset.get(position));
	  }

	  /**
	   * @Method: onCreateViewHolder
	   * @Description: TODO
	   * @param parent
	   * @param viewType
	   * @return
	   * @see android.support.v7.widget.RecyclerView.Adapter#onCreateViewHolder(android.view.ViewGroup,
	   *      int)
	   */
	  @Override
	  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	    View view = View.inflate(parent.getContext(),
	        R.layout.item, null);
	    ViewHolder holder = new ViewHolder(view);
	    return holder;
	  }
	}
