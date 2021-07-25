package anthony.brenon.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import anthony.brenon.myapplication.R;
import anthony.brenon.myapplication.adapter.MyAdapter;
import anthony.brenon.myapplication.callback.Listener;
import anthony.brenon.myapplication.global.ItemClickSupport;
import anthony.brenon.myapplication.model.Pokemon;

public class HomeActivity extends AppCompatActivity implements Listener {

    private RecyclerView mRecyclerView;
    private List<Pokemon> pokemonList;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mRecyclerView = findViewById(R.id.recyclerView);


        myAdapter = new MyAdapter(this, initiatePokemon(), this);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        configureOnClickRecyclerView();
    }

    private List<Pokemon> initiatePokemon(){

        Pokemon pokemon001 = new Pokemon("Bulbizarre", "001", "https://www.pokepedia.fr/images/4/4e/Miniature_001_LGPE.png", "Bulbizarre est un petit quadrupède vert avec une tête large. Il porte un bulbe sur son dos. Ce dernier lui sert également d'organe de stockage, puisqu’on rapporte notamment qu’en période de sécheresse, il peut survivre plusieurs jours sans manger grâce à l’énergie qui y est accumulée. Il a des taches foncées sur le corps faisant penser à un batracien. Son bulbe grandit en permanence en absorbant les rayons du soleil, et lorsque le poids du bulbe sera trop grand et empêchera Bulbizarre de se dresser sur ses deux pattes arrière, cela signifiera que son évolution en Herbizarre est proche.");
        Pokemon pokemon002 = new Pokemon("Herbizarre", "002", "https://www.pokepedia.fr/images/f/fb/Miniature_002_LGPE.png", "Herbizarre est un Pokémon quadrupède, semblable à un dinosaure. Il a un corps bleu vert, avec des taches plus foncées. Deux dents pointues proviennent de sa mâchoire supérieure, et ses yeux se sont rétrécis et sont devenus pourpres. Il a sur le haut de sa tête deux oreilles pointues remplies de noir. Il a un petit museau rond et une large bouche. Chacun de ses pieds possède trois griffes. Le bulbe sur son dos a fleuri et est devenu un gros bourgeon rose dont le poids est tel qu'il empêche Herbizarre de se tenir sur ses pattes postérieures trop longtemps. Une petite tige marron, entourée par quatre larges feuilles, soutient le bourgeon.");
        Pokemon pokemon003 = new Pokemon("Florizarre", "003", "https://www.pokepedia.fr/images/6/60/Miniature_003_LGPE.png", "Florizarre est un imposant quadrupède à la peau verte ayant l'aspect d'un batracien, il est beaucoup plus grand et lourd que Bulbizarre et Herbizarre. Il porte une grande fleur sur son dos, entourée de quatre grandes feuilles. L’intérieur de ses oreilles s'est coloré de rouge et sa peau au niveau de ses pattes est désormais recouverte d'excroissances faisant penser aux verrues d'un crapaud. Sa bouche est ornée de six petites canines. Chacun de ses pas provoque un tremblement du sol. Sa fleur émet un parfum qui calme les esprits et appâte les Pokémon. Ce parfum est plus entêtant après une journée de pluie. La fleur permet aussi à Florizarre d'absorber les rayons du soleil pour se soigner ou être plus efficace en combat.");
        Pokemon pokemon004 = new Pokemon("Salameche", "004", "https://www.pokepedia.fr/images/8/89/Miniature_004_LGPE.png","Salamèche est un Pokémon bipède et reptilien avec un corps orange tandis que son ventre et la plante de ses pieds sont jaunes. Ses bras et ses jambes sont courts, avec respectivement quatre doigts et trois griffes chacune. Une flamme brûle au bout de la svelte queue de Salamèche, et elle flamboie depuis sa naissance. La flamme peut servir d'indication quant à la santé et à l'humeur de Salamèche : elle brûle fièrement quand le Pokémon est en pleine forme, doucement si le Pokémon est faible ou triste, ondoie quand il est heureux et flamboie quand il est en colère. Il est dit que le Salamèche meurt si sa flamme s'éteint.");
        Pokemon pokemon005 = new Pokemon("Reptincel", "005", "https://www.pokepedia.fr/images/3/35/Miniature_005_LGPE.png","Reptincel est tiré du dinosaure ; il possède de grandes et puissantes griffes acérées, qui l'aident notamment à déchirer la peau de ses ennemis lors des combats. Sa peau est devenue plus foncée et son museau s’est allongé. Son crâne est désormais doté d'une crête. Sa queue, longue et terminée par une flamme, lui sert notamment à élever sa température, le rendant plus puissant en combat, et à faire chuter ses adversaires avant de les achever.");
        Pokemon pokemon006 = new Pokemon("Dracaufeu", "006", "https://www.pokepedia.fr/images/6/68/Miniature_006_LGPE.png","Dracaufeu est basé sur un dragon européen. Contrairement à ses pré-évolutions, il a deux ailes lui permettant de voler : l'intérieur des ailes est bleu alors que leur verso est orange. Son cou s'est développé, il est désormais plus long et deux crêtes ont poussé à l'arrière de son crâne. Ses membres supérieurs se sont atrophiés tandis que sa queue s’est allongée pour permettre à ce titan de garder une certaine stabilité au sol bien qu'il soit plus à l'aise dans les airs. Sa dentition, avec ses canines apparentes, révèle une préférence marquée pour la viande ; il possède trois griffes à chaque patte et a le ventre jaune pâle. Pokémon noble, il n'attaque pas les plus faibles que lui et cherche toujours des adversaires plus forts. Après un combat difficile ou s'il est en colère, sa flamme s'intensifie et devient blanc-bleu. Il crache des flammes pouvant faire fondre n'importe quoi et est souvent la cause d'incendies.");
        Pokemon pokemon007 = new Pokemon("Carapuce", "007", "https://www.pokepedia.fr/images/9/95/Miniature_007_LGPE.png","Carapuce est une petite tortue bipède de couleur bleue. Il possède une carapace majoritairement brune, jaune pâle au niveau du ventre. Ses yeux sont grands et violacés. Il a une queue avec un motif de spirale à son extrémité. Il possède quatre pattes avec chacune trois doigts.\n" +"Sa carapace, molle à la naissance, durcit avec le temps et lui sert à se protéger pour lancer ensuite des jets d'eau ou d'écume, mais aussi à améliorer son hydrodynamisme.");
        Pokemon pokemon008 = new Pokemon("Carabaffe", "008", "https://www.pokepedia.fr/images/b/b6/Miniature_008_LGPE.png", "Carabaffe est une tortue bipède de couleur bleu indigo, dont la queue et les oreilles sont recouvertes d'une fourrure duveteuse de couleur blanche. Ses grands yeux sont marron. Trois griffes ornent chacune de ses pattes, et une épaisse carapace le protège des coups.\n" + "Carabaffe est fait pour le combat : des canines affleurent sur ses lèvres, sa queue peut administrer de puissantes volées de coups et ses pattes robustes lui permettent de résister aux chocs. Il semble pouvoir nager extrêmement vite, notamment à l'aide de ses oreilles et de sa queue.\n" + "Il serait inspiré d’un cryptide japonais : Minogame, avec lequel il partage les oreilles et la queue.");
        Pokemon pokemon009 = new Pokemon("Tortank", "009", "https://www.pokepedia.fr/images/7/73/Miniature_009_LGPE.png","Tortank est un bipède massif de la famille des tortues. Les extrémités supérieures gauche et droite de sa carapace sont ornées d'un canon à eau pouvant être orienté dans diverses directions. Formé au combat, sa tête s'est endurcie : le duvet de Carabaffe n'est plus présent et il possède désormais deux petites oreilles et une queue courte. Ses griffes se sont maintenant développées sur tous ses doigts et ses yeux n'ont pas changé de couleur.");
        Pokemon pokemon010 = new Pokemon("Chenipan", "010", "https://www.pokepedia.fr/images/1/11/Miniature_010_LGPE.png","Chenipan est un Pokémon serpentin ressemblant aux larves de Papilio troilus. Il a le corps d'une chenille verte avec des marques jaunes en forme d'anneaux sur les flancs. Il possède également de grands yeux jaunes aux pupilles noires. Sa caractéristique la plus notable est l'antenne rouge vif sur sa tête en forme de « Y », certainement un osmeterium, qui libère une odeur repoussant les prédateurs. Ses marques en formes d'yeux servent également à effrayer ses ennemis. Ses pattes se terminent par des ventouses, permettant à ce Pokémon d'escalader la plupart des surfaces avec un minimum d'efforts");

        pokemonList = new ArrayList<>();
        pokemonList.add(pokemon001); pokemonList.add(pokemon002); pokemonList.add(pokemon003); pokemonList.add(pokemon004); pokemonList.add(pokemon005);
        pokemonList.add(pokemon006); pokemonList.add(pokemon007); pokemonList.add(pokemon008); pokemonList.add(pokemon009); pokemonList.add(pokemon010);

        return pokemonList;
    }

    private void configureOnClickRecyclerView(){
        ItemClickSupport.addTo(mRecyclerView, R.layout.my_row)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                        Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
                        intent.putExtra("name", pokemonList.get(position).getName());
                        intent.putExtra("number", pokemonList.get(position).getNumero());
                        intent.putExtra("description", pokemonList.get(position).getDescription());
                        intent.putExtra("image", pokemonList.get(position).getImage());
                        startActivity(intent);
                    }
                });
    }

    @Override
    public void onClickDeleteButton(int position) {
        pokemonList.remove(position);
        myAdapter.notifyItemRemoved(position);
        myAdapter.notifyItemRangeChanged(position, pokemonList.size());
    }
}