package com.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


public class Plane2 extends Plane {

//    Bitmap[] plane = new Bitmap[10];
      Bitmap[] plane = new Bitmap[8];


    public Plane2(Context context) {
        super(context);
        plane[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile000);
        plane[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile001);
        plane[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile002);
        plane[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile003);
        plane[4] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile004);
        plane[5] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile005);
        plane[6] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile006);
        plane[7] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile007);
        //plane[8] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_9);
        //plane[9] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_10);
        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    @Override
    public int getWidth() {
        return plane[0].getWidth();
    }

    @Override
    public int getHeight() {
        return plane[0].getHeight();
    }

    @Override
    public void resetPosition() {
        planeX = -(200+random.nextInt(1500));
        planeY = random.nextInt(400);
        velocity = 5 + random.nextInt(21);
    }
}
