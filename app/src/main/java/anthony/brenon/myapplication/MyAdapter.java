package anthony.brenon.myapplication;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by Lycast on 11/07/2021.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Pokemon mPokemons[];
    private Context mContext;

    public MyAdapter(Context ct, Pokemon[] pokemons){
        mContext = ct;
        this.mPokemons = pokemons;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        Pokemon pokemon = mPokemons[position];

        holder.tvPkmnName.setText(pokemon.getName());
        holder.tvPkmnNumero.setText(pokemon.getNumero());
        Glide.with(mContext)
                .load(pokemon.getImage())
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(holder.imgPkmn);
        Log.d("test", "no hash : " + holder.imgPkmn.hashCode());
    }

    @Override
    public int getItemCount() {
        return mPokemons.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvPkmnName, tvPkmnNumero;
        ImageView imgPkmn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPkmnName = itemView.findViewById(R.id.name_pkm);
            tvPkmnNumero = itemView.findViewById(R.id.no_pkm);
            imgPkmn = itemView.findViewById(R.id.img_pokemon);
        }
    }
}
