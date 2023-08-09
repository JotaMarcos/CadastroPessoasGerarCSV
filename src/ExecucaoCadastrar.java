public class ExecucaoCadastrar {

    public static void main(String[] args) throws Exception {

        String url = "files/pessoas.csv";

        Cadastrar cadastrar = new Cadastrar();

        cadastrar.CadastrarPessoas(
                                    "João Marcos", "Aires Duarte",
                                "Humaitá", "Amazonas",
                                      'M', "Rua dos Anzóis, 51, Budapeste",
                                    "(92) 99999-6677", "28/02/1985",
                                            url
                                  );

        cadastrar.CadastrarPessoas(
                "Poliane", "Cardoso Duarte",
                "Novo Aripuanã", "Amazonas",
                'F', "Rua Alfonso Pessoa, 123, Clarinda",
                "(92) 98877-6543", "15/01/1988",
                url
        );

        cadastrar.CadastrarPessoas(
                "Ellen", "Cardoso Duarte",
                "Humaitá", "Amazonas",
                'F', "Rua Flores, 367, São José",
                "(92) 99155-3216", "06/01/2006",
                url
        );

        cadastrar.CadastrarPessoas(
                "Elz", "Aires Duarte",
                "Manaus", "Amazonas",
                'F', "Rua Bom Jesus, 55, Japiim",
                "(92) 99876-4316", "17/09/1967",
                url
        );

        cadastrar.CadastrarPessoas(
                "Juqinha", "Aires Duarte",
                "Manaus", "Amazonas",
                'M', "Rua dos Anzóis, 51, Budapeste",
                "(92) 94587-8591", "18/12/1981",
                url
        );

        cadastrar.CadastrarPessoas(
                "Bereh", "Lopes Aires Duarte",
                "Humaitá", "Amazonas",
                'F', "Rua das Flores, 367, São José",
                "(92) 99546-3216", "10/12/1995",
                url
        );

        cadastrar.CadastrarPessoas(
                "Neto", "Lopes Aires Duarte",
                "Humaitá", "Amazonas",
                'M', "Rua das Flores, 367, São José",
                "(92) 96395-5588", "10/03/1991",
                url
        );


        System.out.println("Arquivo foi gerado com sucesso!");

    }

}
