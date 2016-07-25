package com.example.tacademy.sampleviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-07-25.
 */
public class TextFragment extends Fragment {


    public TextFragment() {
        // Required empty public constructor
    }

    public static TextFragment newInstance(String message) {
        TextFragment f = new TextFragment();
        Bundle b = new Bundle();
        b.putString("message", message);
        f.setArguments(b);
        return f;
    }

    String message;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            message = getArguments().getString("message");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        TextView messageView = (TextView)view.findViewById(R.id.text_message);
        messageView.setText(message);
        return view;
    }

}