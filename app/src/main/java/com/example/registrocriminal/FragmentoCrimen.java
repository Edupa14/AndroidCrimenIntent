package com.example.registrocriminal;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentoCrimen extends Fragment {

    // Widgets
    private Crimen mCrimen;
    private EditText mTxtTitulo;
    private Button mBotonFecha;
    private CheckBox mCkbResuelto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrimen = new Crimen();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_crimen, container, false);
        mTxtTitulo = (EditText) v.findViewById(R.id.titulo_crimen);
        mTxtTitulo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int inicio, int cuenta, int despues) {
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                mCrimen.setTitulo(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        mBotonFecha = (Button) v.findViewById(R.id.boton_fecha);
        mBotonFecha.setText(mCrimen.getDate().toString());
        mBotonFecha.setEnabled(false);
        mCkbResuelto = (CheckBox) v.findViewById(R.id.crimen_resuelto);

        mCkbResuelto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                mCrimen.setResuelto(b);
            }
        });

        return v;
    }


}
