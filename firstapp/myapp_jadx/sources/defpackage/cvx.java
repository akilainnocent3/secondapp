package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cvx implements w6a0 {
    public static final cvx a = new cvx();

    public static final int a(tx0 tx0Var, Object obj, int i) {
        int i2 = tx0Var.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = bza.a(i2, i, tx0Var.a);
            if (iA < 0 || Intrinsics.g(obj, tx0Var.b[iA])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && tx0Var.a[i3] == i) {
                if (Intrinsics.g(obj, tx0Var.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && tx0Var.a[i4] == i; i4--) {
                if (Intrinsics.g(obj, tx0Var.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            sx0.a();
            return 0;
        }
    }
}
