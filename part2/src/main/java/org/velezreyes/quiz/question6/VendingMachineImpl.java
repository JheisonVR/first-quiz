package org.velezreyes.quiz.question6;


public class VendingMachineImpl {
  private static VendingMachine instance;

  private VendingMachineImpl(){

  }

  public static VendingMachine getInstance() {
    if(instance == null ){
      instance = new FirstVendingMachine();
    }
    return instance;
  }
}
