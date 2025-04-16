import jakarta.persistence.*;

@Entity
@Table(name="tbl_jogo")
public class Jogo{
    @Id
    private String titulo;
    private String plataforma;
    private String genero;
    private float  preco;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
}