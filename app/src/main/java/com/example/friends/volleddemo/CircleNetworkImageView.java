package com.example.friends.volleddemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Toast;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by yjz on 2015/10/20.
 */


public class CircleNetworkImageView extends NetworkImageView {
    private final Context context;
    private Xfermode xfermode;


    public CircleNetworkImageView(Context context) {
        super(context);
        this.context = context;
    }

    public CircleNetworkImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

    }

    public CircleNetworkImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;

    }

    @Override
    protected void onDraw(Canvas canvas) {
//        Paint paint = new Paint();
//        Bitmap src = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
//        Canvas canvas1 = new Canvas(src);
//        Drawable drawable = getDrawable();
//        drawable.setBounds(0, 0, getWidth(), getHeight());
//        drawable.draw(canvas1);
//
//        Bitmap mask = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
//        Canvas canvas2 = new Canvas(mask);
//        canvas2.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, paint);
//
//        canvas.drawBitmap(src, new Matrix(), paint);
//        canvas.save();
//        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
//        paint.setColor(Color.WHITE);
//        paint.setAntiAlias(true);
//        canvas.drawBitmap(mask, new Matrix(), paint);
//        paint.setXfermode(null);
//        canvas.restore();

/*        canvas.clipRect(new Rect(0, 0, 100, 100));
        canvas.drawColor(Color.RED);
        int save = canvas.save();
        canvas.clipRect(new Rect(0, 0, 80, 80));
        canvas.drawColor(Color.YELLOW);
        canvas.save();

        canvas.clipRect(new Rect(0, 0, 50, 50));
        canvas.drawColor(Color.GREEN);
        canvas.save();

        canvas.clipRect(new Rect(0, 0, 20, 20));
        canvas.drawColor(Color.WHITE);*/
        canvas.rotate(180);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setFakeBoldText(true);
        paint.setTextSize(30);
        canvas.drawColor(Color.RED);
        canvas.drawText("HELLO", 50, 50, paint);


        //canvas.save();

        //canvas.restoreToCount(save);

    }
}
