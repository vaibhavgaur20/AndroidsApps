package app.com.interactivestory.UI;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import app.com.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameField ;
    private Button  startButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText) findViewById(R.id.nameEditText);
        startButton = (Button) findViewById(R.id.startButton);


        startButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String name = nameField.getText().toString();

                //Toast.makeText(MainActivity.this,"Hi "+name,Toast.LENGTH_SHORT).show();

                startStory(name);

            }
        });



    }

                private void startStory(String name)
                {
                    Intent intent = new Intent(this,StoryActivity.class);

                    Resources resources = getResources();

                    String Key = resources.getString(R.string.key_name);
                    intent.putExtra(Key,name);
                    startActivity(intent);



                }
}
