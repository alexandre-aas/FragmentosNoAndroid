package com.s.d.a.a.fragmentosnoandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ToolbarFragment extends Fragment implements OnSeekBarChangeListener {

    private static int valorDeBusca = 10;
    private static EditText edtTexto;

    ToolbarListener activityCallback;

    public interface ToolbarListener {
        public void onButtonClick(int position, String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCallback = (ToolbarListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement ToolbarListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle
                                     savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.toolbar_fragment,
                container, false);

       edtTexto = view.findViewById(R.id.edtTexto);
        final SeekBar barraDeBusca =
                view.findViewById(R.id.barraBusca);

        barraDeBusca.setOnSeekBarChangeListener(this);

        final Button btnUnico = view.findViewById(R.id.btnTexto);
        btnUnico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    public void buttonClicked (View view) {
        activityCallback.onButtonClick(valorDeBusca,
                edtTexto.getText().toString());
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        valorDeBusca = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar arg0) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar arg0) {

    }


}
