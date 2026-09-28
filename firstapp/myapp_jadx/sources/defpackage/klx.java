package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class klx {
    public static final int a(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static final int b(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static final flx c(a aVar) {
        View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        z6i0 z6i0Var = (z6i0) aVar.O(kna.s);
        boolean zM = aVar.M(view) | aVar.M(z6i0Var);
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            z6i0Var.d();
            objY = new jlx(view);
            aVar.r(objY);
        }
        return (flx) objY;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r9
      0x0048: PHI (r9v6 float) = (r9v3 float), (r9v7 float) binds: [B:16:0x0054, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x001d A[PHI: r1
      0x001d: PHI (r1v5 float) = (r1v2 float), (r1v6 float) binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long d(int[] iArr, long j) {
        float f;
        float fIntBitsToFloat;
        float f2;
        float fIntBitsToFloat2;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= 0.0f) {
            f = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (f > fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        } else {
            f = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (f < fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            f2 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (f2 > fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        } else {
            f2 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (f2 < fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }
}
