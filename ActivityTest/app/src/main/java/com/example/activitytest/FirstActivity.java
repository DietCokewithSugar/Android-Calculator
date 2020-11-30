package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        editText=(EditText) findViewById(R.id.edit_text);
        Button button1=(Button) findViewById(R.id.button_1);
        Button button2=(Button) findViewById(R.id.button_2);
        Button button3=(Button) findViewById(R.id.button_3);
        Button button4=(Button) findViewById(R.id.button_4);
        Button button5=(Button) findViewById(R.id.button_5);
        Button button6=(Button) findViewById(R.id.button_6);
        Button button7=(Button) findViewById(R.id.button_7);
        Button button8=(Button) findViewById(R.id.button_8);
        Button button9=(Button) findViewById(R.id.button_9);
        Button button0=(Button) findViewById(R.id.button_0);
        Button button_add=(Button) findViewById(R.id.button_add);
        Button button_sub=(Button) findViewById(R.id.button_sub);
        Button button_mul=(Button) findViewById(R.id.button_mul);
        Button button_div=(Button) findViewById(R.id.button_div);
        Button button_del=(Button) findViewById(R.id.button_del);
        Button button_neg=(Button) findViewById(R.id.button_neg);
        Button button_equ=(Button) findViewById(R.id.button_equ);
        Button button_pt=(Button) findViewById(R.id.button_pt);
        Button button_pc=(Button) findViewById(R.id.button_pc);
        Button button_fac=(Button) findViewById(R.id.button_fac);
        Button button_c=(Button) findViewById(R.id.button_c);
        Button button_root=(Button) findViewById(R.id.button_root);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_del.setOnClickListener(this);
        button_neg.setOnClickListener(this);
        button_equ.setOnClickListener(this);
        button_pt.setOnClickListener(this);
        button_pc.setOnClickListener(this);
        button_fac.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_root.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String et = editText.getText().toString();
        switch (v.getId()) {
            case R.id.button_0:
                if(et.equals("0"))
                    et="0";
                else
                    et+="0";
                editText.setText(et);
                break;
            case R.id.button_1:
                if(et.equals("0"))
                    et="1";
                else
                    et+="1";
                editText.setText(et);
                break;
            case R.id.button_2:
                if(et.equals("0"))
                    et="2";
                else
                    et+="2";
                editText.setText(et);
                break;
            case R.id.button_3:
                if(et.equals("0"))
                    et="3";
                else
                    et+="3";
                editText.setText(et);
                break;
            case R.id.button_4:
                if(et.equals("0"))
                    et="4";
                else
                    et+="4";
                editText.setText(et);
                break;
            case R.id.button_5:
                if(et.equals("0"))
                    et="5";
                else
                    et+="5";
                editText.setText(et);
                break;
            case R.id.button_6:
                if(et.equals("0"))
                    et="6";
                else
                    et+="6";
                editText.setText(et);
                break;
            case R.id.button_7:
                if(et.equals("0"))
                    et="7";
                else
                    et+="7";
                editText.setText(et);
                break;
            case R.id.button_8:
                if(et.equals("0"))
                    et="8";
                else
                    et+="8";
                editText.setText(et);
                break;
            case R.id.button_9:
                if(et.equals("0"))
                    et="9";
                else
                    et+="9";
                editText.setText(et);
                break;
            case R.id.button_pt:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.'||(!et.contains("+")&&!et.contains("-")&&!et.contains("×")&&!et.contains("÷")&&et.contains("."))){
                    Toast.makeText(FirstActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else{
                    et+=".";
                    editText.setText(et);
                }
                break;
            case R.id.button_add:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.'){
                    Toast.makeText(FirstActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else{
                    et+="+";
                    editText.setText(et);
                }
                break;
            case R.id.button_sub:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.'){
                    Toast.makeText(FirstActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else{
                    et+="-";
                    editText.setText(et);
                }
                break;
            case R.id.button_mul:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.'){
                    Toast.makeText(FirstActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else{
                    et+="×";
                    editText.setText(et);
                }
                break;
            case R.id.button_div:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.'){
                    Toast.makeText(FirstActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else{
                    et+="÷";
                    editText.setText(et);
                }
                break;
            case R.id.button_del:
                if(et.length()>1){
                    if(et.length()==2&&et.charAt(0)=='-')
                    {
                        et="0";
                    }
                    else
                    et=et.substring(0,et.length()-1);
                }
                else{
                    et="0";
                }
                editText.setText(et);
                break;
            case R.id.button_c:
                et="0";
                editText.setText(et);
                break;
            case R.id.button_equ:
                if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'){
                    Toast.makeText(FirstActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();
                    editText.setText(et);
                }
                else {
                        String res = getResult();
                        if (res.contains("Infinity")) {
                            Toast.makeText(FirstActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();
                            editText.setText("0");
                        } else {
                            editText.setText(res);
                        }
                    }
                break;
            case R.id.button_pc:
                double per=Double.parseDouble(et);
                per=per/100;
                String per1=""+per;
                per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                editText.setText(per1);
                break;
            case R.id.button_neg:
            if(et.charAt(0)>='0'&&et.charAt(0)<='9')
            {
                if(et.equals("0"))
                {
                    editText.setText("0");
                }
                else{
                    editText.setText("-"+et);
                }
            }
            else if(et.charAt(0)=='-')
                editText.setText(et.substring(1,et.length()));
            else
                editText.setText(et);
            break;
            case R.id.button_fac:
                if(et.contains("."))
                {
                    Toast.makeText(FirstActivity.this, "Not integer!", Toast.LENGTH_SHORT).show();
                }
                else if(et.charAt(0)=='-')
                {
                    Toast.makeText(FirstActivity.this, "Not positive!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(et.equals("0"))
                    {
                        et="1";
                        editText.setText(et);
                    }
                    else
                    {
                        double num= Integer.parseInt(et);
                        double result=1;
                        for(int i=1;i<=num;i++)
                        {
                            result=result*i;
                        }
                        et=""+result;
                        editText.setText(et);
                    }
                }
                break;
            case R.id.button_root:
                if(et.charAt(0)=='-'){
                    Toast.makeText(FirstActivity.this,"Negative numbers cannot be squared!",Toast.LENGTH_SHORT).show();
                    editText.setText("0");
                }
                else if(et.contains("+")||et.contains("-")||et.contains("×")||et.contains("÷")){
                    Toast.makeText(FirstActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    editText.setText("0");
                }
                else{
                    double x=Double.parseDouble(et);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    editText.setText(x2);
                }
                break;
            default:
                break;
        }
    }
    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix) {
        Stack<String> stack = new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix = new StringBuffer(infix.length() * 2);   //后缀表达式字符串
        int i = 0;
        while (i < infix.length()) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                    while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch + ""); //ch入栈
                    i++;
                    break;
                case '-':
                    if (i==0) {
                        postfix.append(0);
                        postfix.append(" ");
                        stack.push("(");
                        stack.push(ch + "");//ch入栈
                        i++;
                    } else {
                        while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                            postfix.append(stack.pop());   //且添加到后缀表达式串
                        stack.push(ch + ""); //ch入栈
                        i++;
                    }
                    break;

                case '×':
                case '÷':
                    while (!stack.isEmpty() && (stack.peek().equals("×") || stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                default:
                    if(i==1&&infix.charAt(0)=='-') {
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                        postfix.append('-');   //添加到后缀表达式串
                        stack.pop(); //弹出"-"
                        stack.pop();   //把此时位于栈顶的"("弹出
                    }
                    else
                    {
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                    }
            }
        }
            while (!stack.isEmpty())       //所有运算符出栈
                postfix.append(stack.pop());   //添加到后缀表达式中
            return postfix;
    }

    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' '&&ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }
                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = editText.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }
}
