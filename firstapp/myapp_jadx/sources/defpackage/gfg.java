package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gfg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgg) obj).s0();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(new pcq.c(false));
                return Unit.a;
            default:
                boolean z = QuickBetView.j1;
                return i2i.c(((QuickBetView) obj).getBookConfigRepository().p(), null, 3);
        }
    }
}
