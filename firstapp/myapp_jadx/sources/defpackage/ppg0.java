package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.TradingSharedViewModel$tradingSharedUiStateFlow$1", f = "TradingSharedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ppg0 extends tje0 implements gaj<BigDecimal, WithDrawInfo, v1b<? super fpg0>, Object> {
    public /* synthetic */ BigDecimal a;
    public /* synthetic */ WithDrawInfo b;

    @Override // defpackage.gaj
    public final Object invoke(BigDecimal bigDecimal, WithDrawInfo withDrawInfo, v1b<? super fpg0> v1bVar) {
        ppg0 ppg0Var = new ppg0(3, v1bVar);
        ppg0Var.a = bigDecimal;
        ppg0Var.b = withDrawInfo;
        return ppg0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimal = this.a;
        WithDrawInfo withDrawInfo = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new fpg0(bigDecimal, withDrawInfo);
    }
}
