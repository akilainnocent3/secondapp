package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y000 {
    public static final x000 a(Integer num) {
        if (num != null && num.intValue() == 0) {
            return x000.a.a;
        }
        return (num != null && num.intValue() == 1) ? x000.b.a : x000.a.a;
    }

    public static p400 b(mym mymVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = mymVar.a();
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        mymVar.getClass();
        str.getClass();
        return new p400(str, mymVar.b(), Integer.valueOf(mymVar.c()), str2);
    }

    public static final z000 c(x000 x000Var) {
        x000Var.getClass();
        if (Intrinsics.g(x000Var, x000.a.a)) {
            return z000.c.a;
        }
        if (Intrinsics.g(x000Var, x000.b.a)) {
            return z000.a.a;
        }
        uhc.a();
        return null;
    }
}
