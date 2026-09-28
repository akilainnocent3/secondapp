package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tob implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                break;
            default:
                Throwable th = (Throwable) obj;
                boolean z = QuickBetView.j1;
                th.getClass();
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_QUICK_BET);
                aVar.p(th, "collect giftAppliedStatusStateFlow failed", new Object[0]);
                break;
        }
        return Unit.a;
    }
}
