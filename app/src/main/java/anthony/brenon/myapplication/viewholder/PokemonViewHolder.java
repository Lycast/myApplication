package anthony.brenon.myapplication.viewholder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.ref.WeakReference;

import anthony.brenon.myapplication.R;
import anthony.brenon.myapplication.callback.Listener;

/**
 * Created by Lycast on 20/07/2021.
 */
public class PokemonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvPkmnName, tvPkmnNumber;
    public ImageView imgPkmn;
    public ImageButton imgCross;

    private Listener callback;

    public PokemonViewHolder(@NonNull View itemView, Listener callback) {
        super(itemView);
        this.callback = callback;
        tvPkmnName = itemView.findViewById(R.id.name_pkm);
        tvPkmnNumber = itemView.findViewById(R.id.no_pkm);
        imgPkmn = itemView.findViewById(R.id.img_pokemon);
        imgCross = itemView.findViewById(R.id.img_cross);

        imgCross.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (callback != null) {
            callback.onClickDeleteButton(getAdapterPosition());
        }
    }
}
