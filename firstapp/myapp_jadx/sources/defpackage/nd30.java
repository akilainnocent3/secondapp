package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nd30 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z = QuickBetView.j1;
        th.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_QUICK_BET);
        aVar.p(th, "collect uiEventFlow failed", new Object[0]);
        return Unit.a;
    }
}
