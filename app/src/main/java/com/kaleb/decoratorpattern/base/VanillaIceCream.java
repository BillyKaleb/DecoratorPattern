package com.kaleb.decoratorpattern.base;

import com.kaleb.decoratorpattern.IceCream;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version VanillaIceCream, v 0.1 26/04/19 12.28 by Yoko Ahadazaro
 */
public class VanillaIceCream implements IceCream {

    IceCream iceCream;

    public VanillaIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void printOut() {

    }

    @Override
    public String getCurrentIce() {
        return "Vanilla Ice Cream";
    }
}
