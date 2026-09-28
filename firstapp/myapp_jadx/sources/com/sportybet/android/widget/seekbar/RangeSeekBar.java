package com.sportybet.android.widget.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fcy;
import defpackage.g70;
import defpackage.hb5;
import defpackage.li3;
import defpackage.n480;
import defpackage.o480;
import defpackage.sk30;
import defpackage.voy;
import defpackage.zrh0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class RangeSeekBar extends View {
    public int A;
    public CharSequence[] B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public int K;
    public int L;
    public float M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public int R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int a;
    public boolean a0;
    public int b;
    public final Paint b0;
    public int c;
    public final RectF c0;
    public int d;
    public final RectF d0;
    public int e;
    public final Rect e0;
    public int f;
    public final RectF f0;
    public final Rect g0;
    public final n480 h0;
    public int i;
    public final n480 i0;
    public n480 j0;
    public Bitmap k0;
    public Bitmap l0;
    public final ArrayList m0;
    public int n0;
    public voy o0;
    public int v;
    public int w;
    public int y;
    public int z;

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = true;
        this.a0 = false;
        this.b0 = new Paint();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new Rect();
        this.f0 = new RectF();
        this.g0 = new Rect();
        this.m0 = new ArrayList();
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sk30.d);
            this.e = typedArrayObtainStyledAttributes.getInt(18, 2);
            this.S = typedArrayObtainStyledAttributes.getFloat(16, 0.0f);
            this.T = typedArrayObtainStyledAttributes.getFloat(15, 100.0f);
            this.J = typedArrayObtainStyledAttributes.getFloat(17, 0.0f);
            this.K = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.D = typedArrayObtainStyledAttributes.getColor(19, -11806366);
            this.C = (int) typedArrayObtainStyledAttributes.getDimension(24, -1.0f);
            this.E = typedArrayObtainStyledAttributes.getColor(20, -2631721);
            this.F = typedArrayObtainStyledAttributes.getResourceId(21, 0);
            this.G = typedArrayObtainStyledAttributes.getResourceId(22, 0);
            this.H = (int) typedArrayObtainStyledAttributes.getDimension(23, zrh0.b(2.0f, getContext()));
            this.f = typedArrayObtainStyledAttributes.getInt(40, 0);
            this.w = typedArrayObtainStyledAttributes.getInt(37, 1);
            this.y = typedArrayObtainStyledAttributes.getInt(39, 0);
            this.B = typedArrayObtainStyledAttributes.getTextArray(42);
            this.i = (int) typedArrayObtainStyledAttributes.getDimension(44, zrh0.b(7.0f, getContext()));
            this.v = (int) typedArrayObtainStyledAttributes.getDimension(45, zrh0.b(12.0f, getContext()));
            this.z = typedArrayObtainStyledAttributes.getColor(43, this.E);
            this.A = typedArrayObtainStyledAttributes.getColor(38, this.D);
            this.P = typedArrayObtainStyledAttributes.getInt(31, 0);
            this.L = typedArrayObtainStyledAttributes.getColor(26, -6447715);
            this.O = typedArrayObtainStyledAttributes.getDimension(29, 0.0f);
            this.M = typedArrayObtainStyledAttributes.getDimension(30, 0.0f);
            this.N = typedArrayObtainStyledAttributes.getDimension(28, 0.0f);
            this.R = typedArrayObtainStyledAttributes.getResourceId(27, 0);
            this.Q = typedArrayObtainStyledAttributes.getBoolean(25, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Paint paint = this.b0;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.E);
        paint.setTextSize(this.v);
        this.h0 = new n480(this, attributeSet, true);
        n480 n480Var = new n480(this, attributeSet, false);
        this.i0 = n480Var;
        n480Var.H = this.e != 1;
        d();
    }

    public final float a(float f) {
        float f2 = 0.0f;
        if (this.j0 == null) {
            return 0.0f;
        }
        float progressLeft = ((f - getProgressLeft()) * 1.0f) / this.I;
        if (f >= getProgressLeft()) {
            f2 = f > ((float) getProgressRight()) ? 1.0f : progressLeft;
        }
        if (this.e == 2) {
            n480 n480Var = this.j0;
            n480 n480Var2 = this.h0;
            n480 n480Var3 = this.i0;
            if (n480Var == n480Var2) {
                float f3 = n480Var3.x;
                float f4 = this.W;
                if (f2 > f3 - f4) {
                    return f3 - f4;
                }
            } else if (n480Var == n480Var3) {
                float f5 = n480Var2.x;
                float f6 = this.W;
                if (f2 < f5 + f6) {
                    return f5 + f6;
                }
            }
        }
        return f2;
    }

    public final void b(boolean z) {
        n480 n480Var;
        n480 n480Var2 = this.i0;
        n480 n480Var3 = this.h0;
        if (!z || (n480Var = this.j0) == null) {
            n480Var3.G = false;
            if (this.e == 2) {
                n480Var2.G = false;
                return;
            }
            return;
        }
        boolean z2 = n480Var == n480Var3;
        n480Var3.G = z2;
        if (this.e == 2) {
            n480Var2.G = !z2;
        }
    }

    public final void c() {
        if (this.k0 == null) {
            this.k0 = zrh0.c(this.I, this.H, this.F, getContext());
        }
        if (this.l0 == null) {
            this.l0 = zrh0.c(this.I, this.H, this.G, getContext());
        }
    }

    public final void d() {
        if (!g() || this.R == 0) {
            return;
        }
        ArrayList arrayList = this.m0;
        if (arrayList.isEmpty()) {
            Bitmap bitmapC = zrh0.c((int) this.M, (int) this.N, this.R, getContext());
            for (int i = 0; i <= this.P; i++) {
                arrayList.add(bitmapC);
            }
        }
    }

    public final void e() {
        n480 n480Var = this.j0;
        if (n480Var == null || n480Var.s <= 1.0f || !this.a0) {
            return;
        }
        this.a0 = false;
        n480Var.P = n480Var.q;
        n480Var.Q = n480Var.r;
        int progressBottom = n480Var.I.getProgressBottom();
        int i = n480Var.Q;
        int i2 = i / 2;
        n480Var.v = progressBottom - i2;
        n480Var.w = i2 + progressBottom;
        n480Var.n(n480Var.o, n480Var.P, i);
    }

    public final void f() {
        n480 n480Var = this.j0;
        if (n480Var == null || n480Var.s <= 1.0f || this.a0) {
            return;
        }
        this.a0 = true;
        n480Var.P = (int) n480Var.h();
        n480Var.Q = (int) n480Var.g();
        int progressBottom = n480Var.I.getProgressBottom();
        int i = n480Var.Q;
        int i2 = i / 2;
        n480Var.v = progressBottom - i2;
        n480Var.w = i2 + progressBottom;
        n480Var.n(n480Var.o, n480Var.P, i);
    }

    public final boolean g() {
        return this.P >= 1 && this.N > 0.0f && this.M > 0.0f;
    }

    public int getGravity() {
        return this.K;
    }

    public n480 getLeftSeekBar() {
        return this.h0;
    }

    public float getMaxProgress() {
        return this.T;
    }

    public float getMinInterval() {
        return this.J;
    }

    public float getMinProgress() {
        return this.S;
    }

    public int getProgressBottom() {
        return this.b;
    }

    public int getProgressColor() {
        return this.D;
    }

    public int getProgressDefaultColor() {
        return this.E;
    }

    public int getProgressDefaultDrawableId() {
        return this.G;
    }

    public int getProgressDrawableId() {
        return this.F;
    }

    public int getProgressHeight() {
        return this.H;
    }

    public int getProgressLeft() {
        return this.c;
    }

    public int getProgressPaddingRight() {
        return this.n0;
    }

    public float getProgressRadius() {
        return this.C;
    }

    public int getProgressRight() {
        return this.d;
    }

    public int getProgressTop() {
        return this.a;
    }

    public int getProgressWidth() {
        return this.I;
    }

    public o480[] getRangeSeekBarState() {
        o480 o480Var = new o480();
        float fD = this.h0.d();
        o480Var.b = fD;
        o480Var.a = String.valueOf(fD);
        if (zrh0.a(o480Var.b, this.S) == 0) {
            o480Var.c = true;
        } else if (zrh0.a(o480Var.b, this.T) == 0) {
            o480Var.d = true;
        }
        o480 o480Var2 = new o480();
        if (this.e == 2) {
            float fD2 = this.i0.d();
            o480Var2.b = fD2;
            o480Var2.a = String.valueOf(fD2);
            if (zrh0.a(this.i0.x, this.S) == 0) {
                o480Var2.c = true;
            } else if (zrh0.a(this.i0.x, this.T) == 0) {
                o480Var2.d = true;
            }
        }
        return new o480[]{o480Var, o480Var2};
    }

    public float getRawHeight() {
        int i = this.e;
        n480 n480Var = this.h0;
        if (i == 1) {
            float fE = n480Var.e();
            if (this.y != 1 || this.B == null) {
                return fE;
            }
            return (this.H / 2.0f) + (fE - (this.h0.g() / 2.0f)) + Math.max((this.h0.g() - this.H) / 2.0f, getTickMarkRawHeight());
        }
        float fMax = Math.max(n480Var.e(), this.i0.e());
        if (this.y != 1 || this.B == null) {
            return fMax;
        }
        float fMax2 = Math.max(this.h0.g(), this.i0.g());
        return (this.H / 2.0f) + (fMax - (fMax2 / 2.0f)) + Math.max((fMax2 - this.H) / 2.0f, getTickMarkRawHeight());
    }

    public n480 getRightSeekBar() {
        return this.i0;
    }

    public int getSeekBarMode() {
        return this.e;
    }

    public int getSteps() {
        return this.P;
    }

    public List<Bitmap> getStepsBitmaps() {
        return this.m0;
    }

    public int getStepsColor() {
        return this.L;
    }

    public int getStepsDrawableId() {
        return this.R;
    }

    public float getStepsHeight() {
        return this.N;
    }

    public float getStepsRadius() {
        return this.O;
    }

    public float getStepsWidth() {
        return this.M;
    }

    public int getTickMarkGravity() {
        return this.w;
    }

    public int getTickMarkInRangeTextColor() {
        return this.A;
    }

    public int getTickMarkLayoutGravity() {
        return this.y;
    }

    public int getTickMarkMode() {
        return this.f;
    }

    public int getTickMarkRawHeight() {
        CharSequence[] charSequenceArr = this.B;
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            return 0;
        }
        return zrh0.e(this.v, String.valueOf(charSequenceArr[0])).height() + this.i + 3;
    }

    public CharSequence[] getTickMarkTextArray() {
        return this.B;
    }

    public int getTickMarkTextColor() {
        return this.z;
    }

    public int getTickMarkTextMargin() {
        return this.i;
    }

    public int getTickMarkTextSize() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float progressLeft;
        int iWidth;
        float f2;
        int iHeight;
        int progressLeft2;
        super.onDraw(canvas);
        CharSequence[] charSequenceArr = this.B;
        Paint paint = this.b0;
        float f3 = 2.0f;
        int i = 0;
        if (charSequenceArr != null) {
            int length = this.I / (charSequenceArr.length - 1);
            int i2 = 0;
            while (true) {
                CharSequence[] charSequenceArr2 = this.B;
                if (i2 >= charSequenceArr2.length) {
                    break;
                }
                String string = charSequenceArr2[i2].toString();
                if (!TextUtils.isEmpty(string)) {
                    int length2 = string.length();
                    Rect rect = this.g0;
                    paint.getTextBounds(string, 0, length2, rect);
                    paint.setColor(this.z);
                    if (this.f == 1) {
                        int i3 = this.w;
                        if (i3 == 2) {
                            progressLeft2 = ((i2 * length) + getProgressLeft()) - rect.width();
                        } else if (i3 == 1) {
                            progressLeft = (i2 * length) + getProgressLeft();
                            iWidth = rect.width();
                        } else {
                            progressLeft2 = (i2 * length) + getProgressLeft();
                        }
                        f2 = progressLeft2;
                        if (this.y == 0) {
                            iHeight = getProgressTop() - this.i;
                        } else {
                            iHeight = rect.height() + getProgressBottom() + this.i;
                        }
                        canvas.drawText(string, f2, iHeight, paint);
                    } else {
                        try {
                            f = Float.parseFloat(string);
                        } catch (NumberFormatException unused) {
                            f = 0.0f;
                        }
                        o480[] rangeSeekBarState = getRangeSeekBarState();
                        if (zrh0.a(f, rangeSeekBarState[0].b) != -1 && zrh0.a(f, rangeSeekBarState[1].b) != 1 && this.e == 2) {
                            paint.setColor(this.A);
                        }
                        float progressLeft3 = getProgressLeft();
                        float f4 = this.I;
                        float f5 = this.S;
                        progressLeft = (((f - f5) * f4) / (this.T - f5)) + progressLeft3;
                        iWidth = rect.width();
                    }
                    f2 = progressLeft - (iWidth / 2.0f);
                    if (this.y == 0) {
                        iHeight = getProgressTop() - this.i;
                    } else {
                        iHeight = rect.height() + getProgressBottom() + this.i;
                    }
                    canvas.drawText(string, f2, iHeight, paint);
                }
                i2++;
            }
        }
        Bitmap bitmap = this.l0;
        RectF rectF = this.c0;
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            paint.setColor(this.E);
            float f6 = this.C;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        } else {
            canvas.drawBitmap(this.l0, (Rect) null, rectF, paint);
        }
        int i4 = this.e;
        n480 n480Var = this.i0;
        n480 n480Var2 = this.h0;
        RectF rectF2 = this.d0;
        if (i4 == 2) {
            rectF2.top = getProgressTop();
            rectF2.left = (this.I * n480Var2.x) + (n480Var2.h() / 2.0f) + n480Var2.t;
            rectF2.right = (this.I * n480Var.x) + (n480Var.h() / 2.0f) + n480Var.t;
            rectF2.bottom = getProgressBottom();
        } else {
            rectF2.top = getProgressTop();
            rectF2.left = (n480Var2.h() / 2.0f) + n480Var2.t;
            rectF2.right = (this.I * n480Var2.x) + (n480Var2.h() / 2.0f) + n480Var2.t;
            rectF2.bottom = getProgressBottom();
        }
        Bitmap bitmap2 = this.k0;
        if (bitmap2 == null || bitmap2.isRecycled() || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
            paint.setColor(this.D);
            float f7 = this.C;
            canvas.drawRoundRect(rectF2, f7, f7, paint);
        } else {
            Rect rect2 = this.e0;
            rect2.top = 0;
            rect2.bottom = this.k0.getHeight();
            int width = this.k0.getWidth();
            if (this.e == 2) {
                float f8 = width;
                rect2.left = (int) (n480Var2.x * f8);
                rect2.right = (int) (f8 * n480Var.x);
            } else {
                rect2.left = 0;
                rect2.right = (int) (width * n480Var2.x);
            }
            canvas.drawBitmap(this.k0, rect2, rectF2, (Paint) null);
        }
        if (g()) {
            int progressWidth = getProgressWidth() / this.P;
            float progressHeight = (this.N - getProgressHeight()) / 2.0f;
            while (i <= this.P) {
                float progressLeft4 = ((i * progressWidth) + getProgressLeft()) - (this.M / f3);
                float progressTop = getProgressTop() - progressHeight;
                float f9 = this.M + progressLeft4;
                float progressBottom = getProgressBottom() + progressHeight;
                RectF rectF3 = this.f0;
                rectF3.set(progressLeft4, progressTop, f9, progressBottom);
                ArrayList arrayList = this.m0;
                if (arrayList.isEmpty() || arrayList.size() <= i) {
                    paint.setColor(this.L);
                    float f10 = this.O;
                    canvas.drawRoundRect(rectF3, f10, f10, paint);
                } else {
                    canvas.drawBitmap((Bitmap) arrayList.get(i), (Rect) null, rectF3, paint);
                }
                i++;
                f3 = 2.0f;
            }
        }
        if (n480Var2.a == 3) {
            n480Var2.m(true);
        }
        n480Var2.b(canvas);
        if (this.e == 2) {
            if (n480Var.a == 3) {
                n480Var.m(true);
            }
            n480Var.b(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float rawHeight;
        int iMakeMeasureSpec;
        float rawHeight2;
        float fMax;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        } else if (mode == Integer.MIN_VALUE && (getParent() instanceof ViewGroup) && size == -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((ViewGroup) getParent()).getMeasuredHeight(), Integer.MIN_VALUE);
        } else {
            if (this.K == 2) {
                if (this.B == null || this.y != 1) {
                    rawHeight2 = getRawHeight();
                    fMax = Math.max(this.h0.g(), this.i0.g()) / 2.0f;
                } else {
                    rawHeight2 = getRawHeight();
                    fMax = getTickMarkRawHeight();
                }
                rawHeight = (rawHeight2 - fMax) * 2.0f;
            } else {
                rawHeight = getRawHeight();
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rawHeight, 1073741824);
        }
        super.onMeasure(i, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        try {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setRange(savedState.a, savedState.b, savedState.c);
            setProgress(savedState.e, savedState.f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.S;
        savedState.b = this.T;
        savedState.c = this.J;
        o480[] rangeSeekBarState = getRangeSeekBarState();
        savedState.e = rangeSeekBarState[0].b;
        savedState.f = rangeSeekBarState[1].b;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int iMax;
        super.onSizeChanged(i, i2, i3, i4);
        int paddingBottom = (i2 - getPaddingBottom()) - getPaddingTop();
        n480 n480Var = this.h0;
        n480 n480Var2 = this.i0;
        if (i2 > 0) {
            int i5 = this.K;
            if (i5 == 0) {
                float fMax = (n480Var.a == 1 && n480Var2.a == 1) ? 0.0f : Math.max(n480Var.c(), n480Var2.c());
                float fMax2 = Math.max(n480Var.g(), n480Var2.g());
                float f = this.H;
                float f2 = fMax2 - (f / 2.0f);
                int iA = (int) g70.a(f2, f, 2.0f, fMax);
                this.a = iA;
                if (this.B != null && this.y == 0) {
                    iA = (int) Math.max(getTickMarkRawHeight(), ((f2 - this.H) / 2.0f) + fMax);
                    this.a = iA;
                }
                this.b = iA + this.H;
            } else if (i5 == 1) {
                if (this.B == null || this.y != 1) {
                    iMax = (int) ((this.H / 2.0f) + (paddingBottom - (Math.max(n480Var.g(), n480Var2.g()) / 2.0f)));
                    this.b = iMax;
                } else {
                    iMax = paddingBottom - getTickMarkRawHeight();
                    this.b = iMax;
                }
                this.a = iMax - this.H;
            } else {
                int i6 = this.H;
                int i7 = (paddingBottom - i6) / 2;
                this.a = i7;
                this.b = i7 + i6;
            }
            int iMax2 = ((int) Math.max(n480Var.h(), n480Var2.h())) / 2;
            this.c = getPaddingLeft() + iMax2;
            int paddingRight = (i - iMax2) - getPaddingRight();
            this.d = paddingRight;
            this.I = paddingRight - this.c;
            this.c0.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
            this.n0 = i - this.d;
            if (this.C <= 0.0f) {
                this.C = (int) ((getProgressBottom() - getProgressTop()) * 0.45f);
            }
            c();
        }
        setRange(this.S, this.T, this.J);
        int progressTop = (getProgressTop() + getProgressBottom()) / 2;
        n480Var.l(getProgressLeft(), progressTop);
        if (this.e == 2) {
            n480Var2.l(getProgressLeft(), progressTop);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.U) {
            return true;
        }
        int action = motionEvent.getAction();
        n480 n480Var = this.h0;
        n480 n480Var2 = this.i0;
        if (action == 0) {
            this.V = motionEvent.getX();
            motionEvent.getY();
            if (this.e != 2) {
                this.j0 = n480Var;
                f();
            } else if (n480Var2.x >= 1.0f && n480Var.a(motionEvent.getX(), motionEvent.getY())) {
                this.j0 = n480Var;
                f();
            } else if (n480Var2.a(motionEvent.getX(), motionEvent.getY())) {
                this.j0 = n480Var2;
                f();
            } else {
                float progressLeft = ((this.V - getProgressLeft()) * 1.0f) / this.I;
                if (Math.abs(n480Var.x - progressLeft) < Math.abs(n480Var2.x - progressLeft)) {
                    this.j0 = n480Var;
                } else {
                    this.j0 = n480Var2;
                }
                this.j0.o(a(this.V));
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            b(true);
            return true;
        }
        if (action == 1) {
            if (g() && this.Q) {
                float fA = a(motionEvent.getX());
                float f = 1.0f / this.P;
                this.j0.o(new BigDecimal(fA / f).setScale(0, RoundingMode.HALF_UP).intValue() * f);
            }
            if (this.e == 2) {
                n480Var2.m(false);
            }
            n480Var.m(false);
            this.j0.k();
            e();
            if (this.o0 != null) {
                o480[] rangeSeekBarState = getRangeSeekBarState();
                this.o0.a(this, rangeSeekBarState[0].b, rangeSeekBarState[1].b);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            voy voyVar = this.o0;
            if (voyVar != null) {
                voyVar.b(this);
            }
            b(false);
        } else if (action == 2) {
            float x = motionEvent.getX();
            if (this.e == 2 && n480Var.x == n480Var2.x) {
                this.j0.k();
                voy voyVar2 = this.o0;
                if (voyVar2 != null) {
                    voyVar2.b(this);
                }
                float f2 = x - this.V;
                n480 n480Var3 = this.j0;
                if (f2 > 0.0f) {
                    if (n480Var3 != n480Var2) {
                        n480Var3.m(false);
                        e();
                        this.j0 = n480Var2;
                    }
                } else if (n480Var3 != n480Var) {
                    n480Var3.m(false);
                    e();
                    this.j0 = n480Var;
                }
            }
            f();
            n480 n480Var4 = this.j0;
            float f3 = n480Var4.y;
            n480Var4.y = f3 < 1.0f ? 0.1f + f3 : 1.0f;
            this.V = x;
            n480Var4.o(a(x));
            this.j0.m(true);
            if (this.o0 != null) {
                o480[] rangeSeekBarState2 = getRangeSeekBarState();
                this.o0.a(this, rangeSeekBarState2[0].b, rangeSeekBarState2[1].b);
            }
            invalidate();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            b(true);
        } else if (action == 3) {
            if (this.e == 2) {
                n480Var2.m(false);
            }
            n480 n480Var5 = this.j0;
            if (n480Var5 == n480Var || n480Var5 == n480Var2) {
                e();
            }
            n480Var.m(false);
            if (this.o0 != null) {
                o480[] rangeSeekBarState3 = getRangeSeekBarState();
                this.o0.a(this, rangeSeekBarState3[0].b, rangeSeekBarState3[1].b);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            b(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableThumbOverlap(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.U = z;
    }

    public void setGravity(int i) {
        this.K = i;
    }

    public void setIndicatorText(String str) {
        this.h0.F = str;
        if (this.e == 2) {
            this.i0.F = str;
        }
    }

    public void setIndicatorTextDecimalFormat(String str) {
        n480 n480Var = this.h0;
        n480Var.getClass();
        n480Var.O = new DecimalFormat(str);
        if (this.e == 2) {
            n480 n480Var2 = this.i0;
            n480Var2.getClass();
            n480Var2.O = new DecimalFormat(str);
        }
    }

    public void setIndicatorTextStringFormat(String str) {
        this.h0.J = str;
        if (this.e == 2) {
            this.i0.J = str;
        }
    }

    public void setOnRangeChangedListener(voy voyVar) {
        this.o0 = voyVar;
    }

    public void setProgress(float f, float f2) {
        float fMin = Math.min(f, f2);
        float fMax = Math.max(fMin, f2);
        float f3 = fMax - fMin;
        float f4 = this.J;
        if (f3 < f4) {
            if (fMin - this.S > this.T - fMax) {
                fMin = fMax - f4;
            } else {
                fMax = fMin + f4;
            }
        }
        float f5 = this.S;
        if (fMin < f5) {
            li3.a("setProgress() min < (preset min - offsetValue) . #min:", fMin, " #preset min:", fMax);
            return;
        }
        float f6 = this.T;
        if (fMax > f6) {
            throw new IllegalArgumentException("setProgress() max > (preset max - offsetValue) . #max:" + fMax + " #preset max:" + fMax);
        }
        float f7 = f6 - f5;
        this.h0.x = Math.abs(fMin - f5) / f7;
        if (this.e == 2) {
            this.i0.x = Math.abs(fMax - this.S) / f7;
        }
        voy voyVar = this.o0;
        if (voyVar != null) {
            voyVar.a(this, fMin, fMax);
        }
        invalidate();
    }

    public void setProgressBottom(int i) {
        this.b = i;
    }

    public void setProgressColor(int i, int i2) {
        this.E = i;
        this.D = i2;
    }

    public void setProgressDefaultColor(int i) {
        this.E = i;
    }

    public void setProgressDefaultDrawableId(int i) {
        this.G = i;
        this.l0 = null;
        c();
    }

    public void setProgressDrawableId(int i) {
        this.F = i;
        this.k0 = null;
        c();
    }

    public void setProgressHeight(int i) {
        this.H = i;
    }

    public void setProgressLeft(int i) {
        this.c = i;
    }

    public void setProgressRadius(float f) {
        this.C = f;
    }

    public void setProgressRight(int i) {
        this.d = i;
    }

    public void setProgressTop(int i) {
        this.a = i;
    }

    public void setProgressWidth(int i) {
        this.I = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    public void setRange(float f, float f2, float f3) {
        float f4;
        if (f2 <= f) {
            li3.a("setRange() max must be greater than min ! #max:", f2, " #min:", f);
            return;
        }
        if (f3 < 0.0f) {
            fcy.a(f3, "setRange() interval must be greater than zero ! #minInterval:");
            return;
        }
        float f5 = f2 - f;
        if (f3 >= f5) {
            li3.a("setRange() interval must be less than (max - min) ! #minInterval:", f3, " #max - min:", f5);
            return;
        }
        this.T = f2;
        this.S = f;
        this.J = f3;
        float f6 = f3 / f5;
        this.W = f6;
        if (this.e == 2) {
            n480 n480Var = this.h0;
            float f7 = n480Var.x;
            if (f7 + f6 <= 1.0f) {
                float f8 = f7 + f6;
                n480 n480Var2 = this.i0;
                if (f8 > n480Var2.x) {
                    n480Var2.x = f7 + f6;
                } else {
                    f4 = this.i0.x;
                    if (f4 - f6 >= 0.0f && f4 - f6 < f7) {
                        n480Var.x = f4 - f6;
                    }
                }
            } else {
                f4 = this.i0.x;
                if (f4 - f6 >= 0.0f) {
                    n480Var.x = f4 - f6;
                }
            }
        }
        invalidate();
    }

    public void setSeekBarMode(int i) {
        this.e = i;
        this.i0.H = i != 1;
    }

    public void setSteps(int i) {
        this.P = i;
    }

    public void setStepsAutoBonding(boolean z) {
        this.Q = z;
    }

    public void setStepsBitmaps(List<Bitmap> list) {
        if (list == null || list.isEmpty() || list.size() <= this.P) {
            hb5.a("stepsBitmaps must > steps !");
            return;
        }
        ArrayList arrayList = this.m0;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setStepsColor(int i) {
        this.L = i;
    }

    public void setStepsDrawable(List<Integer> list) {
        if (list == null || list.isEmpty() || list.size() <= this.P) {
            hb5.a("stepsDrawableIds must > steps !");
            return;
        }
        if (!g()) {
            hb5.a("stepsWidth must > 0, stepsHeight must > 0,steps must > 0 First!!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(zrh0.c((int) this.M, (int) this.N, list.get(i).intValue(), getContext()));
        }
        setStepsBitmaps(arrayList);
    }

    public void setStepsDrawableId(int i) {
        this.m0.clear();
        this.R = i;
        d();
    }

    public void setStepsHeight(float f) {
        this.N = f;
    }

    public void setStepsRadius(float f) {
        this.O = f;
    }

    public void setStepsWidth(float f) {
        this.M = f;
    }

    public void setTickMarkGravity(int i) {
        this.w = i;
    }

    public void setTickMarkInRangeTextColor(int i) {
        this.A = i;
    }

    public void setTickMarkLayoutGravity(int i) {
        this.y = i;
    }

    public void setTickMarkMode(int i) {
        this.f = i;
    }

    public void setTickMarkTextArray(CharSequence[] charSequenceArr) {
        this.B = charSequenceArr;
    }

    public void setTickMarkTextColor(int i) {
        this.z = i;
    }

    public void setTickMarkTextMargin(int i) {
        this.i = i;
    }

    public void setTickMarkTextSize(int i) {
        this.v = i;
    }

    public void setTypeface(Typeface typeface) {
        this.b0.setTypeface(typeface);
    }

    public void setProgressColor(int i) {
        this.D = i;
    }

    public void setRange(float f, float f2) {
        setRange(f, f2, this.J);
    }

    public void setProgress(float f) {
        setProgress(f, this.T);
    }

    public RangeSeekBar(Context context) {
        this(context, null);
    }
}
