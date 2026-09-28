package com.sportybet.plugin.realsports.prematch.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketProduct;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.LiveEventData;
import com.sportybet.plugin.realsports.prematch.data.LiveTournamentData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.a3p;
import defpackage.a9l;
import defpackage.bts;
import defpackage.e64;
import defpackage.gjs;
import defpackage.hvs;
import defpackage.inm;
import defpackage.itf0;
import defpackage.j8l;
import defpackage.k48;
import defpackage.l48;
import defpackage.m2g;
import defpackage.mfb0;
import defpackage.sa8;
import defpackage.saj;
import defpackage.t25;
import defpackage.vyg;
import defpackage.w7l;
import defpackage.x7l;
import defpackage.y2p;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/widget/LiveEventsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhvs;", "g1", "Lhvs;", "getTournamentsListener", "()Lhvs;", "setTournamentsListener", "(Lhvs;)V", "tournamentsListener", "Lx7l;", "La9l;", "getGetGroupAdapter", "()Lx7l;", "getGroupAdapter", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveEventsRecyclerView extends RecyclerView {
    public static final /* synthetic */ int h1 = 0;
    public final LinkedHashMap b1;
    public final ArrayList c1;
    public mfb0 d1;
    public RegularMarketRule e1;
    public BoostResult f1;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public hvs tournamentsListener;

    public static final class a implements bts {
        public a() {
        }

        @Override // defpackage.bts
        public final void a(Event event) {
            event.getClass();
            hvs tournamentsListener = LiveEventsRecyclerView.this.getTournamentsListener();
            if (tournamentsListener != null) {
                tournamentsListener.a(event);
            }
        }

        @Override // defpackage.bts
        public final void b(Event event) {
            hvs tournamentsListener = LiveEventsRecyclerView.this.getTournamentsListener();
            if (tournamentsListener != null) {
                tournamentsListener.b(event);
            }
        }

        @Override // defpackage.bts
        public final void c(Event event) {
            event.getClass();
            hvs tournamentsListener = LiveEventsRecyclerView.this.getTournamentsListener();
            if (tournamentsListener != null) {
                tournamentsListener.c(event);
            }
        }

        @Override // defpackage.bts
        public final void d(Selection selection, boolean z) {
            hvs tournamentsListener = LiveEventsRecyclerView.this.getTournamentsListener();
            if (tournamentsListener != null) {
                tournamentsListener.d(selection, z);
            }
        }

        @Override // defpackage.bts
        public final String e(String str) {
            str.getClass();
            hvs tournamentsListener = LiveEventsRecyclerView.this.getTournamentsListener();
            return tournamentsListener != null ? tournamentsListener.e(str) : "near_odds";
        }

        @Override // defpackage.bts
        public final void f(int i) {
            x7l getGroupAdapter = LiveEventsRecyclerView.this.getGetGroupAdapter();
            if (getGroupAdapter != null) {
                getGroupAdapter.notifyItemChanged(i);
            }
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            LiveEventsRecyclerView liveEventsRecyclerView = (LiveEventsRecyclerView) this.receiver;
            int i = LiveEventsRecyclerView.h1;
            liveEventsRecyclerView.A0(str2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            LiveEventsRecyclerView liveEventsRecyclerView = (LiveEventsRecyclerView) this.receiver;
            int i = LiveEventsRecyclerView.h1;
            liveEventsRecyclerView.A0(str2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.b1 = new LinkedHashMap();
        this.c1 = new ArrayList();
        setItemAnimator(null);
        setAdapter(new x7l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x7l<a9l> getGetGroupAdapter() {
        RecyclerView.f adapter = getAdapter();
        if (!(adapter instanceof x7l)) {
            adapter = null;
        }
        return (x7l) adapter;
    }

    public final void A0(String str) {
        Object bVar;
        Object obj;
        LiveEventData liveEventData;
        a3p a3pVar;
        LiveTournamentData liveTournamentData;
        Tournament tournament;
        try {
            zi50.a aVar = zi50.b;
            ArrayList arrayList = this.c1;
            int size = arrayList.size();
            int i = 0;
            do {
                bVar = null;
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                e64 item = ((vyg) obj).getItem(0);
                if (!(item instanceof a3p)) {
                    item = null;
                }
                a3pVar = (a3p) item;
            } while (!Intrinsics.g((a3pVar == null || (liveTournamentData = a3pVar.d) == null || (tournament = liveTournamentData.getTournament()) == null) ? null : tournament.id, str));
            vyg vygVar = (vyg) obj;
            if (vygVar != null) {
                e64 item2 = vygVar.getItem(1);
                if (!(item2 instanceof y2p)) {
                    item2 = null;
                }
                y2p y2pVar = (y2p) item2;
                if (Intrinsics.g((y2pVar == null || (liveEventData = y2pVar.d) == null) ? null : liveEventData.getSelectedMarket(), this.e1)) {
                    vygVar = null;
                }
                if (vygVar != null) {
                    int iA = vygVar.a();
                    for (int i2 = 0; i2 < iA; i2++) {
                        e64 item3 = vygVar.getItem(i2);
                        if (!(item3 instanceof y2p)) {
                            item3 = null;
                        }
                        y2p y2pVar2 = (y2p) item3;
                        if (y2pVar2 != null) {
                            LiveEventData liveEventData2 = y2pVar2.d;
                            RegularMarketRule regularMarketRule = this.e1;
                            regularMarketRule.getClass();
                            liveEventData2.setSelectedMarket(regularMarketRule);
                            x7l<a9l> getGroupAdapter = getGetGroupAdapter();
                            if (getGroupAdapter != null) {
                                getGroupAdapter.notifyItemChanged(getGroupAdapter.l(y2pVar2));
                            }
                        }
                    }
                    bVar = Unit.a;
                }
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.a(inm.a("checkMarket failed: ", thA.getMessage()), new Object[0]);
        }
    }

    public final LiveEventData B0(mfb0 mfb0Var, Event event, RegularMarketRule regularMarketRule) {
        if (event.markets == null) {
            event.markets = new ArrayList();
        }
        BoostResult boostResult = this.f1;
        return new LiveEventData(mfb0Var, regularMarketRule, event, boostResult != null ? t25.b(event, boostResult) : false, false, new a());
    }

    public final Sport C0(mfb0 mfb0Var, Tournament tournament) {
        Sport sport = new Sport();
        sport.id = mfb0Var.getId();
        UiText uiTextC = mfb0Var.c();
        Context context = getContext();
        context.getClass();
        sport.name = uiTextC.g(context);
        Category category = new Category();
        category.id = tournament.categoryId;
        category.name = tournament.categoryName;
        category.tournament = tournament;
        sport.category = category;
        return sport;
    }

    public final void D0(SocketEventMessage socketEventMessage) {
        RegularMarketRule regularMarketRule;
        x7l<a9l> getGroupAdapter;
        socketEventMessage.getClass();
        mfb0 mfb0Var = this.d1;
        if (mfb0Var == null || !sa8.a(mfb0Var.getId()).equals(socketEventMessage.sportId) || (regularMarketRule = this.e1) == null || (getGroupAdapter = getGetGroupAdapter()) == null) {
            return;
        }
        ArrayList arrayList = this.c1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vyg vygVar = (vyg) obj;
            w7l w7lVarF = vygVar.f(0);
            ArrayList arrayList2 = vygVar.d;
            if (!(w7lVarF instanceof a3p)) {
                w7lVarF = null;
            }
            a3p a3pVar = (a3p) w7lVarF;
            if (a3pVar != null) {
                LiveTournamentData liveTournamentData = a3pVar.d;
                if (Intrinsics.g(liveTournamentData.getTournament().id, socketEventMessage.tournamentId) && Intrinsics.g(liveTournamentData.getTournament().categoryId, socketEventMessage.tournamentCategoryId)) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        i2++;
                        w7l w7lVarF2 = vygVar.f(i2);
                        if (!(w7lVarF2 instanceof y2p)) {
                            w7lVarF2 = null;
                        }
                        y2p y2pVar = (y2p) w7lVarF2;
                        if (y2pVar != null) {
                            LiveEventData liveEventData = y2pVar.d;
                            if (Intrinsics.g(liveEventData.getEvent().eventId, socketEventMessage.eventId)) {
                                if (socketEventMessage.canLiveBet) {
                                    liveEventData.getEvent().update(socketEventMessage.jsonObject);
                                    int iL = getGroupAdapter.l(y2pVar);
                                    if (iL >= 0) {
                                        getGroupAdapter.notifyItemChanged(iL);
                                        return;
                                    }
                                    return;
                                }
                                if (arrayList2.contains(y2pVar)) {
                                    if (vygVar.b) {
                                        int i3 = vygVar.i(y2pVar);
                                        arrayList2.remove(y2pVar);
                                        vygVar.l(i3, 1);
                                    } else {
                                        arrayList2.remove(y2pVar);
                                    }
                                }
                                if (arrayList2.size() == 0) {
                                    arrayList.remove(vygVar);
                                    ArrayList arrayList3 = getGroupAdapter.a;
                                    int iIndexOf = arrayList3.indexOf(vygVar);
                                    int iA = 0;
                                    Iterator it = arrayList3.subList(0, iIndexOf).iterator();
                                    while (it.hasNext()) {
                                        iA += ((w7l) it.next()).a();
                                    }
                                    vygVar.e(getGroupAdapter);
                                    arrayList3.remove(iIndexOf);
                                    getGroupAdapter.notifyItemRangeRemoved(iA, vygVar.a());
                                }
                                G0();
                                return;
                            }
                        }
                    }
                    if (socketEventMessage.canLiveBet) {
                        hvs hvsVar = this.tournamentsListener;
                        if (hvsVar != null) {
                            String str = socketEventMessage.eventId;
                            str.getClass();
                            hvsVar.g(str);
                        }
                        Event event = new Event();
                        event.eventId = socketEventMessage.eventId;
                        Tournament tournament = liveTournamentData.getTournament();
                        event.tournament = tournament;
                        tournament.getClass();
                        event.sport = C0(mfb0Var, tournament);
                        event.update(socketEventMessage.jsonObject);
                        vygVar.m(new y2p(B0(mfb0Var, event, regularMarketRule)));
                        G0();
                        return;
                    }
                    return;
                }
            }
        }
        if (socketEventMessage.canLiveBet) {
            hvs hvsVar2 = this.tournamentsListener;
            if (hvsVar2 != null) {
                String str2 = socketEventMessage.eventId;
                str2.getClass();
                hvsVar2.g(str2);
            }
            Tournament tournament2 = new Tournament();
            tournament2.id = socketEventMessage.tournamentId;
            tournament2.name = socketEventMessage.tournamentName;
            tournament2.categoryId = socketEventMessage.tournamentCategoryId;
            tournament2.categoryName = socketEventMessage.tournamentCategoryName;
            tournament2.events = new ArrayList();
            Event event2 = new Event();
            event2.eventId = socketEventMessage.eventId;
            event2.tournament = tournament2;
            event2.sport = C0(mfb0Var, tournament2);
            event2.update(socketEventMessage.jsonObject);
            a3p a3pVar2 = new a3p(new LiveTournamentData(tournament2, true), new b(1, this, LiveEventsRecyclerView.class, "checkMarket", "checkMarket(Ljava/lang/String;)V", 0));
            y2p y2pVar2 = new y2p(B0(mfb0Var, event2, regularMarketRule));
            vyg vygVar2 = new vyg(a3pVar2, true);
            vygVar2.m(y2pVar2);
            getGroupAdapter.i(vygVar2);
            arrayList.add(vygVar2);
            G0();
        }
    }

    public final void E0(SocketMarketMessage socketMarketMessage) {
        int iL;
        Object obj;
        Object next;
        socketMarketMessage.getClass();
        mfb0 mfb0Var = this.d1;
        Market market = null;
        if (socketMarketMessage.isSameSport(mfb0Var != null ? mfb0Var.getId() : null)) {
            String str = socketMarketMessage.marketId;
            RegularMarketRule regularMarketRule = this.e1;
            if (Intrinsics.g(str, regularMarketRule != null ? regularMarketRule.a : null)) {
                ArrayList arrayList = this.c1;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    vyg vygVar = (vyg) obj2;
                    int iA = vygVar.a();
                    for (int i3 = 0; i3 < iA; i3++) {
                        w7l w7lVarF = vygVar.f(i3);
                        if (!(w7lVarF instanceof y2p)) {
                            w7lVarF = null;
                        }
                        y2p y2pVar = (y2p) w7lVarF;
                        if (y2pVar != null) {
                            if (!Intrinsics.g(y2pVar.d.getEvent().eventId, socketMarketMessage.eventId)) {
                                y2pVar = null;
                            }
                            if (y2pVar != null) {
                                Event event = y2pVar.d.getEvent();
                                JSONArray jSONArray = socketMarketMessage.jsonArray;
                                jSONArray.getClass();
                                String str2 = socketMarketMessage.marketSpecifier;
                                str2.getClass();
                                RegularMarketRule regularMarketRule2 = this.e1;
                                if (regularMarketRule2 != null) {
                                    String str3 = regularMarketRule2.a;
                                    boolean z = regularMarketRule2.c;
                                    LinkedHashMap linkedHashMap = this.b1;
                                    if (z || !Intrinsics.g(str2, "~")) {
                                        ArrayList arrayListD = gjs.d(event, str3);
                                        int size2 = arrayListD.size();
                                        do {
                                            if (i >= size2) {
                                                obj = null;
                                                break;
                                            } else {
                                                obj = arrayListD.get(i);
                                                i++;
                                            }
                                        } while (!((Market) obj).match(str3, str2));
                                        Market market2 = (Market) obj;
                                        if (market2 != null) {
                                            market = market2;
                                        }
                                    } else {
                                        Market market3 = (Market) linkedHashMap.get(event.eventId);
                                        if (market3 == null) {
                                            List<Market> list = event.markets;
                                            list.getClass();
                                            Iterator<T> it = list.iterator();
                                            do {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                            } while (!Intrinsics.g(((Market) next).id, str3));
                                            Market market4 = (Market) next;
                                            if (market4 != null) {
                                                linkedHashMap.put(event.eventId, market4);
                                                market = market4;
                                            }
                                        } else {
                                            market = market3;
                                        }
                                    }
                                    if (market == null) {
                                        market = new Market();
                                        market.id = str3;
                                        market.product = MarketProduct.LIVE.getValue();
                                        if (!Intrinsics.g(str2, "~")) {
                                            market.specifier = str2;
                                        }
                                        event.markets.add(market);
                                        if (!regularMarketRule2.c) {
                                            linkedHashMap.put(event.eventId, market);
                                        }
                                    }
                                    market.update(jSONArray);
                                }
                                x7l<a9l> getGroupAdapter = getGetGroupAdapter();
                                if (getGroupAdapter == null || (iL = getGroupAdapter.l(y2pVar)) < 0) {
                                    return;
                                }
                                getGroupAdapter.notifyItemChanged(iL);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void F0(RegularMarketRule regularMarketRule) {
        this.b1.clear();
        this.e1 = regularMarketRule;
        ArrayList arrayList = this.c1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vyg vygVar = (vyg) obj;
            int iA = vygVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                e64 item = vygVar.getItem(i2);
                if (!(item instanceof y2p)) {
                    item = null;
                }
                y2p y2pVar = (y2p) item;
                if (y2pVar != null) {
                    y2pVar.d.setSelectedMarket(regularMarketRule);
                    x7l<a9l> getGroupAdapter = getGetGroupAdapter();
                    if (getGroupAdapter != null) {
                        getGroupAdapter.notifyItemChanged(getGroupAdapter.l(y2pVar));
                    }
                }
            }
        }
    }

    public final void G0() {
        hvs hvsVar = this.tournamentsListener;
        if (hvsVar != null) {
            ArrayList arrayList = this.c1;
            int size = arrayList.size();
            int size2 = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                size2 += ((vyg) obj).d.size();
            }
            hvsVar.f(size2);
        }
    }

    public final void H0(mfb0 mfb0Var, RegularMarketRule regularMarketRule, List<? extends Tournament> list, BoostResult boostResult, boolean z) {
        LiveTournamentData liveTournamentData;
        Tournament tournament;
        mfb0Var.getClass();
        list.getClass();
        mfb0 mfb0Var2 = this.d1;
        boolean z2 = false;
        boolean z3 = !Intrinsics.g(mfb0Var2 != null ? mfb0Var2.getId() : null, mfb0Var.getId()) || z;
        ArrayList arrayList = this.c1;
        if (z3) {
            arrayList.clear();
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((vyg) obj).b) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            w7l w7lVarF = ((vyg) obj2).f(0);
            if (!(w7lVarF instanceof a3p)) {
                w7lVarF = null;
            }
            a3p a3pVar = (a3p) w7lVarF;
            String str = (a3pVar == null || (liveTournamentData = a3pVar.d) == null || (tournament = liveTournamentData.getTournament()) == null) ? null : tournament.id;
            if (str != null) {
                arrayList3.add(str);
            }
        }
        ArrayList arrayList4 = new ArrayList(l48.r(list, 10));
        for (Tournament tournament2 : list) {
            boolean z4 = (z3 || arrayList3.contains(tournament2.id)) ? true : z2;
            boolean z5 = z4;
            boolean z6 = z3;
            a3p a3pVar2 = new a3p(new LiveTournamentData(tournament2, z4), new c(1, this, LiveEventsRecyclerView.class, "checkMarket", "checkMarket(Ljava/lang/String;)V", 0));
            Iterable<Event> iterable = tournament2.events;
            if (iterable == null) {
                iterable = m2g.a;
            }
            ArrayList arrayList5 = new ArrayList(l48.r(iterable, 10));
            for (Event event : iterable) {
                event.getClass();
                arrayList5.add(new y2p(B0(mfb0Var, event, regularMarketRule)));
            }
            vyg vygVar = new vyg(a3pVar2, z5);
            if (!arrayList5.isEmpty()) {
                int size3 = arrayList5.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList5.get(i3);
                    i3++;
                    ((w7l) obj3).c(vygVar);
                }
                boolean z7 = vygVar.b;
                ArrayList arrayList6 = vygVar.d;
                if (z7) {
                    int iA = vygVar.a();
                    arrayList6.addAll(arrayList5);
                    vygVar.k(iA, j8l.a(arrayList5));
                } else {
                    arrayList6.addAll(arrayList5);
                }
            }
            arrayList4.add(vygVar);
            z3 = z6;
            z2 = false;
        }
        k48.a(arrayList, arrayList4);
        x7l<a9l> getGroupAdapter = getGetGroupAdapter();
        if (getGroupAdapter != null) {
            getGroupAdapter.k();
            getGroupAdapter.j(arrayList4);
        }
        this.d1 = mfb0Var;
        this.e1 = regularMarketRule;
        this.f1 = boostResult;
    }

    public final hvs getTournamentsListener() {
        return this.tournamentsListener;
    }

    public final void setTournamentsListener(hvs hvsVar) {
        this.tournamentsListener = hvsVar;
    }

    public final void z0(String str, String str2) {
        LiveTournamentData liveTournamentData;
        str.getClass();
        ArrayList arrayList = this.c1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vyg vygVar = (vyg) obj;
            w7l w7lVarF = vygVar.f(0);
            if (!(w7lVarF instanceof a3p)) {
                w7lVarF = null;
            }
            a3p a3pVar = (a3p) w7lVarF;
            if (a3pVar != null && (liveTournamentData = a3pVar.d) != null) {
                liveTournamentData.setExpanded(true);
            }
            if (!vygVar.b) {
                vygVar.o();
            }
            int iA = vygVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                e64 item = vygVar.getItem(i2);
                if (!(item instanceof y2p)) {
                    item = null;
                }
                y2p y2pVar = (y2p) item;
                if (y2pVar != null) {
                    Event event = y2pVar.d.getEvent();
                    if (str2 == null || !event.getSpecifierList(str).contains(str2)) {
                        event.removeSelectSpecifier(str);
                    } else {
                        event.setSelectSpecifier(str, str2);
                    }
                }
            }
        }
        x7l<a9l> getGroupAdapter = getGetGroupAdapter();
        if (getGroupAdapter != null) {
            getGroupAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventsRecyclerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LiveEventsRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
