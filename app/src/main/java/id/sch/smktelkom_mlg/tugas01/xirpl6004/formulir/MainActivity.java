package id.sch.smktelkom_mlg.tugas01.xirpl6004.formulir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    CheckBox cbX, cbXI, cbXII;
    Button bDaftar;
    TextView tvHasil;
    RadioButton rbTkj, rbRpl;
    Spinner spAbsen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spAbsen = (Spinner) findViewById(R.id.spinnerAbsen);

        rbRpl = (RadioButton) findViewById(R.id.radioButtonRpl);
        rbRpl = (RadioButton) findViewById(R.id.radioButtonTkj);

        cbX = (CheckBox) findViewById(R.id.checkBoxX);
        cbXI = (CheckBox) findViewById(R.id.checkBoxXI);
        cbXI = (CheckBox) findViewById(R.id.checkBoxXII);

        etNama = (EditText) findViewById(R.id.editTextNama);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();


                String jurusan = null;
                if (rbRpl.isChecked()) {
                    jurusan = rbRpl.getText().toString();
                } else if (rbTkj.isChecked()) {
                    jurusan = rbTkj.getText().toString();
                }

                String kelas = "Kelas Anda:\n";

                if (cbX.isChecked()) kelas += cbX.getText() + "\n";
                if (cbXI.isChecked()) kelas += cbXI.getText() + "\n";
                if (cbXII.isChecked()) kelas += cbXII.getText() + "\n";

                tvHasil.setText(nama + kelas + "berjurusan" + jurusan + "bernomor absen" + spAbsen.getSelectedItem().toString());

            }
        });
    }
}
