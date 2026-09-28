package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lyf {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final Pair a(boolean z, z83 z83Var, boolean z2, boolean z3, long j, String str, boolean z4) {
        z83Var.getClass();
        if (!z || z83Var != z83.c) {
            Boolean bool = Boolean.FALSE;
            return new Pair(bool, bool);
        }
        boolean z5 = false;
        boolean z6 = j == 0 && Intrinsics.g(str, "ROUND_END_WAIT");
        if (!z2 && !z3 && !z6 && !z4) {
            z5 = true;
        }
        return new Pair(Boolean.TRUE, Boolean.valueOf(z5));
    }
}
