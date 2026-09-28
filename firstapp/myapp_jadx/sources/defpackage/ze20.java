package defpackage;

import com.sporty.android.book.presentation.eventdetails.header.EventDetailHeaderUiModel;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.EventSideMenu;
import com.sportybet.plugin.realsports.prematch.data.EventsForTournament;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchEventsForSameTournament$1", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ze20 extends tje0 implements Function2<EventsForTournament, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ of20 b;
    public final /* synthetic */ Event c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze20(of20 of20Var, Event event, v1b<? super ze20> v1bVar) {
        super(2, v1bVar);
        this.b = of20Var;
        this.c = event;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ze20 ze20Var = new ze20(this.b, this.c, v1bVar);
        ze20Var.a = obj;
        return ze20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventsForTournament eventsForTournament, v1b<? super Unit> v1bVar) {
        return ((ze20) create(eventsForTournament, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        EventsForTournament eventsForTournament = (EventsForTournament) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<Event> liveEvents = eventsForTournament.getLiveEvents();
        of20 of20Var = this.b;
        of20Var.n0 = liveEvents;
        ssw<EventDetailHeaderUiModel> sswVar = of20Var.a0;
        List<Event> preMatchEvents = eventsForTournament.getPreMatchEvents();
        of20Var.o0 = preMatchEvents;
        Event event = this.c;
        int iIndexOf = preMatchEvents.indexOf(event);
        int i = iIndexOf - 1;
        Object obj2 = null;
        Event event2 = i >= 0 ? of20Var.o0.get(i) : null;
        int i2 = iIndexOf + 1;
        Event event3 = i2 < of20Var.o0.size() ? of20Var.o0.get(i2) : null;
        EventDetailHeaderUiModel eventDetailHeaderUiModelD = sswVar.d();
        if (eventDetailHeaderUiModelD != null) {
            sswVar.m(EventDetailHeaderUiModel.copy$default(eventDetailHeaderUiModelD, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, false, false, true, event2 != null, event3 != null, !of20Var.n0.isEmpty(), false, false, 12845055, null));
        }
        of20Var.l0 = event2;
        of20Var.m0 = event3;
        Event event4 = (Event) CollectionsKt.T(of20Var.o0);
        ssw<EventSideMenu> sswVar2 = of20Var.c0;
        String str = event.sport.id;
        str.getClass();
        String str2 = event.sport.category.tournament.id;
        str2.getClass();
        event4.getClass();
        Category category = event4.sport.category;
        String strA = oxc.a(category.name, " - ", category.tournament.name);
        ofb0 ofb0VarB = pfb0.b(event4.sport.id);
        String str3 = event4.sport.id;
        lh80.b.getClass();
        for (Object obj3 : lh80.d) {
            if (((lh80) obj3).a.equalsIgnoreCase(str3)) {
                obj2 = obj3;
                break;
            }
        }
        sswVar2.m(new EventSideMenu(str, str2, strA, ofb0VarB, ((lh80) obj2) != null, of20Var.n0, of20Var.o0));
        return Unit.a;
    }
}
