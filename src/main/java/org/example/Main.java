package org.example;

import processing.core.PApplet;

public class Main extends PApplet {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    int no_of_balls = 2;

    int no_of_rect = 2;


    Ball[] balls = new Ball[no_of_balls];

    Rectangle[] rect = new Rectangle[no_of_rect];


    public static void main(String[] args) {

        PApplet.main("org.example.Main", args);

    }

    //To set the WIDTH and HEIGHT of the window
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        int j = 0; // To find the updated height for the Rectangle

        for (int i = 0; i < 2; i++) {
            //Assigning the width and height of each ball
            balls[i] = new Ball(1,((i+1)*height/5),i+1);
            j = i+1;
        }


        for (int i = 0; i < 2; i++) {
            rect[i] = new Rectangle(1,((j+1)*height/5),j+1);
            j = j + 1;
        }

    }

    public void draw() {
        for (int i = 0; i < 2; i++) {
            balls[i].display(this);
            balls[i].move();
        }
        for (int i = 0; i < 2; i++) {
            rect[i].display(this);
            rect[i].move();
        }
    }



}
