package epam.androidlab.com.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PermissionTestServerActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_test_server);

        btnTest = (Button) findViewById(R.id.testBtn);
        btnTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent in = new Intent("epam.androidlab.intent.action.testpermission");
        startActivity(in);

    }
}
