package com.wilder.retroftstack;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Wilder on 12/13/2015.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.QuestionViewHolder> {

    private List<Question> contactList;

    public ContactAdapter(List<Question> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder contactViewHolder, int i) {
        Question ci = contactList.get(i);
        contactViewHolder.vName.setText(ci.link);
        contactViewHolder.vSurname.setText(ci.score);
        contactViewHolder.vTitle.setText(ci.title);
    }

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_question, viewGroup, false);

        return new QuestionViewHolder(itemView);
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vSurname;
        protected TextView vTitle;

        public QuestionViewHolder(View v) {
            super(v);
            vName = (TextView) v.findViewById(R.id.txtScore);
            vSurname = (TextView) v.findViewById(R.id.txtLink);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}