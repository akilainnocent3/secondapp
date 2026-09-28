package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uvc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uvc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fxc fxcVar = (fxc) obj2;
                Long l = (Long) obj;
                ytw<xt5> ytwVar = fxcVar.f;
                if (l != null) {
                    xt5 xt5VarB = fxcVar.c.b(l.longValue());
                    ((x5a0) ytwVar).setValue(fxcVar.a.e(xt5VarB.a) ? xt5VarB : null);
                } else {
                    ((x5a0) ytwVar).setValue(null);
                }
                break;
            case 1:
                kr00 kr00Var = (kr00) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                kr00Var.B = bool;
                kr00Var.F.postDelayed(kr00Var.I, 500L);
                break;
            default:
                cxg0 cxg0Var = (cxg0) obj2;
                eq7 eq7Var = (eq7) obj;
                eq7Var.getClass();
                eq7.a(eq7Var, "first", cxg0Var.a.getDescriptor());
                eq7.a(eq7Var, "second", cxg0Var.b.getDescriptor());
                eq7.a(eq7Var, "third", cxg0Var.c.getDescriptor());
                break;
        }
        return Unit.a;
    }
}
