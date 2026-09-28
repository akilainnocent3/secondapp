package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.EventSideMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luog;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uog extends j8i0 {
    public final be20 a;
    public final qjh0 b;
    public final wwd0 c;
    public final v340 d;
    public EventSideMenu e;
    public GroupTopic f;
    public final LinkedHashMap i;
    public final tog v;

    /* JADX WARN: Type inference failed for: r1v5, types: [tog] */
    public uog(be20 be20Var, qjh0 qjh0Var) {
        this.a = be20Var;
        this.b = qjh0Var;
        wwd0 wwd0VarA = xwd0.a(new rog(0));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        this.i = new LinkedHashMap();
        this.v = new Subscriber() { // from class: tog
            /* JADX WARN: Code duplicated, block: B:101:0x0205  */
            /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                ArrayList arrayList;
                EventSideMenu eventSideMenu;
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_PREMATCH_PAGE, "on receive event status message: ", str), new Object[0]);
                SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str);
                if (socketEventMessageCreate == null) {
                    return;
                }
                Sport sport = new Sport();
                sport.id = socketEventMessageCreate.sportId;
                Category category = new Category();
                category.id = socketEventMessageCreate.tournamentCategoryId;
                category.name = socketEventMessageCreate.tournamentCategoryName;
                Tournament tournament = new Tournament();
                tournament.id = socketEventMessageCreate.tournamentId;
                category.tournament = tournament;
                sport.category = category;
                Event event = new Event();
                event.eventId = socketEventMessageCreate.eventId;
                event.sport = sport;
                event.update(socketEventMessageCreate.jsonObject);
                uog uogVar = this.a;
                qjh0 qjh0Var2 = uogVar.b;
                int i = event.status;
                EventSideMenu eventSideMenu2 = uogVar.e;
                if (i != 1) {
                    if (eventSideMenu2 == null) {
                        Intrinsics.n("eventSideMenu");
                        throw null;
                    }
                    List<Event> liveEvents = eventSideMenu2.getLiveEvents();
                    arrayList = new ArrayList();
                    for (Object obj : liveEvents) {
                        if (!Intrinsics.g(((Event) obj).eventId, event.eventId)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    if (eventSideMenu2 == null) {
                        Intrinsics.n("eventSideMenu");
                        throw null;
                    }
                    List<Event> liveEvents2 = eventSideMenu2.getLiveEvents();
                    if (liveEvents2 == null || !liveEvents2.isEmpty()) {
                        Iterator<T> it = liveEvents2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                eventSideMenu = uogVar.e;
                                if (eventSideMenu != null) {
                                    Intrinsics.n("eventSideMenu");
                                    throw null;
                                }
                                List<Event> liveEvents3 = eventSideMenu.getLiveEvents();
                                uogVar.x1(event);
                                arrayList = CollectionsKt.j0(liveEvents3, event);
                            } else if (Intrinsics.g(((Event) it.next()).eventId, event.eventId)) {
                                EventSideMenu eventSideMenu3 = uogVar.e;
                                if (eventSideMenu3 == null) {
                                    Intrinsics.n("eventSideMenu");
                                    throw null;
                                }
                                List<Event> liveEvents4 = eventSideMenu3.getLiveEvents();
                                arrayList = new ArrayList(l48.r(liveEvents4, 10));
                                for (Event event2 : liveEvents4) {
                                    if (Intrinsics.g(event2.eventId, event.eventId)) {
                                        uogVar.x1(event);
                                        event2 = event;
                                    }
                                    arrayList.add(event2);
                                }
                            }
                        }
                    } else {
                        eventSideMenu = uogVar.e;
                        if (eventSideMenu != null) {
                            Intrinsics.n("eventSideMenu");
                            throw null;
                        }
                        List<Event> liveEvents5 = eventSideMenu.getLiveEvents();
                        uogVar.x1(event);
                        arrayList = CollectionsKt.j0(liveEvents5, event);
                    }
                }
                ArrayList arrayList2 = arrayList;
                EventSideMenu eventSideMenu4 = uogVar.e;
                if (eventSideMenu4 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                String tournamentId = eventSideMenu4.getTournamentId();
                EventSideMenu eventSideMenu5 = uogVar.e;
                if (eventSideMenu5 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                String sportId = eventSideMenu5.getSportId();
                qjh0Var2.getClass();
                gtg gtgVar = qjh0Var2.a;
                tournamentId.getClass();
                sportId.getClass();
                gtgVar.a(1, tournamentId, sportId, arrayList2);
                EventSideMenu eventSideMenu6 = uogVar.e;
                if (eventSideMenu6 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                List<Event> preMatchEvents = eventSideMenu6.getPreMatchEvents();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : preMatchEvents) {
                    if (!Intrinsics.g(((Event) obj2).eventId, event.eventId)) {
                        arrayList3.add(obj2);
                    }
                }
                EventSideMenu eventSideMenu7 = uogVar.e;
                if (eventSideMenu7 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                String tournamentId2 = eventSideMenu7.getTournamentId();
                EventSideMenu eventSideMenu8 = uogVar.e;
                if (eventSideMenu8 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                String sportId2 = eventSideMenu8.getSportId();
                tournamentId2.getClass();
                sportId2.getClass();
                gtgVar.a(3, tournamentId2, sportId2, arrayList3);
                EventSideMenu eventSideMenu9 = uogVar.e;
                if (eventSideMenu9 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                EventSideMenu eventSideMenuCopy$default = EventSideMenu.copy$default(eventSideMenu9, null, null, null, null, false, arrayList2, arrayList3, 31, null);
                uogVar.e = eventSideMenuCopy$default;
                if (eventSideMenuCopy$default == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                List<Event> preMatchEvents2 = eventSideMenuCopy$default.getPreMatchEvents();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : preMatchEvents2) {
                    String strB = bwf0.a.b(((Event) obj3).estimateStartTime);
                    Object objA = linkedHashMap.get(strB);
                    if (objA == null) {
                        objA = r9i.a(strB, linkedHashMap);
                    }
                    ((List) objA).add(obj3);
                }
                wwd0 wwd0Var = uogVar.c;
                be20 be20Var2 = uogVar.a;
                EventSideMenu eventSideMenu10 = uogVar.e;
                if (eventSideMenu10 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                String competitionName = eventSideMenu10.getCompetitionName();
                EventSideMenu eventSideMenu11 = uogVar.e;
                if (eventSideMenu11 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                ofb0 sportType = eventSideMenu11.getSportType();
                EventSideMenu eventSideMenu12 = uogVar.e;
                if (eventSideMenu12 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                boolean zIsSetBasedSport = eventSideMenu12.isSetBasedSport();
                EventSideMenu eventSideMenu13 = uogVar.e;
                if (eventSideMenu13 == null) {
                    Intrinsics.n("eventSideMenu");
                    throw null;
                }
                rog rogVarA = be20Var2.a(competitionName, sportType, zIsSetBasedSport, eventSideMenu13.getLiveEvents(), linkedHashMap);
                wwd0Var.getClass();
                wwd0Var.k(null, rogVarA);
            }
        };
    }

    public final void x1(Event event) {
        String str = event.homeTeamIcon;
        LinkedHashMap linkedHashMap = this.i;
        if (str == null || str.length() == 0) {
            hpg hpgVar = (hpg) linkedHashMap.get(event.eventId);
            event.homeTeamIcon = hpgVar != null ? hpgVar.a : null;
        }
        String str2 = event.awayTeamIcon;
        if (str2 == null || str2.length() == 0) {
            hpg hpgVar2 = (hpg) linkedHashMap.get(event.eventId);
            event.awayTeamIcon = hpgVar2 != null ? hpgVar2.b : null;
        }
    }
}
