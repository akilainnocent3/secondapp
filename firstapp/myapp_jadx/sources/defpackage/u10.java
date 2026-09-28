package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                i20 i20Var = (i20) obj;
                ytw ytwVar = i20Var.l;
                ytw ytwVar2 = i20Var.g;
                isw iswVar = i20Var.j;
                Object value = ((x5a0) ytwVar).getValue();
                if (value != null) {
                    return value;
                }
                t5a0 t5a0Var = (t5a0) iswVar;
                if (Float.isNaN(t5a0Var.j())) {
                    return ((x5a0) ytwVar2).getValue();
                }
                Object objC = i20Var.b().c(t5a0Var.j());
                return objC == null ? ((x5a0) ytwVar2).getValue() : objC;
            case 1:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            default:
                s2a0 s2a0Var = (s2a0) obj;
                s2a0Var.v0().H1();
                om5 om5Var = s2a0Var.C;
                if (om5Var != null) {
                    om5Var.a(s2a0Var);
                    return Unit.a;
                }
                Intrinsics.n("registerUpdatePhoneNumberLauncher");
                throw null;
        }
    }
}
