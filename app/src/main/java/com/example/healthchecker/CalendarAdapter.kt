package com.example.healthchecker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter(daysOfMonth: ArrayList<String>, onItemListener : OnItemListener) : RecyclerView.Adapter<CalendarViewHolder>() {

    private final lateinit var daysOfMonth : ArrayList<String>;
    private var onItemListener :OnItemListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context);
        var view : View = inflater.inflate(R.layout.calendar_cell, parent, false);
        var layoutParams : ViewGroup.LayoutParams = view.layoutParams;
        layoutParams.height = ((parent.height * 1.6666666666666667).toInt());
        return CalendarViewHolder(view);
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size;
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.dayOfMonth.text = daysOfMonth[position];
    }


    init{
        this.onItemListener = onItemListener;
    }

    public interface OnItemListener{
        fun onItemClick(position: Int, dayText: String){};
    }
}