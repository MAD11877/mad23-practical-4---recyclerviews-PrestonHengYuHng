package sg.edu.np.mad.madpractical;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practical4.R;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<UserTest> userList = new ArrayList<>();
        userList.add(new UserTest("Name23742837", "147238472123", 1, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name39842896", "684239081930", 2, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name90247582", "490234801739", 3, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name12584930", "981273402890", 1, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name58291735", "209834012738", 2, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name73649721", "873240981723", 3, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name23798274", "018237401283", 1, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name65938401", "781239408123", 2, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name37294758", "923840129380", 3, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name90487236", "193847203984", 1, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name49823765", "129837401273", 2, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name29384792", "384739278432", 3, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name75839273", "230948123047", 1, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name84592376", "983240981230", 2, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name67298347", "120934809172", 3, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name12093847", "890123048723", 1, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name47923867", "481209384710", 2, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name98234756", "238409812093", 3, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name78349023", "102938472910", 1, R.mipmap.ic_launcher_round,false));
        userList.add(new UserTest("Name23847592", "987120934821", 2, R.mipmap.ic_launcher_round,true));
        userList.add(new UserTest("Name39485729", "481203984712", 3, R.mipmap.ic_launcher_round,false));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(new MyAdapter(getApplicationContext(),userList));
        recyclerView.setAdapter(new MyAdapter(userList)); // <<<=====


    }

}
