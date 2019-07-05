package com.kaleb.decoratorpattern.decorator;

import com.kaleb.decoratorpattern.IceCream;
import com.kaleb.decoratorpattern.IceCreamDecorator;

/**
 * @author Yoko Ahadazaro (yoko.ahadazaro@dana.id)
 * @version ChocoChipDecorator, v 0.1 26/04/19 10.44 by Yoko Ahadazaro
 */
public class ChocoChipDecorator extends IceCreamDecorator {

    IceCream iceCream;

    public ChocoChipDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void printOut() {
    }

    @Override
    public String getCurrentIce() {
        return iceCream.getCurrentIce() + ", ChocoChip";
    }
}
