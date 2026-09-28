package com.sportybet.plugin.realsports.event;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.event.viewholder.ViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder;
import defpackage.a8z;
import defpackage.aah;
import defpackage.agd0;
import defpackage.apg;
import defpackage.b3;
import defpackage.brg;
import defpackage.c2p;
import defpackage.d9f0;
import defpackage.fqu;
import defpackage.gym;
import defpackage.hbs;
import defpackage.hhy;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iym;
import defpackage.ko70;
import defpackage.lja0;
import defpackage.mfb0;
import defpackage.muh;
import defpackage.nt3;
import defpackage.qfi0;
import defpackage.rgy;
import defpackage.s1p;
import defpackage.s6b;
import defpackage.sn5;
import defpackage.tva;
import defpackage.vpu;
import defpackage.y7z;
import defpackage.z7z;
import defpackage.zsu;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class EventLiveAdapter extends BaseEventDetailMarketListAdapter implements Subscriber, hbs {
    private final WeakReference<EventActivity> activityRef;
    private rgy appliedOddsFilter;
    private final List<Map<String, String>> boostMatchList;
    private final aah favoriteMarketToggleListener;
    private final muh flashBoostViewTracker;
    private Event mEvent;
    private int mFavoriteMarketCount;
    private boolean mShowUseBoost;
    private final Set<Pair<? extends Topic, Subscriber>> mTopicSet;
    private final a8z outcomeBoostResolver;
    private String selectedMarketGroupTabId;
    private int selectedMarketGroupTabPosition;
    private final Map<String, List<Market>> tabMarketsRef;
    private VisibleMarketViewHolder.a visibleMarketViewHolderCallback;

    public class a implements VisibleMarketViewHolder.a {
        public a() {
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean A(Market market) {
            return EventLiveAdapter.this.isFavoriteMarket(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean B() {
            return EventLiveAdapter.this.mShowUseBoost;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void C(Market market, int i) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            eventLiveAdapter.expandMarket(market);
            eventLiveAdapter.notifyItemChanged(i);
            eventLiveAdapter.scrollToPosition(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List<Map<String, String>> D() {
            return EventLiveAdapter.this.boostMatchList;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final d9f0 E(String str) {
            return EventLiveAdapter.this.getCurrentTeamSelection(str);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void F(Market market, int i) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            boolean zIsCollapse = eventLiveAdapter.isCollapse(market);
            Map<Market, Boolean> map = eventLiveAdapter.mCollapsed;
            if (zIsCollapse) {
                map.put(market, Boolean.FALSE);
            } else {
                map.put(market, Boolean.TRUE);
            }
            eventLiveAdapter.notifyItemRangeChanged(i, b3.Q(eventLiveAdapter.mSportRule, market.id) ? eventLiveAdapter.getFakeComboMarketItemsCount(market) : 1);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean G(Outcome outcome) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            if (eventLiveAdapter.appliedOddsFilter == null || !hhy.b(eventLiveAdapter.appliedOddsFilter)) {
                return false;
            }
            float fFloatValue = eventLiveAdapter.appliedOddsFilter.b() != null ? eventLiveAdapter.appliedOddsFilter.b().floatValue() : 0.0f;
            float fFloatValue2 = eventLiveAdapter.appliedOddsFilter.a() != null ? eventLiveAdapter.appliedOddsFilter.a().floatValue() : Float.MAX_VALUE;
            BigDecimal bigDecimal = new BigDecimal(outcome.odds);
            return outcome.isActive == 1 && bigDecimal.compareTo(new BigDecimal((double) fFloatValue)) >= 0 && bigDecimal.compareTo(new BigDecimal((double) fFloatValue2)) <= 0;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void a(String str, d9f0 d9f0Var) {
            EventLiveAdapter.this.setCurrentTeamSelection(str, d9f0Var);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean b() {
            return false;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void c(String str, String str2, int i) {
            EventLiveAdapter.this.setSelectedSpinnerPosition(str, str2, i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final int d(String str, String str2) {
            return EventLiveAdapter.this.getSelectedSpinnerPosition(str, str2);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean e(Selection selection) {
            return iu2.n(selection.a, selection.b, selection.c);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void f(Event event, Market market, z7z z7zVar) {
            if (z7zVar instanceof z7z.b) {
                EventLiveAdapter.this.flashBoostViewTracker.a(apg.b(event, market), brg.LIVE_EVENT_DETAILS);
            }
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final z7z g(Event event, Market market, Outcome outcome) {
            return EventLiveAdapter.this.outcomeBoostResolver.a(event, market, outcome);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean h(Market market, String str) {
            return true;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final Market i(List<Market> list) {
            return EventLiveAdapter.this.resolveFavoriteToggleTarget(list);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void j(View view, boolean z, Selection selection) {
            EventActivity activity = EventLiveAdapter.this.getActivity();
            if (activity == null) {
                return;
            }
            selection.getClass();
            if (z) {
                iym iymVarF1 = activity.F1();
                PageMeta.INSTANCE.getClass();
                iymVarF1.f(AnalyticsEvent.EVENT_DETAIL_ADD_TO_BETSLIP, PageMeta.Companion.a());
            }
            if (iu2.m()) {
                Event event = selection.a;
                Market market = selection.b;
                if (event.isVirtualSoccer()) {
                    return;
                }
                if (!z) {
                    iym iymVarF2 = activity.F1();
                    market.getClass();
                    gym.a(iymVarF2, new nt3(apg.b(event, market)));
                } else {
                    s1p s1pVar = activity.L;
                    if (s1pVar == null) {
                        Intrinsics.n("isLfbBoostEligibleUseCase");
                        throw null;
                    }
                    gym.a(activity.F1(), new y7z(brg.LIVE_EVENT_DETAILS, apg.b(event, market), s1pVar.a(event.eventId, market.status, selection.c)));
                }
            }
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List<List<Outcome>> k(List<List<Outcome>> list, String str, int i) {
            return EventLiveAdapter.this.getSortedOutcomeRows(list, str, i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void l(Market market, s6b s6bVar, int i) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            eventLiveAdapter.updateCounter(eventLiveAdapter.mEvent, market, s6bVar);
            eventLiveAdapter.notifyItemChanged(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean m(Market market) {
            return false;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean n() {
            return false;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void o(Market market) {
            EventActivity activity = EventLiveAdapter.this.getActivity();
            if (activity == null || market == null || TextUtils.isEmpty(market.marketGuide) || TextUtils.isEmpty(market.desc)) {
                return;
            }
            b.a title = new b.a(activity).setTitle(market.desc);
            title.a.f = market.marketGuide;
            title.c(sn5.b(activity, R.string.common_functions__ok, new Object[0]), null);
            title.f();
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final String p(Market market) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            return eventLiveAdapter.getCounter(eventLiveAdapter.mEvent, market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void q(Market market) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            if (eventLiveAdapter.getActivity() == null) {
                return;
            }
            eventLiveAdapter.favoriteMarketToggleListener.a(market, eventLiveAdapter.isFavoriteMarket(market));
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List r(String str, ArrayList arrayList) {
            return EventLiveAdapter.this.getSortedMarkets(arrayList, str);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean s(Market market) {
            return EventLiveAdapter.this.isFakeCollapse(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void t(Market market, int i) {
            EventLiveAdapter eventLiveAdapter = EventLiveAdapter.this;
            EventActivity activity = eventLiveAdapter.getActivity();
            if (activity == null) {
                return;
            }
            eventLiveAdapter.removeCounter(market);
            market.getClass();
            e eVar = activity.E0;
            if (eVar == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar.R1(market);
            eventLiveAdapter.notifyItemChanged(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean u(Market market) {
            return EventLiveAdapter.this.isMarketExpanded(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final mfb0 v() {
            return EventLiveAdapter.this.mSportRule;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean w() {
            return false;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean x(Market market) {
            return EventLiveAdapter.this.isFirstFakeComboMarket(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean y(Market market) {
            return EventLiveAdapter.this.isCollapse(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final Event z() {
            return EventLiveAdapter.this.mEvent;
        }
    }

    public EventLiveAdapter(EventActivity eventActivity, Event event, mfb0 mfb0Var, aah aahVar, Map<String, List<Market>> map, zsu zsuVar, a8z a8zVar, muh muhVar) {
        super(null, zsuVar, mfb0Var);
        this.mTopicSet = new HashSet();
        this.boostMatchList = new ArrayList();
        this.selectedMarketGroupTabPosition = 1;
        this.activityRef = new WeakReference<>(eventActivity);
        this.mEvent = event;
        this.tabMarketsRef = map;
        this.favoriteMarketToggleListener = aahVar;
        this.outcomeBoostResolver = a8zVar;
        this.flashBoostViewTracker = muhVar;
        sub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EventActivity getActivity() {
        EventActivity eventActivity = this.activityRef.get();
        if (eventActivity == null || eventActivity.isFinishing()) {
            return null;
        }
        return eventActivity;
    }

    private void removeMarket(String str) {
        for (int size = getData().size() - 1; size >= 0; size--) {
            c2p item = getItem(size);
            if ((item instanceof fqu) && ((fqu) item).a.id.equals(str)) {
                this.mFavoriteMarketCount--;
                remove(size);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToPosition(int i) {
        EventLiveAdapter eventLiveAdapter;
        EventActivity activity = getActivity();
        if (activity == null || (eventLiveAdapter = activity.w0) == null || eventLiveAdapter.getItemCount() == 0 || i < 0) {
            return;
        }
        EventLiveAdapter eventLiveAdapter2 = activity.w0;
        if (i >= (eventLiveAdapter2 != null ? eventLiveAdapter2.getItemCount() : 0)) {
            return;
        }
        agd0 agd0Var = activity.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.o layoutManager = agd0Var.K.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && i <= linearLayoutManager.f1()) {
            agd0 agd0Var2 = activity.R;
            if (agd0Var2 != null) {
                agd0Var2.K.o0(i);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, c2p c2pVar) {
        if (!(baseViewHolder instanceof ViewHolder) || c2pVar == null) {
            return;
        }
        ((ViewHolder) baseViewHolder).bind(c2pVar);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i) {
        c2p item = getItem(i);
        if (item instanceof qfi0) {
            return ((qfi0) item).a;
        }
        if (!(item instanceof fqu)) {
            return super.getDefItemViewType(i);
        }
        Market market = ((fqu) item).a;
        if (b3.R(market, 1)) {
            return 21;
        }
        if (b3.Q(this.mSportRule, market.id)) {
            return 13;
        }
        if (!this.mSportRule.r(market.id)) {
            if (this.mSportRule.g(market.id)) {
                return 12;
            }
            return (!market.mode.equalsIgnoreCase("slider") || market.parameters.isEmpty()) ? 11 : 16;
        }
        EventActivity activity = getActivity();
        if (activity == null) {
            return 11;
        }
        e eVar = activity.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        ko70 ko70Var = (ko70) ((Map) eVar.V.getValue()).get(market.id);
        if (ko70Var == null) {
            ko70Var = ko70.MODE_BUTTONS;
        }
        int iOrdinal = ko70Var.ordinal();
        if (iOrdinal == 0) {
            return 17;
        }
        if (iOrdinal == 1) {
            return 18;
        }
        throw new IncompatibleClassChangeError();
    }

    @Override // com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter
    public Event getEvent() {
        return this.mEvent;
    }

    public int getFavoriteMarketCount() {
        return this.mFavoriteMarketCount;
    }

    @Override // com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter
    public VisibleMarketViewHolder.a getVisibleMarketViewHolderCallback() {
        VisibleMarketViewHolder.a aVar = this.visibleMarketViewHolderCallback;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.visibleMarketViewHolderCallback = aVar2;
        return aVar2;
    }

    public void hide() {
        notifyDataSetChanged();
    }

    @Override // com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter
    public void onFavoriteMarketStatusUpdated(Market market) {
        toggleFavorite(market);
        if (this.selectedMarketGroupTabPosition == 0) {
            removeMarket(market.id);
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0185 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0006, B:5:0x000c, B:9:0x001c, B:11:0x0028, B:13:0x0037, B:15:0x003c, B:16:0x0054, B:18:0x005a, B:20:0x0083, B:22:0x0093, B:24:0x009d, B:28:0x00a6, B:30:0x00ae, B:32:0x00b5, B:35:0x00ba, B:37:0x00c0, B:38:0x00d2, B:40:0x00d8, B:45:0x00f3, B:47:0x0103, B:51:0x0111, B:62:0x013b, B:63:0x0146, B:65:0x014c, B:67:0x015c, B:69:0x016a, B:76:0x017c, B:80:0x0185, B:81:0x0187, B:52:0x0119, B:56:0x0123, B:83:0x0198, B:42:0x00ea), top: B:87:0x0006, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0194 A[SYNTHETIC] */
    @Override // com.sportybet.ntespm.socket.Subscriber
    public void onReceive(String str) {
        Iterator<Map.Entry<String, List<Market>>> it;
        int i;
        int i2;
        int i3;
        JSONArray jSONArray;
        try {
            lja0 socketData = parseSocketData(str);
            if (socketData == null) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar.n("error when processing socket data: %s", str);
                return;
            }
            if (!TextUtils.equals(this.mEvent.eventId, socketData.a)) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar2.l("ignore unmatched eventId socket data: %s", str);
                return;
            }
            int i4 = 1;
            if (socketData.c != 1) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar3.l("ignore unmatched data type socket data: %s", str);
                return;
            }
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
            aVar4.l("handle socket data: %s", str);
            Iterator<Map.Entry<String, List<Market>>> it2 = this.tabMarketsRef.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, List<Market>> next = it2.next();
                List<Market> value = next.getValue();
                boolean zEquals = next.getKey().equals(this.selectedMarketGroupTabId);
                boolean zEquals2 = TextUtils.equals("odds", socketData.d);
                int size = value.size() - i4;
                int i5 = 0;
                while (true) {
                    if (size < 0) {
                        it = it2;
                        i = 0;
                        i2 = 0;
                        break;
                    }
                    Market market = value.get(size);
                    if (TextUtils.equals(socketData.e, market.id)) {
                        if (market.match(socketData.e, socketData.f)) {
                            int i6 = market.status;
                            int i7 = socketData.b;
                            int i8 = i6 != i7 ? i4 : 0;
                            market.status = i7;
                            if (b3.R(market, i4)) {
                                this.mCollapsed.remove(market);
                            }
                            if (zEquals2 && (jSONArray = socketData.g) != null) {
                                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                    String[] strArrSplit = jSONArray.getString(i9).split("#");
                                    for (Outcome outcome : market.outcomes) {
                                        Iterator<Map.Entry<String, List<Market>>> it3 = it2;
                                        if (outcome.id.equals(strArrSplit[0])) {
                                            try {
                                                outcome.update(jSONArray.getString(i9));
                                            } catch (Exception e) {
                                                itf0.a aVar5 = itf0.a;
                                                aVar5.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                                                aVar5.p(e, "error when processing socket data: %s", str);
                                            }
                                        }
                                        it2 = it3;
                                    }
                                }
                            }
                            it = it2;
                            i = 0;
                            if (!zEquals) {
                                i4 = 1;
                            } else if (i8 != 0) {
                                i4 = 1;
                                refreshFakeComboMarketsData(1);
                                notifyDataSetChanged();
                            } else {
                                i4 = 1;
                                notifyItemChanged(size);
                            }
                            i5 = i4;
                            i2 = i5;
                            break;
                        }
                        i5 = i4;
                    }
                    size--;
                    it2 = it2;
                }
                if (i5 != 0 && i2 == 0 && zEquals && zEquals2) {
                    Market market2 = new Market(socketData.h);
                    int i10 = -1;
                    int i11 = i;
                    while (true) {
                        if (i11 < value.size()) {
                            Market market3 = value.get(i11);
                            if (TextUtils.equals(market3.id, market2.id)) {
                                if (market3.specifier.length() <= market2.specifier.length() && market3.specifier.compareTo(market2.specifier) <= 0) {
                                    i10 = i11;
                                }
                                i3 = i11;
                                if (i11 <= -1) {
                                    if (i3 == -1) {
                                        i3 = i11 + 1;
                                    }
                                    value.add(i3, market2);
                                    setMarkets(value, this.mFavoriteMarketCount, this.appliedOddsFilter);
                                    notifyDataSetChanged();
                                }
                            } else if (i10 > -1) {
                            }
                            i11++;
                        }
                        i11 = i10;
                        i3 = -1;
                        if (i11 <= -1) {
                            if (i3 == -1) {
                                i3 = i11 + 1;
                            }
                            value.add(i3, market2);
                            setMarkets(value, this.mFavoriteMarketCount, this.appliedOddsFilter);
                            notifyDataSetChanged();
                        }
                    }
                }
                it2 = it;
            }
        } catch (Exception e2) {
            itf0.a aVar6 = itf0.a;
            aVar6.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
            aVar6.p(e2, "error when processing socket data: %s", str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onViewRecycled(BaseViewHolder baseViewHolder) {
        super.onViewRecycled(baseViewHolder);
        if (baseViewHolder instanceof ViewHolder) {
            ((ViewHolder) baseViewHolder).onViewRecycled();
        }
    }

    public void setBoostMatch(List<Map<String, String>> list) {
        this.boostMatchList.clear();
        this.boostMatchList.addAll(list);
        notifyDataSetChanged();
    }

    public void setEvent(Event event) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
        aVar.g("on new API data", new Object[0]);
        this.mEvent = event;
        sub();
    }

    public void setMarkets(List<Market> list, int i, rgy rgyVar) {
        ArrayList arrayList = new ArrayList(list);
        this.appliedOddsFilter = rgyVar;
        List<Market> listA = arrayList;
        if (rgyVar != null) {
            listA = vpu.a(arrayList, rgyVar);
        }
        this.mFavoriteMarketCount = i;
        ArrayList arrayList2 = new ArrayList();
        for (Market market : listA) {
            if (market != null) {
                arrayList2.add(new fqu(market));
            }
        }
        arrayList2.add(new qfi0());
        setList(arrayList2);
        refreshFakeComboMarketsData(1);
    }

    public void setSelectedMarketGroupTab(int i, String str) {
        this.selectedMarketGroupTabPosition = i;
        this.selectedMarketGroupTabId = str;
    }

    public void showUseBoost(boolean z, int i) {
        this.mShowUseBoost = z;
    }

    public void sub() {
        unSub();
        Set<Pair<? extends Topic, Subscriber>> set = this.mTopicSet;
        Event event = this.mEvent;
        String str = tva.a;
        set.add(Pair.create(new GroupTopic(event.getMarketStatusTopic(str)), this));
        this.mTopicSet.add(Pair.create(new GroupTopic(this.mEvent.getMarketOddsTopic(str)), this));
        for (Pair<? extends Topic, Subscriber> pair : this.mTopicSet) {
            SocketPushManager.getInstance().subscribeTopic((Topic) pair.first, (Subscriber) pair.second);
        }
    }

    public void unSub() {
        for (Pair<? extends Topic, Subscriber> pair : this.mTopicSet) {
            SocketPushManager.getInstance().unsubscribeTopic((Topic) pair.first, (Subscriber) pair.second);
        }
        this.mTopicSet.clear();
    }

    public void setMarkets(List<Market> list, int i) {
        setMarkets(list, i, null);
    }
}
