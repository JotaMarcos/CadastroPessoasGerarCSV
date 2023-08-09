import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

    public void CadastrarPessoas(String nome, String sobreNome, String naturalidade,
                                  String unidadeFederativa, char sexo, String endereco,
                                 String telefone, String dataNascimento, String url) {

        GerarCSV(url);

        try {
            List<String> dadosExistentes = LinhasExistentes(url);
            String linha = nome + ";" + sobreNome + ";" + naturalidade + ";" +
                           unidadeFederativa + ";" + sexo + ";" + endereco + ";" +
                           telefone + ";" + dataNascimento + ";";
            dadosExistentes.add(linha);

            // adicionar o csv
            String todasLinhas = UnicaLinha(dadosExistentes);
            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasLinhas);
            arquivo.close();

        } catch (Exception error) {
            System.out.println("Erro ao gerar o arquivo " + url);
        }


    }

    public String UnicaLinha(List<String> dadosExistentes) {
        String unicaLinha = "";
        for (String linha : dadosExistentes) {
            unicaLinha += linha + "\n";
        }
        return  unicaLinha;
    }

    public void GerarCSV(String url) {

        try {
        File arquivo = new File(url);
        arquivo.createNewFile();

        } catch (Exception erro) {
            System.out.println("Erro ao gerar o arquivo.");
        }
    }


    public List<String> LinhasExistentes(String url) {
        List<String> resultado = new ArrayList<String>();

        try {
            Path path = Paths.get(url);
            resultado = Files.readAllLines(path);
        } catch (Exception erro) {
            System.out.println("Erro ao ler o arquivo.");
        }


        return resultado;
    }

}
