package com.example.mon.retrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mon.retrofit.Items.MatchesQueryItems.Match;
import com.example.mon.retrofit.R;

import java.util.ArrayList;

/**
 * Created by mon on 23/8/18.
 */

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.EquipViewHolder> {
    private ArrayList<Match> dataList;

    public MatchAdapter(ArrayList<Match> dataList) {
        this.dataList = dataList;
    }

    @Override
    public EquipViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_row_view, parent, false);
        return new EquipViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EquipViewHolder holder, int position) {
        holder.txtNoticeTitle.setText(dataList.get(position).getHomeTeam().getName());
        holder.txtNoticeBrief.setText(dataList.get(position).getAwayTeam().getName());
        holder.txtNoticeFilePath.setText(dataList.get(position).getMatchday());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class EquipViewHolder extends RecyclerView.ViewHolder {

        TextView txtNoticeTitle, txtNoticeBrief, txtNoticeFilePath;

        EquipViewHolder(View itemView) {
            super(itemView);
            txtNoticeTitle =  itemView.findViewById(R.id.txt_notice_title);
            txtNoticeBrief =  itemView.findViewById(R.id.txt_notice_brief);
            txtNoticeFilePath =  itemView.findViewById(R.id.txt_notice_file_path);
        }
    }

}
