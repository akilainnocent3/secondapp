package com.sporty.android.common_ui.widgets;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import defpackage.sk30;
import defpackage.th50;

/* JADX INFO: loaded from: classes.dex */
public class TimelineView extends View {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Rect P;
    public Drawable a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean i;
    public final Paint v;
    public boolean w;
    public boolean y;
    public float z;

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = new Paint();
        this.w = false;
        this.y = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sk30.e);
        this.a = typedArrayObtainStyledAttributes.getDrawable(7);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, (int) TypedValue.applyDimension(1, 20.0f, getContext().getResources().getDisplayMetrics()));
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(8, true);
        this.H = typedArrayObtainStyledAttributes.getColor(14, getResources().getColor(R.color.darker_gray));
        this.I = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.darker_gray));
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) TypedValue.applyDimension(1, 2.0f, getContext().getResources().getDisplayMetrics()));
        this.K = typedArrayObtainStyledAttributes.getInt(1, 1);
        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.L = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics()));
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(1, 4.0f, getContext().getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.w = true;
            this.y = true;
        }
        if (this.a == null) {
            Resources resources = getResources();
            Resources.Theme theme = getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = th50.a;
            this.a = resources.getDrawable(com.sportybet.android.gp.tz.R.drawable.cmn_ic_timeline_marker, theme);
        }
        c();
        b();
        setLayerType(1, null);
    }

    public final void a(int i) {
        if (i == 1) {
            this.w = false;
            this.y = true;
        } else if (i == 2) {
            this.w = true;
            this.y = false;
        } else if (i == 3) {
            this.w = false;
            this.y = false;
        } else {
            this.w = true;
            this.y = true;
        }
        c();
    }

    public final void b() {
        Paint paint = this.v;
        paint.setAlpha(0);
        paint.setAntiAlias(true);
        paint.setColor(this.H);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.J);
        if (this.L == 1) {
            paint.setPathEffect(new DashPathEffect(new float[]{this.M, this.N}, 0.0f));
        } else {
            paint.setPathEffect(new PathEffect());
        }
        invalidate();
    }

    public final void c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        int iMin = Math.min(this.b, Math.min((width - paddingLeft) - paddingRight, (height - paddingTop) - paddingBottom));
        boolean z = this.i;
        int i6 = this.K;
        if (z) {
            int i7 = width / 2;
            int i8 = iMin / 2;
            i5 = i7 - i8;
            int i9 = height / 2;
            i2 = i9 - i8;
            i = i7 + i8;
            i3 = i9 + i8;
            if (i6 == 0) {
                i4 = this.c - this.e;
                i5 += i4;
                i += i4;
            } else if (i6 == 1) {
                int i10 = this.d - this.f;
                i2 += i10;
                i3 += i10;
            }
        } else {
            i = paddingLeft + iMin;
            if (i6 == 0) {
                int i11 = height / 2;
                int i12 = iMin / 2;
                i2 = i11 - i12;
                i3 = i11 + i12;
                i4 = this.c - this.e;
                i5 = i4 + paddingLeft;
                i += i4;
            } else if (i6 != 1) {
                i5 = paddingLeft;
                i3 = paddingTop;
                i2 = i3;
            } else {
                int i13 = this.d;
                int i14 = this.f;
                i2 = (i13 - i14) + paddingTop;
                i3 = ((iMin + i13) - i14) + paddingTop;
                i5 = paddingLeft;
            }
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(i5, i2, i, i3);
            this.P = this.a.getBounds();
        }
        int i15 = this.K;
        boolean z2 = this.w;
        if (i15 == 0) {
            if (z2) {
                this.z = paddingLeft;
                this.A = this.P.centerY();
                Rect rect = this.P;
                this.B = rect.left - this.O;
                this.C = rect.centerY();
            }
            if (this.y) {
                if (this.L == 1) {
                    this.D = getWidth() - this.N;
                    this.E = this.P.centerY();
                    this.F = this.P.right + this.O;
                } else {
                    Rect rect2 = this.P;
                    this.D = rect2.right + this.O;
                    this.E = rect2.centerY();
                    this.F = getWidth();
                }
                this.G = this.P.centerY();
            }
        } else {
            if (z2) {
                this.z = this.P.centerX();
                this.A = paddingTop;
                this.B = this.P.centerX();
                this.C = this.P.top - this.O;
            }
            if (this.y) {
                int i16 = this.L;
                Rect rect3 = this.P;
                if (i16 == 1) {
                    this.D = rect3.centerX();
                    this.E = getHeight() - this.N;
                    this.F = this.P.centerX();
                    this.G = this.P.bottom + this.O;
                } else {
                    this.D = rect3.centerX();
                    Rect rect4 = this.P;
                    this.E = rect4.bottom + this.O;
                    this.F = rect4.centerX();
                    this.G = getHeight();
                }
            }
        }
        invalidate();
    }

    public int getEndLineColor() {
        return this.I;
    }

    public int getLineOrientation() {
        return this.K;
    }

    public int getLinePadding() {
        return this.O;
    }

    public int getLineStyle() {
        return this.L;
    }

    public int getLineStyleDashGap() {
        return this.N;
    }

    public int getLineStyleDashLength() {
        return this.M;
    }

    public int getLineWidth() {
        return this.J;
    }

    public Drawable getMarker() {
        return this.a;
    }

    public int getMarkerPaddingBottom() {
        return this.f;
    }

    public int getMarkerPaddingLeft() {
        return this.c;
    }

    public int getMarkerPaddingRight() {
        return this.e;
    }

    public int getMarkerPaddingTop() {
        return this.d;
    }

    public int getMarkerSize() {
        return this.b;
    }

    public int getStartLineColor() {
        return this.H;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        boolean z = this.w;
        Paint paint = this.v;
        if (z) {
            paint.setColor(this.H);
            canvas2 = canvas;
            canvas2.drawLine(this.z, this.A, this.B, this.C, paint);
        } else {
            canvas2 = canvas;
        }
        if (this.y) {
            paint.setColor(this.I);
            canvas2.drawLine(this.D, this.E, this.F, this.G, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + this.b, i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.b, i2, 0));
        c();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public void setEndLineColor(int i, int i2) {
        this.I = i;
        a(i2);
    }

    public void setLineOrientation(int i) {
        this.K = i;
    }

    public void setLinePadding(int i) {
        this.O = i;
        c();
    }

    public void setLineStyle(int i) {
        this.L = i;
        b();
    }

    public void setLineStyleDashGap(int i) {
        this.N = i;
        b();
    }

    public void setLineStyleDashLength(int i) {
        this.M = i;
        b();
    }

    public void setLineWidth(int i) {
        this.J = i;
        c();
    }

    public void setMarker(Drawable drawable, int i) {
        this.a = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        c();
    }

    public void setMarkerColor(int i) {
        this.a.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        c();
    }

    public void setMarkerInCenter(boolean z) {
        this.i = z;
        c();
    }

    public void setMarkerPaddingBottom(int i) {
        this.f = i;
        c();
    }

    public void setMarkerPaddingLeft(int i) {
        this.c = i;
        c();
    }

    public void setMarkerPaddingRight(int i) {
        this.e = i;
        c();
    }

    public void setMarkerPaddingTop(int i) {
        this.d = i;
        c();
    }

    public void setMarkerSize(int i) {
        this.b = i;
        c();
    }

    public void setStartLineColor(int i, int i2) {
        this.H = i;
        a(i2);
    }

    public void setMarker(Drawable drawable) {
        this.a = drawable;
        c();
    }
}
