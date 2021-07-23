package anthony.brenon.myapplication;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.ref.WeakReference;

/**
 * Created by Lycast on 20/07/2021.
 */
public class PokemonViewHolder extends RecyclerView.ViewHolder /*implements View.OnClickListener*/{

    TextView tvPkmnName, tvPkmnNumber;
    ImageView imgPkmn;
    ImageButton imgCross;

    //private WeakReference<MyAdapter.Listener> callbackWeakRef;

    public PokemonViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPkmnName = itemView.findViewById(R.id.name_pkm);
        tvPkmnNumber = itemView.findViewById(R.id.no_pkm);
        imgPkmn = itemView.findViewById(R.id.img_pokemon);
        imgCross = itemView.findViewById(R.id.img_cross);
    }
}
