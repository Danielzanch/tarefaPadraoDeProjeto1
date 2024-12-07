/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.tarefa.padao.de.projeto1.factory;

/**
 *
 * @author DB Family
 */
public abstract class Factory {
    
    public Car create(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }
    private Car prepareCar(Car car){
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        car.acessorios();
        return car;
    }
    abstract Car retrieveCar(String requestedGrade);
    
}
