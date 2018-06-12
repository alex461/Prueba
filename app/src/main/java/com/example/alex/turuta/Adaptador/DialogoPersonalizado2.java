package com.example.alex.turuta.Adaptador;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.alex.turuta.R;

public class DialogoPersonalizado2 {

    public DialogoPersonalizado2(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.venatana_taxi);

        TextView entendido = dialog.findViewById(R.id.cancelar_ventana2);



        entendido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });




        dialog.show();
    }
}
