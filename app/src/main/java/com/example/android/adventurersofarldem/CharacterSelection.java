package com.example.android.adventurersofarldem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CharacterSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);
    }

    public void playerSelectedWizard(View view) {
        ImageView wizardClass = (ImageView) findViewById(R.id.Wizard);
        wizardClass.setImageResource(R.drawable.wizardyes);

        ImageView rangerClass = (ImageView) findViewById(R.id.Ranger);
        rangerClass.setImageResource(R.drawable.ranger);

        ImageView warriorClass = (ImageView) findViewById(R.id.Warrior);
        warriorClass.setImageResource(R.drawable.warrior);
    }

    public void playerSelectedWarrior(View view) {
        ImageView wizardClass = (ImageView) findViewById(R.id.Wizard);
        wizardClass.setImageResource(R.drawable.wizard);

        ImageView rangerClass = (ImageView) findViewById(R.id.Ranger);
        rangerClass.setImageResource(R.drawable.ranger);

        ImageView warriorClass = (ImageView) findViewById(R.id.Warrior);
        warriorClass.setImageResource(R.drawable.warrioryes);
    }

    public void playerSelectedRanger(View view) {
        ImageView wizardClass = (ImageView) findViewById(R.id.Wizard);
        wizardClass.setImageResource(R.drawable.wizard);

        ImageView rangerClass = (ImageView) findViewById(R.id.Ranger);
        rangerClass.setImageResource(R.drawable.rangeryes);

        ImageView warriorClass = (ImageView) findViewById(R.id.Warrior);
        warriorClass.setImageResource(R.drawable.warrior);
    }
}
