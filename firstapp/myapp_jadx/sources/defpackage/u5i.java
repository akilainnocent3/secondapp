package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u5i extends saj implements Function2<j5i, j5i, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(j5i j5iVar, j5i j5iVar2) {
        boolean zA;
        w5i w5iVarT2;
        j5i j5iVar3 = j5iVar;
        j5i j5iVar4 = j5iVar2;
        t5i t5iVar = (t5i) this.receiver;
        if (t5iVar.C && (zA = j5iVar4.a()) != j5iVar3.a()) {
            Function1<Boolean, Unit> function1 = t5iVar.G;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zA));
            }
            if (zA) {
                ej5.c(t5iVar.d2(), null, null, new v5i(t5iVar, null), 3);
                dq40 dq40Var = new dq40();
                nfy.a(t5iVar, new s5i(dq40Var, t5iVar));
                j610 j610Var = (j610) dq40Var.a;
                t5iVar.I = j610Var != null ? j610Var.a() : null;
                ywx ywxVar = t5iVar.J;
                if (ywxVar != null && ywxVar.E1().C && (w5iVarT2 = t5iVar.t2()) != null) {
                    w5iVarT2.p2(t5iVar.J);
                }
            } else {
                j610.a aVar = t5iVar.I;
                if (aVar != null) {
                    aVar.release();
                }
                t5iVar.I = null;
                w5i w5iVarT3 = t5iVar.t2();
                if (w5iVarT3 != null) {
                    w5iVarT3.p2(null);
                }
            }
            pkd.f(t5iVar).R();
            psw pswVar = t5iVar.F;
            if (pswVar != null) {
                c4i c4iVar = t5iVar.H;
                if (zA) {
                    if (c4iVar != null) {
                        t5iVar.s2(pswVar, new d4i(c4iVar));
                        t5iVar.H = null;
                    }
                    c4i c4iVar2 = new c4i();
                    t5iVar.s2(pswVar, c4iVar2);
                    t5iVar.H = c4iVar2;
                } else if (c4iVar != null) {
                    t5iVar.s2(pswVar, new d4i(c4iVar));
                    t5iVar.H = null;
                }
            }
        }
        return Unit.a;
    }
}
