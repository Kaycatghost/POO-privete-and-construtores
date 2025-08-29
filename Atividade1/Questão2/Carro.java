public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
}
