package es.esy.sisgrados.appcontactos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by DIgo on 29/06/2017.
 */

public class DetalleContacto extends AppCompatActivity {

    private TextView txtNombre;
    private TextView txtTelefono;
    private TextView txtEmail;
    private TextView txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Bundle parametros = getIntent().getExtras();
        txtNombre = (TextView) findViewById(R.id.intNombre);
        txtTelefono = (TextView) findViewById(R.id.intFechaNac);
        txtEmail = (TextView) findViewById(R.id.intEmail);
        txtDescripcion =(TextView)findViewById(R.id.intDescripcion);

        //txtNombre.setText(txtNombre.getText());
        //txtTelefono.setText(txtTelefono.getText());
        //txtEmail.setText(txtEmail.getText());
        //txtDescripcion.setText(txtDescripcion.getText());
    }
}
