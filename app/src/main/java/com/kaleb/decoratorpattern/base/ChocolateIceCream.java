package com.kaleb.decoratorpattern.base;

import com.kaleb.decoratorpattern.IceCream;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version ChocolateIceCream, v 0.1 26/04/19 12.27 by Yoko Ahadazaro
 */
public class ChocolateIceCream implements IceCream {

    IceCream iceCream;

    public ChocolateIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void printOut() {

    }

    @Override
    public String getCurrentIce() {
        return "Chocolate Ice Cream";
    }
}
