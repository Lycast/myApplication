package anthony.brenon.myapplication.model;

/**
 * Created by Lycast on 10/07/2021.
 */
public class Pokemon{

    private String name;
    private String numero;
    private String image;
    private String description;

    public Pokemon(String name, String numero, String imageUrl, String description) {
        this.name = name;
        this.numero = numero;
        this.image = imageUrl;
        this.description = description;
    }

    public String getDescription() { return description; }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNumero() { return numero; }
}
