package es.esy.sisgrados.appcontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmarContacto extends AppCompatActivity {

    private TextView txtNombre;
    private TextView txtFechaNac;
    private TextView txtTelefono;
    private TextView txtEmail;
    private TextView txtDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_contacto);

        Bundle extras      = getIntent().getExtras();
        String nombre      = extras.getString(getResources().getString(R.string.pnombre));
        String fechaNac    = extras.getString(getResources().getString(R.string.pfechaNac));
        String telefono    = extras.getString(getResources().getString(R.string.ptelefono));
        String email       = extras.getString(getResources().getString(R.string.pemail));
        String descripcion = extras.getString(getResources().getString(R.string.pdescripcion));

        txtNombre      = (TextView)findViewById(R.id.tvNombreResp);
        txtFechaNac    = (TextView)findViewById(R.id.tvFechaNacResp);
        txtTelefono    = (TextView)findViewById(R.id.tvTelefonoResp);
        txtEmail       = (TextView)findViewById(R.id.tvEmailResp);
        txtDescripcion = (TextView)findViewById(R.id.tvDescripcionResp);

        //Toast.makeText(getBaseContext(), nombre, Toast.LENGTH_SHORT).show();
        txtNombre.setText(nombre);
        txtFechaNac.setText(fechaNac);
        txtTelefono.setText(telefono);
        txtEmail.setText(email);
        txtDescripcion.setText(descripcion);

        Button btnEditar=(Button)findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data=new Intent();
                data.putExtra(getResources().getString(R.string.peditnombre),txtNombre.getText().toString());
                data.putExtra(getResources().getString(R.string.peditfechaNac),txtFechaNac.getText().toString());
                data.putExtra(getResources().getString(R.string.pedittelefono),txtTelefono.getText().toString());
                data.putExtra(getResources().getString(R.string.peditemail),txtEmail.getText().toString());
                data.putExtra(getResources().getString(R.string.peditdescripcion),txtDescripcion.getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}
