package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ke3 implements Function0 {
    public final /* synthetic */ BetslipActivity a;
    public final /* synthetic */ BetTypeAnyWinConfig b;

    public /* synthetic */ ke3(BetslipActivity betslipActivity, BetTypeAnyWinConfig betTypeAnyWinConfig) {
        this.a = betslipActivity;
        this.b = betTypeAnyWinConfig;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        BetslipActivity betslipActivity = this.a;
        nl0 nl0Var = betslipActivity.I2;
        BigDecimal bigDecimal = nl0Var.c;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (Intrinsics.g(bigDecimal, bigDecimal2)) {
            betslipActivity.E3();
        } else {
            BetTypeAnyWinConfig betTypeAnyWinConfig = this.b;
            if (Intrinsics.g(betTypeAnyWinConfig.getMinOdds(), bigDecimal2) || nl0Var.c.compareTo(betTypeAnyWinConfig.getMinOdds()) >= 0) {
                betslipActivity.E3();
            }
        }
        betslipActivity.Q1().O1(v03.h.a);
        return Unit.a;
    }
}
