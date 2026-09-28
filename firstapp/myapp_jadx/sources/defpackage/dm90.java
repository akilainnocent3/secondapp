package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dm90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dm90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(qm90.a.b.a);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(s3d0.c.a);
                return Unit.a;
            default:
                cj cjVar = (cj) obj;
                wwd0 wwd0Var = cjVar.o;
                wwd0 wwd0Var2 = cjVar.n;
                lyh<? extends xhj0> lyhVar = cjVar.f;
                if (lyhVar == null) {
                    Intrinsics.n("withdrawAmountValidationFlow");
                    throw null;
                }
                k1i k1iVarA = r1i.a(wwd0Var, wwd0Var2, lyhVar, new cj.d(cjVar, null));
                et7 et7Var = cjVar.k;
                if (et7Var != null) {
                    return e1i.e(k1iVarA, et7Var, q490.a.a, Boolean.FALSE);
                }
                Intrinsics.n("scope");
                throw null;
        }
    }
}
