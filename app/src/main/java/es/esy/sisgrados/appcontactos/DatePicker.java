package es.esy.sisgrados.appcontactos;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by DIgo on 29/06/2017.
 */
public class DatePicker extends DialogFragment  {

    private DatePickerDialog.OnDateSetListener listener;

    public static DatePicker newInstance(DatePickerDialog.OnDateSetListener listener) {
        DatePicker fragment = new DatePicker();
        fragment.setListener(listener);
        return fragment;
    }

    public void setListener(DatePickerDialog.OnDateSetListener listener) {
        this.listener = listener;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

// Use the current date as the default date in the picker
        Calendar c = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            c = Calendar.getInstance();
        }
        int year = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            year = c.get(Calendar.YEAR);
        }
        int month = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            month = c.get(Calendar.MONTH);
        }
        int day = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            day = c.get(Calendar.DAY_OF_MONTH);
        }

        return new DatePickerDialog(getActivity(),listener, year, month, day);
        //return super.onCreateDialog(savedInstanceState);
    }




}
