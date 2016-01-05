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
    TextView txv_result;
    String display="",action="";
    boolean pause=true,first=true;
    int tmp=0,result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setListener();
    }

    private void init(){
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
        txv_result = (TextView) findViewById(R.id.result);
    }

    protected void setListener(){
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

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_num1:
                pause = false;
                display+="1";
                txv_result.setText(display);
                break;
            case R.id.btn_num2:
                pause = false;
                display+="2";
                txv_result.setText(display);
                break;
            case R.id.btn_num3:
                pause = false;
                display+="3";
                txv_result.setText(display);
                break;
            case R.id.btn_num4:
                pause = false;
                display+="4";
                txv_result.setText(display);
                break;
            case R.id.btn_num5:
                pause = false;
                display+="5";
                txv_result.setText(display);
                break;
            case R.id.btn_num6:
                pause = false;
                display+="6";
                txv_result.setText(display);
                break;
            case R.id.btn_num7:
                pause = false;
                display+="7";
                txv_result.setText(display);
                break;
            case R.id.btn_num8:
                pause = false;
                display+="8";
                txv_result.setText(display);
                break;
            case R.id.btn_num9:
                pause = false;
                display+="9";
                txv_result.setText(display);
                break;
            case R.id.btn_num0:
                if(!display.equals("")) {
                    pause = false;
                    display += "0";
                    txv_result.setText(display);
                }
                break;
            case R.id.btn_plus:
                if(!display.equals("")&&!pause){
                    if(first){
                        result = Integer.valueOf(txv_result.getText().toString());
                        first = !first;
                        action = "+";
                        txv_result.setText(display);
                        display = "";
                    }else{
                        tmp = Integer.valueOf(txv_result.getText().toString());
                        result = compute(result, action, tmp);
                        action = "+";
                        display = Integer.toString(result);
                        txv_result.setText(display);
                        display = "";
                    }
                    pause = true;
                }else if(display.equals("")&&!pause){
                    result = Integer.valueOf(txv_result.getText().toString());
                    first = !first;
                    action = "+";
                    txv_result.setText(display);
                    display = "";
                    pause = true;
                }
                break;
            case R.id.btn_minus:
                if(!display.equals("")&&!pause){
                    if(first){
                        result = Integer.valueOf(txv_result.getText().toString());
                        first = !first;
                        action = "-";
                        txv_result.setText(display);
                        display = "";
                    }else{
                        tmp = Integer.valueOf(txv_result.getText().toString());
                        result = compute(result, action, tmp);
                        action = "-";
                        display = Integer.toString(result);
                        txv_result.setText(display);
                        display = "";
                    }
                    pause = true;
                }else if(display.equals("")&&!pause){
                    result = Integer.valueOf(txv_result.getText().toString());
                    first = !first;
                    action = "-";
                    txv_result.setText(display);
                    display = "";
                    pause = true;
                }
                break;
            case R.id.btn_multi:
                if(!display.equals("")&&!pause){
                    if(first){
                        result = Integer.valueOf(txv_result.getText().toString());
                        first = !first;
                        action = "*";
                        txv_result.setText(display);
                        display = "";
                    }else{
                        tmp = Integer.valueOf(txv_result.getText().toString());
                        result = compute(result, action, tmp);
                        action = "*";
                        display = Integer.toString(result);
                        txv_result.setText(display);
                        display = "";
                    }
                    pause = true;
                }else if(display.equals("")&&!pause){
                    result = Integer.valueOf(txv_result.getText().toString());
                    first = !first;
                    action = "*";
                    txv_result.setText(display);
                    display = "";
                    pause = true;
                }
                break;
            case R.id.btn_divide:
                if(!display.equals("")&&!pause){
                    if(first){
                        result = Integer.valueOf(txv_result.getText().toString());
                        first = !first;
                        action = "/";
                        txv_result.setText(display);
                        display = "";
                    }else{
                        tmp = Integer.valueOf(txv_result.getText().toString());
                        result = compute(result, action, tmp);
                        action = "/";
                        display = Integer.toString(result);
                        txv_result.setText(display);
                        display = "";
                    }
                    pause = true;
                }else if(display.equals("")&&!pause){
                    result = Integer.valueOf(txv_result.getText().toString());
                    first = !first;
                    action = "/";
                    txv_result.setText(display);
                    display = "";
                    pause = true;
                }
                break;
            case R.id.btn_clear:
                pause = true;
                first = true;
                action = "";
                tmp = 0;
                result = 0;
                display = "";
                txv_result.setText(display);
                break;
            case R.id.btn_equal:
                if(!display.equals("")&&!pause){
                    if(!first){
                        first = !first;
                        tmp = Integer.valueOf(txv_result.getText().toString());
                        result = compute(result, action, tmp);
                        display = Integer.toString(result);
                        txv_result.setText(display);
                        pause = false;
                        first = true;
                        action = "";
                        tmp = 0;
                        result = 0;
                    }
                }
                break;
        }
    }

    public int compute(int result,String action,int tmp ){
        if(action.equals("+")){
            return result+tmp;
        }else if(action.equals("-")){
            return result-tmp;
        }else if(action.equals("*")){
            return result*tmp;
        }else if(action.equals("/")){
            return result/tmp;
        }
        return 0;
    }
}