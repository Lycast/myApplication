package anthony.brenon.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = findViewById(R.id.recyclerView);


        MyAdapter myAdapter = new MyAdapter(this, initiatePokemon());
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Pokemon> initiatePokemon(){

        /*String[] pokemonNo = getResources().getStringArray((R.array.pokedex_number));
        String[] pokemonName = getResources().getStringArray(R.array.pokemon_name);
        String[] pokemonImages = getResources().getStringArray(R.array.pokemon_image_url);*/
            //Pokemon[] pkmn = new Pokemon[pokemonImages.length];
        Pokemon pokemon1 = new Pokemon("bulbizarre", "001", "https://www.pokepedia.fr/images/4/4e/Miniature_001_LGPE.png");
        Pokemon pokemon2 = new Pokemon("bulbizarre", "002", "https://www.pokepedia.fr/images/f/fb/Miniature_002_LGPE.png");
        Pokemon pokemon3 = new Pokemon("bulbizarre", "003", "https://www.pokepedia.fr/images/6/60/Miniature_003_LGPE.png");
        Pokemon pokemon4 = new Pokemon("bulbizarre", "004", "https://www.pokepedia.fr/images/8/89/Miniature_004_LGPE.png");
        Pokemon pokemon5 = new Pokemon("bulbizarre", "005", "https://www.pokepedia.fr/images/3/35/Miniature_005_LGPE.png");

        List<Pokemon> pkmn = new ArrayList<Pokemon>();
        pkmn.add(pokemon1);
        pkmn.add(pokemon2);
        pkmn.add(pokemon3);
        pkmn.add(pokemon4);
        pkmn.add(pokemon5);

            /*for(int i = 0; i  < pkmn.size(); i++){
                pkmn[i] = new Pokemon(pokemonName[i], pokemonNo[i], pokemonImages[i]);
            }
            return pkmn;
            */

        return pkmn;
    }
}