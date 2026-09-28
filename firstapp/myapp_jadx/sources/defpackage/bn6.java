package defpackage;

import com.sportybet.feature.kyc.confirmAccountInfo.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bn6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bn6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dn6 dn6Var = (dn6) obj;
                u350 u350Var = dn6Var.i;
                if (u350Var == null) {
                    Intrinsics.n("remixBetAnTestManager");
                    throw null;
                }
                u350Var.c();
                dn6Var.v = null;
                hj6 hj6Var = dn6Var.w;
                if (hj6Var != null) {
                    hj6Var.invoke();
                }
                dn6Var.dismissAllowingStateLoss();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(d.b.a);
                return Unit.a;
            case 2:
                pl60 pl60Var = (pl60) obj;
                if (pl60Var.F == pl60.a.b) {
                    m010 m010Var = pl60Var.B;
                    if (m010Var == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    m010Var.invoke(Integer.valueOf(pl60Var.E + pl60Var.D), Integer.valueOf(pl60Var.D));
                }
                return Unit.a;
            default:
                ((a1b0) obj).N0();
                return Unit.a;
        }
    }
}
