package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e9e extends saj implements Function0<Unit> {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ f9e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9e(yp40 yp40Var, f9e f9eVar) {
        super(0, Intrinsics.a.class, "goTxListOnce", "showDepositSubmittedSnackBarThenGoTxList$goTxListOnce(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/sportybet/feature/payment/impl/deposit/presentation/uiprocess/DepositUiProcess;)V", 0);
        this.a = yp40Var;
        this.b = f9eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        yp40 yp40Var = this.a;
        if (!yp40Var.a) {
            yp40Var.a = true;
            vtw<spg0> vtwVar = this.b.r;
            if (vtwVar == null) {
                Intrinsics.n("tradingUiEventFlow");
                throw null;
            }
            vpg0.b(vtwVar, aqg0.e.c);
        }
        return Unit.a;
    }
}
