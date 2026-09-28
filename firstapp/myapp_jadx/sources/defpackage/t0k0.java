package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupRelatedGame;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt0k0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t0k0 extends j8i0 {
    public final mpe0 A;
    public final mpe0 B;
    public final mpe0 C;
    public WorldCupTournamentConfig D;
    public uf00<WorldCupTeam> E;
    public l0k0 F;
    public ArrayList G;
    public ArrayList H;
    public ArrayList I;
    public final HashMap J;
    public final mpe0 K;
    public final mpe0 L;
    public jvd0 M;
    public final wwd0 N;
    public final v340 O;
    public final b390 P;
    public final t340 Q;
    public final s6k0 a;
    public final bhk b;
    public final ehk c;
    public final lfb0 d;
    public final d4k0 e;
    public final ISocketPushManager f;
    public final azm i;
    public final jrm v;
    public final a8z w;
    public final muh y;
    public final v6k0 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l0k0.values().length];
            try {
                iArr[l0k0.TEAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0k0.SPECIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$uiState$1", f = "WorldCupPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super n0k0>, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return t0k0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super n0k0> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            t0k0 t0k0Var = t0k0.this;
            ej5.c(o8i0.d(t0k0Var), null, null, new b1k0(t0k0Var, null), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements jaj<uf00<? extends WorldCupTeam>, WorldCupTeam, l0k0, uf00<? extends l5k0>, Boolean, n0k0.c> {
        public static final c a = new c(5, n0k0.c.class, "<init>", "<init>(Lkotlinx/collections/immutable/PersistentList;Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;Lcom/sportybet/plugin/worldcuptournament/presentation/model/WorldCupPanelTab;Lkotlinx/collections/immutable/PersistentList;Z)V", 0);

        @Override // defpackage.jaj
        public final n0k0.c l(uf00<? extends WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, l0k0 l0k0Var, uf00<? extends l5k0> uf00Var2, Boolean bool) {
            uf00<? extends WorldCupTeam> uf00Var3 = uf00Var;
            l0k0 l0k0Var2 = l0k0Var;
            uf00<? extends l5k0> uf00Var4 = uf00Var2;
            boolean zBooleanValue = bool.booleanValue();
            uf00Var3.getClass();
            l0k0Var2.getClass();
            uf00Var4.getClass();
            return new n0k0.c(uf00Var3, worldCupTeam, l0k0Var2, uf00Var4, zBooleanValue);
        }
    }

    public static final /* synthetic */ class d extends saj implements jaj<uf00<? extends WorldCupTeam>, WorldCupTeam, l0k0, uf00<? extends l5k0>, Boolean, n0k0.d> {
        public static final d a = new d(5, n0k0.d.class, "<init>", "<init>(Lkotlinx/collections/immutable/PersistentList;Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;Lcom/sportybet/plugin/worldcuptournament/presentation/model/WorldCupPanelTab;Lkotlinx/collections/immutable/PersistentList;Z)V", 0);

        @Override // defpackage.jaj
        public final n0k0.d l(uf00<? extends WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, l0k0 l0k0Var, uf00<? extends l5k0> uf00Var2, Boolean bool) {
            uf00<? extends WorldCupTeam> uf00Var3 = uf00Var;
            l0k0 l0k0Var2 = l0k0Var;
            uf00<? extends l5k0> uf00Var4 = uf00Var2;
            boolean zBooleanValue = bool.booleanValue();
            uf00Var3.getClass();
            l0k0Var2.getClass();
            uf00Var4.getClass();
            return new n0k0.d(uf00Var3, worldCupTeam, l0k0Var2, uf00Var4, zBooleanValue);
        }
    }

    public t0k0(s6k0 s6k0Var, bhk bhkVar, ehk ehkVar, lfb0 lfb0Var, d4k0 d4k0Var, ISocketPushManager iSocketPushManager, azm azmVar, jrm jrmVar, a8z a8zVar, muh muhVar, v6k0 v6k0Var) {
        lfb0Var.getClass();
        d4k0Var.getClass();
        iSocketPushManager.getClass();
        azmVar.getClass();
        jrmVar.getClass();
        muhVar.getClass();
        this.a = s6k0Var;
        this.b = bhkVar;
        this.c = ehkVar;
        this.d = lfb0Var;
        this.e = d4k0Var;
        this.f = iSocketPushManager;
        this.i = azmVar;
        this.v = jrmVar;
        this.w = a8zVar;
        this.y = muhVar;
        this.z = v6k0Var;
        this.A = hwr.b(new hdz(this, 1));
        this.B = hwr.b(new jdz(this, 1));
        this.C = hwr.b(new o0k0());
        this.F = l0k0.TEAM;
        this.J = new HashMap();
        int i = 2;
        this.K = hwr.b(new ldz(this, i));
        this.L = hwr.b(new ykb(this, i));
        n0k0.a aVar = n0k0.a.a;
        wwd0 wwd0VarA = xwd0.a(aVar);
        this.N = wwd0VarA;
        this.O = e1i.e(new xzh(wwd0VarA, new b(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), aVar);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.P = b390VarB;
        this.Q = e1i.a(b390VarB);
    }

    public static Event B1(Event event, SocketEventMessage socketEventMessage) {
        Event event2 = new Event(event);
        event2.update(socketEventMessage.jsonObject);
        if (event2.status == 1) {
            List<Market> list = event2.markets;
            ArrayList arrayListA = kw5.a(list);
            for (Object obj : list) {
                if (((Market) obj).isPreMatch()) {
                    arrayListA.add(obj);
                }
            }
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListA.get(i);
                i++;
                Market market = (Market) obj2;
                market.status = 1;
                market.product = 1;
            }
        }
        return event2;
    }

    public static Event C1(Event event, SocketMarketMessage socketMarketMessage) {
        Object next;
        Event event2 = new Event(event);
        List<Market> list = event2.markets;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((Market) next).id, socketMarketMessage.marketId));
        Market market = (Market) next;
        if (market == null) {
            return event2;
        }
        market.update(socketMarketMessage.jsonArray);
        market.product = socketMarketMessage.isLive ? 1 : 3;
        return event2;
    }

    public static boolean G1(List list, String str, Function1 function1) {
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.g(((dtg) it.next()).a.eventId, str)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                list.set(i, new dtg((Event) function1.invoke(((dtg) list.get(i)).a)));
                return true;
            }
        }
        return false;
    }

    public final WorldCupTeam A1() {
        return (WorldCupTeam) this.e.a().a.getValue();
    }

    public final void D1(boolean z) {
        ej5.c(o8i0.d(this), null, null, new u0k0(this, z, null), 3);
    }

    public final void E1() {
        ej5.c(o8i0.d(this), null, null, new v0k0(this, null), 3);
    }

    public final void F1() {
        ej5.c(o8i0.d(this), null, null, new w0k0(this, null), 3);
    }

    public final void H1() {
        for (Map.Entry entry : this.J.entrySet()) {
            this.f.unsubscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }

    public final void I1() {
        n0k0 n0k0Var = (n0k0) this.N.getValue();
        if (Intrinsics.g(n0k0Var, n0k0.a.a)) {
            return;
        }
        if (n0k0Var instanceof n0k0.c) {
            J1();
            return;
        }
        if (n0k0Var instanceof n0k0.d) {
            L1();
        } else if (n0k0Var instanceof n0k0.b) {
            K1(f1k0.a);
        } else {
            uhc.a();
        }
    }

    public final void J1() {
        K1(c.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    public final void K1(jaj<? super uf00<WorldCupTeam>, ? super WorldCupTeam, ? super l0k0, ? super uf00<? extends l5k0>, ? super Boolean, ? extends n0k0> jajVar) {
        ?? arrayList;
        l5k0.c cVar;
        uf00 uf00VarF;
        uf00 uf00VarF2;
        uf00<WorldCupTeam> uf00Var = this.E;
        if (uf00Var == null) {
            Intrinsics.n("teams");
            throw null;
        }
        WorldCupTeam worldCupTeamA1 = A1();
        l0k0 l0k0Var = this.F;
        ngs ngsVarB = kotlin.collections.a.b();
        mpe0 mpe0Var = this.A;
        ngsVarB.add(new l5k0.a("common_functions__live", l0k0.LIVE, (mfb0) mpe0Var.getValue(), z1(), a4h.f(y1()), R.string.world_cup_tournament__no_events));
        mfb0 mfb0Var = (mfb0) mpe0Var.getValue();
        RegularMarketRule regularMarketRuleZ1 = z1();
        ArrayList arrayList2 = this.G;
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (((dtg) obj).a.status == 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = m2g.a;
        }
        ngsVarB.add(new l5k0.a("common_functions__upcoming", l0k0.PRE_MATCH, mfb0Var, regularMarketRuleZ1, a4h.f(arrayList), R.string.world_cup_tournament__no_events));
        WorldCupTeam worldCupTeamA2 = A1();
        if (worldCupTeamA2 != null) {
            String nameCmsKey = worldCupTeamA2.getNameCmsKey();
            mfb0 mfb0Var2 = (mfb0) mpe0Var.getValue();
            RegularMarketRule regularMarketRuleZ2 = z1();
            ArrayList arrayList3 = this.H;
            if (arrayList3 == null || (uf00VarF2 = a4h.f(arrayList3)) == null) {
                uf00VarF2 = n1a0.c;
            }
            ngsVarB.add(new l5k0.a(nameCmsKey, l0k0.TEAM, mfb0Var2, regularMarketRuleZ2, uf00VarF2, R.string.world_cup_tournament__no_events_country));
        }
        WorldCupTournamentConfig worldCupTournamentConfig = this.D;
        if (worldCupTournamentConfig == null) {
            Intrinsics.n("config");
            throw null;
        }
        List<WorldCupRelatedGame> games = worldCupTournamentConfig.getGames();
        if (games.isEmpty()) {
            games = null;
        }
        l5k0.b bVar = games != null ? new l5k0.b(a4h.f(games)) : null;
        WorldCupTournamentConfig worldCupTournamentConfig2 = this.D;
        if (worldCupTournamentConfig2 == null) {
            Intrinsics.n("config");
            throw null;
        }
        if (worldCupTournamentConfig2.getSpecialsTabEnabled()) {
            ArrayList arrayList4 = this.I;
            if (arrayList4 == null || (uf00VarF = a4h.f(arrayList4)) == null) {
                uf00VarF = n1a0.c;
            }
            cVar = new l5k0.c(uf00VarF);
        } else {
            cVar = null;
        }
        List listV = ay0.v(new l5k0[]{bVar, cVar});
        WorldCupTournamentConfig worldCupTournamentConfig3 = this.D;
        if (worldCupTournamentConfig3 == null) {
            Intrinsics.n("config");
            throw null;
        }
        if (worldCupTournamentConfig3.getSwapGamesAndSpecialsTabs()) {
            listV = CollectionsKt.m0(listV);
        }
        ngsVarB.addAll(listV);
        uf00 uf00VarF3 = a4h.f(kotlin.collections.a.a(ngsVarB));
        WorldCupTournamentConfig worldCupTournamentConfig4 = this.D;
        if (worldCupTournamentConfig4 != null) {
            this.N.setValue(jajVar.l(uf00Var, worldCupTeamA1, l0k0Var, uf00VarF3, Boolean.valueOf(worldCupTournamentConfig4.getGoToTournamentButtonEnabled())));
        } else {
            Intrinsics.n("config");
            throw null;
        }
    }

    public final void L1() {
        K1(d.a);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.v.j1((iu2.b) this.B.getValue());
        H1();
    }

    public final void x1() {
        HashMap map;
        H1();
        Collection collection = this.G;
        if (collection == null) {
            collection = m2g.a;
        }
        Iterable iterable = this.H;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayListI0 = CollectionsKt.i0(iterable, collection);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListI0.get(i2);
            i2++;
            if (hashSet.add(((dtg) obj).a.eventId)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            map = this.J;
            if (i >= size2) {
                break;
            }
            Object obj2 = arrayList.get(i);
            i++;
            Event event = ((dtg) obj2).a;
            map.put(new GroupTopic(event.getTopic()), (Subscriber) this.K.getValue());
            Iterator it = kotlin.collections.b.k(1, 3).iterator();
            while (it.hasNext()) {
                String strValueOf = String.valueOf(((Number) it.next()).intValue());
                GroupTopic groupTopic = new GroupTopic(event.getMarketStatusTopic(strValueOf, z1().a));
                mpe0 mpe0Var = this.L;
                map.put(groupTopic, (Subscriber) mpe0Var.getValue());
                map.put(new GroupTopic(event.getMarketOddsTopic(strValueOf, z1().a)), (Subscriber) mpe0Var.getValue());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f.subscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }

    public final List<dtg> y1() {
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            return m2g.a;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((dtg) obj).a.status;
            if (i2 == 1 || i2 == 2) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final RegularMarketRule z1() {
        return (RegularMarketRule) this.C.getValue();
    }
}
