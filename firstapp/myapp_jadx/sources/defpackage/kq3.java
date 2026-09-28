package defpackage;

import com.sportybet.feature.luckynumber.search.data.LNRecentSearchDatabase_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wq3.d;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kq3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wq3 wq3Var = (wq3) obj;
                itf0.a.a("BetslipButtonState onHintDismissed Called", new Object[0]);
                gm3 gm3Var = wq3Var.P;
                if (gm3Var != null) {
                    gm3Var.c(false);
                }
                ej5.c(wq3Var.g0, null, null, wq3Var.new d(null), 3);
                return Unit.a;
            default:
                return new b6r((LNRecentSearchDatabase_Impl) obj);
        }
    }
}
