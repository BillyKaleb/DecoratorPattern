package com.kaleb.decoratorpattern;

import com.kaleb.decoratorpattern.base.ChocolateIceCream;
import com.kaleb.decoratorpattern.base.TiramisuIceCream;
import com.kaleb.decoratorpattern.base.VanillaIceCream;
import com.kaleb.decoratorpattern.decorator.ChocoChipDecorator;
import com.kaleb.decoratorpattern.decorator.GummyDecorator;
import com.kaleb.decoratorpattern.decorator.JellyDecorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button chocButton;

    private Button vanillaButton;

    private Button tiramisuButton;

    private Button chipButton;

    private Button gummyButton;

    private Button jellyButton;

    private Button finishButton;

    private IceCream iceCream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocButton = findViewById(R.id.btn_ice_cream_choc);
        vanillaButton = findViewById(R.id.btn_ice_cream_vanilla);
        tiramisuButton = findViewById(R.id.btn_ice_cream_tiramisu);
        chipButton = findViewById(R.id.btn_toppings_chocochip);
        gummyButton = findViewById(R.id.btn_toppings_gummy);
        jellyButton = findViewById(R.id.btn_toppings_jelly);
        finishButton = findViewById(R.id.btn_done);

        chocButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new ChocolateIceCream(iceCream);
            }
        });

        vanillaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new VanillaIceCream(iceCream);
            }
        });

        tiramisuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new TiramisuIceCream(iceCream);
            }
        });

        chipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new ChocoChipDecorator(iceCream);
            }
        });

        gummyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new GummyDecorator(iceCream);
            }
        });

        jellyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iceCream = new JellyDecorator(iceCream);
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iceCream != null) {
                    Toast.makeText(getBaseContext(), iceCream.getCurrentIce(), Toast.LENGTH_LONG)
                        .show();
                    iceCream = null;
                }
            }
        });
    }
}
