
package br.com.uniderp.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class EstatisticaBean extends AlunoBean{
    private AlunoBean alunoBean = new AlunoBean();
    private List<AlunoBean> alunos =new ArrayList<AlunoBean>();
    
    public void adicionarAlunos(){
        alunos.add(alunoBean);
        alunoBean = new AlunoBean();
    }

    public AlunoBean getAlunoBean() {
        return alunoBean;
    }

    public void setAlunoBean(AlunoBean alunoBean) {
        this.alunoBean = alunoBean;
    }

    public List<AlunoBean> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoBean> alunos) {
        this.alunos = alunos;
    }
    
}
