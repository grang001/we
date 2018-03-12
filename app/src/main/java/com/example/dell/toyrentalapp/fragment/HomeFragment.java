package com.example.dell.toyrentalapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.dell.toyrentalapp.R;

/**
 * Created by dell on 2018/3/10.
 */

public class HomeFragment extends Fragment {
    private View view;
    private ViewFlipper flipper;
//    private Intent i = new Intent();

    private int[] resId={R.drawable.b,R.drawable.a1,R.drawable.sct3};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        GetId();
        Flipper();

        return view;
    }
    /**
     * 获取控件
     */
    private void GetId() {
        flipper = (ViewFlipper)view.findViewById(R.id.flipper);
    }

    /**
     * 滚动图
     */
    private void Flipper() {
        /**
         * 动态导入的方式为ViewFlipper加入子View
         */
        for (int i=0;i<resId.length;i++){
            flipper.addView(getImageView(i));
        }
        flipper.setInAnimation(getActivity(),R.anim.left_in);
        flipper.setOutAnimation(getActivity(),R.anim.left_out);
        flipper.setFlipInterval(3000);
        flipper.startFlipping();
    }

    private ImageView getImageView(int i) {
        ImageView image = new ImageView(getActivity());
        image.setBackgroundResource(resId[i]);
        return image;
    }

}