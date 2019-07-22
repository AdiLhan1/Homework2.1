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


        Shelter shelter = new Shelter("Питомник", "Чуй 71");
        Dog d2 = new Dog("Тайфун", "Хаски", Color.WHITE, shelter, new String[]{"Лежать,Замиреть,Дай лапу"});
        d2.setAge(3);
        Dog d3 = new Dog("Мухтар", "Овчарка", Color.BROWN, shelter, new String[]{"След", "Фас", "Голос"});
        d3.setAge(5);
        System.out.println(d1.getInfo());
        d1.makeVoice();
        System.out.println(d2.getInfo());
        d2.makeVoice(4);
        System.out.println(d3.getInfo());
        d3.makeVoice("РРавв Ра", 3);

    }
}
