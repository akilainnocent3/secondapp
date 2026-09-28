package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dfg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lk40 lk40VarQ2;
        ssw<Boolean> sswVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((fgg) obj2).t0(str);
                break;
            case 1:
                nza nzaVar = ((br70) obj2).V;
                nzaVar.I = (urr) obj;
                if (nzaVar.K && (lk40VarQ2 = nzaVar.q2()) != null && !nzaVar.r2(lk40VarQ2, nzaVar.L)) {
                    nzaVar.J = true;
                    nzaVar.s2();
                }
                nzaVar.K = false;
                break;
            default:
                qub0 qub0Var = (qub0) obj2;
                if (Intrinsics.g((Boolean) obj, Boolean.TRUE)) {
                    qub0Var.U2("RANGE");
                    ab8 ab8Var = qub0Var.w1;
                    if (ab8Var != null && (sswVar = ab8Var.P) != null) {
                        sswVar.m(Boolean.FALSE);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
