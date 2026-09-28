package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class dzj0 {
    public static final ezj0 a(x1k0 x1k0Var, Function0<Unit> function0, Function0<Unit> function1, boolean z) {
        x1k0Var.getClass();
        if (!x1k0Var.equals(x1k0.a.a)) {
            if (x1k0Var instanceof x1k0.b) {
                return new ezj0(new vyj0.a(((x1k0.b) x1k0Var).a), function0);
            }
            if (!x1k0Var.equals(x1k0.c.a)) {
                uhc.a();
                return null;
            }
            if (!z) {
                return new ezj0(vyj0.b.a, function1);
            }
        }
        return null;
    }
}
