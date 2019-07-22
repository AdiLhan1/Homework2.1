package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] command;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommand() {
        return command;
    }

    public void setCommand(String[] command) {
        this.command = command;
    }

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.breed = breed;
        this.name = name;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] command) {
        this.name = name;
        this.command = command;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public void makeVoice() {
        System.out.println("РРррр Гав-гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return "Собака{" +
                "Кличка=" + name +
                ", Порода=" + breed +
                ", Команды=" + Arrays.toString(command) +
                "} " + super.getInfo();
    }
}

