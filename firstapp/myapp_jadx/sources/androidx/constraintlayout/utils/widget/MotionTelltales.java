package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.amp;
import defpackage.aw0;
import defpackage.gxh0;
import defpackage.n5w;
import defpackage.q9i0;
import defpackage.t5w;
import defpackage.u5w;
import defpackage.wk30;
import defpackage.z8i0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public final Paint A;
    public MotionLayout B;
    public final float[] C;
    public final Matrix D;
    public int E;
    public int F;
    public float G;

    public MotionTelltales(Context context) {
        super(context);
        this.A = new Paint();
        this.C = new float[2];
        this.D = new Matrix();
        this.E = 0;
        this.F = -65281;
        this.G = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.F = typedArrayObtainStyledAttributes.getColor(index, this.F);
                } else if (index == 2) {
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                } else if (index == 1) {
                    this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.F;
        Paint paint = this.A;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Matrix matrix;
        int i2;
        float f;
        float[] fArr;
        int i3;
        int i4;
        char c;
        double[] dArr;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        Matrix matrix2 = motionTelltales.getMatrix();
        Matrix matrix3 = motionTelltales.D;
        matrix2.invert(matrix3);
        if (motionTelltales.B == null) {
            ViewParent parent = motionTelltales.getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.B = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = motionTelltales.getWidth();
        int height = motionTelltales.getHeight();
        int i5 = 5;
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i6 = 0;
        while (i6 < i5) {
            float f2 = fArr2[i6];
            int i7 = 0;
            while (i7 < i5) {
                float f3 = fArr2[i7];
                MotionLayout motionLayout = motionTelltales.B;
                int i8 = motionTelltales.E;
                float fA = motionLayout.I;
                float f4 = motionLayout.T;
                if (motionLayout.G != null) {
                    float fSignum = Math.signum(motionLayout.V - f4);
                    float interpolation = motionLayout.G.getInterpolation(motionLayout.T + 1.0E-5f);
                    float interpolation2 = motionLayout.G.getInterpolation(motionLayout.T);
                    fA = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.R;
                    f4 = interpolation2;
                }
                t5w t5wVar = motionLayout.G;
                if (t5wVar != null) {
                    fA = t5wVar.a();
                }
                float f5 = fA;
                n5w n5wVar = motionLayout.P.get(motionTelltales);
                int i9 = i8 & 1;
                float[] fArr3 = motionTelltales.C;
                if (i9 == 0) {
                    int width2 = motionTelltales.getWidth();
                    int height2 = motionTelltales.getHeight();
                    float[] fArr4 = n5wVar.v;
                    float fB = n5wVar.b(f4, fArr4);
                    c = 0;
                    HashMap<String, q9i0> map = n5wVar.y;
                    f = f5;
                    q9i0 q9i0Var = map == null ? null : map.get("translationX");
                    fArr = fArr2;
                    HashMap<String, q9i0> map2 = n5wVar.y;
                    i3 = i6;
                    q9i0 q9i0Var2 = map2 == null ? null : map2.get("translationY");
                    HashMap<String, q9i0> map3 = n5wVar.y;
                    float f6 = f2;
                    q9i0 q9i0Var3 = map3 == null ? null : map3.get("rotation");
                    HashMap<String, q9i0> map4 = n5wVar.y;
                    i4 = i7;
                    q9i0 q9i0Var4 = map4 == null ? null : map4.get("scaleX");
                    i2 = height;
                    HashMap<String, q9i0> map5 = n5wVar.y;
                    i = width;
                    q9i0 q9i0Var5 = map5 == null ? null : map5.get("scaleY");
                    matrix = matrix3;
                    HashMap<String, z8i0> map6 = n5wVar.z;
                    z8i0 z8i0Var = map6 == null ? null : map6.get("translationX");
                    HashMap<String, z8i0> map7 = n5wVar.z;
                    z8i0 z8i0Var2 = map7 == null ? null : map7.get("translationY");
                    HashMap<String, z8i0> map8 = n5wVar.z;
                    z8i0 z8i0Var3 = map8 == null ? null : map8.get("rotation");
                    HashMap<String, z8i0> map9 = n5wVar.z;
                    z8i0 z8i0Var4 = map9 == null ? null : map9.get("scaleX");
                    HashMap<String, z8i0> map10 = n5wVar.z;
                    z8i0 z8i0Var5 = map10 != null ? map10.get("scaleY") : null;
                    gxh0 gxh0Var = new gxh0();
                    gxh0Var.e = 0.0f;
                    gxh0Var.d = 0.0f;
                    gxh0Var.c = 0.0f;
                    gxh0Var.b = 0.0f;
                    gxh0Var.a = 0.0f;
                    if (q9i0Var3 != null) {
                        gxh0Var.e = (float) q9i0Var3.a.e(fB);
                        gxh0Var.f = q9i0Var3.a(fB);
                    }
                    if (q9i0Var != null) {
                        gxh0Var.c = (float) q9i0Var.a.e(fB);
                    }
                    if (q9i0Var2 != null) {
                        gxh0Var.d = (float) q9i0Var2.a.e(fB);
                    }
                    if (q9i0Var4 != null) {
                        gxh0Var.a = (float) q9i0Var4.a.e(fB);
                    }
                    if (q9i0Var5 != null) {
                        gxh0Var.b = (float) q9i0Var5.a.e(fB);
                    }
                    if (z8i0Var3 != null) {
                        gxh0Var.e = z8i0Var3.b(fB);
                    }
                    if (z8i0Var != null) {
                        gxh0Var.c = z8i0Var.b(fB);
                    }
                    if (z8i0Var2 != null) {
                        gxh0Var.d = z8i0Var2.b(fB);
                    }
                    amp ampVar = z8i0Var4;
                    if (z8i0Var4 != null) {
                        gxh0Var.a = ampVar.b(fB);
                    }
                    if (z8i0Var5 != null) {
                        gxh0Var.b = z8i0Var5.b(fB);
                    }
                    aw0 aw0Var = n5wVar.k;
                    if (aw0Var != null) {
                        double[] dArr2 = n5wVar.p;
                        if (dArr2.length > 0) {
                            double d = fB;
                            aw0Var.c(d, dArr2);
                            n5wVar.k.f(d, n5wVar.q);
                            u5w.e(f3, f6, fArr3, n5wVar.o, n5wVar.q, n5wVar.p);
                            fArr3 = fArr3;
                            f2 = f6;
                            f3 = f3;
                        } else {
                            f3 = f3;
                            f2 = f6;
                            fArr3 = fArr3;
                        }
                        gxh0Var.a(f3, f2, width2, height2, fArr3);
                    } else if (n5wVar.j != null) {
                        double dB = n5wVar.b(fB, fArr4);
                        n5wVar.j[0].f(dB, n5wVar.q);
                        n5wVar.j[0].c(dB, n5wVar.p);
                        float f7 = fArr4[0];
                        int i10 = 0;
                        while (true) {
                            dArr = n5wVar.q;
                            if (i10 >= dArr.length) {
                                break;
                            }
                            dArr[i10] = dArr[i10] * ((double) f7);
                            i10++;
                        }
                        u5w.e(f3, f6, fArr3, n5wVar.o, dArr, n5wVar.p);
                        fArr3 = fArr3;
                        f2 = f6;
                        f3 = f3;
                        gxh0Var.a(f3, f2, width2, height2, fArr3);
                    } else {
                        u5w u5wVar = n5wVar.g;
                        float f8 = u5wVar.e;
                        u5w u5wVar2 = n5wVar.f;
                        float f9 = f8 - u5wVar2.e;
                        float f10 = u5wVar.f - u5wVar2.f;
                        float f11 = u5wVar.i - u5wVar2.i;
                        float f12 = f10 + (u5wVar.v - u5wVar2.v);
                        fArr3[0] = ((f9 + f11) * f3) + ((1.0f - f3) * f9);
                        fArr3[1] = (f12 * f6) + ((1.0f - f6) * f10);
                        gxh0Var.e = 0.0f;
                        gxh0Var.d = 0.0f;
                        gxh0Var.c = 0.0f;
                        gxh0Var.b = 0.0f;
                        gxh0Var.a = 0.0f;
                        if (q9i0Var3 != null) {
                            gxh0Var.e = (float) q9i0Var3.a.e(fB);
                            gxh0Var.f = q9i0Var3.a(fB);
                        }
                        if (q9i0Var != null) {
                            gxh0Var.c = (float) q9i0Var.a.e(fB);
                        }
                        if (q9i0Var2 != null) {
                            gxh0Var.d = (float) q9i0Var2.a.e(fB);
                        }
                        if (q9i0Var4 != null) {
                            gxh0Var.a = (float) q9i0Var4.a.e(fB);
                        }
                        if (q9i0Var5 != null) {
                            gxh0Var.b = (float) q9i0Var5.a.e(fB);
                        }
                        if (z8i0Var3 != null) {
                            gxh0Var.e = z8i0Var3.b(fB);
                        }
                        if (z8i0Var != null) {
                            gxh0Var.c = z8i0Var.b(fB);
                        }
                        if (z8i0Var2 != null) {
                            gxh0Var.d = z8i0Var2.b(fB);
                        }
                        if (ampVar != null) {
                            gxh0Var.a = ampVar.b(fB);
                        }
                        if (z8i0Var5 != null) {
                            gxh0Var.b = z8i0Var5.b(fB);
                        }
                        f3 = f3;
                        f2 = f6;
                        fArr3 = fArr3;
                        gxh0Var.a(f3, f2, width2, height2, fArr3);
                    }
                    i8 = i8;
                } else {
                    i = width;
                    matrix = matrix3;
                    i2 = height;
                    f = f5;
                    fArr = fArr2;
                    i3 = i6;
                    i4 = i7;
                    i8 = i8;
                    c = 0;
                    n5wVar.d(f4, f3, f2, fArr3);
                }
                if (i8 < 2) {
                    fArr3[c] = fArr3[c] * f;
                    fArr3[1] = fArr3[1] * f;
                }
                motionTelltales = this;
                float[] fArr5 = motionTelltales.C;
                matrix3 = matrix;
                matrix3.mapVectors(fArr5);
                int i11 = i;
                float f13 = i11 * f3;
                int i12 = i2;
                float f14 = i12 * f2;
                float f15 = fArr5[c];
                float f16 = motionTelltales.G;
                float f17 = f14 - (fArr5[1] * f16);
                matrix3.mapVectors(fArr5);
                canvas.drawLine(f13, f14, f13 - (f15 * f16), f17, motionTelltales.A);
                i7 = i4 + 1;
                width = i11;
                height = i12;
                fArr2 = fArr;
                i6 = i3;
                i5 = 5;
            }
            i6++;
            height = height;
            i5 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new Paint();
        this.C = new float[2];
        this.D = new Matrix();
        this.E = 0;
        this.F = -65281;
        this.G = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new Paint();
        this.C = new float[2];
        this.D = new Matrix();
        this.E = 0;
        this.F = -65281;
        this.G = 0.25f;
        b(context, attributeSet);
    }
}
