package com.example.hasee.easy2
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lin.coursetwo.R;
/**
 * Created by Hasee on 2018/4/8.
 */
class FragmentThree : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }
}