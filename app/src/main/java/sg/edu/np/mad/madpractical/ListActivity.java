package sg.edu.np.mad.madpractical;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practical4.R;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<UserTest> userList = new ArrayList<>();
        userList.add(new UserTest("John", "147238472123", 1, false));
        userList.add(new UserTest("Samantha", "684239081930", 2, true));
        userList.add(new UserTest("Tom", "490234801739", 3, false));
        userList.add(new UserTest("Emily", "981273402890", 1, true));
        userList.add(new UserTest("Michael", "209834012738", 2, false));
        userList.add(new UserTest("Avery", "873240981723", 3, true));
        userList.add(new UserTest("David", "018237401283", 1, false));
        userList.add(new UserTest("Emma", "781239408123", 2, true));
        userList.add(new UserTest("Nathan", "923840129380", 3, false));
        userList.add(new UserTest("Olivia", "193847203984", 1, true));
        userList.add(new UserTest("Ryan", "129837401273", 2, false));
        userList.add(new UserTest("Sophia", "384739278432", 3, true));
        userList.add(new UserTest("Daniel", "230948123047", 1, false));
        userList.add(new UserTest("Grace", "983240981230", 2, true));
        userList.add(new UserTest("Jacob", "120934809172", 3, false));
        userList.add(new UserTest("Isabella", "890123048723", 1, true));
        userList.add(new UserTest("Eric", "481209384710", 2, false));
        userList.add(new UserTest("Chloe", "238409812093", 3, true));
        userList.add(new UserTest("William", "102938472910", 1, false));
        userList.add(new UserTest("Madison", "987120934821", 2, true));
        userList.add(new UserTest("Andrew", "481203984712", 3, false));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),userList));




    }

}
