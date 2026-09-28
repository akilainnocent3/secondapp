package com.sportygames.pingpong.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import defpackage.nv1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/sportygames/pingpong/utils/BallServeP2ToP1;", "Landroid/view/View;", "", "progress", "", "setProgress", "(F)V", "", "visible", "setBitmapVisibility", "(Z)V", "setReverseProgress", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "getImageView", "()Landroid/graphics/drawable/Drawable;", "setImageView", "(Landroid/graphics/drawable/Drawable;)V", "imageView", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BallServeP2ToP1 extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Drawable imageView;
    public final Paint b;
    public final PathMeasure c;
    public float d;
    public final Bitmap e;
    public final int f;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BallServeP2ToP1(Context context, int i, int i2, Bitmap bitmap, Drawable drawable) {
        super(context, null);
        context.getClass();
        this.imageView = drawable;
        Paint paint = new Paint(1);
        this.b = paint;
        this.i = i;
        this.f = i2;
        Path path = new Path();
        path.moveTo(845.859f, 16.289f);
        path.cubicTo(824.783f, 22.117f, 797.92f, 29.948f, 764.944f, 50.893f);
        path.cubicTo(730.819f, 72.544f, 700.993f, 111.204f, 700.993f, 111.204f);
        path.cubicTo(700.993f, 111.204f, 676.358f, 28.297f, 584.765f, 28.815f);
        path.cubicTo(489.43f, 29.341f, 461.827f, 110.297f, 461.827f, 110.297f);
        path.cubicTo(461.827f, 110.297f, 440.579f, 80.243f, 412.279f, 58.111f);
        path.cubicTo(389.894f, 40.605f, 365.267f, 30.297f, 353.169f, 25.664f);
        path.transform(new Matrix());
        this.c = new PathMeasure(path, false);
        if (i != 0 && i2 != 0) {
            this.e = bitmap;
        }
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL);
    }

    public static int a(float f, Context context) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public final Drawable getImageView() {
        return this.imageView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float[] fArr = new float[2];
        PathMeasure pathMeasure = this.c;
        pathMeasure.getPosTan(pathMeasure.getLength() * this.d, fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        int i = this.f;
        Paint paint = this.b;
        Bitmap bitmap = this.e;
        int i2 = this.i;
        if (i2 > 1300 && i > 900) {
            if (bitmap != null) {
                nv1.a(i, 1.8f, 3.05f, -(i2 / 11.0f), canvas);
                canvas.scale(1.3f, 1.2f);
                Drawable drawable = this.imageView;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                canvas.drawBitmap(bitmap, f, f2, paint);
                canvas.getWidth();
                canvas.getHeight();
                float f3 = getContext().getResources().getDisplayMetrics().density;
                setBitmapVisibility(false);
                Canvas canvas2 = new Canvas(bitmap);
                Drawable drawable2 = this.imageView;
                if (drawable2 != null) {
                    Context context = getContext();
                    context.getClass();
                    int iA = a(9.5f, context);
                    Context context2 = getContext();
                    context2.getClass();
                    drawable2.setBounds(0, 0, iA, a(10.0f, context2));
                }
                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                bitmap.eraseColor(0);
                Drawable drawable3 = this.imageView;
                if (drawable3 != null) {
                    drawable3.draw(canvas2);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 > 1000) {
            if (bitmap != null) {
                nv1.a(i, 1.8f, 3.05f, -(i2 / 11.0f), canvas);
                canvas.scale(1.0f, 1.0f);
                Drawable drawable4 = this.imageView;
                if (drawable4 != null) {
                    drawable4.draw(canvas);
                }
                canvas.drawBitmap(bitmap, f, f2, paint);
                canvas.getWidth();
                canvas.getHeight();
                float f4 = getContext().getResources().getDisplayMetrics().density;
                setBitmapVisibility(false);
                Canvas canvas3 = new Canvas(bitmap);
                Drawable drawable5 = this.imageView;
                if (drawable5 != null) {
                    Context context3 = getContext();
                    context3.getClass();
                    int iA2 = a(12.0f, context3);
                    Context context4 = getContext();
                    context4.getClass();
                    drawable5.setBounds(0, 0, iA2, a(12.0f, context4));
                }
                canvas3.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                bitmap.eraseColor(0);
                Drawable drawable6 = this.imageView;
                if (drawable6 != null) {
                    drawable6.draw(canvas3);
                    return;
                }
                return;
            }
            return;
        }
        if (bitmap != null) {
            if (i > 500) {
                canvas.translate((-(i2 / 6.0f)) * 0.65f, i / 1.69f);
                canvas.scale(0.7f, 0.7f);
                Drawable drawable7 = this.imageView;
                if (drawable7 != null) {
                    drawable7.draw(canvas);
                }
                canvas.drawBitmap(bitmap, f, f2, paint);
                bitmap.getWidth();
                bitmap.getHeight();
                float f5 = getContext().getResources().getDisplayMetrics().density;
                setBitmapVisibility(false);
                Canvas canvas4 = new Canvas(bitmap);
                Drawable drawable8 = this.imageView;
                if (drawable8 != null) {
                    Context context5 = getContext();
                    context5.getClass();
                    int iA3 = a(18.0f, context5);
                    Context context6 = getContext();
                    context6.getClass();
                    drawable8.setBounds(0, 0, iA3, a(18.0f, context6));
                }
                canvas4.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                bitmap.eraseColor(0);
                Drawable drawable9 = this.imageView;
                if (drawable9 != null) {
                    drawable9.draw(canvas4);
                    return;
                }
                return;
            }
            canvas.translate((-(i2 / 6.0f)) * 0.65f, (i / 2) * 1.14f);
            canvas.scale(0.7f, 0.5f);
            Drawable drawable10 = this.imageView;
            if (drawable10 != null) {
                drawable10.draw(canvas);
            }
            canvas.drawBitmap(bitmap, f, f2, paint);
            canvas.getWidth();
            canvas.getHeight();
            float f6 = getContext().getResources().getDisplayMetrics().density;
            setBitmapVisibility(false);
            Canvas canvas5 = new Canvas(bitmap);
            Drawable drawable11 = this.imageView;
            if (drawable11 != null) {
                Context context7 = getContext();
                context7.getClass();
                int iA4 = a(18.0f, context7);
                Context context8 = getContext();
                context8.getClass();
                drawable11.setBounds(0, 0, iA4, a(20.0f, context8));
            }
            canvas5.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
            bitmap.eraseColor(0);
            Drawable drawable12 = this.imageView;
            if (drawable12 != null) {
                drawable12.draw(canvas5);
            }
        }
    }

    public final void setBitmapVisibility(boolean visible) {
        invalidate();
    }

    public final void setImageView(Drawable drawable) {
        drawable.getClass();
        this.imageView = drawable;
    }

    public final void setProgress(float progress) {
        this.d = progress;
        if (progress == 0.0f) {
            setVisibility(0);
        }
        invalidate();
        if (progress >= 1.0f) {
            setVisibility(8);
        }
    }

    public final void setReverseProgress(float progress) {
        this.d = 1.0f - progress;
        invalidate();
    }
}
