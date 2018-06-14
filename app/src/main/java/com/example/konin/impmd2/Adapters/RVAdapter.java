package com.example.konin.impmd2.Adapters;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.VakkenViewHolder>{

    public static class VakkenViewHolder extends RecyclerView.ViewHolder
    CardView cv;
    TextView personName;
    TextView personAge;
    ImageView personPhoto;
}
