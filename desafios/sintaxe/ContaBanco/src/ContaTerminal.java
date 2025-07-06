/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rycbczak
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ola! Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Agora, digite o numero da sua agencia: ");
        String numAgencia = sc.nextLine();
        
        System.out.println("Digite o numero da sua conta, somente numeros, por favor: ");
        int numConta = sc.nextInt();
        
        System.out.println("Finalmente, pode digitar seu saldo. Exemplo: 458,48");
        var saldo = sc.nextBigDecimal();       
        
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %s e seu saldo R$%s ja esta disponivel para saque", nomeCliente, numAgencia, numConta, saldo);
    }
}
