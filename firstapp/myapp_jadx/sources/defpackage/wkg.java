package defpackage;

import android.accounts.Account;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wkg extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        eventActivity.getAccountHelper().demandAccount(eventActivity, new tit() { // from class: rjg
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                e eVar = eventActivity.E0;
                if (eVar != null) {
                    eVar.N1();
                } else {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
            }
        });
        return Unit.a;
    }
}
