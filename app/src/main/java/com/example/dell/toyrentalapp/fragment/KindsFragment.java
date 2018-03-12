package com.example.dell.toyrentalapp.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.toyrentalapp.MainActivity;
import com.example.dell.toyrentalapp.R;

/**
 * Created by dell on 2018/3/10.
 */

public class KindsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View kindview;
        kindview=inflater.inflate(R.layout.fragment_kinds, container, false);
//       获取各项按钮
        TextView tx1=(TextView) kindview.findViewById(R.id.age1);
        TextView tx2=(TextView) kindview.findViewById(R.id.age2);
        TextView tx3=(TextView) kindview.findViewById(R.id.age3);
        TextView tx4=(TextView) kindview.findViewById(R.id.age4);
        TextView tx5=(TextView) kindview.findViewById(R.id.age5);
        TextView tx6=(TextView) kindview.findViewById(R.id.age6);

        return kindview;
    }
    public abstract class MyListener implements View.OnClickListener{
        public void onclick (View v){
            Intent i=new Intent();
            i.setClass(getActivity(), MainActivity.class);

        }


    }

}