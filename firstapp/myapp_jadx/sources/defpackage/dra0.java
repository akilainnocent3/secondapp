package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class dra0 extends rtu {
    public static final byte[] b = new byte[0];

    public static byte[] d(hg1 hg1Var) {
        return hg1Var.a().isEmpty() ? b : woi0.a(hg1Var).getBytes(StandardCharsets.UTF_8);
    }

    public static dk1 e(wqa0 wqa0Var) {
        int iOrdinal = wqa0Var.ordinal();
        if (iOrdinal == 0) {
            return nqa0.c.b;
        }
        if (iOrdinal == 1) {
            return nqa0.c.c;
        }
        if (iOrdinal == 2) {
            return nqa0.c.d;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? nqa0.c.a : nqa0.c.f;
        }
        return nqa0.c.e;
    }
}
