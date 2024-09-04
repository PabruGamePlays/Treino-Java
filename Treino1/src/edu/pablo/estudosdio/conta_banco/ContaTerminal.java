/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pablo.estudosdio.conta_banco;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ContaTerminal {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String name;
        String agencia;
        int numeroConta;
        double saldo = 1530.76;

        System.out.println("Olá novo usuário, por favor digite o seu nome: ");
        name = ler.next();

        System.out.println("Por favor, " + name + " digite o número da Agência:");
        agencia = ler.next();

        System.out.println("Agora digite o número da sua conta: ");
        numeroConta = ler.nextInt();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " que já está disponível para saque!");

    }

}
