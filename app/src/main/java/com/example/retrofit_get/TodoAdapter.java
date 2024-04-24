package com.example.retrofit_get;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {

    MainActivity mainActivity;
    ArrayList<Todo> list;

    public TodoAdapter(MainActivity mainActivity, ArrayList<Todo> list) {
        this.mainActivity = mainActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item_todo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.userIdTextView.setText("User ID: " + list.get(position).getUserId());
        holder.idTextView.setText("ID: " + list.get(position).getId());
        holder.todoTextView.setText("Title: " + list.get(position).getTitle());
        holder.completedTextView.setText("Completed: " + list.get(position).isCompleted());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView idTextView, todoTextView, completedTextView, userIdTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userIdTextView = itemView.findViewById(R.id.useridTextView);
            idTextView = itemView.findViewById(R.id.idTextView);
            todoTextView = itemView.findViewById(R.id.todoTextView);
            completedTextView = itemView.findViewById(R.id.completedTextView);
        }
    }
}