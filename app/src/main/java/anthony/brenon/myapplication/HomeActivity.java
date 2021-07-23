package anthony.brenon.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Pokemon> pkmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mRecyclerView = findViewById(R.id.recyclerView);


        MyAdapter myAdapter = new MyAdapter(this, initiatePokemon());
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        configureOnClickRecyclerView();
    }

    private List<Pokemon> initiatePokemon(){

        /*
        String[] pokemonNo = getResources().getStringArray((R.array.pokedex_number));
        String[] pokemonName = getResources().getStringArray(R.array.pokemon_name);
        String[] pokemonImages = getResources().getStringArray(R.array.pokemon_image_url);
        Pokemon[] pkmn = new Pokemon[pokemonImages.length];
          for(int i = 0; i  < pkmn.size(); i++){
            pkmn[i] = new Pokemon(pokemonName[i], pokemonNo[i], pokemonImages[i]);
        }
        return pkmn;
        */
        Pokemon pokemon001 = new Pokemon("Bulbizarre", "001", "https://www.pokepedia.fr/images/4/4e/Miniature_001_LGPE.png");
        Pokemon pokemon002 = new Pokemon("Herbizarre", "002", "https://www.pokepedia.fr/images/f/fb/Miniature_002_LGPE.png");
        Pokemon pokemon003 = new Pokemon("Florizarre", "003", "https://www.pokepedia.fr/images/6/60/Miniature_003_LGPE.png");
        Pokemon pokemon004 = new Pokemon("Salameche", "004", "https://www.pokepedia.fr/images/8/89/Miniature_004_LGPE.png");
        Pokemon pokemon005 = new Pokemon("Reptincel", "005", "https://www.pokepedia.fr/images/3/35/Miniature_005_LGPE.png");
        Pokemon pokemon006 = new Pokemon("Dracaufeu", "006", "https://www.pokepedia.fr/images/6/68/Miniature_006_LGPE.png");
        Pokemon pokemon007 = new Pokemon("Carapuce", "007", "https://www.pokepedia.fr/images/9/95/Miniature_007_LGPE.png");
        Pokemon pokemon008 = new Pokemon("Carabaffe", "008", "https://www.pokepedia.fr/images/b/b6/Miniature_008_LGPE.png");
        Pokemon pokemon009 = new Pokemon("Tortank", "009", "https://www.pokepedia.fr/images/7/73/Miniature_009_LGPE.png");
        Pokemon pokemon010 = new Pokemon("Chenipan", "010", "https://www.pokepedia.fr/images/1/11/Miniature_010_LGPE.png");

        pkmn = new ArrayList<>();
        pkmn.add(pokemon001); pkmn.add(pokemon002); pkmn.add(pokemon003); pkmn.add(pokemon004); pkmn.add(pokemon005);
        pkmn.add(pokemon006); pkmn.add(pokemon007); pkmn.add(pokemon008); pkmn.add(pokemon009); pkmn.add(pokemon010);

        return pkmn;
    }

    private void configureOnClickRecyclerView(){
        ItemClickSupport.addTo(mRecyclerView, R.layout.my_row)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                        //CHANGER LE TOAST PAR UN INTENT POUR OUVRIR UNE NOUVELLE ACTIVITE CORRESPONDANT A L IMAGE
                        Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
                        startActivity(intent);
                        finish();
                        //Toast toast = Toast.makeText(HomeActivity.this , pkmn.get(position).getName() + " " + pkmn.get(position).getNumero(), Toast.LENGTH_SHORT);
                        //toast.show();
                    }
                });
    }
}