package org.velezreyes.quiz.question6;

public class FirstVendingMachine implements VendingMachine {
    private double balance = 0.0;
    private final double scottColaPrice = 0.75;
    private final double KarenTeaPrice = 1.0;

    @Override
    public void insertQuarter(){
        balance += 0.25;
    }

     @Override
     public Drink pressButton (String name) throws NotEnoughMoneyException, UnknownDrinkException{
        double drinkPrice = 0.0;

        if("ScottCola".equals(name)){
            drinkPrice = scottColaPrice;
        } else if ("KarenTea".equals(name)) {
            drinkPrice=KarenTeaPrice;
        } else {
            throw new UnknownDrinkException();
        }

        if(balance < drinkPrice){
            throw new NotEnoughMoneyException();
        }
        balance -= drinkPrice;

        if("ScottCola".equals(name)){
            return new Cola("ScottCola",true);
        } else {
            return new Tea("KarenTea", false);
        }



     }
    
}
