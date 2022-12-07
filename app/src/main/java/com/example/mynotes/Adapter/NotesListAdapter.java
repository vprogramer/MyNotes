package com.example.mynotes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynotes.Models.Notes;
import com.example.mynotes.NotesClickListener;
import com.example.mynotes.R;

import java.util.ArrayList;
import java.util.List;

public class NotesListAdapter extends RecyclerView.Adapter <NotesViewHolder>{

        Context context;
        List<Notes> list;

        NotesClickListener listener;

        public NotesListAdapter(Context context, List<Notes> list, NotesClickListener listener) {
                this.context = context;
                this.list = list;
                this.listener = listener;
        }

        @NonNull
        @Override
        public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new NotesViewHolder(LayoutInflater.from(context).inflate(R.layout.notes_list, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

                if (!list.get(position).getPrivacy()) {
                        holder.textView_title.setText(list.get(position).getTitle());
                        holder.textView_title.setSelected(true);
                        holder.textView_date.setText(list.get(position).getDate());
                        holder.textView_date.setSelected(true);
                }

        }

//        private int getRandomColor(){
//                List <Integer
//        }

        @Override
        public int getItemCount() {
                return list.size();
        }
}

class NotesViewHolder extends RecyclerView.ViewHolder {

        CardView notes_container;
        CheckBox checkBox_note;
        TextView textView_title, textView_date;

        public NotesViewHolder(@NonNull View itemView) {
                super(itemView);

                notes_container = itemView.findViewById(R.id.notes_container);
                checkBox_note = itemView.findViewById(R.id.checkBox_note);
                textView_title = itemView.findViewById(R.id.textView_title);
                textView_date = itemView.findViewById(R.id.textView_date);
        }
}