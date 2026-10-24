/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflowstatementi;

/**
 *
 * @author John Leo D. Martinez
 */
public class ControlFlowstatementI {
    public static void main(String[] args) {

        double purchaseAmount = 1000.00;
        double discount;

        if (purchaseAmount >= 1000) {
            discount = 0.15; // 15%
        } else if (purchaseAmount >= 750) {
            discount = 0.10; // 10%
        } else if (purchaseAmount >= 500) {
            discount = 0.05; // 5%
        } else {
            discount = 0.00; // 0%
        }

        double discountAmount = purchaseAmount * discount;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}
