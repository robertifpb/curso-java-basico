class Argumentos3 {
    public static void main (String[] args) {
        System.out.println("Quantidade de argumentos digitados: " + args.length);

        if(args.length >0) {
            System.out.println("Voce digitou: " + args[0]);
            System.out.println("Este Codigo utiliza Estrutura de Decisao");
        }
        else {
            System.out.println("Nenhum valor foi digitado, tente novamente!");
        }
    }
}
