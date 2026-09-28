package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class amp {
    public a a;
    public String b;
    public int c;
    public String d;
    public int e;
    public ArrayList<b> f;

    public static class a {
        public k3z a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public r5c g;
        public double[] h;
        public double[] i;
    }

    public static class b {
        public final int a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public final float a(float f) {
        a aVar = this.a;
        r5c r5cVar = aVar.g;
        double[] dArr = aVar.h;
        if (r5cVar != null) {
            r5cVar.c(f, dArr);
        } else {
            dArr[0] = aVar.e[0];
            dArr[1] = aVar.f[0];
            dArr[2] = aVar.b[0];
        }
        double[] dArr2 = aVar.h;
        return (float) ((aVar.a.c(f, dArr2[1]) * aVar.h[2]) + dArr2[0]);
    }

    public final float b(float f) {
        double d;
        double dSin;
        double d2;
        double dSignum;
        a aVar = this.a;
        k3z k3zVar = aVar.a;
        r5c r5cVar = aVar.g;
        double[] dArr = aVar.i;
        if (r5cVar != null) {
            double d3 = f;
            r5cVar.f(d3, dArr);
            aVar.g.c(d3, aVar.h);
        } else {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double dC = k3zVar.c(d4, aVar.h[1]);
        double d5 = aVar.h[1];
        double d6 = aVar.i[1];
        double dB = k3zVar.b(d4) + d5;
        if (d4 <= 0.0d) {
            d = 0.0d;
        } else if (d4 >= 1.0d) {
            d = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch(k3zVar.b, d4);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = k3zVar.a;
            float f2 = fArr[iBinarySearch];
            int i = iBinarySearch - 1;
            float f3 = fArr[i];
            double[] dArr2 = k3zVar.b;
            double d7 = dArr2[iBinarySearch];
            double d8 = dArr2[i];
            double d9 = ((double) (f2 - f3)) / (d7 - d8);
            d = (((double) f3) - (d9 * d8)) + (d4 * d9);
        }
        double d10 = d + d6;
        switch (k3zVar.e) {
            case 1:
                dSin = 0.0d;
                break;
            case 2:
                d2 = d10 * 4.0d;
                dSignum = Math.signum((((dB * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dSin = dSignum * d2;
                break;
            case 3:
                dSin = d10 * 2.0d;
                break;
            case 4:
                dSin = (-d10) * 2.0d;
                break;
            case 5:
                dSin = Math.sin(6.283185307179586d * dB) * (-6.283185307179586d) * d10;
                break;
            case 6:
                dSin = ((((dB * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d10 * 4.0d;
                break;
            case 7:
                dSin = k3zVar.d.e(dB % 1.0d);
                break;
            default:
                d2 = d10 * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dB);
                dSin = dSignum * d2;
                break;
        }
        double[] dArr3 = aVar.i;
        return (float) ((dSin * aVar.h[2]) + (dC * dArr3[r5]) + dArr3[0]);
    }

    public final void d() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new zlp());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.c;
        String str = this.d;
        a aVar = new a();
        k3z k3zVar = new k3z();
        k3zVar.a = new float[0];
        k3zVar.b = new double[0];
        aVar.a = k3zVar;
        k3zVar.e = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double d4 = d2;
                double d5 = ((double) i6) * d4;
                dArr5[i7] = d5;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d5 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d4;
                    dArr5[i9] = (d5 - 1.0d) - d4;
                }
                i6++;
                d2 = d4;
            }
            k3zVar.d = new q4w(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        aVar.b = new float[size];
        aVar.c = new double[size];
        aVar.d = new float[size];
        aVar.e = new float[size];
        aVar.f = new float[size];
        float[] fArr = new float[size];
        this.a = aVar;
        int i10 = i2;
        int i11 = i10;
        for (int size2 = arrayList.size(); i11 < size2; size2 = size2) {
            b bVar = arrayList.get(i11);
            i11++;
            b bVar2 = bVar;
            float f = bVar2.d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i10];
            float f2 = bVar2.b;
            dArr6[i2] = f2;
            float f3 = bVar2.c;
            dArr6[i] = f3;
            float f4 = bVar2.e;
            dArr6[r4] = f4;
            a aVar2 = this.a;
            aVar2.c[i10] = ((double) bVar2.a) / 100.0d;
            aVar2.d[i10] = f;
            aVar2.e[i10] = f3;
            aVar2.f[i10] = f4;
            aVar2.b[i10] = f2;
            i10++;
            arrayList = arrayList;
        }
        a aVar3 = this.a;
        float[] fArr2 = aVar3.d;
        k3z k3zVar2 = aVar3.a;
        double[] dArr7 = aVar3.c;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = aVar3.b;
        aVar3.h = new double[fArr3.length + 2];
        aVar3.i = new double[fArr3.length + 2];
        double d6 = 0.0d;
        if (dArr7[i2] > 0.0d) {
            k3zVar2.a(0.0d, fArr2[i2]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            k3zVar2.a(d, fArr2[length4]);
        }
        for (int i12 = i2; i12 < dArr8.length; i12++) {
            double[] dArr9 = dArr8[i12];
            dArr9[i2] = aVar3.e[i12];
            dArr9[i] = aVar3.f[i12];
            dArr9[2] = fArr3[i12];
            k3zVar2.a(dArr7[i12], fArr2[i12]);
        }
        double d7 = 0.0d;
        int i13 = i2;
        while (true) {
            float[] fArr4 = k3zVar2.a;
            if (i13 >= fArr4.length) {
                break;
            }
            d7 += (double) fArr4[i13];
            i13++;
        }
        double d8 = 0.0d;
        int i14 = i;
        while (true) {
            float[] fArr5 = k3zVar2.a;
            if (i14 >= fArr5.length) {
                break;
            }
            int i15 = i14 - 1;
            float f5 = (fArr5[i15] + fArr5[i14]) / 2.0f;
            double[] dArr10 = k3zVar2.b;
            d8 = ((dArr10[i14] - dArr10[i15]) * ((double) f5)) + d8;
            i14++;
        }
        int i16 = i2;
        while (true) {
            float[] fArr6 = k3zVar2.a;
            if (i16 >= fArr6.length) {
                break;
            }
            fArr6[i16] = fArr6[i16] * ((float) (d7 / d8));
            i16++;
            d6 = d6;
        }
        k3zVar2.c[i2] = d6;
        int i17 = i;
        while (true) {
            float[] fArr7 = k3zVar2.a;
            if (i17 >= fArr7.length) {
                break;
            }
            int i18 = i17 - 1;
            float f6 = (fArr7[i18] + fArr7[i17]) / 2.0f;
            double[] dArr11 = k3zVar2.b;
            double d9 = dArr11[i17] - dArr11[i18];
            double[] dArr12 = k3zVar2.c;
            dArr12[i17] = (d9 * ((double) f6)) + dArr12[i18];
            i17++;
        }
        if (dArr7.length > i) {
            i3 = i2;
            aVar3.g = r5c.a(i3, dArr7, dArr8);
        } else {
            i3 = i2;
            aVar3.g = null;
        }
        r5c.a(i3, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b bVar = arrayList.get(i);
            i++;
            b bVar2 = bVar;
            str = str + "[" + bVar2.a + " , " + decimalFormat.format(bVar2.b) + "] ";
        }
        return str;
    }

    public void c(androidx.constraintlayout.widget.a aVar) {
    }
}
