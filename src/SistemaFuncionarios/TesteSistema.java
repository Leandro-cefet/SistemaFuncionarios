package SistemaFuncionarios;

public class TesteSistema {

    public static void main(String[] args) {

        // 1 - Criando departamento
    	
        Departamento departamento = new Departamento("Tecnologia da Informação");

        // 2 - Criando funcionários
        Funcionario f1 = new Funcionario("João", "121.212.232-11","Programador", 3600);

        Funcionario f2 = new Funcionario("Amanda", "232.343.454-22","Analista", 4000);

        Funcionario f3 = new Funcionario("Pedro", "454.545.654-33","Suporte", 2500);
        
        Funcionario f4 = new Funcionario();

        // 3 - Alterando dados do funcionário default
        
        f4.alterarDados("Rodrigo","123.321.456-54","Gerente",6000);

        // Ativando funcionário (pois o construtor default deixa ativo = false)
        
        f4.aplicarReajuste(0);

        // 4 - Adicionando funcionários
        
        departamento.adicionarFuncionario(f1);
        departamento.adicionarFuncionario(f2);
        departamento.adicionarFuncionario(f3);
        departamento.adicionarFuncionario(f4);

        // 5 - Aplicando reajuste de 15%
        
        f1.aplicarReajuste(15);

        // 6 - Demitindo terceiro funcionário
        
        f3.demitir();

        // 7 - Listando funcionários
        
        departamento.listarFuncionarios();

        // 8 - Exibindo folha salarial
        
        double folha = departamento.calcularFolhaSalarial();

        System.out.println("Folha salarial dos funcionários ativos: R$ " + folha);
    }
}


