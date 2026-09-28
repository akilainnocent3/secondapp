package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vj6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ vj6(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                b bVar = (b) fragment;
                yzy yzyVar = (yzy) obj;
                yzyVar.getClass();
                if (yzyVar == yzy.a) {
                    shd0 shd0Var = bVar.b0;
                    shd0Var.getClass();
                    shd0Var.w.setVisibility(8);
                    bVar.s0().J1(true, false);
                    bVar.s0().F1(true, false);
                } else if (yzyVar == yzy.b) {
                    wsm wsmVar = bVar.F;
                    if (wsmVar == null) {
                        Intrinsics.n("crashlyticsHelper");
                        throw null;
                    }
                    wsmVar.log("OpenBet lifecycle == OpenBetLifecycle.OnDestroyView");
                    bVar.s0().J1(false, false);
                    bVar.s0().F1(false, false);
                    wp6 wp6Var = bVar.G;
                    if (wp6Var == null) {
                        Intrinsics.n("cashoutMetricsManager");
                        throw null;
                    }
                    wp6Var.d(false);
                    bVar.s0().K1();
                    bVar.s0().x1();
                }
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                ((a1b0) fragment).t0(str);
                return Unit.a;
        }
    }
}
