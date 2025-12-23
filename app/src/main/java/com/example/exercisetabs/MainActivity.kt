package com.example.exercisetabs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        viewPager.adapter = TabAdapter(this)

        val tabTitles = listOf(
            getString(R.string.home_title),
            getString(R.string.entertainment_title),
            getString(R.string.lifestyle_title)
        )

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            tab.text = tabTitles[position]

        }.attach()
    }
}