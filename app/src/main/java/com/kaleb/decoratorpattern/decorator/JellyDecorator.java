package com.kaleb.decoratorpattern.decorator;

import com.kaleb.decoratorpattern.IceCream;
import com.kaleb.decoratorpattern.IceCreamDecorator;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version JellyDecorator, v 0.1 26/04/19 12.26 by Yoko Ahadazaro
 */
public class JellyDecorator extends IceCreamDecorator {

    IceCream iceCream;

    public JellyDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void printOut() {

    }

    @Override
    public String getCurrentIce() {
        return iceCream.getCurrentIce() + ", Jelly";
    }
}
