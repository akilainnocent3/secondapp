package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornerLayout extends FrameLayout {
    public Bitmap a;
    public Paint b;
    public Paint c;
    public float d;

    public RoundedCornerLayout(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        this.d = TypedValue.applyDimension(1, 40.0f, context.getResources().getDisplayMetrics());
        this.b = new Paint(1);
        Paint paint = new Paint(3);
        this.c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.draw(canvas2);
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            int width = getWidth();
            int height = getHeight();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            paint.setColor(-1);
            float f = width;
            float f2 = height;
            canvas3.drawRect(0.0f, 0.0f, f, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            float f3 = this.d;
            canvas3.drawRoundRect(rectF, f3, f3, paint);
            this.a = bitmapCreateBitmap2;
            bitmap = bitmapCreateBitmap2;
        }
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, this.c);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.b);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public RoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
