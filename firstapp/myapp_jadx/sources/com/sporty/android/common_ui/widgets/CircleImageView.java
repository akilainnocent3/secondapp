package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.rk30;
import defpackage.vs50;
import defpackage.zqh0;

/* JADX INFO: loaded from: classes.dex */
public class CircleImageView extends AppCompatImageView {
    public static final ImageView.ScaleType H = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config I = Bitmap.Config.ARGB_8888;
    public BitmapShader A;
    public int B;
    public int C;
    public float D;
    public float E;
    public final boolean F;
    public boolean G;
    public final RectF d;
    public final RectF e;
    public final Matrix f;
    public final Paint i;
    public final Paint v;
    public int w;
    public int y;
    public Bitmap z;

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.i = new Paint();
        this.v = new Paint();
        this.w = -1;
        this.y = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.g, i, 0);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 2);
        this.w = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        super.setScaleType(H);
        this.F = true;
        if (this.G) {
            d();
            this.G = false;
        }
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            boolean z = drawable instanceof ColorDrawable;
            Bitmap.Config config = I;
            Bitmap bitmapCreateBitmap = z ? Bitmap.createBitmap(1, 1, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final void d() {
        float fWidth;
        float fA;
        if (!this.F) {
            this.G = true;
            return;
        }
        if (this.z == null) {
            return;
        }
        Bitmap bitmap = this.z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.i;
        paint.setAntiAlias(true);
        paint.setShader(this.A);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.v;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.w);
        paint2.setStrokeWidth(this.y);
        this.C = this.z.getHeight();
        this.B = this.z.getWidth();
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.e;
        float fA2 = 0.0f;
        rectF.set(0.0f, 0.0f, width, height);
        this.E = Math.min((rectF.height() - this.y) / 2.0f, (rectF.width() - this.y) / 2.0f);
        float f = this.y;
        float fWidth2 = rectF.width() - this.y;
        float fHeight = rectF.height() - this.y;
        RectF rectF2 = this.d;
        rectF2.set(f, f, fWidth2, fHeight);
        this.D = Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f);
        Matrix matrix = this.f;
        matrix.set(null);
        if (rectF2.height() * this.B > rectF2.width() * this.C) {
            fWidth = rectF2.height() / this.C;
            fA = 0.0f;
            fA2 = vs50.a(this.B, fWidth, rectF2.width(), 0.5f);
        } else {
            fWidth = rectF2.width() / this.B;
            fA = vs50.a(this.C, fWidth, rectF2.height(), 0.5f);
        }
        matrix.setScale(fWidth, fWidth);
        int i = (int) (fA2 + 0.5f);
        int i2 = this.y;
        matrix.postTranslate(i + i2, ((int) (fA + 0.5f)) + i2);
        this.A.setLocalMatrix(matrix);
        invalidate();
    }

    public int getBorderColor() {
        return this.w;
    }

    public int getBorderWidth() {
        return this.y;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return H;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setImageDrawable(null);
        setImageBitmap(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.D, this.i);
        if (this.y != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.E, this.v);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d();
    }

    public void setBorderColor(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        this.v.setColor(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.y) {
            return;
        }
        this.y = i;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.z = bitmap;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.z = c(drawable);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.z = c(getDrawable());
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.z = c(getDrawable());
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == H) {
            return;
        }
        zqh0.a(scaleType, "ScaleType ", " not supported.");
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context) {
        super(context);
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.i = new Paint();
        this.v = new Paint();
        this.w = -1;
        this.y = 2;
        super.setScaleType(H);
        this.F = true;
        if (this.G) {
            d();
            this.G = false;
        }
    }
}
