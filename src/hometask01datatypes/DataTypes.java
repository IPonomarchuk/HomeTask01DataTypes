package hometask01datatypes;

public class DataTypes {
    public static void main(String[] args) {

        int intVar = 10;
        double doubleVar;
        String stringVar;

        stringVar = String.valueOf(intVar);
        doubleVar = Double.parseDouble(stringVar);
        intVar = (int) doubleVar;

        System.out.println("Value of variable intVar: " + intVar + '\n' + "Value of variable doubleVar: " + doubleVar + '\n'
                + "Value of variable stringVar: " + stringVar);
    }
}
