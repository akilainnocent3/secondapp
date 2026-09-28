package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.prematch.data.EventsForTournament;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchEventsForSameTournament$2", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class af20 extends tje0 implements gaj<myh<? super EventsForTournament>, Throwable, v1b<? super Unit>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(myh<? super EventsForTournament> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new af20(3, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_PREMATCH_PAGE);
        aVar.n("Error fetching events for tournament", new Object[0]);
        return Unit.a;
    }
}
