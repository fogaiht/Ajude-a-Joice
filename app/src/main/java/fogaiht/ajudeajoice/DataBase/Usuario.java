package fogaiht.ajudeajoice.DataBase;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Usuario extends _Default {

    private int id;
    private String nome;
    private String email;
    private String mensagem;


    public Usuario(){
        super();
        this.id = -1;
        this.email = "";
        this.nome = "";
        this.mensagem = "";
    }

    public ArrayList<Usuario> getLista(){
        DB db = new DB();
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ResultSet resultSet = db.select("SELECT * FROM todospelajoice");
            if (resultSet != null){
                while (resultSet.next()){
                    Usuario obj = new Usuario();
                    obj.setId(resultSet.getInt("id"));
                    obj.setNome(resultSet.getString("nome"));
                    obj.setEmail(resultSet.getString("email"));
                    obj.setMensagem(resultSet.getString("mensagem"));
                    lista.add(obj);
                    obj = null;
                }
            }
        }catch (Exception ex){
            this._mensagem = ex.getMessage();
            this._status = false;
        }
        return lista;
    }


    public void salvar(){
        String comando = "";
        if (this.getId() == -1){
            comando = String.format("INSERT INTO todospelajoice (nome, email, mensagem) VALUES ('%s','%s','%s');",
                    this.getNome(),this.getEmail(),this.getMensagem());
        }else{
            comando = String.format("UPDATE todospelajoice SET nome = '%s', email = '%s', mensagem = '%s' WHERE id = %d;",
                    this.getNome(),this.getEmail(),this.getMensagem(),this.getId());
        }
        DB db = new DB();
        db.execute(comando);
        this._mensagem = db._mensagem;
        this._status = db._status;
    }

    public void apagar(){
        String comando = String.format("DELETE FROM todospelajoice WHERE id = %d;",this.getId());
        DB db = new DB();
        db.execute(comando);
        this._mensagem = db._mensagem;
        this._status = db._status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


}
