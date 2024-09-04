package edu.pablo.estudosdio;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal <= 5 ) {
            System.out.println("Reprovado!");
        }else if (mediaFinal >= 6 || mediaFinal <= 10) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Nota Invalida");
        }
    }
}
