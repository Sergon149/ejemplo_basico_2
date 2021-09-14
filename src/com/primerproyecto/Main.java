package com.primerproyecto;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hola, esta es mi primera línea de código");
        System.out.println("Esta es mi segunda línea de código");
        funTest();
        System.out.println("Me despido con mi tercera línea de código");
        int num1 = 5;
        int num2 = 3;
        System.out.println(suma(num1,num2));

    }

    private static void funTest(){
        System.out.println("Blablabla");
    }

    public static int suma(int num1, int num2){
        return num1+num2;
    }
}
