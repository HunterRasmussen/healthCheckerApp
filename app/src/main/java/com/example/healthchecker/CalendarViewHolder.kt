package com.example.healthchecker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalendarViewHolder(itemView: View, onItemListener: CalendarAdapter.OnItemListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var  dayOfMonth : TextView;
    var onItemListener : CalendarAdapter.OnItemListener;
    init {
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        onItemListener.onItemClick(adapterPosition, dayOfMonth.text.toString());
    }


}