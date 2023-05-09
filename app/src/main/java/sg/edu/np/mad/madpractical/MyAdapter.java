package sg.edu.np.mad.madpractical;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practical4.R;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    public Context context;
    public List<UserTest> users;

    public MyAdapter(Context context, List<UserTest> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final UserTest data_position = users.get(position);
        holder.nameView.setText(users.get(position).getName());
        holder.descView.setText("Description: " + users.get(position).getDescription());
        holder.imageview.setImageResource(users.get(position).getImg());
        holder.imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Profile");
                builder.setMessage("Name: " + data_position.getName());
                builder.setCancelable(true);
                builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        intent.putExtra("name", data_position.getName());
                        intent.putExtra("desc", data_position.getDescription());
                        v.getContext().startActivity(intent);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                Toast.makeText(v.getContext(), "Name: " + data_position.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView nameView, descView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageView3);
            nameView = itemView.findViewById(R.id.name);
            descView = itemView.findViewById(R.id.description);
        }


    }


}
