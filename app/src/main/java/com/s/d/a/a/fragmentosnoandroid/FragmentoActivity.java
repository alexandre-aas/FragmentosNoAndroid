package com.s.d.a.a.fragmentosnoandroid;

//import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class FragmentoActivity extends FragmentActivity implements ToolbarFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento);
    }

    public void onButtonClick(int tamanhofonte, String texto){
        //fragment2 eh o ID do RelativeLayout do xml text_fragmento que representa um dos 2 fragments que esse
        //app exemplo estah usando
        TextFragmento fragmento = (TextFragmento) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        fragmento.trocarPropriedadesDoTexto(tamanhofonte, texto);

    }
}
