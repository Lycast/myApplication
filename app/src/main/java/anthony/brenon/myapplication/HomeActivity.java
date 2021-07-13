package anthony.brenon.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = findViewById(R.id.recyclerView);

        Pokemon[] pokemons = initiatePokemon();

        MyAdapter myAdapter = new MyAdapter(this, pokemons);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private Pokemon[] initiatePokemon(){

        String[] pokemonNo = getResources().getStringArray((R.array.pokedex_number));
        String[] pokemonName = getResources().getStringArray(R.array.pokemon_name);
        String[] pokemonImages = getResources().getStringArray(R.array.pokemon_image_url);

        Pokemon[] pkmn = new Pokemon[pokemonImages.length];

        for(int i = 0; i  < pokemonImages.length; i++){
            pkmn[i] = new Pokemon(pokemonName[i], pokemonNo[i], pokemonImages[i]);
        }

        return pkmn;
    }
}