package com.s.d.a.a.fragmentosnoandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragmento extends Fragment {
    private static TextView textview;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragmento,
                container, false);

        //textview = view.findViewById(R.id.edtTexto);
        textview = view.findViewById(R.id.textView1);


        return view;
    }

    public void trocarPropriedadesDoTexto(int tamanhofonte, String text){
        textview.setTextSize(tamanhofonte);
        textview.setText(text);
    }
}
