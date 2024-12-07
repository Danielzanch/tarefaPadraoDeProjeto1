/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.tarefa.padao.de.projeto1.factory;

/**
 *
 * @author DB Family
 */
public class Car{
    
    private int Potencia;
    private String combustivel;
    private String color;
    private String travaEletrica;
    private String vidroEletrico;
    private String portas;
    private String arCondicionado;
    private String direcaoHidraulica;

    public Car(int Potencia, String combustivel, String color, String travaEletrica, String vidroEletrico, String portas, String arCondicionado, String direcaoHidraulica) {
        this.Potencia = Potencia;
        this.combustivel = combustivel;
        this.color = color;
        this.travaEletrica = travaEletrica;
        this.vidroEletrico = vidroEletrico;
        this.portas = portas;
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O tanque do carro esta:  " + combustivel + " e o motor esta ligado, e pronto para usar, com  " + Potencia + " cavalos de potencia" );
    }
    public void clean(){
        System.out.println("O carro esta limpo, a sua cor e: " + color.toLowerCase());
    }
    public void mechanicCheck(){
        System.out.println("O mecanico ja examinou o carro. esta tudo ok!");
    }
    public void fuelCar(){
        System.out.println("O tanque do carro esta:  " + combustivel.toLowerCase());
    }
    public void acessorios(){
        System.out.println("Este carro tem Trava-Eletrica?:  " + travaEletrica.toLowerCase());
        System.out.println("Este carro tem Vidro-Eletrico?:  " + vidroEletrico.toLowerCase());
        System.out.println("Quantas portas este carro tem?:  " + portas.toLowerCase());
        System.out.println("Este carro tem Ar-Condicionado?:  " + arCondicionado.toLowerCase());
        System.out.println("Este carro tem Direcao-Hidraulica?:  " + direcaoHidraulica.toLowerCase());
    }
}