package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l23 implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = BetSlipFooter.j0;
                return new BigDecimal(-1);
            default:
                throw new IllegalStateException("No LNHistoryColor provided. Make sure to wrap with LNHistoryTheme.");
        }
    }
}
