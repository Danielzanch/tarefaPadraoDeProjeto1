/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.tarefa.padao.de.projeto1.factory;

/**
 *
 * @author DB Family
 */
public class SemContratosFactory extends Factory {
    
        Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(100, "cheio", "azul", "nao", "nao", "3", "nao", "nao");
        } else {
            return null;
        }
    }
    
}
