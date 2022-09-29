/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

public class ContaNoBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaNoBanco(boolean status, float saldo) {
        this.status = status;
        this.saldo = saldo;
    } 

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "Cc"){
            this.saldo = 50;
        }else if(t == "Cp"){
            this.saldo+= 150;
         
        }
   
    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com dinheiro!");
        }else if (saldo < 0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
        }
        
    }
        
    public void depositar(float deposito){
        if (this.getStatus() == true){
            setSaldo(getSaldo() + deposito);
            //setSaldo(getSaldo() + deposito);
            System.out.println("Valor do depósito: "+ deposito);
            System.out.println("Saldo Atual: "+ getSaldo());
        }else{
            System.out.println("Impossível Depositar");
        }
    }
    public void sacar(float saque){
        if (getStatus() == true){
            
            if (getSaldo() >= saque){
                setSaldo(getSaldo() - saque);
                System.out.println("Valor do saque: "+ saque);
                System.out.println("Saldo Atual: "+ this.getSaldo());
            }else{
                System.out.println("Saldo insuficiente para realizar o saque!");
            }
        }else{
            System.out.println("Conta não existe. Impossível sacar!");
        }
        
    }
    public void pagarMensal(){
        float v;
        if (getTipo() == "Cc"){
            v = 12;
        }else if (getTipo() == "Cp"){
            v = 20;
         if (getStatus() == true){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
                
            }
        }
        
     }
        
    }
    
    public void estadoConta(){
        System.out.println("Dados sobre a Conta "+ this.getTipo());
        System.out.println("Número: "+ this.getnumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo())
        
         ;
    }
   }

