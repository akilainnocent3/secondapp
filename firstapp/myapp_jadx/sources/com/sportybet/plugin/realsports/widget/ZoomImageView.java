package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import defpackage.itf0;
import defpackage.rck0;

/* JADX INFO: loaded from: classes.dex */
public class ZoomImageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    public float A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public ZoomImageActivity F;
    public c G;
    public float d;
    public boolean e;
    public final float[] f;
    public final ScaleGestureDetector i;
    public final Matrix v;
    public final GestureDetector w;
    public boolean y;
    public float z;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            ZoomImageView zoomImageView = ZoomImageView.this;
            if (zoomImageView.y) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            itf0.a aVar = itf0.a;
            aVar.q("DoubleTap");
            aVar.d(zoomImageView.getScale() + " , " + zoomImageView.d, new Object[0]);
            if (zoomImageView.getScale() < 2.0f) {
                zoomImageView.postDelayed(zoomImageView.new b(2.0f, x, y), 16L);
                zoomImageView.y = true;
                return true;
            }
            if (zoomImageView.getScale() < 2.0f || zoomImageView.getScale() >= 4.0f) {
                zoomImageView.postDelayed(zoomImageView.new b(zoomImageView.d, x, y), 16L);
                zoomImageView.y = true;
                return true;
            }
            zoomImageView.postDelayed(zoomImageView.new b(4.0f, x, y), 16L);
            zoomImageView.y = true;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Drawable drawable;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ZoomImageView zoomImageView = ZoomImageView.this;
            if (zoomImageView.G != null && (drawable = zoomImageView.getDrawable()) != null) {
                int scaleX = (int) (zoomImageView.getScaleX() * drawable.getIntrinsicWidth());
                int scaleY = (int) (zoomImageView.getScaleY() * drawable.getIntrinsicHeight());
                int width = (zoomImageView.getWidth() - scaleX) / 2;
                int height = (zoomImageView.getHeight() - scaleY) / 2;
                int i = scaleX + width;
                int i2 = scaleY + height;
                if (x >= width && x <= i && y >= height && y <= i2) {
                    ZoomImageActivity zoomImageActivity = ((rck0) zoomImageView.G).a;
                    int i3 = ZoomImageActivity.z;
                    if (TextUtils.isEmpty(zoomImageActivity.f) || TextUtils.isEmpty(zoomImageActivity.i)) {
                        zoomImageActivity.finish();
                        return true;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("param_booking_code", zoomImageActivity.f);
                    intent.putExtra("param_country_code", zoomImageActivity.i);
                    if (!TextUtils.isEmpty(zoomImageActivity.v)) {
                        intent.putExtra("param_code_source", zoomImageActivity.v);
                    }
                    zoomImageActivity.setResult(-1, intent);
                    zoomImageActivity.finish();
                    return true;
                }
            }
            ZoomImageActivity zoomImageActivity2 = zoomImageView.F;
            if (zoomImageActivity2 == null) {
                return false;
            }
            zoomImageActivity2.finish();
            return true;
        }
    }

    public class b implements Runnable {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3) {
            this.a = f;
            this.c = f2;
            this.d = f3;
            if (ZoomImageView.this.getScale() < f) {
                this.b = 1.07f;
            } else {
                this.b = 0.93f;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZoomImageView zoomImageView = ZoomImageView.this;
            Matrix matrix = zoomImageView.v;
            float f = this.b;
            float f2 = this.c;
            float f3 = this.d;
            matrix.postScale(f, f, f2, f3);
            zoomImageView.c();
            zoomImageView.setImageMatrix(matrix);
            float scale = zoomImageView.getScale();
            float f4 = this.a;
            if ((f > 1.0f && scale < f4) || (f < 1.0f && f4 < scale)) {
                zoomImageView.postDelayed(this, 16L);
                return;
            }
            float f5 = f4 / scale;
            matrix.postScale(f5, f5, f2, f3);
            zoomImageView.c();
            zoomImageView.setImageMatrix(matrix);
            zoomImageView.y = false;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public interface c {
    }

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1.0f;
        this.e = true;
        this.f = new float[9];
        this.i = null;
        this.v = new Matrix();
        this.D = true;
        this.E = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.w = new GestureDetector(context, new a());
        this.i = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }

    private RectF getMatrixRectF() {
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.v.mapRect(rectF);
        }
        return rectF;
    }

    public final void c() {
        float fWidth;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float fHeight = 0.0f;
        if (matrixRectF.width() >= f) {
            float f2 = matrixRectF.left;
            fWidth = f2 > 0.0f ? -f2 : 0.0f;
            float f3 = matrixRectF.right;
            if (f3 < f) {
                fWidth = f - f3;
            }
        } else {
            fWidth = 0.0f;
        }
        float f4 = height;
        if (matrixRectF.height() >= f4) {
            float f5 = matrixRectF.top;
            fHeight = f5 > 0.0f ? -f5 : 0.0f;
            float f6 = matrixRectF.bottom;
            if (f6 < f4) {
                fHeight = f4 - f6;
            }
        }
        if (matrixRectF.width() < f) {
            fWidth = (matrixRectF.width() * 0.5f) + ((f * 0.5f) - matrixRectF.right);
        }
        if (matrixRectF.height() < f4) {
            fHeight = (matrixRectF.height() * 0.5f) + ((f4 * 0.5f) - matrixRectF.bottom);
        }
        itf0.a aVar = itf0.a;
        aVar.q("ZoomImageView");
        aVar.d("deltaX = " + fWidth + " , deltaY = " + fHeight, new Object[0]);
        this.v.postTranslate(fWidth, fHeight);
    }

    public final float getScale() {
        Matrix matrix = this.v;
        float[] fArr = this.f;
        matrix.getValues(fArr);
        return fArr[0];
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Drawable drawable;
        if (!this.e || (drawable = getDrawable()) == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q("ZoomImageView");
        aVar.d(drawable.getIntrinsicWidth() + " , " + drawable.getIntrinsicHeight(), new Object[0]);
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = (intrinsicWidth <= width || intrinsicHeight > height) ? 1.0f : (width * 1.0f) / intrinsicWidth;
        if (intrinsicHeight > height && intrinsicWidth <= width) {
            fMin = (height * 1.0f) / intrinsicHeight;
        }
        if (intrinsicWidth > width && intrinsicHeight > height) {
            fMin = Math.min((width * 1.0f) / intrinsicWidth, (height * 1.0f) / intrinsicHeight);
        }
        this.d = fMin;
        aVar.q("ZoomImageView");
        aVar.d("initScale = %s", Float.valueOf(this.d));
        Matrix matrix = this.v;
        matrix.postTranslate((width - intrinsicWidth) / 2, (height - intrinsicHeight) / 2);
        matrix.postScale(fMin, fMin, getWidth() / 2, getHeight() / 2);
        setImageMatrix(matrix);
        this.e = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        if ((scale < 4.0f && scaleFactor > 1.0f) || (scale > this.d && scaleFactor < 1.0f)) {
            float f = scaleFactor * scale;
            float f2 = this.d;
            if (f < f2) {
                scaleFactor = f2 / scale;
            }
            if (scaleFactor * scale > 4.0f) {
                scaleFactor = 4.0f / scale;
            }
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            Matrix matrix = this.v;
            matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
            c();
            setImageMatrix(matrix);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r12 != 3) goto L72;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.widget.ZoomImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setOnImageClickListener(c cVar) {
        this.G = cVar;
    }

    public ZoomImageView(Context context) {
        this(context, null);
    }
}
