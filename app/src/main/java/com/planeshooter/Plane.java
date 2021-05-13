package com.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;


public class Plane {
    //Bitmap plane[] = new Bitmap[15];
    Bitmap plane[] = new Bitmap[8];
    int planeX, planeY, velocity, planeFrame;
    Random random;

    public Plane(Context context) {
        plane[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_000);
        plane[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_001);
        plane[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_002);
        plane[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_003);
        plane[4] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_004);
        plane[5] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_005);
        plane[6] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_006);
        plane[7] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_007);
//        plane[8] = BitmapFactory.decodeResource(context.getResources(),R.drawable.tile2_008);
//        plane[9] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_10);
//        plane[10] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_11);
//        plane[11] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_12);
//        plane[12] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_13);
//        plane[13] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_14);
//        plane[14] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane_15);
        random = new Random();
        resetPosition();
    }
    public Bitmap getBitmap(){
        return plane[planeFrame];
    }
    public int getWidth(){
        return plane[0].getWidth();
    }
    public int getHeight(){
        return plane[0].getHeight();
    }
    public void resetPosition(){
        planeX = GameView.dWidth + random.nextInt(1200);
        planeY = random.nextInt(300);
        velocity = 8 + random.nextInt(13);
        planeFrame = 0;
    }
}
