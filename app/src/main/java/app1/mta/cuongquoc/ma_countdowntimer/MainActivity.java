package app1.mta.cuongquoc.ma_countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtvNoidung;
    Button btnSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvNoidung = (TextView)findViewById(R.id.textViewNoidung);
        btnSelect = (Button)findViewById(R.id.buttonSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(10000, 100) {    // Trong 10000 minisecon cứ 100mini thực hiện 1 hành động
                    @Override
                    public void onTick(long millisUntilFinished) {  // -- millisUntilFinished cho biết thời gian còn lại
                        String s = txtvNoidung.getText().toString();
                        s = s + "Hello World... ";
                        txtvNoidung.setText(s);
                        String miliSecond = String.valueOf(millisUntilFinished);
                        Toast.makeText(MainActivity.this, miliSecond, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Hết cmn thời gian rồi!!!", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });


    }
}
