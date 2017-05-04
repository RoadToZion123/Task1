package epam.androidlab.com.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    EditText address, subject, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Считывание строки из модуля hometask и  помещение  ее  в  текстовый  вид
        /*String newText  =  MainActivity.this.getString(R.string.newText);
        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText(newText);*/

        btnSend = (Button) findViewById(R.id.btnSend);
        address = (EditText) findViewById(R.id.editTextDest);
        subject = (EditText) findViewById(R.id.editTextTheme);
        message = (EditText) findViewById(R.id.editTextMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(Intent.ACTION_SEND);
                in.setType("text/plain");
                in.putExtra(Intent.EXTRA_EMAIL, new String[]{address.getText().toString()});
                in.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                in.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                startActivity(in);


                /*if (in.resolveActivity(getPackageManager()) != null) {
                    startActivity(in);
                }*/

            }
        });

    }

}
