/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.tarefa.padao.de.projeto1.factory;

/**
 *
 * @author DB Family
 */
public class ContratosFactory extends Factory{

    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "azul", "sim", "sim", "4", "sim", "sim");
        } else {
            return null;
        }
    }
}