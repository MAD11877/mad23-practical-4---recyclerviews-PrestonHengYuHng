package sg.edu.np.mad.madpractical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.practical4.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageview;
    TextView nameView, descView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        //imageview = itemView.findViewById(R.id.imageView3);
        nameView = itemView.findViewById(R.id.name);
        descView = itemView.findViewById(R.id.description);
    }
}
