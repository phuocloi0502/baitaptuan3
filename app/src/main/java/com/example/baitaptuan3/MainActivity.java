package com.example.baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txvKq;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUoc, btnThoat;
    EditText soA, soB;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvKq = findViewById(R.id.txvkq);
        btnTong = findViewById(R.id.btn_tong);
        btnHieu = findViewById(R.id.btnhieu);
        btnTich = findViewById(R.id.btntich);
        btnThuong = findViewById(R.id.btnthuong);
        btnUoc = findViewById(R.id.btnuoc);
        btnThoat = findViewById(R.id.btnthoat);
        soA = findViewById(R.id.editsoa);
        soB = findViewById(R.id.editsob);
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(soA.getText().toString());
                b = Integer.parseInt(soB.getText().toString());
                txvKq.setText(String.valueOf(a + b));
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(soA.getText().toString());
                b = Integer.parseInt(soB.getText().toString());
                txvKq.setText(String.valueOf(a - b));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(soA.getText().toString());
                b = Integer.parseInt(soB.getText().toString());
                txvKq.setText(String.valueOf(a * b));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(soA.getText().toString());
                b = Integer.parseInt(soB.getText().toString());
                if (b == 0) {
                    txvKq.setText("Không thể thực hiện");
                } else {
                    txvKq.setText(String.valueOf(a / b));
                }
            }
        });

        btnUoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(soA.getText().toString());
                b = Integer.parseInt(soB.getText().toString());
                txvKq.setText(String.valueOf(uochunglonnhat(a,b)));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    int uochunglonnhat(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b; // a = a - b
            } else {
                b -= a;
            }
        }
        return a; // return a or b, bởi vì lúc này a và b bằng nhau
    }

}
