package app.com.example.cal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_num1,btn_num2,btn_num3,btn_num4,btn_num5,
            btn_num6,btn_num7,btn_num8,btn_num9,btn_num0,
            btn_plus,btn_minus,btn_multi,btn_divide,btn_clear,btn_equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_num1 = (Button) findViewById(R.id.btn_num1);
        btn_num2 = (Button) findViewById(R.id.btn_num2);
        btn_num3 = (Button) findViewById(R.id.btn_num3);
        btn_num4 = (Button) findViewById(R.id.btn_num4);
        btn_num5 = (Button) findViewById(R.id.btn_num5);
        btn_num6 = (Button) findViewById(R.id.btn_num6);
        btn_num7 = (Button) findViewById(R.id.btn_num7);
        btn_num8 = (Button) findViewById(R.id.btn_num8);
        btn_num9 = (Button) findViewById(R.id.btn_num9);
        btn_num0 = (Button) findViewById(R.id.btn_num0);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_equal = (Button) findViewById(R.id.btn_equal);

    }
}
