package anthony.brenon.myapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import anthony.brenon.myapplication.callback.Listener;
import anthony.brenon.myapplication.model.Pokemon;
import anthony.brenon.myapplication.viewholder.PokemonViewHolder;
import anthony.brenon.myapplication.R;

/**
 * Created by Lycast on 11/07/2021.
 */
public class MyAdapter extends RecyclerView.Adapter<PokemonViewHolder> {


    private final Listener callback;

    private List<Pokemon> pokemonList;
    private Context context;

    public MyAdapter(Context context, List<Pokemon> pokemonList, Listener callback){
        this.context = context;
        this.pokemonList = pokemonList;
        this.callback = callback;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new PokemonViewHolder(view, callback);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);

        holder.tvPkmnName.setText(pokemon.getName());
        holder.tvPkmnNumber.setText(pokemon.getNumero());
        Glide.with(context)
                .load(pokemon.getImage())
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(holder.imgPkmn);
        Log.d("test", "no hash : " + holder.imgPkmn.hashCode());
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

}
