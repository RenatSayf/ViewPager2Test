package com.renatsayf.viewpager2test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<String>()
        for (i in 1..300)
        {
            list.add("Example Text $i")
        }

        // Шаг 5: Подключение и настройка ViewPager2
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.apply {
            adapter = ViewPagerAdapter(list)
            orientation = ViewPager2.ORIENTATION_HORIZONTAL // изменение ориентации
            //orientation = ViewPager2.ORIENTATION_VERTICAL
        }
    }
}