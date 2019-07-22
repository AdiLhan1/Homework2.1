package com.company;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setAge(2);
        d1.setColor(Color.BLACK);
        d1.setShelter(new Shelter("Beautiful Pets", "Советская 55"));
        d1.setName("Граф");
        d1.setBreed("Пудель");
        d1.setCommand(new String[]{"Сидеть", "Лежать"});

        Dog d2 = new Dog(Color.WHITE, new Shelter("Питомник", "Исанова 28"), "Тайфун", "Хаски", new String[]{"Лежать,кувырок"});
        d2.setAge(3);
        Dog d3 = new Dog(Color.BROWN, new Shelter("Дом Животных", "Гагарина 167"), "Мухтар", "Овчарка", new String[]{"След", "Фас", "Голос"});
        d3.setAge(5);
        System.out.println(d1.getInfo());
        d1.makeVoice();
        System.out.println(d2.getInfo());
        d2.makeVoice(4);
        System.out.println(d3.getInfo());
        d3.makeVoice("РРавв Ра", 3);

    }
}
