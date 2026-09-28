package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.patron.FavoriteTournament;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.LiveEventChange;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a8z;
import defpackage.akf;
import defpackage.ap0;
import defpackage.asy;
import defpackage.avy;
import defpackage.cby;
import defpackage.ckf;
import defpackage.cxw;
import defpackage.djs;
import defpackage.dxl;
import defpackage.f00;
import defpackage.gby;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.hih0;
import defpackage.hkf;
import defpackage.hqc;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iuy;
import defpackage.ivw;
import defpackage.izw;
import defpackage.j380;
import defpackage.jjd;
import defpackage.jqu;
import defpackage.js;
import defpackage.k650;
import defpackage.lfb0;
import defpackage.lqu;
import defpackage.lxw;
import defpackage.mfb0;
import defpackage.mjf;
import defpackage.mqc;
import defpackage.muh;
import defpackage.nqc;
import defpackage.nxw;
import defpackage.phh0;
import defpackage.r8e0;
import defpackage.rhh0;
import defpackage.s3p;
import defpackage.sa8;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.su5;
import defpackage.tay;
import defpackage.tlc;
import defpackage.trs;
import defpackage.tru;
import defpackage.ty4;
import defpackage.uhc;
import defpackage.uvy;
import defpackage.v5k;
import defpackage.vgb0;
import defpackage.w1k;
import defpackage.w7i0;
import defpackage.wga;
import defpackage.whh0;
import defpackage.xhh0;
import defpackage.xvy;
import defpackage.yay;
import defpackage.yhh0;
import defpackage.zhh0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteLivePanel extends dxl implements iu2.b, djs.d {
    public static final /* synthetic */ int p0 = 0;
    public final QuickMarketSpotEnum A;
    public final HashMap B;
    public com.sportybet.android.widget.LoadingView C;
    public TabLayout D;
    public TabLayout E;
    public RelativeLayout F;
    public OneUpTwoUpSwitch G;
    public OUEarlyGoalsSwitch H;
    public View I;
    public BubbleView J;
    public final Object K;
    public final Object L;
    public su5<BaseResponse<List<Sport>>> M;
    public su5<BaseResponse<PreMatchSportsData>> N;
    public su5<BaseResponse<BoostInfo>> O;
    public boolean P;
    public final ArrayList Q;
    public djs R;
    public boolean S;
    public final ArrayList T;
    public final ArrayList U;
    public ArrayList V;
    public boolean W;
    public boolean a0;
    public String b0;
    public k650 c;
    public trs c0;
    public iuy d;
    public final Set<Pair<? extends Topic, Subscriber>> d0;
    public mjf e;
    public final a e0;
    public hkf f;
    public final b f0;
    public ivw g0;
    public asy h0;
    public a8z i;
    public tay i0;
    public final c j0;
    public final d k0;
    public TextView l0;
    public boolean m0;
    public final h n0;
    public w7i0 o0;
    public muh v;
    public xhh0 w;
    public zhh0 y;
    public v5k z;

    public class a implements Subscriber {
        public a() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.q("MyFavoriteLivePanel");
            aVar.a("on receive market status message: %s", str);
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            djs djsVar = myFavoriteLivePanel.R;
            if (djsVar == null || myFavoriteLivePanel.m0) {
                return;
            }
            djsVar.p(SocketMarketMessage.create(str), null);
        }
    }

    public class b implements Subscriber {
        public b() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            Tournament tournament;
            Event event;
            List<FavoriteTournament> list;
            itf0.a aVar = itf0.a;
            aVar.q("MyFavoriteLivePanel");
            aVar.a("on receive event status message: %s", str);
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            djs djsVar = myFavoriteLivePanel.R;
            if (djsVar == null || myFavoriteLivePanel.m0) {
                return;
            }
            SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str);
            mfb0 mfb0Var = djsVar.v;
            if (mfb0Var == null || socketEventMessageCreate == null) {
                return;
            }
            aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
            aVar.a("handle event: %s", socketEventMessageCreate.jsonObject.toString());
            try {
                if (TextUtils.equals(sa8.a(mfb0Var.getId()), socketEventMessageCreate.sportId)) {
                    boolean z = socketEventMessageCreate.canLiveBet;
                    String str2 = socketEventMessageCreate.tournamentId;
                    String str3 = socketEventMessageCreate.tournamentName;
                    String str4 = socketEventMessageCreate.tournamentCategoryId;
                    String str5 = socketEventMessageCreate.tournamentCategoryName;
                    String str6 = socketEventMessageCreate.eventId;
                    if (djsVar.C && (list = djsVar.E) != null && list.size() > 0) {
                        if (!izw.a.a().g(str2, djsVar.E)) {
                            aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                            aVar.a("leaguedId not in my favorite: %s", str2);
                            return;
                        }
                    }
                    synchronized (djsVar.c) {
                        try {
                            ArrayList arrayList = djsVar.d;
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    tournament = null;
                                    break;
                                }
                                Object obj = arrayList.get(i);
                                i++;
                                tournament = (Tournament) obj;
                                if (TextUtils.equals(tournament.id, str2)) {
                                    if (TextUtils.equals(tournament.categoryId, str4)) {
                                        break;
                                    }
                                    itf0.a aVar2 = itf0.a;
                                    aVar2.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                    aVar2.a("match tournamentId, but categoryId is not matched. tournament: %s", tournament);
                                    return;
                                }
                            }
                            if (tournament != null) {
                                Iterator<Event> it = tournament.events.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        event = null;
                                        break;
                                    }
                                    Event next = it.next();
                                    if (TextUtils.equals(str6, next.eventId)) {
                                        event = next;
                                        break;
                                    }
                                }
                                if (event == null) {
                                    if (!z) {
                                        return;
                                    }
                                    Event event2 = new Event();
                                    event2.eventId = str6;
                                    event2.tournament = tournament;
                                    event2.sport = djsVar.n(mfb0Var, tournament);
                                    event2.update(socketEventMessageCreate.jsonObject);
                                    tournament.events.add(event2);
                                    if (!djsVar.i.contains(tournament.id)) {
                                        int iIndexOf = djsVar.c.indexOf(tournament) + tournament.events.size();
                                        djsVar.c.add(iIndexOf, event2);
                                        djsVar.notifyItemInserted(iIndexOf);
                                        itf0.a aVar3 = itf0.a;
                                        aVar3.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                        aVar3.a("and event(" + iIndexOf + "): " + event2, new Object[0]);
                                    }
                                    if (djsVar.G.g()) {
                                        djsVar.G.h(new LiveEventChange(event2, true, djs.o(djsVar.d, djsVar.c)));
                                    }
                                } else if (z) {
                                    event.update(socketEventMessageCreate.jsonObject);
                                    if (!djsVar.i.contains(tournament.id)) {
                                        djsVar.notifyItemChanged(djsVar.c.indexOf(event));
                                    }
                                } else {
                                    tournament.events.remove(event);
                                    if (!djsVar.i.contains(tournament.id)) {
                                        int iIndexOf2 = djsVar.c.indexOf(event);
                                        djsVar.c.remove(iIndexOf2);
                                        djsVar.notifyItemRemoved(iIndexOf2);
                                        itf0.a aVar4 = itf0.a;
                                        aVar4.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                        aVar4.a("remove event(" + iIndexOf2 + "): " + event, new Object[0]);
                                    }
                                    if (tournament.events.size() == 0) {
                                        djsVar.d.remove(tournament);
                                        djsVar.i.remove(tournament.id);
                                        int iIndexOf3 = djsVar.c.indexOf(tournament);
                                        djsVar.c.remove(iIndexOf3);
                                        djsVar.notifyItemRemoved(iIndexOf3);
                                        itf0.a aVar5 = itf0.a;
                                        aVar5.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                        aVar5.a("remove tournament(" + iIndexOf3 + "): " + tournament, new Object[0]);
                                    }
                                    if (djsVar.c.size() == 0 && djsVar.G.g()) {
                                        djsVar.G.i(new nqc(new Object()));
                                    }
                                    if (djsVar.G.g()) {
                                        djsVar.G.h(new LiveEventChange(event, false, djs.o(djsVar.d, djsVar.c)));
                                    }
                                }
                            } else {
                                if (!z) {
                                    return;
                                }
                                Tournament tournament2 = new Tournament();
                                tournament2.id = str2;
                                tournament2.name = str3;
                                tournament2.categoryId = str4;
                                tournament2.categoryName = str5;
                                tournament2.events = new ArrayList();
                                Event event3 = new Event();
                                event3.eventId = str6;
                                event3.tournament = tournament2;
                                event3.sport = djsVar.n(mfb0Var, tournament2);
                                event3.update(socketEventMessageCreate.jsonObject);
                                tournament2.events.add(event3);
                                djsVar.d.add(tournament2);
                                djsVar.i.remove(tournament2.id);
                                djsVar.c.add(tournament2);
                                djsVar.c.add(event3);
                                djsVar.notifyItemRangeInserted(djsVar.c.size() - 2, 2);
                                itf0.a aVar6 = itf0.a;
                                aVar6.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                aVar6.a("add tournament(" + (djsVar.c.size() - 2) + "): " + tournament2 + " and event(" + (djsVar.c.size() - 1) + "): " + event3, new Object[0]);
                                if (djsVar.G.g()) {
                                    djsVar.G.h(new LiveEventChange(event3, true, djs.o(djsVar.d, djsVar.c)));
                                    djsVar.G.i(new mqc());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Exception e) {
                itf0.a aVar7 = itf0.a;
                aVar7.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar7.p(e, "Failed to process event message", new Object[0]);
            }
        }
    }

    public class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            QuickMarketHelper.fetch(MyFavoriteLivePanel.this.A, ((Sport) gVar.a).id, new QuickMarketHelper.FetchCallback() { // from class: gxw
                @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                public final void onResult(List list) {
                    MyFavoriteLivePanel.c cVar = this.a;
                    synchronized (MyFavoriteLivePanel.this.K) {
                        MyFavoriteLivePanel.this.z(list);
                    }
                    MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
                    myFavoriteLivePanel.o0.a.removeAllViews();
                    myFavoriteLivePanel.B.clear();
                    MyFavoriteLivePanel.this.D(true);
                    MyFavoriteLivePanel.this.v(false);
                }
            });
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public class d implements TabLayout.d {
        public d() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            Sport selectedSport = myFavoriteLivePanel.getSelectedSport();
            RegularMarketRule selectedMarket = myFavoriteLivePanel.getSelectedMarket();
            if (selectedSport == null || selectedMarket == null || myFavoriteLivePanel.R == null) {
                return;
            }
            myFavoriteLivePanel.E(selectedSport, selectedMarket);
            ArrayList arrayListN = myFavoriteLivePanel.n(myFavoriteLivePanel.V, selectedMarket);
            djs djsVar = myFavoriteLivePanel.R;
            djsVar.getClass();
            djsVar.s(new ArrayList(arrayListN), selectedMarket);
            myFavoriteLivePanel.R.notifyDataSetChanged();
            myFavoriteLivePanel.B(true);
            Sport selectedSport2 = myFavoriteLivePanel.getSelectedSport();
            RegularMarketRule selectedMarket2 = myFavoriteLivePanel.getSelectedMarket();
            if (selectedSport2 != null && selectedMarket2 != null) {
                f00 f00Var = vgb0.a;
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.CONTENT_TYPE, "A_" + selectedSport2.id + "_" + selectedMarket2.a)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                if (w1k.a(key, entry, map, key) != null) {
                    hb5.a(wga.a(key, "duplicate key: "));
                    return;
                } else {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    mapUnmodifiableMap.getClass();
                    vgb0.c("quick_market", mapUnmodifiableMap, false);
                }
            }
            new Handler().postDelayed(new Runnable() { // from class: hxw
                @Override // java.lang.Runnable
                public final void run() {
                    MyFavoriteLivePanel myFavoriteLivePanel2 = MyFavoriteLivePanel.this;
                    myFavoriteLivePanel2.G(myFavoriteLivePanel2.R);
                }
            }, 300L);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public class e extends OneUpTwoUpSwitch.d {
        public e() {
        }

        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
        public final void d(OneUpTwoUpSwitch.f fVar) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            asy asyVar = myFavoriteLivePanel.h0;
            if (asyVar != null) {
                asyVar.d(fVar);
            }
            myFavoriteLivePanel.x(hih0.g(fVar));
        }
    }

    public class f extends SimpleResponseWrapper<List<Sport>> {
        public f() {
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            if (myFavoriteLivePanel.C.isShown()) {
                myFavoriteLivePanel.C.I();
                myFavoriteLivePanel.C.setOnClickListener(new View.OnClickListener() { // from class: jxw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyFavoriteLivePanel.this.u();
                    }
                });
            }
        }

        @Override // com.sportybet.android.data.CallbackWrapper
        public final void onResponseComplete() {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.M = null;
            myFavoriteLivePanel.S = true;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(List<Sport> list) {
            List<Sport> list2 = list;
            ServerProductStatus serverProductStatus = getServerProductStatus();
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            if (serverProductStatus != null && !serverProductStatus.isInServing(ServerProductStatus.Product.LIVE_EVENTS)) {
                myFavoriteLivePanel.D.setVisibility(8);
                myFavoriteLivePanel.E.setVisibility(8);
                myFavoriteLivePanel.l0.setVisibility(8);
                myFavoriteLivePanel.C.G(R.string.wap_home__failed_to_load_game_tip);
                myFavoriteLivePanel.o0.a.removeAllViews();
                myFavoriteLivePanel.B.clear();
                return;
            }
            ArrayList arrayList = myFavoriteLivePanel.U;
            arrayList.clear();
            arrayList.addAll(MyFavoriteLivePanel.A(MyFavoriteLivePanel.m(list2)));
            if (arrayList.isEmpty()) {
                myFavoriteLivePanel.setVisibility(8);
                return;
            }
            if (!myFavoriteLivePanel.o(arrayList)) {
                myFavoriteLivePanel.y();
            }
            ArrayList arrayListF = lfb0.d().f(arrayList);
            int size = arrayListF.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListF.get(i2);
                i2++;
                i += ((Sport) obj).eventSize;
            }
            myFavoriteLivePanel.l0.setText(sn5.c(myFavoriteLivePanel, R.string.live__all_events, String.valueOf(i)));
            trs trsVar = myFavoriteLivePanel.c0;
            if (trsVar != null) {
                trsVar.c.m(Integer.valueOf(i));
            }
            if (!myFavoriteLivePanel.a0) {
                myFavoriteLivePanel.setVisibility(0);
            }
            myFavoriteLivePanel.D.setVisibility(myFavoriteLivePanel.a0 ? 8 : 0);
            myFavoriteLivePanel.E.setVisibility(0);
            if (myFavoriteLivePanel.W) {
                myFavoriteLivePanel.l0.setVisibility(0);
            }
            iu2.a(myFavoriteLivePanel);
            QuickMarketHelper.fetch(myFavoriteLivePanel.A, myFavoriteLivePanel.getSelectedSport().id, new QuickMarketHelper.FetchCallback() { // from class: ixw
                @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                public final void onResult(List list3) {
                    MyFavoriteLivePanel.f fVar = this.a;
                    synchronized (MyFavoriteLivePanel.this.K) {
                        MyFavoriteLivePanel.this.z(list3);
                    }
                    MyFavoriteLivePanel.this.v(true);
                }
            });
        }
    }

    public class g extends SimpleResponseWrapper<PreMatchSportsData> {
        public final /* synthetic */ RegularMarketRule a;
        public final /* synthetic */ Sport b;

        public g(RegularMarketRule regularMarketRule, Sport sport) {
            this.a = regularMarketRule;
            this.b = sport;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_MARKET);
            aVar.a("load event, sport: " + this.b + ", market: " + this.a + ", failed: " + th, new Object[0]);
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            if (myFavoriteLivePanel.C.isShown()) {
                myFavoriteLivePanel.C.I();
                myFavoriteLivePanel.C.setOnClickListener(new View.OnClickListener() { // from class: kxw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyFavoriteLivePanel myFavoriteLivePanel2 = MyFavoriteLivePanel.this;
                        int i = MyFavoriteLivePanel.p0;
                        myFavoriteLivePanel2.v(false);
                    }
                });
            }
        }

        @Override // com.sportybet.android.data.CallbackWrapper
        public final void onResponseComplete() {
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.N = null;
            myFavoriteLivePanel.m0 = false;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(PreMatchSportsData preMatchSportsData) {
            PreMatchSportsData preMatchSportsData2 = preMatchSportsData;
            ArrayList arrayList = new ArrayList(preMatchSportsData2.tournaments);
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            myFavoriteLivePanel.V = arrayList;
            List<Tournament> list = preMatchSportsData2.tournaments;
            RegularMarketRule regularMarketRule = this.a;
            ArrayList arrayListN = myFavoriteLivePanel.n(list, regularMarketRule);
            if (arrayListN.isEmpty()) {
                djs djsVar = myFavoriteLivePanel.R;
                if (djsVar != null) {
                    djsVar.s(arrayListN, regularMarketRule);
                }
                myFavoriteLivePanel.w();
                return;
            }
            if (myFavoriteLivePanel.c0 != null) {
                int size = arrayListN.size();
                int size2 = 0;
                int i = 0;
                while (i < size) {
                    Object obj = arrayListN.get(i);
                    i++;
                    size2 += ((Tournament) obj).events.size();
                }
                myFavoriteLivePanel.c0.d.m(Integer.valueOf(size2));
            }
            djs djsVar2 = myFavoriteLivePanel.R;
            Sport sport = this.b;
            if (djsVar2 == null) {
                djs djsVar3 = new djs(myFavoriteLivePanel.getContext(), sport.id, myFavoriteLivePanel, "favorites/live", myFavoriteLivePanel.c, myFavoriteLivePanel.i, myFavoriteLivePanel.v, myFavoriteLivePanel.z);
                myFavoriteLivePanel.R = djsVar3;
                djsVar3.registerAdapterDataObserver(new com.sportybet.plugin.myfavorite.widget.a(this));
            } else {
                djsVar2.v = lfb0.d().e(sport.id);
            }
            djs djsVar4 = myFavoriteLivePanel.R;
            djsVar4.C = true;
            List<FavoriteTournament> listM = izw.a.a().m(djsVar4.v.getId());
            djsVar4.E = listM;
            if (listM != null) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar.a("setIsMyFavorite: size = %s", Integer.valueOf(djsVar4.E.size()));
            }
            djs djsVar5 = myFavoriteLivePanel.R;
            djsVar5.w = myFavoriteLivePanel.B;
            djsVar5.y = myFavoriteLivePanel.F;
            djsVar5.D = true;
            djsVar5.s(arrayListN, regularMarketRule);
            djs djsVar6 = myFavoriteLivePanel.R;
            su5<BaseResponse<BoostInfo>> su5Var = myFavoriteLivePanel.O;
            if (su5Var != null) {
                su5Var.cancel();
                myFavoriteLivePanel.O = null;
            }
            su5<BaseResponse<BoostInfo>> su5VarB = ap0.e().b();
            myFavoriteLivePanel.O = su5VarB;
            su5VarB.G(new lxw(myFavoriteLivePanel, djsVar6));
            myFavoriteLivePanel.B(true);
        }
    }

    public class h implements Subscriber {
        public h() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_SPORT_LIST);
            aVar.a("on receive sport list message: %s", str);
            MyFavoriteLivePanel myFavoriteLivePanel = MyFavoriteLivePanel.this;
            ArrayList arrayList = myFavoriteLivePanel.U;
            if (myFavoriteLivePanel.S) {
                JsonSerializeService jsonSerializeServiceB = sh8.b();
                try {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray = new JSONArray(str);
                    int i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList2.add((Sport) jsonSerializeServiceB.fromJson(jSONArray.getString(i2), Sport.class));
                    }
                    ArrayList arrayListA = MyFavoriteLivePanel.A(MyFavoriteLivePanel.m(arrayList2));
                    int size = arrayListA.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListA.get(i3);
                        i3++;
                        i += ((Sport) obj).eventSize;
                    }
                    trs trsVar = myFavoriteLivePanel.c0;
                    if (trsVar != null) {
                        trsVar.c.m(Integer.valueOf(i));
                    }
                    if (myFavoriteLivePanel.a0 || myFavoriteLivePanel.o(arrayListA)) {
                        return;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayListA);
                    if (arrayList.isEmpty()) {
                        myFavoriteLivePanel.setVisibility(8);
                    } else {
                        myFavoriteLivePanel.y();
                        QuickMarketHelper.fetch(myFavoriteLivePanel.A, myFavoriteLivePanel.getSelectedSport().id, new QuickMarketHelper.FetchCallback() { // from class: mxw
                            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                            public final void onResult(List list) {
                                MyFavoriteLivePanel.h hVar = this.a;
                                synchronized (MyFavoriteLivePanel.this.K) {
                                    MyFavoriteLivePanel.this.z(list);
                                }
                            }
                        });
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public MyFavoriteLivePanel(Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((nxw) generatedComponent()).B(this);
        }
        this.A = QuickMarketSpotEnum.MAIN_PAGE_LIVE_EVENTS;
        this.B = new HashMap();
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = new Object();
        this.L = new Object();
        this.Q = new ArrayList();
        this.S = false;
        this.T = new ArrayList();
        this.U = new ArrayList();
        new ArrayList();
        this.V = new ArrayList();
        this.W = true;
        this.a0 = false;
        this.b0 = "";
        this.d0 = Collections.synchronizedSet(new HashSet());
        this.e0 = new a();
        this.f0 = new b();
        this.h0 = null;
        this.i0 = null;
        this.j0 = new c();
        this.k0 = new d();
        this.m0 = false;
        this.n0 = new h();
        q();
    }

    public static ArrayList A(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Sport sport = (Sport) obj;
            map.put(sport.id, sport);
        }
        Iterator<OrderedSportItem> it = OrderedSportItemHelper.getFromStorage(1).iterator();
        while (it.hasNext()) {
            Sport sport2 = (Sport) map.get(it.next().id);
            if (sport2 != null) {
                arrayList2.add(sport2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RegularMarketRule getSelectedMarket() {
        int selectedTabPosition = this.E.getTabCount() > 0 ? this.E.getSelectedTabPosition() : -1;
        if (selectedTabPosition > -1) {
            return (RegularMarketRule) this.E.k(selectedTabPosition).a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Sport getSelectedSport() {
        if (!this.a0) {
            int selectedTabPosition = this.D.getTabCount() > 0 ? this.D.getSelectedTabPosition() : -1;
            if (selectedTabPosition > -1) {
                return (Sport) this.D.k(selectedTabPosition).a;
            }
            return null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T;
            if (i >= arrayList.size()) {
                return null;
            }
            Sport sport = (Sport) arrayList.get(i);
            if (TextUtils.equals(this.b0, sport.id)) {
                return sport;
            }
            i++;
        }
    }

    public static ArrayList m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sport sport = (Sport) it.next();
            if (sport != null && sport.isValid()) {
                lfb0 lfb0VarD = lfb0.d();
                if (lfb0VarD.d.containsKey(sport.id)) {
                    arrayList.add(sport);
                }
            }
        }
        return arrayList;
    }

    public final void B(boolean z) {
        Set<Pair<? extends Topic, Subscriber>> set = this.d0;
        if (z) {
            D(true);
            Sport selectedSport = getSelectedSport();
            final RegularMarketRule selectedMarket = getSelectedMarket();
            if (selectedSport != null && selectedMarket != null) {
                final String strA = sa8.a(selectedSport.id);
                String strGenerateTopicString = TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new ty4(strA, 1));
                String strGenerateTopicString2 = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new cxw(0, strA, selectedMarket));
                String strGenerateTopicString3 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: dxw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TopicInfo topicInfo = (TopicInfo) obj;
                        int i = MyFavoriteLivePanel.p0;
                        topicInfo.setSportId(strA);
                        topicInfo.setProductId(tva.a);
                        topicInfo.setMarketId(selectedMarket.a);
                        return null;
                    }
                });
                set.add(Pair.create(new GroupTopic(strGenerateTopicString), this.f0));
                GroupTopic groupTopic = new GroupTopic(strGenerateTopicString2);
                a aVar = this.e0;
                set.add(Pair.create(groupTopic, aVar));
                set.add(Pair.create(new GroupTopic(strGenerateTopicString3), aVar));
            }
        }
        for (Pair<? extends Topic, Subscriber> pair : set) {
            SocketPushManager.getInstance().subscribeTopic((Topic) pair.first, (Subscriber) pair.second);
        }
    }

    @Override // iu2.a
    public final void C() {
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            ((OutcomeButton) it.next()).d();
        }
    }

    public final void D(boolean z) {
        Set<Pair<? extends Topic, Subscriber>> set = this.d0;
        for (Pair<? extends Topic, Subscriber> pair : set) {
            SocketPushManager.getInstance().unsubscribeTopic((Topic) pair.first, (Subscriber) pair.second);
        }
        if (z) {
            set.clear();
        }
    }

    public final void E(Sport sport, RegularMarketRule regularMarketRule) {
        OneUpTwoUpSwitch oneUpTwoUpSwitch = this.G;
        if (oneUpTwoUpSwitch == null || this.H == null || this.I == null || this.J == null) {
            return;
        }
        if (sport == null || regularMarketRule == null) {
            oneUpTwoUpSwitch.setVisibility(8);
            this.H.setVisibility(8);
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            return;
        }
        boolean zE = this.w.e(regularMarketRule, sport.id, true);
        hkf hkfVar = this.f;
        ckf ckfVar = ckf.c;
        String str = sport.id;
        String str2 = regularMarketRule.a;
        hkfVar.getClass();
        boolean zB = hkfVar.a.b(ckfVar, str, str2, true);
        if (zE) {
            whh0 whh0VarC = this.w.c(regularMarketRule, sport.id, true);
            this.y.getClass();
            yhh0 yhh0VarA = zhh0.a(whh0VarC);
            hih0.a(this.G, yhh0VarA.a);
            hih0.b(this.G, yhh0VarA.b);
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.I.setVisibility(0);
            asy asyVar = this.h0;
            jqu jquVar = ((asyVar == null || !asyVar.c()) || !((whh0VarC != null ? whh0VarC.a : null) == rhh0.b && whh0VarC.c.contains(phh0.a))) ? null : jqu.b;
            if (jquVar != null) {
                BubbleView bubbleView = this.J;
                bubbleView.getClass();
                lqu.c(bubbleView, jquVar, null);
            }
            this.J.setVisibility(jquVar != null ? 0 : 8);
            asy asyVar2 = this.h0;
            if (asyVar2 != null) {
                asyVar2.a();
                return;
            }
            return;
        }
        OneUpTwoUpSwitch oneUpTwoUpSwitch2 = this.G;
        if (!zB) {
            oneUpTwoUpSwitch2.setVisibility(8);
            this.H.setVisibility(8);
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            return;
        }
        oneUpTwoUpSwitch2.setVisibility(8);
        this.H.setVisibility(0);
        this.I.setVisibility(0);
        tay tayVar = this.i0;
        boolean zC = tayVar != null ? tayVar.c() : false;
        if (zC) {
            lqu.c(this.J, jqu.a, new Function0() { // from class: exw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = MyFavoriteLivePanel.p0;
                    gby.b(this.a.J.getDescriptionView().getContext());
                    return Unit.a;
                }
            });
        }
        this.J.setVisibility(zC ? 0 : 8);
        tay tayVar2 = this.i0;
        if (tayVar2 != null) {
            tayVar2.a();
        }
    }

    public final void F(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        for (int i = 0; i < this.E.getTabCount(); i++) {
            TabLayout.g gVarK = this.E.k(i);
            if (gVarK != null) {
                Object obj = gVarK.a;
                if ((obj instanceof RegularMarketRule) && TextUtils.equals(((RegularMarketRule) obj).a, regularMarketRule.a)) {
                    gVarK.a = regularMarketRule2;
                    break;
                }
            }
        }
        if (this.R == null) {
            return;
        }
        ArrayList arrayListN = n(this.V, regularMarketRule2);
        djs djsVar = this.R;
        djsVar.getClass();
        djsVar.s(new ArrayList(arrayListN), regularMarketRule2);
        this.R.notifyDataSetChanged();
        B(true);
        new Handler().postDelayed(new jjd(this, 1), 300L);
    }

    public final void G(djs djsVar) {
        ArrayList arrayList;
        synchronized (this.L) {
            try {
                this.o0.a.removeAllViews();
                this.B.clear();
                djs djsVar2 = this.R;
                synchronized (djsVar2.c) {
                    arrayList = djsVar2.c;
                }
                itf0.a aVar = itf0.a;
                aVar.q("MyFavoriteLivePanel");
                aVar.a("updateView, adapterData.size(): %s", Integer.valueOf(arrayList.size()));
                if (arrayList.size() == 0) {
                    w();
                } else {
                    if (getSelectedMarket() != null) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            Object obj = arrayList.get(i);
                            w7i0 w7i0Var = this.o0;
                            w7i0Var.a.addView(l(obj, i, djsVar));
                        }
                        p();
                        return;
                    }
                    aVar.q("MyFavoriteLivePanel");
                    aVar.n("no selected market to update event view", new Object[0]);
                    w();
                }
                p();
            } catch (Exception unused) {
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
    }

    public final void H(djs djsVar, int i, String str) {
        ArrayList arrayList;
        synchronized (this.L) {
            try {
                djs djsVar2 = this.R;
                synchronized (djsVar2.c) {
                    arrayList = djsVar2.c;
                }
                if (arrayList.size() == 0) {
                    w();
                } else {
                    if (getSelectedMarket() != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1335458389) {
                            if (iHashCode != -1183792455) {
                                if (iHashCode == -838846263 && str.equals("update")) {
                                    this.o0.a.removeView(this.o0.a.getChildAt(i));
                                    Object obj = arrayList.get(i);
                                    w7i0 w7i0Var = this.o0;
                                    w7i0Var.a.addView(l(obj, i, djsVar), i);
                                    itf0.a aVar = itf0.a;
                                    aVar.q("MyFavoriteLivePanel");
                                    aVar.a("update, index: %s", Integer.valueOf(i));
                                }
                            } else if (str.equals("insert")) {
                                Object obj2 = arrayList.get(i);
                                w7i0 w7i0Var2 = this.o0;
                                w7i0Var2.a.addView(l(obj2, i, djsVar), i);
                                itf0.a aVar2 = itf0.a;
                                aVar2.q("MyFavoriteLivePanel");
                                aVar2.a("insert, index: %s", Integer.valueOf(i));
                            }
                        } else if (str.equals("delete")) {
                            this.o0.a.removeView(this.o0.a.getChildAt(i));
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("MyFavoriteLivePanel");
                            aVar3.a("delete, index: %s", Integer.valueOf(i));
                        }
                        p();
                        return;
                    }
                    itf0.a aVar4 = itf0.a;
                    aVar4.q("MyFavoriteLivePanel");
                    aVar4.n("no selected market to update event view", new Object[0]);
                    w();
                }
                p();
            } catch (Exception unused) {
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
    }

    @Override // djs.d
    public final void a(Event event) {
        ivw ivwVar = this.g0;
        if (ivwVar != null) {
            ivwVar.a(event);
        }
    }

    @Override // djs.d
    public final void d(Selection selection, boolean z) {
    }

    @Override // djs.d
    public final void e() {
        Context context = getContext();
        String string = getContext().getString(R.string.common_functions__dynamic_market_info_text);
        context.getClass();
        string.getClass();
        js.d(context, R.string.common_functions__dynamic_market_info_title, string, null, null, 48);
    }

    @Override // djs.d
    public final boolean g() {
        return true;
    }

    @Override // djs.d
    public final void h(LiveEventChange liveEventChange) {
        this.c0.a.m(liveEventChange);
    }

    @Override // djs.d
    public final void i(hqc hqcVar) {
        this.c0.b.m(hqcVar);
    }

    public final void k() {
        su5<BaseResponse<List<Sport>>> su5Var = this.M;
        if (su5Var != null) {
            su5Var.cancel();
            this.M = null;
        }
        su5<BaseResponse<PreMatchSportsData>> su5Var2 = this.N;
        if (su5Var2 != null) {
            su5Var2.cancel();
            this.N = null;
        }
        su5<BaseResponse<BoostInfo>> su5Var3 = this.O;
        if (su5Var3 != null) {
            su5Var3.cancel();
            this.O = null;
        }
    }

    public final View l(Object obj, int i, djs djsVar) {
        if (obj instanceof Tournament) {
            itf0.a aVar = itf0.a;
            aVar.q("MyFavoriteLivePanel");
            aVar.a("generateItem - Tournament", new Object[0]);
            j380 j380Var = (j380) djsVar.onCreateViewHolder(this, 0);
            djsVar.onBindViewHolder(j380Var, i);
            j380Var.itemView.setTag(R.id.live_panel, Integer.valueOf(i));
            return j380Var.itemView;
        }
        if (obj instanceof Event) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("MyFavoriteLivePanel");
            aVar2.a("generateItem - Event", new Object[0]);
            s3p s3pVar = (s3p) djsVar.onCreateViewHolder(this, 1);
            djsVar.onBindViewHolder(s3pVar, i);
            s3pVar.itemView.setTag(R.id.live_panel, Integer.valueOf(i));
            return s3pVar.itemView;
        }
        itf0.a aVar3 = itf0.a;
        aVar3.q("MyFavoriteLivePanel");
        aVar3.a("generateItem - StreamBtn", new Object[0]);
        r8e0 r8e0Var = (r8e0) djsVar.onCreateViewHolder(this, 2);
        djsVar.onBindViewHolder(r8e0Var, i);
        r8e0Var.itemView.setTag(R.id.live_panel, Integer.valueOf(i));
        return r8e0Var.itemView;
    }

    public final ArrayList n(List list, RegularMarketRule regularMarketRule) {
        boolean zE;
        String str = regularMarketRule.a;
        hkf hkfVar = this.f;
        String str2 = getSelectedSport() != null ? getSelectedSport().id : null;
        hkfVar.getClass();
        list.getClass();
        whh0 whh0VarD = hkfVar.b.d(str2, str, true);
        boolean zG = yay.g(str);
        if ((whh0VarD != null ? whh0VarD.b : null) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Tournament tournament = (Tournament) obj;
                phh0 phh0Var = whh0VarD.b;
                rhh0 rhh0Var = whh0VarD.a;
                int iOrdinal = phh0Var.ordinal();
                if (iOrdinal == 0) {
                    int iOrdinal2 = rhh0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        zE = xvy.e(tournament, false, 1);
                    } else {
                        if (iOrdinal2 != 1) {
                            uhc.a();
                            return null;
                        }
                        zE = akf.f(tournament, tlc.a, false, 2);
                    }
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    int iOrdinal3 = rhh0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        zE = xvy.h(tournament, false, 1);
                    } else {
                        if (iOrdinal3 != 1) {
                            uhc.a();
                            return null;
                        }
                        zE = true;
                    }
                }
                if (zE) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        } else if (zG) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (akf.f((Tournament) obj2, cby.a, false, 2)) {
                    arrayList2.add(obj2);
                }
            }
            list = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Tournament tournament2 : list) {
            if (tournament2 != null) {
                hkf hkfVar2 = this.f;
                String str3 = getSelectedSport() != null ? getSelectedSport().id : null;
                List<Event> list2 = tournament2.events;
                if (list2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
                hkfVar2.getClass();
                list2.getClass();
                List<Event> listC = hkfVar2.c(str3, str, list2, true);
                if (!listC.isEmpty()) {
                    Tournament tournament3 = new Tournament();
                    tournament3.id = tournament2.id;
                    tournament3.name = tournament2.name;
                    tournament3.score = tournament2.score;
                    tournament3.categoryId = tournament2.categoryId;
                    tournament3.categoryName = tournament2.categoryName;
                    tournament3.showViewAll = tournament2.showViewAll;
                    tournament3.events = listC;
                    tournament3.eventSize = listC.size();
                    arrayList3.add(tournament3);
                }
            }
        }
        return arrayList3;
    }

    public final boolean o(ArrayList arrayList) {
        int tabCount = this.D.getTabCount();
        if (tabCount == arrayList.size()) {
            for (int i = 0; i < tabCount; i++) {
                if (((Sport) this.D.k(i).a).equals((Sport) arrayList.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu2.q(this);
        k();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        com.sportybet.android.widget.LoadingView loadingView = (com.sportybet.android.widget.LoadingView) findViewById(R.id.loading);
        this.C = loadingView;
        loadingView.getEmptyView().setTextColor(-1);
        this.C.getErrorView().getTitle().setTextColor(-1);
        Button button = this.C.getErrorView().getButton();
        button.setBackgroundResource(R.drawable.bg_fiilled_brand_secondary_3_radius);
        button.setTextColor(-1);
        button.setText(sn5.c(this, R.string.common_functions__retry, new Object[0]));
        TextView textView = (TextView) findViewById(R.id.bottom_all);
        this.l0 = textView;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(getContext(), R.drawable.spr_ic_chevron_right_black_24dp), (Drawable) null);
        this.l0.setOnClickListener(new View.OnClickListener() { // from class: vww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = MyFavoriteLivePanel.p0;
                this.a.r();
            }
        });
        this.o0 = new w7i0((ViewGroup) findViewById(R.id.event_view_container));
    }

    public final void p() {
        this.o0.a.setVisibility(0);
        this.C.E();
    }

    public final void q() {
        ArrayList arrayListC = lfb0.d().c();
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            mfb0 mfb0Var = (mfb0) obj;
            Sport sport = new Sport();
            sport.id = mfb0Var.getId();
            sport.name = mfb0Var.c().g(getContext());
            this.T.add(sport);
        }
    }

    public final /* synthetic */ void r() {
        Sport selectedSport = getSelectedSport();
        if (selectedSport != null) {
            Intent intent = new Intent(getContext(), (Class<?>) LivePageActivity.class);
            intent.putExtra("key_sport_id", selectedSport.id);
            getContext().startActivity(intent);
        }
    }

    public final void s() {
        TabLayout.g gVarK;
        int selectedTabPosition = this.E.getSelectedTabPosition();
        if (selectedTabPosition > -1 && (gVarK = this.E.k(selectedTabPosition)) != null) {
            gVarK.b();
        }
        E(getSelectedSport(), getSelectedMarket());
        this.E.a(this.k0);
    }

    public void setActionListener(ivw ivwVar) {
        this.g0 = ivwVar;
    }

    public void setFixedSport(String str) {
        this.b0 = str;
        this.a0 = !TextUtils.isEmpty(str);
    }

    public void setMarketOptionViews(OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, View view, final BubbleView bubbleView) {
        this.G = oneUpTwoUpSwitch;
        this.H = oUEarlyGoalsSwitch;
        this.I = view;
        this.J = bubbleView;
        oneUpTwoUpSwitch.setOnStateChangedListener(new e());
        oUEarlyGoalsSwitch.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: zww
            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
            public final void onStateChanged(boolean z) {
                int i = MyFavoriteLivePanel.p0;
                this.a.t(z);
            }
        });
        gby.a(bubbleView.getDescriptionView(), new Function0() { // from class: axw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = MyFavoriteLivePanel.p0;
                gby.b(bubbleView.getDescriptionView().getContext());
                return Unit.a;
            }
        });
        bubbleView.setOnClickedClose(new Function0() { // from class: bxw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                asy asyVar;
                int i = MyFavoriteLivePanel.p0;
                jqu jquVarB = lqu.b(bubbleView);
                jqu jquVar = jqu.b;
                MyFavoriteLivePanel myFavoriteLivePanel = this.a;
                if (jquVarB != jquVar || (asyVar = myFavoriteLivePanel.h0) == null) {
                    tay tayVar = myFavoriteLivePanel.i0;
                    if (tayVar != null) {
                        tayVar.b();
                    }
                } else {
                    asyVar.b();
                }
                return Unit.a;
            }
        });
    }

    public void setMarketTabLayout(TabLayout tabLayout) {
        this.E = tabLayout;
        tabLayout.setTabMode(0);
    }

    public void setMarketTitle(RelativeLayout relativeLayout) {
        this.F = relativeLayout;
    }

    public void setOneTwoUpStateDelegate(asy asyVar) {
        this.h0 = asyVar;
    }

    public void setOuEarlyGoalsCoordinator(tay tayVar) {
        this.i0 = tayVar;
    }

    public void setSportTabLayout(TabLayout tabLayout) {
        this.D = tabLayout;
        tabLayout.setTabMode(0);
    }

    public void setViewModel(trs trsVar) {
        this.c0 = trsVar;
    }

    public void setupUpMarketViews() {
        E(getSelectedSport(), getSelectedMarket());
    }

    public final void t(boolean z) {
        tay tayVar = this.i0;
        if (tayVar != null) {
            tayVar.onStateChanged(z);
        }
        Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || selectedMarket == null) {
            return;
        }
        String str = selectedMarket.a;
        RegularMarketRule regularMarketRuleA = this.e.b(ckf.c, selectedSport.id, str, true) ? this.f.a(selectedSport.id, selectedMarket, z, true) : selectedMarket;
        if (regularMarketRuleA == null || TextUtils.equals(regularMarketRuleA.a, str)) {
            return;
        }
        F(selectedMarket, regularMarketRuleA);
    }

    public final void u() {
        if (this.C.isShown()) {
            this.C.K();
            this.o0.a.setVisibility(8);
        }
        k();
        su5<BaseResponse<List<Sport>>> su5VarF0 = ap0.b().f0(null, 1, null, "1", null, false);
        this.M = su5VarF0;
        su5VarF0.G(new f());
    }

    public final void v(boolean z) {
        this.m0 = true;
        Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || selectedMarket == null) {
            w();
            return;
        }
        if (!z || this.C.isShown()) {
            this.C.K();
            this.o0.a.setVisibility(8);
        }
        k();
        uvy uvyVarE = this.d.e();
        boolean z2 = false;
        boolean z3 = uvyVarE.a && uvyVarE.b;
        if (uvyVarE.c && uvyVarE.d) {
            z2 = true;
        }
        String str = selectedSport.id;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sportId", str);
            jSONObject.put("productId", 1);
            jSONObject.put("withOneUpMarket", z3);
            jSONObject.put("withTwoUpMarket", z2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        su5<BaseResponse<PreMatchSportsData>> su5VarE0 = ap0.b().e0(jSONObject.toString());
        this.N = su5VarE0;
        su5VarE0.G(new g(selectedMarket, selectedSport));
    }

    public final void w() {
        this.C.G(R.string.common_functions__no_game);
        this.C.L(new View.OnClickListener() { // from class: www
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = MyFavoriteLivePanel.p0;
                MyFavoriteLivePanel myFavoriteLivePanel = this.a;
                myFavoriteLivePanel.C.L(null);
                myFavoriteLivePanel.v(false);
            }
        });
        trs trsVar = this.c0;
        if (trsVar != null) {
            trsVar.d.m(0);
        }
    }

    public final void x(avy avyVar) {
        Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || selectedMarket == null) {
            return;
        }
        RegularMarketRule regularMarketRuleB = this.w.e(selectedMarket, selectedSport.id, true) ? this.w.b(avyVar, selectedMarket, selectedSport.id, true) : selectedMarket;
        if (regularMarketRuleB == null || TextUtils.equals(regularMarketRuleB.a, selectedMarket.a)) {
            return;
        }
        F(selectedMarket, regularMarketRuleB);
    }

    public final void y() {
        Sport selectedSport = getSelectedSport();
        TabLayout tabLayout = this.D;
        c cVar = this.j0;
        tabLayout.o(cVar);
        this.D.n();
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Sport sport = (Sport) obj;
            TabLayout.g gVarL = this.D.l();
            gVarL.e(sport.name);
            gVarL.a = sport;
            this.D.b(gVarL);
            if (selectedSport != null && TextUtils.equals(selectedSport.id, sport.id)) {
                gVarL.b();
            }
        }
        this.D.a(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    public final void z(List<RegularMarketRule> list) {
        List<RegularMarketRule> list2;
        TabLayout.g gVarK;
        RegularMarketRule regularMarketRuleD;
        if (list.isEmpty()) {
            return;
        }
        final Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || list.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            final ArrayList arrayList = new ArrayList();
            list.forEach(new Consumer() { // from class: yww
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    RegularMarketRule regularMarketRule = (RegularMarketRule) obj;
                    int i = MyFavoriteLivePanel.p0;
                    MyFavoriteLivePanel myFavoriteLivePanel = this.a;
                    xhh0 xhh0Var = myFavoriteLivePanel.w;
                    Sport sport = selectedSport;
                    boolean zE = xhh0Var.e(regularMarketRule, sport.id, true);
                    hkf hkfVar = myFavoriteLivePanel.f;
                    ckf ckfVar = ckf.c;
                    String str = sport.id;
                    String str2 = regularMarketRule.a;
                    hkfVar.getClass();
                    boolean zB = hkfVar.a.b(ckfVar, str, str2, true);
                    ArrayList arrayList2 = arrayList;
                    if (zE) {
                        RegularMarketRule regularMarketRuleB = myFavoriteLivePanel.w.b(hih0.g(myFavoriteLivePanel.G.getB()), regularMarketRule, sport.id, true);
                        if (regularMarketRuleB != null) {
                            regularMarketRule = regularMarketRuleB;
                        }
                        arrayList2.add(regularMarketRule);
                        return;
                    }
                    if (!zB) {
                        arrayList2.add(regularMarketRule);
                        return;
                    }
                    RegularMarketRule regularMarketRuleA = myFavoriteLivePanel.f.a(sport.id, regularMarketRule, myFavoriteLivePanel.H.c(), true);
                    if (regularMarketRuleA != null) {
                        regularMarketRule = regularMarketRuleA;
                    }
                    arrayList2.add(regularMarketRule);
                }
            });
            list2 = arrayList;
        }
        new ArrayList(list2);
        this.E.o(this.k0);
        this.E.n();
        boolean z = this.E.getVisibility() == 0;
        for (RegularMarketRule regularMarketRule : list2) {
            if (regularMarketRule == null) {
                regularMarketRuleD = null;
            } else if (selectedSport == null || !this.w.e(regularMarketRule, selectedSport.id, true)) {
                this.f.getClass();
                if (hkf.e(regularMarketRule)) {
                    this.f.getClass();
                    regularMarketRuleD = hkf.d(regularMarketRule);
                } else {
                    regularMarketRuleD = regularMarketRule;
                }
            } else {
                regularMarketRuleD = this.w.b(avy.c, regularMarketRule, selectedSport.id, true);
                if (regularMarketRuleD == null) {
                    regularMarketRuleD = regularMarketRule;
                }
            }
            TabLayout.g gVarL = this.E.l();
            gVarL.a = regularMarketRule;
            getContext();
            HashSet hashSet = tru.a;
            gVarL.e(regularMarketRuleD.b);
            this.E.b(gVarL);
            if (selectedMarket != null) {
                String str = selectedMarket.a;
                if (TextUtils.equals(str, regularMarketRule.a) || TextUtils.equals(str, regularMarketRuleD.a)) {
                    gVarL.b();
                    z = false;
                }
            }
        }
        if (z && this.E.getChildCount() > 0 && (gVarK = this.E.k(0)) != null) {
            gVarK.b();
        }
        this.E.postDelayed(new Runnable() { // from class: xww
            @Override // java.lang.Runnable
            public final void run() {
                int i = MyFavoriteLivePanel.p0;
                this.a.s();
            }
        }, 100L);
    }

    public MyFavoriteLivePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = QuickMarketSpotEnum.MAIN_PAGE_LIVE_EVENTS;
        this.B = new HashMap();
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = new Object();
        this.L = new Object();
        this.Q = new ArrayList();
        this.S = false;
        this.T = new ArrayList();
        this.U = new ArrayList();
        new ArrayList();
        this.V = new ArrayList();
        this.W = true;
        this.a0 = false;
        this.b0 = "";
        this.d0 = Collections.synchronizedSet(new HashSet());
        this.e0 = new a();
        this.f0 = new b();
        this.h0 = null;
        this.i0 = null;
        this.j0 = new c();
        this.k0 = new d();
        this.m0 = false;
        this.n0 = new h();
        q();
    }
}
