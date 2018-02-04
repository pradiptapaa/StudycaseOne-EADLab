package pradiptapa.si3905.com.studycaseone;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //@pradipta Deklarasikan variabelnya.
    EditText inputMakanan;
    EditText inputJumlahPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputMakanan = (EditText) findViewById(R.id.editText);
        inputJumlahPorsi = (EditText) findViewById(R.id.editText2);
    }

    public void launch_eatbus(View view) {
        //@pradipta Ubah text menjadi String dan Integers.
        String makanan = inputMakanan.getText().toString();
        int jumlahPorsi = Integer.parseInt(inputJumlahPorsi.getText().toString());
        String warung = "Eatbus";
        int total = 50000 * jumlahPorsi;
        if (makanan.equals("Nasi Uduk") && total >= 65500) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Jangan disini, kemahalan bang", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else if (makanan.equals("Nasi Uduk") && total < 65500 && jumlahPorsi < 2) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Wah bang, cewenya nda ditawarin makan?", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else if (makanan.equals("Nasi Uduk") && total < 65500 && jumlahPorsi >= 2) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Sip, ini cocok buat budget 65.500!", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else
            Toast.makeText(getApplicationContext(), "Menunya cuma Nasi Uduk aja bang", Toast.LENGTH_LONG).show();
    }

    public void launch_abnormal(View view) {
        //@pradipta copas dari launch_eatbus
        String makanan = inputMakanan.getText().toString();
        int jumlahPorsi = Integer.parseInt(inputJumlahPorsi.getText().toString());
        String warung = "Abnormal";
        int total = 30000 * jumlahPorsi;
        if (makanan.equals("Nasi Uduk") && total >= 65500) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Jangan disini, kemahalan bang", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else if (makanan.equals("Nasi Uduk") && total < 65500 && jumlahPorsi < 2) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Wah bang, cewenya nda ditawarin makan?", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else if (makanan.equals("Nasi Uduk") && total < 65500 && jumlahPorsi >= 2) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("makanan", makanan);
            intent.putExtra("jumlahPorsi", jumlahPorsi);
            intent.putExtra("total", total);
            intent.putExtra("warung", warung);
            Toast.makeText(getApplicationContext(), "Sip, ini cocok buat budget 65.500!", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else
            Toast.makeText(getApplicationContext(), "Menunya cuma Nasi Uduk aja bang", Toast.LENGTH_LONG).show();
    }
}