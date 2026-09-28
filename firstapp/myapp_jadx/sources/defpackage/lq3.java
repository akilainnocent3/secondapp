package defpackage;

import com.sportybet.android.bethistory.data.db.RealBetHistoryOrderDatabase_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wq3.e;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lq3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq3(Object obj, int i) {
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
                itf0.a.a("BetslipButtonState onButtonMoved Called", new Object[0]);
                gm3 gm3Var = wq3Var.P;
                if (gm3Var != null) {
                    gm3Var.c(false);
                }
                ej5.c(wq3Var.g0, null, null, wq3Var.new e(null), 3);
                return Unit.a;
            case 1:
                return new i640((RealBetHistoryOrderDatabase_Impl) obj);
            default:
                cq80 cq80Var = (cq80) obj;
                Function0<Unit> function0 = cq80Var.b;
                if (function0 == null) {
                    Intrinsics.n("dismissListener");
                    throw null;
                }
                function0.invoke();
                cq80Var.dismiss();
                return Unit.a;
        }
    }
}
