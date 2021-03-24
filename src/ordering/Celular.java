package ordering;

public class Celular implements Precedable{
    private int numero;
    private String celular;

    public Celular(int numero, String celular) {
        this.numero = numero;
        this.celular = celular;
    }

    @Override
    public int precedeA(Object o) {
        Celular celularAComparar = (Celular) o;
        return this.numero-celularAComparar.numero;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", celular='" + celular + '\'' +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
