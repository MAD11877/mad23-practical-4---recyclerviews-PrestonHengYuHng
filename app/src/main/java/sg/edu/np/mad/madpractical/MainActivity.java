package sg.edu.np.mad.madpractical;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.practical4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Operations when follow button is clicked
        Button btnFollow = findViewById(R.id.btnFollow);
        btnFollow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Button button = (Button) view;
                if (UserTest.Followed == false){
                    button.setText("Unfollow");
                    UserTest.Followed = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }

                else {
                    button.setText("Follow");
                    UserTest.Followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // get name from MyAdapter
        TextView name = findViewById(R.id.editTextText);
        Intent i = getIntent();
        String s1 = i.getStringExtra("name");
        name.setText(s1);

        //get description from MyAdapter
        TextView desc = findViewById(R.id.textView);
        String s2 = i.getStringExtra("desc");
        desc.setText("Description: " + s2);


        // Operations when message button is clicked -> Go into message group
        Button msgButton = findViewById(R.id.MsgButton);
        msgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(intent);
            }
        });

    }
}