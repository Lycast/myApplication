package anthony.brenon.myapplication;

/**
 * Created by Lycast on 10/07/2021.
 */
class Pokemon{

    private String name;
    private String numero;
    private String image;

    public Pokemon(String name, String numero, String imageUrl) {
        this.name = name;
        this.numero = numero;
        this.image = imageUrl;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNumero() {
        return numero;
    }
}
