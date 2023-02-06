package com.kardelen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;

public class ExitClass extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        view = inflater.inflate(R.layout.fragment_exit, container, false);
//
//        return view;
        return inflater.inflate(R.layout.fragment_exit, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button =  view.findViewById(R.id.btnReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
 /*               Intent intent;
                startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));*/
            }
        });

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

