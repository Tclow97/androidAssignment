package com.inti.student.penangtourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class penanglist extends AppCompatActivity {

    Button birdparkbutton;
    Button bgardenbutton;
    Button camerabutton;
    Button chewjettybutton;
    Button escapebutton;
    Button hillbutton;
    Button kekloksibutton;
    Button nparkbutton;
    Button snakebutton;
    Button streetartbutton;
    Button warbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penanglist);
        birdparkbutton =(Button)findViewById(R.id.birdparkbutton);
        birdparkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent birdpark = new Intent(penanglist.this, com.inti.student.penangtourism.birdpark.class);
                startActivity(birdpark);
            }
        });

        bgardenbutton =(Button)findViewById(R.id.bgardenbutton);
        bgardenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bgarden = new Intent(penanglist.this, com.inti.student.penangtourism.bgarden.class);
                startActivity(bgarden);
            }
        });

        camerabutton =(Button)findViewById(R.id.camerabutton);
        camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera = new Intent(penanglist.this, com.inti.student.penangtourism.camera.class);
                startActivity(camera);
            }
        });

        chewjettybutton =(Button)findViewById(R.id.chewjettybutton);
        chewjettybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chewjetty = new Intent(penanglist.this, com.inti.student.penangtourism.chewjetty.class);
                startActivity(chewjetty);
            }
        });

        escapebutton =(Button)findViewById(R.id.escapebutton);
        escapebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent escape = new Intent(penanglist.this, com.inti.student.penangtourism.escape.class);
                startActivity(escape);
            }
        });

        hillbutton =(Button)findViewById(R.id.hillbutton);
        hillbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hill = new Intent(penanglist.this, com.inti.student.penangtourism.hill.class);
                startActivity(hill);
            }
        });

        kekloksibutton =(Button)findViewById(R.id.kekloksibutton);
        kekloksibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kekloksi = new Intent(penanglist.this, com.inti.student.penangtourism.kekloksi.class);
                startActivity(kekloksi);
            }
        });

        nparkbutton =(Button)findViewById(R.id.nparkbutton);
        nparkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent npark = new Intent(penanglist.this, com.inti.student.penangtourism.npark.class);
                startActivity(npark);
            }
        });

        snakebutton =(Button)findViewById(R.id.snakebutton);
        snakebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent snake = new Intent(penanglist.this, com.inti.student.penangtourism.snake.class);
                startActivity(snake);
            }
        });

        streetartbutton =(Button)findViewById(R.id.streetartbutton);
        streetartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streetart = new Intent(penanglist.this, com.inti.student.penangtourism.streetart.class);
                startActivity(streetart);
            }
        });

        warbutton =(Button)findViewById(R.id.warbutton);
        warbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent war = new Intent(penanglist.this, com.inti.student.penangtourism.war.class);
                startActivity(war);
            }
        });

    }
}
