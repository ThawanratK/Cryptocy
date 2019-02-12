package com.example.mac.crypto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<DataModel> mDatas;
    private LayoutInflater mLayoutinflater;
    Context mContext;
    int []pic;

    public MyAdapter(Context context, List<DataModel> aList,int[] pic){
        this.pic = pic;
        mDatas = aList;
        mLayoutinflater = LayoutInflater.from(context);
        mContext = context;
    }
    static class ViewHolder{
        TextView tvName;
        TextView tvSymbol;
        TextView tvPrice;
        ImageView imImage;

    }
    public int getCount(){
        return mDatas.size();
    }
    public Object getItem(int i){
        return  null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View view, ViewGroup viewGroup){
        ViewHolder holder;
        if(view == null){
            view = mLayoutinflater.inflate(R.layout.row_layout,viewGroup,false);
            holder= new ViewHolder();
            holder.tvName = (TextView)view.findViewById(R.id.txtName);
            holder.tvSymbol = (TextView)view.findViewById(R.id.txtSymbol);
            holder.tvPrice  = (TextView)view.findViewById(R.id.txtPrice);
            holder.imImage = (ImageView)view.findViewById(R.id.imageViewcoin);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }
        String name = mDatas.get(position).getName();
        holder.tvName.setText(name);
        holder.tvSymbol.setText(mDatas.get(position).getSymbol());
        holder.tvPrice.setText(mDatas.get(position).getPrice());
        holder.imImage.setImageResource(pic[position]);
        return view;
    }
}
