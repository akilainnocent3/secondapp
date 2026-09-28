package defpackage;

import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.b;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u5w implements Comparable<u5w> {
    public static final String[] G = {"position", "x", "y", "width", "height", "pathRotate"};
    public skf a;
    public float c;
    public float d;
    public float e;
    public float f;
    public float i;
    public float v;
    public int b = 0;
    public float w = Float.NaN;
    public int y = -1;
    public int z = -1;
    public float A = Float.NaN;
    public n5w B = null;
    public LinkedHashMap<String, a> C = new LinkedHashMap<>();
    public int D = 0;
    public double[] E = new double[18];
    public double[] F = new double[18];

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void a(b.a aVar) {
        int iOrdinal;
        this.a = skf.c(aVar.d.d);
        b.c cVar = aVar.d;
        this.y = cVar.e;
        this.z = cVar.b;
        this.w = cVar.h;
        this.b = cVar.f;
        this.A = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            a aVar2 = aVar.g.get(str);
            if (aVar2 != null && (iOrdinal = aVar2.c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.C.put(str, aVar2);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float fCos = this.f;
        float f2 = this.i;
        float f3 = this.v;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        n5w n5wVar = this.B;
        if (n5wVar != null) {
            float[] fArr2 = new float[2];
            n5wVar.c(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = f;
            double d3 = fCos;
            double dSin = Math.sin(d3) * d2;
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            f = (float) ((dSin + ((double) f5)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f2 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(u5w u5wVar) {
        return Float.compare(this.d, u5wVar.d);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.i = f3;
        this.v = f4;
    }

    public final void f(n5w n5wVar, u5w u5wVar) {
        double d = (((this.i / 2.0f) + this.e) - u5wVar.e) - (u5wVar.i / 2.0f);
        double d2 = (((this.v / 2.0f) + this.f) - u5wVar.f) - (u5wVar.v / 2.0f);
        this.B = n5wVar;
        this.e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.A)) {
            this.f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f = (float) Math.toRadians(this.A);
        }
    }
}
