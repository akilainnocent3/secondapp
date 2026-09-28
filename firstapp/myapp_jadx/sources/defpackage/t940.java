package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t940 implements QuickMarketHelper.FetchCallback {
    public final /* synthetic */ bc6 a;

    public t940(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
    public final void onResult(List<RegularMarketRule> list) {
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(list);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
    }
}
