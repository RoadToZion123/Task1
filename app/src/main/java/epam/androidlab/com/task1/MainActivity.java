package epam.androidlab.com.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Считывание строки из модуля hometask и  помещение  ее  в  текстовый  вид
        String newText  =  MainActivity.this.getString(R.string.newText);
        TextView textView = (TextView) findViewById(R.id.myText);
        textView.setText(newText);

    }
}
