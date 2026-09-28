package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c33 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c33(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetSlipFooter.j0;
                return ((BetSlipFooter) obj).getUpFooterInsureUseCase().c();
            default:
                ((Function1) obj).invoke(tgq.h.a);
                return Unit.a;
        }
    }
}
