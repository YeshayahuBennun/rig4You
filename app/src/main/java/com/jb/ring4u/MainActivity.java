package com.jb.ring4u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jb.ring4u.model.WeddingRing;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final List<WeddingRing> RINGS = new ArrayList<>();

    static {
        RINGS.add(new WeddingRing("Trillion","IUBE357",10_000,R.drawable.ring0));
        RINGS.add(new WeddingRing("Baguette","OIHE893",12_000,R.drawable.ring1));
        RINGS.add(new WeddingRing("Oval","IOE2333",127_000,R.drawable.ring2));
        RINGS.add(new WeddingRing("Heart","JJJPOE377",128_000,R.drawable.ring3));
        RINGS.add(new WeddingRing("Radiant","LLL8727",125_000,R.drawable.ring4));
        RINGS.add(new WeddingRing("Cushion","JEI77398",152_000,R.drawable.ring5));
        RINGS.add(new WeddingRing("AssCher","AA873582",125_000,R.drawable.ring6));
        RINGS.add(new WeddingRing("Emerald","OPIEH86732",12_000,R.drawable.ring7));
        RINGS.add(new WeddingRing("Pear","OIE222345",125_000,R.drawable.ring8));
        RINGS.add(new WeddingRing("Princess","OIUE86235",152_000,R.drawable.ring9));
        RINGS.add(new WeddingRing("Round","OIE098723",192_000,R.drawable.ring10));
        RINGS.add(new WeddingRing("Marquise","KKEIL872345",200_000,R.drawable.ring11));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ringsListView = findViewById(R.id.lv_rings);

        RingsAdapter ringsAdapter = new RingsAdapter(this, R.layout.item_ring, RINGS);

        ringsListView.setAdapter(ringsAdapter);
    }
}