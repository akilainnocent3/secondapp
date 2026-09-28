package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class i0g0 {
    public static final float a;
    public static final zhd b;

    static {
        long jA = jc1.a(16.0f, 8.0f);
        a = 200.0f;
        b = new zhd(jA);
    }

    public static w0g0 a(int i, float f, a aVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            umz umzVar = r0g0.a;
            f = 4.0f;
        }
        int iY0 = ((mmd) aVar.O(kna.h)).y0(f);
        boolean zD = ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4) | aVar.d(iY0);
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new w0g0(i, iY0);
            aVar.r(objY);
        }
        return (w0g0) objY;
    }
}
