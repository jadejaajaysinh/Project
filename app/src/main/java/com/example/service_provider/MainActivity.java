package com.example.service_provider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity
{
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.cdv1);
        c2=findViewById(R.id.cdv2);
        c3=findViewById(R.id.cdv3);
        c4=findViewById(R.id.cdv4);
        c5=findViewById(R.id.cdv5);
        c6=findViewById(R.id.cdv6);
        c7=findViewById(R.id.cdv7);
        c8=findViewById(R.id.cdv8);
        c9=findViewById(R.id.cdv9);
        c10=findViewById(R.id.cdv10);


        c1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i2= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i2);
            }
        });

        c3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i3= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i3);
            }
        });

        c4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i4= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i4);
            }
        });

        c5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i5= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i5);
            }
        });

        c6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i6= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i6);
            }
        });

        c7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i7= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i7);
            }
        });

        c8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i8= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i8);
            }
        });

        c9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i9= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i9);
            }
        });

        c10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i10= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i10);
            }
        });


    }
}