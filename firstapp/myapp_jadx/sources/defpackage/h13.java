package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h13 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h13(Object obj, int i) {
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
                ((BetSlipFooter) obj).k();
                return Unit.a;
            case 1:
                return (List) obj;
            default:
                ((Function1) obj).invoke(v9k0.a.a);
                return Unit.a;
        }
    }
}
