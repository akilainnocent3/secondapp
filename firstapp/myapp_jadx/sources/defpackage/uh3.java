package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;
import com.sportygames.sportyherov2.components.RangeComponent;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uh3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ uh3(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) callback;
                Set<g08> set = BetslipActivity.X2;
                if (Intrinsics.g((Boolean) obj, Boolean.TRUE) && !betslipActivity.Q1().J1()) {
                    betslipActivity.S1().E.setSimNotifyBadgeVisible(iw2.c());
                    BetSlipHeader betSlipHeader = betslipActivity.S1().E;
                    gbn gbnVar = betslipActivity.E;
                    if (gbnVar == null) {
                        Intrinsics.n("imageService");
                        throw null;
                    }
                    gbnVar.a(xib0.SIM_NOTIFY_BADGE, betSlipHeader.F.N);
                }
                return Unit.a;
            default:
                int i2 = RangeComponent.f0;
                ((View) obj).getClass();
                Function1<? super Boolean, Unit> function1 = ((RangeComponent) callback).R;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return Unit.a;
                }
                Intrinsics.n("onFbgClick");
                throw null;
        }
    }
}
