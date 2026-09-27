package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class grv extends ImageView {
    private Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34295sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34296tq;
    private Matrix vy;

    public grv(Context context) {
        this(context, null);
    }

    private Bitmap hww(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && fc.a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapHww = hww(drawable);
        if (bitmapHww == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapHww, tileMode, tileMode);
        float fMax = (bitmapHww.getWidth() == getWidth() && bitmapHww.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapHww.getWidth(), (getHeight() * 1.0f) / bitmapHww.getHeight());
        this.vy.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.vy);
        this.hww.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f34296tq, this.f34295sd, this.hww);
    }

    public void setXRound(int i10) {
        this.f34296tq = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f34295sd = i10;
        postInvalidate();
    }

    public grv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public grv(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34296tq = 25;
        this.f34295sd = 25;
        Paint paint = new Paint();
        this.hww = paint;
        paint.setAntiAlias(true);
        this.hww.setFilterBitmap(true);
        this.vy = new Matrix();
    }
}
