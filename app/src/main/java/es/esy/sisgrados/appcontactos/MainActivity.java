package es.esy.sisgrados.appcontactos;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    TextView txtvNombre;
    TextView txtvFechaNac;
    TextView txtvTelefono;
    TextView txtvEmail;
    TextView txtvDescripcion;
    //private static final int REQUEST_CODE = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvNombre=(TextView) findViewById(R.id.intNombre);
        txtvFechaNac=(TextView) findViewById(R.id.intFechaNac);
        txtvTelefono=(TextView) findViewById(R.id.intTelefono);
        txtvEmail=(TextView) findViewById(R.id.intEmail);
        txtvDescripcion=(TextView) findViewById(R.id.intDescripcion);
        //Toast.makeText(getBaseContext(), txtvNombre.getText(), Toast.LENGTH_SHORT).show();
        Button btnSiguiente=(Button)findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ConfirmarContacto.class);
                //Toast.makeText(getBaseContext(), txtvNombre.getText(), Toast.LENGTH_LONG).show();
                intent.putExtra(getResources().getString(R.string.pnombre),txtvNombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.pfechaNac),txtvFechaNac.getText().toString());
                intent.putExtra(getResources().getString(R.string.ptelefono),txtvTelefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.pemail),txtvEmail.getText().toString());
                intent.putExtra(getResources().getString(R.string.pdescripcion),txtvDescripcion.getText().toString());
                startActivityForResult(intent,1);
                //finish();
            }
        });
    }


    public void showDatePickerDialog(View v) {
        DatePicker newFragment = DatePicker.newInstance(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                final String selectedDate = dayOfMonth + " / " + (month+1) + " / " + year;
                txtvFechaNac.setText(selectedDate);
            }
        });
        newFragment.show(getSupportFragmentManager(), "datePicker");


        //DialogFragment newFragment = new DatePicker();
        //newFragment.show(getSupportFragmentManager(), "datePicker");

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 1) && (resultCode == RESULT_OK)){
           String nombreConfirma=data.getExtras().getString(getResources().getString(R.string.peditnombre));
        }
        //Toast.makeText(this,"ENTRA",Toast.LENGTH_LONG).show();
       /* if ((requestCode == 1) && (resultCode == RESULT_OK)){
            if(data.hasExtra(getResources().getString(R.string.peditnombre))){
                String nombreConfirma=data.getExtras().getString(getResources().getString(R.string.peditnombre));
                if(nombreConfirma!=null && nombreConfirma.length()>0){
                    Toast.makeText(this,nombreConfirma,Toast.LENGTH_LONG).show();
                }
            }
        }*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this,getResources().getString(R.string.onstart),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this,getResources().getString(R.string.onpause),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this,getResources().getString(R.string.onstop),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this,getResources().getString(R.string.onrestart),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this,getResources().getString(R.string.onresume),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this,getResources().getString(R.string.ondestroy),Toast.LENGTH_LONG).show();
    }


}
