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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sportygames/pingpong/utils/BallP1ToP2off;", "Landroid/view/View;", "", "visible", "", "setBitmapVisibility", "(Z)V", "", "progress", "setProgress", "(F)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BallP1ToP2off extends View {
    public final Paint a;
    public final PathMeasure b;
    public float c;
    public final Bitmap d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BallP1ToP2off(Context context, int i, int i2, Bitmap bitmap) {
        super(context, null);
        context.getClass();
        Paint paint = new Paint(1);
        this.a = paint;
        this.f = i;
        this.e = i2;
        Path path = new Path();
        path.moveTo(354.999f, 25.673f);
        path.cubicTo(393.446f, 23.414f, 435.257f, 17.255f, 526.88f, 39.683f);
        path.cubicTo(618.491f, 62.094f, 703.672f, 108.609f, 703.672f, 108.609f);
        path.lineTo(726.706f, 72.611f);
        path.lineTo(760.83f, 50.957f);
        path.lineTo(793.807f, 30.018f);
        path.lineTo(820.668f, 18.169f);
        path.lineTo(845.322f, 16.412f);
        path.cubicTo(882.852f, 8.797f, 892.316f, 4.168f, 985.264f, 8.28f);
        path.cubicTo(1078.133f, 12.388f, 1152.127f, 37.594f, 1152.127f, 37.594f);
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
