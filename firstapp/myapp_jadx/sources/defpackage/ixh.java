package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ixh {
    public static final float[] a;

    static {
        long[] jArr;
        long[] jArr2 = fz60.a;
        int iE = fz60.e(0);
        int iMax = iE > 0 ? Math.max(7, fz60.d(iE)) : 0;
        if (iMax == 0) {
            jArr = fz60.a;
        } else {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i];
            Arrays.fill(jArr3, 0, i, -9187201950435737472L);
            jArr = jArr3;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}
