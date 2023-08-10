import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perguntas {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     List<Integer> respostas = new ArrayList<>();

      int resposta;
     
      
System.out.println("\nEntrevistando os indivíduos ");

System.out.println("Digite 1 para SIM e 0 para NÃO ");

System.out.println("\nTelefonou para a vítima?");
resposta = sc.nextInt();
while (resposta != 0 && resposta != 1) {
    System.out.println("OpcaoInvalida \n Digite uma das opções apresentadas anteriormente para validarmos");
    resposta = sc.nextInt();
}
respostas.add(resposta);
System.out.println("\nEsteve no local do crime?");
resposta = sc.nextInt();
while (resposta != 0 && resposta != 1) {
    System.out.println("OpcaoInvalida \nDigite uma das opções apresentadas anteriormente para validarmos");
    resposta = sc.nextInt();
}
respostas.add(resposta);
System.out.println("\nMora perto da vítima?");
resposta = sc.nextInt();
while (resposta != 0 && resposta != 1) {
    System.out.println("OpcaoInvalida \nDigite uma das opções apresentadas anteriormente para validarmos");
    resposta = sc.nextInt();
}
respostas.add(resposta);
System.out.println("\nDevia para a vítima?");
resposta = sc.nextInt();
while (resposta != 0 && resposta != 1) {
    System.out.println("OpcaoInvalida \nDigite uma das opções apresentadas anteriormente para validarmos ");
    resposta = sc.nextInt();
}
respostas.add(resposta);
System.out.println("\nJá trabalhou com a vítima? ");
resposta = sc.nextInt();
while (resposta != 0 && resposta != 1) {
    System.out.println("OpcaoInvalida \nDigite uma das opções apresentadas anteriormente para validarmos ");
    resposta = sc.nextInt();
}
respostas.add(resposta);

sc.close();

int soma = 0;
for (int resultado : respostas) {
    soma += resultado;

}

if (soma <2 ){
System.out.println("\nInocente");
}

else if (soma == 2){
    System.out.println("\nSuspeita");
}
else if (soma >= 3 && soma <= 4){
    System.out.println("\nCúmplice");
}
else if (soma == 5 ){
    System.out.println("\nCulpada ");
}




}
}