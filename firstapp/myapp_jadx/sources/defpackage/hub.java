package defpackage;

import android.accounts.Account;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.data.Market;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hub implements Continuation, tit {
    public final /* synthetic */ Object a;

    public /* synthetic */ hub(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((Runnable) this.a).run();
        return Tasks.forResult(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tit
    public void w(Account account, boolean z) {
        EventActivity eventActivity = (EventActivity) this.a;
        if (account == null) {
            int i = EventActivity.U0;
            return;
        }
        e eVar = eventActivity.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        Pair<? extends Market, Boolean> pair = eVar.f0;
        if (pair == null) {
            return;
        }
        Market market = (Market) pair.a;
        boolean zBooleanValue = pair.b.booleanValue();
        eVar.f0 = null;
        eVar.K1(market, zBooleanValue);
    }
}
