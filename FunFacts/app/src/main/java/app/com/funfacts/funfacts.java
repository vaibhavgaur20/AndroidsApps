
package app.com.funfacts;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class funfacts extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private TextView mFactTextView ;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfacts);
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.RelativeLayout);

        View.OnClickListener listner = new View.OnClickListener()
        {
          public void onClick(View v)
          {
            String fact = mFactBook.getFact();
              int color = mColorWheel.getColor();



              mFactTextView.setText(fact);
              mRelativeLayout.setBackgroundColor(color);
              mShowFactButton.setTextColor(color);


          }
        };
        mShowFactButton.setOnClickListener(listner);

        //Toast.makeText(this, "Opening...", Toast.LENGTH_SHORT).show();

        Log.d("Funfacts","we'r logging from OnCreate() method !!!");
    }
}
