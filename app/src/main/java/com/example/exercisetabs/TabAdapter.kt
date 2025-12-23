package com.example.exercisetabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter (activity: FragmentActivity) :
    FragmentStateAdapter(activity) {

    val fragmentList = listOf(
        HomeFragment(),
        EntertainmentFragment(),
        LifestyleFragment()
    )

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment = fragmentList[position]
}