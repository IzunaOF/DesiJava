package Models;

import java.util.UUID;

public class Pessoa {

    private UUID id;
    private String nome;
    private String sobrenome;
    private String documento;


    public Pessoa(String nome, String documento) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.documento = documento;

    }
    
    public Pessoa(UUID id, String nome, String documento){
                this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getDocumento() {
        return documento;
    }
}
