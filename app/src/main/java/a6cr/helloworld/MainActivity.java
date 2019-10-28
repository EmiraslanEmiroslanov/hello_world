package a6cr.helloworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Meine erste App - Das ist die Java-Datei zur Hauptoberfläche
    //Mein zweiter Kommentar - Ich liebe David sei mom

    private Button bOne;
    private Button bTwo;
    private Button bThree;
    private Button bFour;
    private Button bFive;
    private Button bSix;
    private Button bSeven;
    private Button bEight;
    private Button bNine;
    private Button bZero;
    private Button bPlus;
    private Button bMinus;
    private Button bDivide;
    private Button bMultiply;
    private Button bErease;
    private Button bEqual;
    private TextureView

protected void onCreative (Bundle savedInstanceState) }
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)



    this.bOne.setOnClickListener(this);
    this.bTwo.setOnClickListener(this);
    this.bThree.setOnClickListener(this);
    this.bFour.setOnClickListener(this);
    this.bFive.setOnClickListener(this);
    this.bSix.setOnClickListener(this);
    this.bSeven.setOnClickListener(this);
    this.bEight.setOnClickListener(this);
    this.bNine.setOnClickListener(this);
    this.bZero.setOnClickListener(this);
    this.bMultiply.setOnClickListener(this);
    this.bDivide.setOnClickListener(this);
    this.bMinus.setOnClickListener(this);
    this.bPlus.setOnClickListener(this);
    this.bErease.setOnClickListener(this);
    this.bEqual.setOnClickListener(this);

    @Override
    public void onClick(View v){
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.bOne = this.findViewById(R.id.bOne);
        this.bTwo = this.findViewById(R.id.bTwo);
        this.bThree = this.findViewById(R.id.bThree);
        this.bFour = this.findViewById(R.id.bFour);
        this.bFive = this.findViewById(R.id.bFive);
        this.bSix = this.findViewById(R.id.bSix);
        this.bSeven = this.findViewById(R.id.bSeven);
        this.bEight = this.findViewById(R.id.bEight);
        this.bNine = this.findViewById(R.id.bNine);
        this.bZero = this.findViewById(R.id.bZero);
        this.bPlus = this.findViewById(R.id.bPlus);
        this.bMinus = this.findViewById(R.id.bMinus);
        this.bErease = this.findViewById(R.id.bErease);
        this.bDivide = this.findViewById(R.id.bDivide);
        this.bMultiply = this.findViewById(R.id.bMultiply);
        this.bEqual = this.findViewById(R.id.bEqual);
    }
}
