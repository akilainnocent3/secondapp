package com.king.zxing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import defpackage.pjh;
import defpackage.qk30;
import defpackage.xj50;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewfinderView extends View {
    public int A;
    public int B;
    public boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public a H;
    public final int I;
    public final int J;
    public Rect K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final float R;
    public ArrayList S;
    public ArrayList T;
    public final int U;
    public final Paint a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int i;
    public final float v;
    public String w;
    public int y;
    public float z;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE(0),
        LINE(1),
        /* JADX INFO: Fake field, exist only in values array */
        GRID(2);

        public final int a;

        a(int i) {
            this.a = i;
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        a aVar;
        super(context, attributeSet, i);
        int i3 = 0;
        this.A = 0;
        this.B = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qk30.a);
        this.c = typedArrayObtainStyledAttributes.getColor(17, context.getColor(R.color.viewfinder_mask));
        this.d = typedArrayObtainStyledAttributes.getColor(3, context.getColor(R.color.viewfinder_frame));
        this.f = typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color.viewfinder_corner));
        this.e = typedArrayObtainStyledAttributes.getColor(15, context.getColor(R.color.viewfinder_laser));
        this.i = typedArrayObtainStyledAttributes.getColor(18, context.getColor(R.color.viewfinder_result_point_color));
        this.w = typedArrayObtainStyledAttributes.getString(10);
        this.y = typedArrayObtainStyledAttributes.getColor(11, context.getColor(R.color.viewfinder_text_color));
        this.z = typedArrayObtainStyledAttributes.getDimension(14, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.v = typedArrayObtainStyledAttributes.getDimension(13, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        int i4 = typedArrayObtainStyledAttributes.getInt(12, 0);
        int[] iArrC = pjh.c(2);
        int length = iArrC.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i2 = 1;
                break;
            }
            i2 = iArrC[i5];
            if (pjh.b(i2) == i4) {
                break;
            } else {
                i5++;
            }
        }
        this.U = i2;
        this.C = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(16, 1);
        a[] aVarArrValues = a.values();
        int length2 = aVarArrValues.length;
        while (true) {
            if (i3 >= length2) {
                aVar = a.LINE;
                break;
            }
            aVar = aVarArrValues[i3];
            if (aVar.a == i6) {
                break;
            } else {
                i3++;
            }
        }
        this.H = aVar;
        this.I = typedArrayObtainStyledAttributes.getInt(8, 20);
        this.J = (int) typedArrayObtainStyledAttributes.getDimension(9, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.L = (int) typedArrayObtainStyledAttributes.getDimension(2, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.M = (int) typedArrayObtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.N = (int) typedArrayObtainStyledAttributes.getDimension(21, TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.O = (int) typedArrayObtainStyledAttributes.getDimension(20, TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
        this.P = (int) typedArrayObtainStyledAttributes.getDimension(5, TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.Q = typedArrayObtainStyledAttributes.getInteger(19, 15);
        this.R = typedArrayObtainStyledAttributes.getFloat(6, 0.625f);
        typedArrayObtainStyledAttributes.recycle();
        this.a = new Paint(1);
        this.b = new TextPaint(1);
        this.S = new ArrayList(5);
        this.T = null;
        this.D = getDisplayMetrics().widthPixels;
        int i7 = getDisplayMetrics().heightPixels;
        this.E = i7;
        int iMin = (int) (Math.min(this.D, i7) * this.R);
        int i8 = this.F;
        if (i8 <= 0 || i8 > this.D) {
            this.F = iMin;
        }
        int i9 = this.G;
        if (i9 <= 0 || i9 > this.E) {
            this.G = iMin;
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        Rect rect = this.K;
        if (rect == null) {
            return;
        }
        if (this.A == 0 || this.B == 0) {
            this.A = rect.top;
            this.B = rect.bottom - this.O;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect rect2 = this.K;
        this.a.setColor(this.c);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect2.top, this.a);
        canvas.drawRect(0.0f, rect2.top, rect2.left, rect2.bottom, this.a);
        canvas.drawRect(rect2.right, rect2.top, f, rect2.bottom, this.a);
        canvas.drawRect(0.0f, rect2.bottom, f, height, this.a);
        Rect rect3 = this.K;
        int i2 = 0;
        if (this.H != null) {
            this.a.setColor(this.e);
            int iOrdinal = this.H.ordinal();
            if (iOrdinal == 1) {
                canvas2 = canvas;
                float f2 = rect3.left;
                int i3 = this.A;
                this.a.setShader(new LinearGradient(f2, i3, f2, i3 + this.O, Integer.valueOf("01".concat(Integer.toHexString(this.e).substring(2)), 16).intValue(), this.e, Shader.TileMode.MIRROR));
                if (this.A <= this.B) {
                    int i4 = rect3.left;
                    int i5 = this.O;
                    int i6 = i5 * 2;
                    int i7 = this.A;
                    canvas2.drawOval(new RectF(i4 + i6, i7, rect3.right - i6, i7 + i5), this.a);
                    this.A += this.N;
                } else {
                    this.A = rect3.top;
                }
            } else if (iOrdinal != 2) {
                canvas2 = canvas;
            } else {
                this.a.setStrokeWidth(2.0f);
                int i8 = this.J;
                if (i8 > 0) {
                    int i9 = this.A;
                    if (i9 - rect3.top > i8) {
                        i = i9 - i8;
                    } else {
                        i = rect3.top;
                    }
                } else {
                    i = rect3.top;
                }
                float f3 = i;
                this.a.setShader(new LinearGradient((rect3.width() / 2) + rect3.left, f3, (rect3.width() / 2) + rect3.left, this.A, new int[]{Integer.valueOf("01".concat(Integer.toHexString(this.e).substring(2)), 16).intValue(), this.e}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                float fWidth = (rect3.width() * 1.0f) / this.I;
                for (int i10 = 1; i10 < this.I; i10++) {
                    float f4 = (i10 * fWidth) + rect3.left;
                    canvas.drawLine(f4, f3, f4, this.A, this.a);
                }
                int i11 = this.J;
                if (i11 <= 0 || this.A - rect3.top <= i11) {
                    i11 = this.A - rect3.top;
                }
                int i12 = i11;
                int i13 = 0;
                while (true) {
                    float f5 = i13;
                    if (f5 > i12 / fWidth) {
                        break;
                    }
                    float f6 = rect3.left;
                    float f7 = this.A - (f5 * fWidth);
                    canvas.drawLine(f6, f7, rect3.right, f7, this.a);
                    i13++;
                }
                canvas2 = canvas;
                int i14 = this.A;
                if (i14 < this.B) {
                    this.A = i14 + this.N;
                } else {
                    this.A = rect3.top;
                }
            }
            this.a.setShader(null);
        } else {
            canvas2 = canvas;
        }
        Rect rect4 = this.K;
        this.a.setColor(this.d);
        float f8 = rect4.left;
        int i15 = rect4.top;
        canvas2.drawRect(f8, i15, rect4.right, i15 + this.P, this.a);
        int i16 = rect4.left;
        canvas.drawRect(i16, rect4.top, i16 + this.P, rect4.bottom, this.a);
        int i17 = rect4.right;
        canvas.drawRect(i17 - this.P, rect4.top, i17, rect4.bottom, this.a);
        float f9 = rect4.left;
        int i18 = rect4.bottom;
        canvas.drawRect(f9, i18 - this.P, rect4.right, i18, this.a);
        Rect rect5 = this.K;
        this.a.setColor(this.f);
        int i19 = rect5.left;
        int i20 = rect5.top;
        canvas.drawRect(i19, i20, i19 + this.L, i20 + this.M, this.a);
        int i21 = rect5.left;
        int i22 = rect5.top;
        canvas.drawRect(i21, i22, i21 + this.M, i22 + this.L, this.a);
        int i23 = rect5.right;
        float f10 = i23 - this.L;
        int i24 = rect5.top;
        canvas.drawRect(f10, i24, i23, i24 + this.M, this.a);
        int i25 = rect5.right;
        float f11 = i25 - this.M;
        int i26 = rect5.top;
        canvas.drawRect(f11, i26, i25, i26 + this.L, this.a);
        int i27 = rect5.left;
        int i28 = rect5.bottom;
        canvas.drawRect(i27, i28 - this.L, i27 + this.M, i28, this.a);
        int i29 = rect5.left;
        int i30 = rect5.bottom;
        canvas.drawRect(i29, i30 - this.M, i29 + this.L, i30, this.a);
        int i31 = rect5.right;
        float f12 = i31 - this.L;
        int i32 = rect5.bottom;
        canvas.drawRect(f12, i32 - this.M, i31, i32, this.a);
        int i33 = rect5.right;
        float f13 = i33 - this.M;
        int i34 = rect5.bottom;
        canvas.drawRect(f13, i34 - this.L, i33, i34, this.a);
        Rect rect6 = this.K;
        if (!TextUtils.isEmpty(this.w)) {
            this.b.setColor(this.y);
            this.b.setTextSize(this.z);
            this.b.setTextAlign(Paint.Align.CENTER);
            StaticLayout staticLayout = new StaticLayout(this.w, this.b, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (this.U == 2) {
                canvas.translate((rect6.width() / 2) + rect6.left, rect6.bottom + this.v);
                staticLayout.draw(canvas);
            } else {
                canvas.translate((rect6.width() / 2) + rect6.left, (rect6.top - this.v) - staticLayout.getHeight());
                staticLayout.draw(canvas);
            }
        }
        if (this.C) {
            ArrayList arrayList = this.S;
            ArrayList arrayList2 = this.T;
            if (arrayList.isEmpty()) {
                this.T = null;
            } else {
                this.S = new ArrayList(5);
                this.T = arrayList;
                this.a.setAlpha(160);
                this.a.setColor(this.i);
                synchronized (arrayList) {
                    try {
                        int size = arrayList.size();
                        int i35 = 0;
                        while (i35 < size) {
                            Object obj = arrayList.get(i35);
                            i35++;
                            ((xj50) obj).getClass();
                            canvas.drawCircle(0.0f, 0.0f, 10.0f, this.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (arrayList2 != null) {
                this.a.setAlpha(80);
                this.a.setColor(this.i);
                synchronized (arrayList2) {
                    try {
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            ((xj50) obj2).getClass();
                            canvas.drawCircle(0.0f, 0.0f, 10.0f, this.a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        long j = this.Q;
        Rect rect7 = this.K;
        postInvalidateDelayed(j, rect7.left - 20, rect7.top - 20, rect7.right + 20, rect7.bottom + 20);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = (getPaddingLeft() + ((this.D - this.F) / 2)) - getPaddingRight();
        int paddingTop = (getPaddingTop() + ((this.E - this.G) / 2)) - getPaddingBottom();
        this.K = new Rect(paddingLeft, paddingTop, this.F + paddingLeft, this.G + paddingTop);
    }

    public void setLabelText(String str) {
        this.w = str;
    }

    public void setLabelTextColor(int i) {
        this.y = i;
    }

    public void setLabelTextColorResource(int i) {
        this.y = getContext().getColor(i);
    }

    public void setLabelTextSize(float f) {
        this.z = f;
    }

    public void setLaserStyle(a aVar) {
        this.H = aVar;
    }

    public void setShowResultPoint(boolean z) {
        this.C = z;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }
}
