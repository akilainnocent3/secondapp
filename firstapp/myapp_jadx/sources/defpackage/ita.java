package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.widget.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ita implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zsb zsbVar = d.v0;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_BET_SLIP);
                aVar.p((Throwable) obj, "collect uiEventFlow failed", new Object[0]);
                break;
            default:
                ((String) obj).getClass();
                break;
        }
        return Unit.a;
    }
}
