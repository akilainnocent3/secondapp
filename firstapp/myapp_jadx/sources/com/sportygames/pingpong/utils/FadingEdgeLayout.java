package com.sportygames.pingpong.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.tk30;

/* JADX INFO: loaded from: classes8.dex */
public class FadingEdgeLayout extends FrameLayout {
    public static final int[] G = {0, -16777216};
    public static final int[] H = {-16777216, 0};
    public Paint A;
    public Rect B;
    public Rect C;
    public Rect D;
    public Rect E;
    public int F;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int i;
    public int v;
    public Paint w;
    public Paint y;
    public Paint z;

    public FadingEdgeLayout(Context context) {
        super(context);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        int iApplyDimension = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tk30.e, 0, 0);
            int i = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.a = (i & 1) == 1;
            this.b = (i & 2) == 2;
            this.c = (i & 4) == 4;
            this.d = (i & 8) == 8;
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, iApplyDimension);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iApplyDimension);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, iApplyDimension);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iApplyDimension);
            this.v = dimensionPixelSize;
            if (this.a && this.e > 0) {
                this.F |= 1;
            }
            if (this.c && this.i > 0) {
                this.F |= 4;
            }
            if (this.b && this.f > 0) {
                this.F |= 2;
            }
            if (this.d && dimensionPixelSize > 0) {
                this.F |= 8;
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.v = iApplyDimension;
            this.i = iApplyDimension;
            this.f = iApplyDimension;
            this.e = iApplyDimension;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setXfermode(porterDuffXfermode);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        paint2.setXfermode(porterDuffXfermode);
        Paint paint3 = new Paint(1);
        this.z = paint3;
        paint3.setXfermode(porterDuffXfermode);
        Paint paint4 = new Paint(1);
        this.A = paint4;
        paint4.setXfermode(porterDuffXfermode);
        this.B = new Rect();
        this.D = new Rect();
        this.C = new Rect();
        this.E = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        boolean z = this.a || this.b || this.c || this.d;
        if (getVisibility() == 8 || width == 0 || height == 0 || !z) {
            super.dispatchDraw(canvas);
            return;
        }
        int i = this.F;
        int i2 = i & 1;
        int[] iArr = G;
        if (i2 == 1) {
            this.F = i & (-2);
            int iMin = Math.min(this.e, (getHeight() - getPaddingTop()) - getPaddingBottom());
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i3 = iMin + paddingTop;
            this.B.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), i3);
            float f = paddingLeft;
            this.w.setShader(new LinearGradient(f, paddingTop, f, i3, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
        int i4 = this.F;
        if ((i4 & 4) == 4) {
            this.F = i4 & (-5);
            int iMin2 = Math.min(this.i, (getWidth() - getPaddingLeft()) - getPaddingRight());
            int paddingLeft2 = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            int i5 = iMin2 + paddingLeft2;
            this.D.set(paddingLeft2, paddingTop2, i5, getHeight() - getPaddingBottom());
            float f2 = paddingTop2;
            this.z.setShader(new LinearGradient(paddingLeft2, f2, i5, f2, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
        int i6 = this.F;
        int i7 = i6 & 2;
        int[] iArr2 = H;
        if (i7 == 2) {
            this.F = i6 & (-3);
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int iMin3 = Math.min(this.f, height2);
            int paddingLeft3 = getPaddingLeft();
            int paddingTop3 = (getPaddingTop() + height2) - iMin3;
            int i8 = iMin3 + paddingTop3;
            this.C.set(paddingLeft3, paddingTop3, getWidth() - getPaddingRight(), i8);
            float f3 = paddingLeft3;
            this.y.setShader(new LinearGradient(f3, paddingTop3, f3, i8, iArr2, (float[]) null, Shader.TileMode.CLAMP));
        }
        int i9 = this.F;
        if ((i9 & 8) == 8) {
            this.F = i9 & (-9);
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int iMin4 = Math.min(this.v, width2);
            int paddingLeft4 = (getPaddingLeft() + width2) - iMin4;
            int paddingTop4 = getPaddingTop();
            int i10 = iMin4 + paddingLeft4;
            this.E.set(paddingLeft4, paddingTop4, i10, getHeight() - getPaddingBottom());
            float f4 = paddingTop4;
            this.A.setShader(new LinearGradient(paddingLeft4, f4, i10, f4, iArr2, (float[]) null, Shader.TileMode.CLAMP));
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        if (this.a && this.e > 0) {
            canvas.drawRect(this.B, this.w);
        }
        if (this.b && this.f > 0) {
            canvas.drawRect(this.C, this.y);
        }
        if (this.c && this.i > 0) {
            canvas.drawRect(this.D, this.z);
        }
        if (this.d && this.v > 0) {
            canvas.drawRect(this.E, this.A);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.F |= 12;
        }
        if (i2 != i4) {
            this.F |= 3;
        }
    }

    public void setFadeEdges(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.a != z) {
            this.a = z;
            this.F |= 1;
        }
        if (this.c != z2) {
            this.c = z2;
            this.F |= 4;
        }
        if (this.b != z3) {
            this.b = z3;
            this.F |= 2;
        }
        if (this.d != z4) {
            this.d = z4;
            this.F |= 8;
        }
        if (this.F != 0) {
            invalidate();
        }
    }

    public void setFadeSizes(int i, int i2, int i3, int i4) {
        if (this.e != i) {
            this.e = i;
            this.F |= 1;
        }
        if (this.i != i2) {
            this.i = i2;
            this.F |= 4;
        }
        if (this.f != i3) {
            this.f = i3;
            this.F |= 2;
        }
        if (this.v != i4) {
            this.v = i4;
            this.F |= 8;
        }
        if (this.F != 0) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() != i) {
            this.F |= 4;
        }
        if (getPaddingTop() != i2) {
            this.F |= 1;
        }
        if (getPaddingRight() != i3) {
            this.F |= 8;
        }
        if (getPaddingBottom() != i4) {
            this.F |= 2;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
