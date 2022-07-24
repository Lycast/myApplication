package anthony.brenon.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import anthony.brenon.myapplication.R;

public class DescriptionActivity extends AppCompatActivity {

    private ImageView ivPokemon;
    private TextView tvName;
    private TextView tvNumber;
    private TextView tvDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ivPokemon = findViewById(R.id.iv_description);
        tvName = findViewById(R.id.tv_description_name);
        tvNumber = findViewById(R.id.tv_description_number);
        tvDescription = findViewById(R.id.tv_description);

        getInfoPokemon();
    }

    private void getInfoPokemon() {
        String name = getIntent().getExtras().getString("name");
        tvName.setText(name);
        String number = getIntent().getExtras().getString("number");
        tvNumber.setText(number);
        String description = getIntent().getExtras().getString("description");
        tvDescription.setText(description);
        String image = getIntent().getExtras().getString("image");
        Glide.with(this)
                .load(image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(ivPokemon);
    }
}