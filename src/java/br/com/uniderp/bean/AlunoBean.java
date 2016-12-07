package br.com.uniderp.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AlunoBean {

    private Integer Id;
    private String ra;
    private String nome;
    private Double n1;
    private Double n2;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double calculaMedia(Double n1, Double n2) {
        return (n1 + n2) / 2;
    }

    public String situacao(Double caculaMedia) {
        if (caculaMedia < 3) {
            return "reprovado";
        } else if (caculaMedia > 3 && caculaMedia < 7) {
            return "exame";
        } else {
            return "aprocado";
        }
    }
}
