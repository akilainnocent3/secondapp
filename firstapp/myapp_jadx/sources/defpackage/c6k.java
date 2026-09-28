package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.EventsForTournament;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.GetEventsForTournamentUseCase$invoke$1", f = "GetEventsForTournamentUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c6k extends tje0 implements gaj<List<? extends Event>, List<? extends Event>, v1b<? super EventsForTournament>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ List b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends Event> list, List<? extends Event> list2, v1b<? super EventsForTournament> v1bVar) {
        c6k c6kVar = new c6k(3, v1bVar);
        c6kVar.a = list;
        c6kVar.b = list2;
        return c6kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        List list2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new EventsForTournament(list, list2);
    }
}
