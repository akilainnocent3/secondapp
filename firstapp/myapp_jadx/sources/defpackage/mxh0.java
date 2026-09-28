package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mxh0 {
    public static final void a(jxh0 jxh0Var, m020 m020Var, long j) {
        boolean zC = ovo.c(m020Var);
        long j2 = m020Var.b;
        if (zC) {
            jxh0Var.b();
        }
        if (!ovo.e(m020Var)) {
            List list = m020Var.k;
            if (list == null) {
                list = m2g.a;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                z9m z9mVar = (z9m) list.get(i);
                long j3 = z9mVar.a;
                long jF = gly.f(z9mVar.c, j);
                jxh0Var.a.a(Float.intBitsToFloat((int) (jF >> 32)), j3);
                jxh0Var.b.a(Float.intBitsToFloat((int) (jF & 4294967295L)), j3);
                i++;
            }
            long jF2 = gly.f(m020Var.l, j);
            jxh0Var.a.a(Float.intBitsToFloat((int) (jF2 >> 32)), j2);
            jxh0Var.b.a(Float.intBitsToFloat((int) (jF2 & 4294967295L)), j2);
        }
        if (ovo.e(m020Var) && j2 - jxh0Var.c > 40) {
            jxh0Var.b();
        }
        jxh0Var.c = j2;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void c(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            wkn.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fB = b(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : b(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fB2 = b(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fB2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fB2 / fArr11[i14];
        }
    }
}
