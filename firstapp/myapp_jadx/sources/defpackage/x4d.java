package defpackage;

import com.google.protobuf.Reader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4d {
    public static final long a(int i, int i2, ww90 ww90Var, vy60 vy60Var, ww90 ww90Var2) {
        int i3;
        int i4;
        if (!Intrinsics.g(ww90Var, ww90.c)) {
            i = c(ww90Var.a, vy60Var);
            i2 = c(ww90Var.b, vy60Var);
        }
        dqe dqeVar = ww90Var2.a;
        dqe dqeVar2 = ww90Var2.b;
        if ((dqeVar instanceof dqe.a) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((dqe.a) dqeVar).a)) {
            i = i4;
        }
        if ((dqeVar2 instanceof dqe.a) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((dqe.a) dqeVar2).a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double b(int i, int i2, int i3, int i4, vy60 vy60Var) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = vy60Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        uhc.a();
        return 0.0d;
    }

    public static int c(dqe dqeVar, vy60 vy60Var) {
        if (dqeVar instanceof dqe.a) {
            return ((dqe.a) dqeVar).a;
        }
        int iOrdinal = vy60Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Reader.READ_DONE;
        }
        uhc.a();
        return 0;
    }
}
