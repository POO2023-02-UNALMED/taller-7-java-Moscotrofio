package comunicacion;
public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        String coma = ", ";
        String alfabeto = "";

        for (int i = 0; i < letras.length - 1; i++) {
            alfabeto += letras[i] + coma;
        }
        
        alfabeto += letras[letras.length - 1];
        return alfabeto;
    }

    public String[] getLetras() {
        return letras;
    }

}

