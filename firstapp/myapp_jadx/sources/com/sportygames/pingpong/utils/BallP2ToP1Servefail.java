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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/sportygames/pingpong/utils/BallP2ToP1Servefail;", "Landroid/view/View;", "", "progress", "", "setProgress", "(F)V", "", "visible", "setBitmapVisibility", "(Z)V", "setReverseProgress", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BallP2ToP1Servefail extends View {
    public final Paint a;
    public final PathMeasure b;
    public float c;
    public final Bitmap d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BallP2ToP1Servefail(Context context, int i, int i2, Bitmap bitmap) {
        super(context, null);
        context.getClass();
        Paint paint = new Paint(1);
        this.a = paint;
        this.f = i;
        this.e = i2;
        Path path = new Path();
        path.moveTo(845.859f, 16.289f);
        path.cubicTo(824.783f, 22.117f, 797.92f, 29.948f, 764.944f, 50.893f);
        path.cubicTo(730.819f, 72.544f, 700.993f, 111.204f, 700.993f, 111.204f);
        path.cubicTo(700.993f, 111.204f, 676.358f, 28.297f, 584.765f, 28.815f);
        path.cubicTo(489.43f, 29.341f, 461.827f, 110.297f, 461.827f, 110.297f);
        path.cubicTo(461.827f, 110.297f, 440.579f, 80.243f, 412.279f, 58.111f);
        path.cubicTo(389.894f, 40.605f, 365.267f, 30.297f, 353.169f, 25.664f);
        path.cubicTo(330.38f, 17.36f, 253.532f, 7.348f, 214.523f, 10.522f);
        path.cubicTo(170.358f, 14.116f, 108.579f, 21.977f, 53.278f, 49.314f);
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

    public final void setReverseProgress(float progress) {
        this.c = 1.0f - progress;
        invalidate();
    }
}
