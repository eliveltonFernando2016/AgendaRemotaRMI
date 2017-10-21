import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elivelton
 */
public class Compromisso implements Serializable{
    private Integer id;
    private String data;
    private String hora;
    private String assunto;
    private String descricao;
    private boolean notificacao;

    public Compromisso(Integer id, String data, String hora, String assunto, String descricao, boolean notificacao) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.assunto = assunto;
        this.descricao = descricao;
        this.notificacao = notificacao;
    }

    public Compromisso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(boolean notificacao) {
        this.notificacao = notificacao;
    }
}
