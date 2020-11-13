package kz.training.learn.collection.aircompany;
//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.+++
// Посчитать общую вместимость и грузоподъемность.+
// Провести сортировку самолетов компании по дальности полета. +
// Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
public class Runner {
    public static void main(String[] args) {
        Airport airport = new Airport();
       /* System.out.println(airport.getFullCapacity());
        System.out.println(airport.getFullCarrying());
        airport.sortRangeFlight();
        airport.printList();*/
        System.out.println(airport.rangeFuelConsumption(180, 450));
    }
}
