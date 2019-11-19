package com.gaius.kotlinlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gaius.kotlinlab.databinding.HomeViewPagerFragmentBinding

class HomeViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = HomeViewPagerFragmentBinding.inflate(inflater, container, false)
        val tabLayout = binding.tabs
        val viewPager = binding.viewPager

//        viewPager.adapter
        return null
    }

}