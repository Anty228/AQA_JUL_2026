package org.prog.session2;

//TODO: write if-else-if-else with:
// - declare int myMoney
// - declare int phonePrice
// logic: if you have more money TWICE that phone costs -> credit it.
// If THRICE money of phone price -> buy it


public class HomeWork1 {

    public static void main(String[] args) {
      int MyMoney = 25000;
      int IPhonePrice = 15000;

      if (MyMoney<15000) {
          System.out.println("I cant afford a new phone");
      }
      if (MyMoney>IPhonePrice*2) {
          System.out.println("I can credit a new Iphone");
      }
      else if (MyMoney<30000) {
          System.out.println("I can go take a look at the phones in the store");
      }
      else  {
          System.out.println("I need to save some money");
      }
      if (MyMoney>IPhonePrice*3) {
          System.out.println("I can buy a new Iphone");
        }
    }
}
