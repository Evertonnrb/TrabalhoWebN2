package br.com.uniderp.dal;


import br.com.uniderp.bean.AlunoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlunoDao {

    private static Connection con = Conexao.getConnection();

    public void cadastrarNotas(AlunoBean aluno) {
        String sql = "insert into aluno (ra,nome,n1,n2)values(?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aluno.getRa());
            pst.setString(2, aluno.getNome());
            pst.setDouble(3, aluno.getN1());
            pst.setDouble(4, aluno.getN2());
            pst.execute();
            System.out.println("salvo");
            pst.close();
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    public void calculamedia(AlunoBean aluno) {
        String sql = "insert into aluno (media,situacao)values(?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1, aluno.calculaMedia(aluno.getN1(), aluno.getN2()));
            pst.setString(2, aluno.situacao(aluno.calculaMedia(aluno.getN1(), aluno.getN2())));
            pst.execute();
            System.out.println("sucesso");
            pst.close();
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }
//    public Aluno buscarTodos(){
//        String sql = "select*from aluno";
//        List<Aluno>alunos = new ArrayList<Aluno>();
//        try {
//            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//            while(rs.next()){
//                Estatistica estatistica = new Estatistica();
//                estatistica.totalizador(calculamedia(estatistica)).setInt(rs.getInt("aprovados"));
//                estatistica.totalizador(calculamedia(estatistica)).setInt(rs.getInt("reprovados"));
//                estatistica.totalizador(calculamedia(estatistica)).setInt(rs.getInt("exame"));
//                alunos.add(estatistica);
//            }
//            
//        } catch (Exception e) {
//        }
//    }
}
