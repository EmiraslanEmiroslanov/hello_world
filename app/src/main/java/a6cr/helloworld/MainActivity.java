package a6cr.helloworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Meine erste App - Das ist die Java-Datei zur Hauptoberfläche
    //Mein zweiter Kommentar - Ich liebe David sei mom

    private Integer number1 = 0;
    private Integer number2 = 0;
    private Integer result = 0;
    private Integer operator = 0; // 1 für +, 2 für -, 3 für *, 4 für /


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
    private TextView tvNumber1;

protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


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
    public void onClick (View v){
    }

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState){
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
    @Override
    public void onClick (View v){
        Button clicked = v;

        if (clicked.getId() == this.bZero.getId()) {
            number2 = number * 10 + 0;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bZero.getId()) {
            number2 = number * 10 + 1;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bOne.getId()) {
            number2 = number * 10 + 2;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bTwo.getId()) {
            number2 = number * 10 + 3;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bThree.getId()) {
            number2 = number * 10 + 4;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bFour.getId()) {
            number2 = number * 10 + 5;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bFive.getId()) {
            number2 = number * 10 + 6;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bSeven.getId()) {
            number2 = number * 10 + 7;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if (clicked.getId() == this.bEight.getId()) {
            number2 = number * 10 + 8;
            this.tvNumber2.setText(tvNumber2.toString());

        }
        if(clicked.getId() == this.bNine.getId()) {
            number2 = number * 10 + 9;
            this.tvNumber2.setText(tvNumber2.toString());
        }
        if(clicked.getId() == this.bPlus.getId()) {
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            this.tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");

        }
        if(clicked.getId() == this.bPlus.getId()) {
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            this.tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");

        }
        if(clicked.getId() == this.bPlus.getId()) {
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            this.tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");

        }
        if(clicked.getId() == this.bPlus.getId()) {
            number1 = number2;
            number2 = 0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            this.tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");

        }
    }
}