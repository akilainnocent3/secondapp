package com.bytedance.sdk.openadsdk.core.widget;

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

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class bs extends com.bytedance.sdk.openadsdk.core.hu.vy {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private BitmapShader f37046hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final RectF f37047hv;
    private final Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37048sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37049tq;
    private final Matrix vy;

    public bs(Context context) {
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
        Bitmap bitmapHww;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && fc.a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f37046hu == null && (bitmapHww = hww(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f37046hu = new BitmapShader(bitmapHww, tileMode, tileMode);
            float fMax = (bitmapHww.getWidth() == getWidth() && bitmapHww.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapHww.getWidth(), (getHeight() * 1.0f) / bitmapHww.getHeight());
            this.vy.setScale(fMax, fMax);
            this.f37046hu.setLocalMatrix(this.vy);
        }
        BitmapShader bitmapShader = this.f37046hu;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.hww.setShader(bitmapShader);
            canvas.drawRoundRect(this.f37047hv, this.f37049tq, this.f37048sd, this.hww);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f37047hv.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.f37049tq = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f37048sd = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f37046hu = null;
    }

    public bs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bs(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37049tq = 25;
        this.f37048sd = 25;
        this.f37047hv = new RectF();
        Paint paint = new Paint();
        this.hww = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.vy = new Matrix();
    }
}
