package com.sportygames.pingpong.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import defpackage.nv1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sportygames/pingpong/utils/BallP1ToP2Net;", "Landroid/view/View;", "", "visible", "", "setBitmapVisibility", "(Z)V", "", "progress", "setProgress", "(F)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BallP1ToP2Net extends View {
    public final Paint a;
    public final PathMeasure b;
    public float c;
    public final Bitmap d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BallP1ToP2Net(Context context, int i, int i2, Bitmap bitmap) {
        super(context, null);
        context.getClass();
        Paint paint = new Paint(1);
        this.a = paint;
        this.f = i;
        this.e = i2;
        Path path = new Path();
        path.moveTo(347.93f, 30.325f);
        path.cubicTo(378.917f, 30.525f, 406.867f, 31.243f, 447.465f, 41.114f);
        path.cubicTo(488.524f, 51.097f, 537.272f, 83.634f, 537.272f, 83.634f);
        path.cubicTo(537.272f, 83.634f, 512.326f, 76.186f, 490.95102f, 85.851f);
        path.cubicTo(474.04102f, 93.496f, 469.989f, 105.752f, 469.989f, 105.752f);
        path.cubicTo(469.989f, 105.752f, 460.717f, 93.577f, 436.265f, 94.077f);
        path.cubicTo(416.207f, 94.464f, 407.632f, 104.032f, 401.346f, 107.731f);
        path.transform(new Matrix());
        this.b = new PathMeasure(path, false);
        if (i != 0 && i2 != 0) {
            this.d = bitmap;
        }
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float[] fArr = new float[2];
        PathMeasure pathMeasure = this.b;
        pathMeasure.getPosTan(pathMeasure.getLength() * this.c, fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        Bitmap bitmap = this.d;
        int i = this.e;
        Paint paint = this.a;
        int i2 = this.f;
        if (i2 > 1300 && i > 900) {
            if (bitmap != null) {
                nv1.a(i, 1.8f, 3.05f, -(i2 / 11.0f), canvas);
                canvas.scale(1.3f, 1.2f);
                canvas.drawBitmap(bitmap, f, f2, paint);
                setBitmapVisibility(false);
                return;
            }
            return;
        }
        if (i2 > 1000) {
            if (bitmap != null) {
                nv1.a(i, 1.8f, 3.05f, -(i2 / 11.0f), canvas);
                canvas.scale(1.0f, 1.0f);
                canvas.drawBitmap(bitmap, f, f2, paint);
                setBitmapVisibility(false);
                return;
            }
            return;
        }
        if (bitmap != null) {
            if (i > 500) {
                canvas.translate((-(i2 / 6.0f)) * 0.65f, i / 1.69f);
                canvas.scale(0.7f, 0.7f);
                canvas.drawBitmap(bitmap, f, f2, paint);
                setBitmapVisibility(false);
                return;
            }
            canvas.translate((-(i2 / 6.0f)) * 0.65f, (i / 2) * 1.14f);
            canvas.scale(0.7f, 0.5f);
            canvas.drawBitmap(bitmap, f, f2, paint);
            setBitmapVisibility(false);
        }
    }

    public final void setBitmapVisibility(boolean visible) {
        invalidate();
    }

    public final void setProgress(float progress) {
        this.c = progress;
        if (progress == 0.0f) {
            setVisibility(0);
        }
        invalidate();
        if (progress >= 1.0f) {
            setVisibility(8);
        }
    }
}
