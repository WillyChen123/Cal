package app.com.example.cal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_num1,btn_num2,btn_num3,btn_num4,btn_num5,
            btn_num6,btn_num7,btn_num8,btn_num9,btn_num0,
            btn_plus,btn_minus,btn_multi,btn_divide,btn_clear,btn_equal;

    TextView result;
    String display="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        setL();
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_num1:
                display += "1";
                result.setText(display);
                break;
            case R.id.btn_num2:
                display += "2";
                result.setText(display);
                break;
            case R.id.btn_num3:
                display += "3";
                result.setText(display);
                break;
            case R.id.btn_num4:
                display += "4";
                result.setText(display);
                break;
            case R.id.btn_num5:
                display += "5";
                result.setText(display);
                break;
            case R.id.btn_num6:
                display += "6";
                result.setText(display);
                break;
            case R.id.btn_num7:
                display += "7";
                result.setText(display);
                break;
            case R.id.btn_num8:
                display += "8";
                result.setText(display);
                break;
            case R.id.btn_num9:
                display += "9";
                result.setText(display);
                break;
            case R.id.btn_num0:
                display += "0";
                result.setText(display);
                break;
            case R.id.btn_plus:
                break;
            case R.id.btn_minus:
                break;
            case R.id.btn_multi:
                break;
            case R.id.btn_divide:
                break;
            case R.id.btn_clear:
                display = "";
                result.setText(display);
                break;
            case R.id.btn_equal:
                break;

        }
    }

    public void findView(){
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
        result = (TextView) findViewById(R.id.result);
    }

    public void setL(){
        btn_num1.setOnClickListener(this);
        btn_num2.setOnClickListener(this);
        btn_num3.setOnClickListener(this);
        btn_num4.setOnClickListener(this);
        btn_num5.setOnClickListener(this);
        btn_num6.setOnClickListener(this);
        btn_num7.setOnClickListener(this);
        btn_num8.setOnClickListener(this);
        btn_num9.setOnClickListener(this);
        btn_num0.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
    }

}
