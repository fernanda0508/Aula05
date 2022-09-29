/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaNoBanco c1 = new ContaNoBanco(false, 0f);
        c1.abrirConta("Cc");
        c1.setTipo("Corrente");
        c1.setSaldo(10f);
        c1.setnumConta(1459784260);
        c1.setDono("Fernanda Coelho");
        c1.estadoConta();
        c1.depositar(5f);

    }

}
