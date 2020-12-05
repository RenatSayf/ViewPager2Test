package com.renatsayf.viewpager2test

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Шаг 2: Создаем адаптер
class ViewPagerAdapter constructor(private val list: MutableList<String>) : RecyclerView.Adapter<PagerViewHolder>()
{
    // Шаг 4: переопределяем методы
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page_layout, parent, false)
        return PagerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int)
    {
        val itemView = holder.itemView
        val textView = itemView.findViewById<androidx.appcompat.widget.AppCompatTextView>(R.id.textView)
        textView.text = list[position]
    }

    override fun getItemCount(): Int
    {
        return list.size
    }

}

// Шаг 3: Создаем view holder
class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)