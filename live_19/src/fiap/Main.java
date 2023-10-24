package fiap;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import model.Game;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String senha = "xxxxxxxxxxxxx";
        
        try {
            //Apontar o driver
            Class.forName("oracle.jdbc.OracleDriver");
            //Abrimos uma conexao do tipo Connection que passar url, login e senha para conhecer no banco de dados
            Connection conexao = DriverManager.getConnection(url, user, senha);
            //Mensagem conexão de sucesso
            System.out.println("Conectado com sucesso");

            //INSERT GAME NO BANCO  ///////////////////////////////////////////////
            // //Criar o objeto que será persistido no banco
            // Game game = new Game();
            // game.setTITULO("Street Fighter III");
            // game.setDATA_LANCAMENTO(LocalDate.of(2016,7,16));
            // game.setFINALIZADO(true);

            // //Cria String que armazena o texto String
            // String comandoSql = "INSERT INTO TBL_GAME (CODIGO,TITULO,DATA_LANCAMENTO,FINALIZADO)" 
            //         + "VALUES (SQ_GAME.NEXTVAL, ?, ?, ?)";
            // //Cria o objeto que envia o comando SQL para o banco - preparestatement precisa receber em seguida os valores do conteudos faltantes
            // PreparedStatement ps = conexao.prepareStatement(comandoSql);
            // //Passando o primeiro parâmetro do Titulo
            // ps.setString(1, game.getTITULO());
            // //Fazendo um casting para transformar o LocalDate em Date, usando Date.valueOf - fizemos isso por no banco esta Date e aqui esta LocalDate
            // Date data = Date.valueOf(game.getDATA_LANCAMENTO());
            // //Passando o segundo paramtro data
            // ps.setDate(2, data);
            // //Funçaõ ternaria - Casting de boolean, por aqui esta boolean e la o "finalizado" esta como tipo numerico...se for true preenche com 1 se não preenche com 0
            // int finalizado = game.isFINALIZADO() == true ? 1 : 0;
            // //Passando o terceiro parametro;
            // ps.setInt(3, finalizado);
            //Executa o comando
            // ps.execute();

            // //DELETE PELO CODIGO/////////////////////////////////////////////////
            // String comandoSql = "DELETE FROM TBL_GAME WHERE CODIGO = ?";
            // PreparedStatement ps = conexao.prepareStatement(comandoSql);
            // ps.setInt(1,6);
            //Executa o comando
            // ps.execute();

            // //SELECT PELO CODIGO////////////////////////////////////////////////
            // String sql = "SELECT * FROM TBL_GAME WHERE CODIGO = ?";
            // PreparedStatement ps= conexao.prepareStatement(sql);
            // ps.setInt(1, 5);
            // //cria uma variavel do tipo resultset, na qual recebe o preparestantemet.excuteQuery
            // ResultSet resultado = ps.executeQuery();
            // //Correr os resultado
            // if (resultado.next()) {

            //     Game g= new Game();
            //     g.setCODIGO(resultado.getInt("CODIGO"));
            //     g.setTITULO(resultado.getString("TITULO"));
            //     Date dt=  resultado.getDate("DATA_LANCAMENTO");
            //     g.setDATA_LANCAMENTO(dt.toLocalDate());
            //     int finalizado = resultado.getInt("FINALIZADO");
            //     g.setFINALIZADO(finalizado == 1 ? true : false);

            //     System.out.println(g);
            // // }

            // //Executa o comando
            // ps.execute();
            // //Fecho o preparedStatement e a conexao
            // ps.close();
            // conexao.close();






        } catch (ClassNotFoundException e) {
            System.out.println("Erro na conexão, Driver não encontrado " + e.getMessage());
        } catch (SQLException e) {
                System.out.println("Erro na conexão tipo SQL Exeption " + e.getMessage());
        }

    }
    
}
