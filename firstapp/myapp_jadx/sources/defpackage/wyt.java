package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wyt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wyt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(wae.HOME);
                return Unit.a;
            default:
                tt60 tt60Var = (tt60) obj;
                uwd0 uwd0Var = (uwd0) tt60Var.p.getValue();
                lyh<? extends xhj0> lyhVar = tt60Var.f;
                if (lyhVar == null) {
                    Intrinsics.n("withdrawAmountValidationFlow");
                    throw null;
                }
                o82.a aVar = tt60Var.b;
                if (aVar == null) {
                    Intrinsics.n("amountMinHintFlow");
                    throw null;
                }
                g1i g1iVar = tt60Var.c;
                if (g1iVar == null) {
                    Intrinsics.n("normalizedAmountFlow");
                    throw null;
                }
                v340 v340Var = tt60Var.d;
                if (v340Var == null) {
                    Intrinsics.n("payHintFlow");
                    throw null;
                }
                tt60.e eVar = new tt60.e(new lyh[]{uwd0Var, lyhVar, aVar, g1iVar, v340Var, (uwd0) tt60Var.r.getValue(), (uwd0) tt60Var.s.getValue()}, tt60Var);
                et7 et7Var = tt60Var.k;
                if (et7Var == null) {
                    Intrinsics.n("scope");
                    throw null;
                }
                kzh.d(eVar, et7Var);
                uwd0 uwd0Var2 = (uwd0) tt60Var.q.getValue();
                wwd0 wwd0Var = tt60Var.e;
                if (wwd0Var == null) {
                    Intrinsics.n("nextProgressButtonUiStateFlow");
                    throw null;
                }
                wwd0 wwd0Var2 = tt60Var.i;
                if (wwd0Var2 == null) {
                    Intrinsics.n("processUiBlockStateFlow");
                    throw null;
                }
                k1i k1iVarA = r1i.a(uwd0Var2, wwd0Var, wwd0Var2, new tt60.c(null, tt60Var));
                et7 et7Var2 = tt60Var.k;
                if (et7Var2 == null) {
                    Intrinsics.n("scope");
                    throw null;
                }
                kzh.d(k1iVarA, et7Var2);
                v340 v340Var2 = tt60Var.h;
                if (v340Var2 == null) {
                    Intrinsics.n("savedAssetsStateFlow");
                    throw null;
                }
                g1i g1iVar2 = new g1i(bm50.f(v340Var2), new tt60.d(null, tt60Var));
                et7 et7Var3 = tt60Var.k;
                if (et7Var3 != null) {
                    return kzh.d(g1iVar2, et7Var3);
                }
                Intrinsics.n("scope");
                throw null;
        }
    }
}
