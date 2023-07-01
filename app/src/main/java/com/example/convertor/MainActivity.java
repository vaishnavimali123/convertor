//package com.example.convertor;

//import androidx.appcompat.app.AppCompatActivity;

//import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//=    }
//}






package com.example.convertor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void meterTofeet(View view){
        EditText userInputText;


        userInputText=findViewById(R.id.convert);


        String userInputString=userInputText.getText().toString();

        double userInputDouble=Double.parseDouble(userInputString);

        double outputDouble=(userInputDouble)*3.28084;

        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of Length from Meter to Feet is "+outputString,Toast.LENGTH_LONG).show();

    }

    public void feetTometer(View view){
        EditText userInputText;


        userInputText=findViewById(R.id.convert);


        String userInputString=userInputText.getText().toString();
        double userInputDouble=Double.parseDouble(userInputString);
        double outputDouble=(userInputDouble)*0.304;
        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of Length from Feet to Meter is "+outputString,Toast.LENGTH_LONG).show();

    }
}