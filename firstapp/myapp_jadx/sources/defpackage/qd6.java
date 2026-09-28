package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qd6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj2;
                ((Boolean) obj).getClass();
                throw th;
            case 1:
                r320 r320Var = (r320) obj2;
                Pair pair = (Pair) obj;
                List list = (List) pair.a;
                boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
                boolean z = r320Var.p0() != jz7.c && ((Boolean) r320Var.r0().I.getValue()).booleanValue();
                int iIntValue = ((Number) r320Var.r0().J.getValue()).intValue();
                Boolean bool = (Boolean) r320Var.r0().H.d();
                if (bool == null || !(!bool.booleanValue())) {
                    if (!zBooleanValue) {
                        if (Intrinsics.g(r320Var.r0().T, mz7.h0)) {
                            r320.u0(r320Var, my7.d);
                        } else {
                            r320.u0(r320Var, my7.c);
                        }
                    }
                    return Unit.a;
                }
                kz1 kz1Var = r320Var.C;
                if (zBooleanValue) {
                    if (kz1Var == null) {
                        Intrinsics.n("adapter");
                        throw null;
                    }
                    kz1Var.h(iIntValue, list, z);
                } else {
                    if (kz1Var == null) {
                        Intrinsics.n("adapter");
                        throw null;
                    }
                    kz1Var.c(iIntValue, list, z);
                }
                r320.u0(r320Var, my7.a);
                return Unit.a;
            default:
                aq40 aq40Var = (aq40) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(aq40Var.a);
                a7lVar.v(aq40Var.a);
                a7lVar.z0(n09.a(0.5f, 0.5f));
                return Unit.a;
        }
    }
}
