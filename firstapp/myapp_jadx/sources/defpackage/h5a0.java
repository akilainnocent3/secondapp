package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h5a0 {
    public final usw a;

    public h5a0(long[] jArr) {
        usw uswVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            uswVar = new usw(jArrCopyOf.length);
            int i = uswVar.b;
            if (i < 0) {
                mae0.a("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = uswVar.a;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    uswVar.a = jArrCopyOf2;
                }
                int i2 = uswVar.b;
                if (i != i2) {
                    xx0.g(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                }
                xx0.g(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                uswVar.b += jArrCopyOf.length;
            }
        } else {
            uswVar = new usw(16);
        }
        this.a = uswVar;
    }
}
