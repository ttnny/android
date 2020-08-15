package ttnny.dev.android.androidconcurrency.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import ttnny.dev.android.androidconcurrency.R
import ttnny.dev.android.androidconcurrency.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: HomeFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)

        binding.uiThreadDemoButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_UIThreadDemoFragment)
        )

        return binding.root
    }

}