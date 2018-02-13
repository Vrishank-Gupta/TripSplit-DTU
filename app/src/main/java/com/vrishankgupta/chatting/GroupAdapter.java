package com.vrishankgupta.chatting;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aryam on 2/12/2018.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupHolder>{

    ArrayList<Group> groupArrayList = new ArrayList<>();
    public GroupAdapter(ArrayList<Group> groups){groupArrayList = groups;}

    @Override
    public GroupAdapter.GroupHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_view,parent,false);
        return new GroupHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GroupAdapter.GroupHolder holder, int position) {

        Group currentGroup = groupArrayList.get(position);
        holder.groupName.setText(currentGroup.getName());
        holder.groupDescription.setText(currentGroup.getDescription());
        holder.members.setAdapter(new com.vrishankgupta.chatting.ChildAdapter(currentGroup.getUserArrayList()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GroupHolder extends RecyclerView.ViewHolder{
        TextView groupName;
        TextView groupDescription;
        RecyclerView members;

        public GroupHolder(View itemView) {
            super(itemView);
            groupName = (TextView) itemView.findViewById(R.id.group_name);
            groupDescription = (TextView) itemView.findViewById(R.id.group_description);
            members = (RecyclerView) itemView.findViewById(R.id.contentRV);
            members.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.VERTICAL,false));

        }
    }
}
