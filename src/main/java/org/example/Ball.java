package org.example;

import processing.core.PApplet;

    class Ball implements Shape{
    private float startingPoint;
    private float height;
    private float speed;

    Ball(int startingPoint, int height, int speed) {
        this.startingPoint = startingPoint;
        this.height = height;
        this.speed = speed;
    }


        @Override
        public void display(PApplet applet) {
            applet.ellipse(this.startingPoint, this.height, 10, 10);
        }

        @Override
        public void move(){
            this.startingPoint = this.startingPoint + this.speed;
        }
}


class Rectangle implements Shape{
    private float startingPoint;
    private float height;
    private float speed;

    Rectangle(int startingPoint, int height, int speed) {
        this.startingPoint = startingPoint;
        this.height = height;
        this.speed = speed;
    }

    @Override
    public void display(PApplet pApplet) {
        pApplet.rect(this.startingPoint, this.height, 10, 10);
    }


    @Override
    public void move(){
        this.startingPoint = this.startingPoint + this.speed;
    }
}

