package com.example.mysignupapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<ContactModel> contactList;

    public ContactAdapter(List<ContactModel> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        ContactModel contact = contactList.get(position);

        holder.textName.setText(contact.getName());
        holder.textEmail.setText(contact.getEmail());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView textName, textEmail;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.nametext);
            textEmail = itemView.findViewById(R.id.emailtext);
        }
    }
}