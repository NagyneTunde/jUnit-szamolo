/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitszamolo;

/**
 *
 * @author nagyg
 */
public class Szamolo {

    public int plussz(int egyik, int masik) {
        return egyik + masik;
    }

    public int minusz(int egyik, int masik) {
        return egyik - masik;
    }

    public int oszt(int egyik, int masik) throws Exception {
        if (masik != 0) {
            return egyik / masik;
        }
        throw new Exception("0-val nem oszthatunk");
    }

    public int szamol(int egyik, int masik, String muvelet) throws Exception {
        switch (muvelet) {
            case "+":
                return egyik + masik;
            case "-":
                return egyik - masik;
            case "*":
                return egyik * masik;
            case "/":
                if (masik != 0) {
                    return egyik / masik;
                }
                throw new Exception("0-val nem oszthatunk");
            default:
                throw new Exception("hibás művelet");
        }
    }
}
