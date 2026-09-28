package defpackage;

import cj.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cj cjVar = (cj) obj;
                uwd0 uwd0Var = (uwd0) cjVar.r.getValue();
                wwd0 wwd0Var = cjVar.o;
                wwd0 wwd0Var2 = cjVar.n;
                lyh<? extends xhj0> lyhVar = cjVar.f;
                if (lyhVar == null) {
                    Intrinsics.n("withdrawAmountValidationFlow");
                    throw null;
                }
                o82.a aVar = cjVar.b;
                if (aVar == null) {
                    Intrinsics.n("amountMinHintFlow");
                    throw null;
                }
                g1i g1iVar = cjVar.c;
                if (g1iVar == null) {
                    Intrinsics.n("normalizedAmountFlow");
                    throw null;
                }
                v340 v340Var = cjVar.d;
                if (v340Var == null) {
                    Intrinsics.n("payHintFlow");
                    throw null;
                }
                cj.b bVar = new cj.b(new lyh[]{uwd0Var, wwd0Var, wwd0Var2, lyhVar, aVar, g1iVar, v340Var, (uwd0) cjVar.s.getValue()}, cjVar);
                et7 et7Var = cjVar.k;
                if (et7Var == null) {
                    Intrinsics.n("scope");
                    throw null;
                }
                kzh.d(bVar, et7Var);
                uwd0 uwd0Var2 = (uwd0) cjVar.p.getValue();
                wwd0 wwd0Var3 = cjVar.e;
                if (wwd0Var3 == null) {
                    Intrinsics.n("nextProgressButtonUiStateFlow");
                    throw null;
                }
                n1i n1iVar = new n1i(uwd0Var2, wwd0Var3, cjVar.new a(null));
                et7 et7Var2 = cjVar.k;
                if (et7Var2 != null) {
                    return kzh.d(n1iVar, et7Var2);
                }
                Intrinsics.n("scope");
                throw null;
            case 1:
                return Boolean.valueOf(((m410) obj).Z0());
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(s3d0.a.C1077a.a);
                function1.invoke(s3d0.e.a);
                return Unit.a;
        }
    }
}
