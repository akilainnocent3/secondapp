package com.sportybet.plugin.realsports.event;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.event.viewholder.ViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder;
import defpackage.a8z;
import defpackage.aah;
import defpackage.apg;
import defpackage.b3;
import defpackage.bap;
import defpackage.brg;
import defpackage.bsy;
import defpackage.c2p;
import defpackage.d9f0;
import defpackage.e880;
import defpackage.e8z;
import defpackage.f00;
import defpackage.fqu;
import defpackage.gym;
import defpackage.hhy;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iym;
import defpackage.k00;
import defpackage.ko70;
import defpackage.kpu;
import defpackage.ksu;
import defpackage.l48;
import defpackage.lbp;
import defpackage.lja0;
import defpackage.mfb0;
import defpackage.muh;
import defpackage.nt3;
import defpackage.o2g;
import defpackage.of20;
import defpackage.qfi0;
import defpackage.r0b;
import defpackage.r9i;
import defpackage.rgy;
import defpackage.s1p;
import defpackage.s6b;
import defpackage.sg2;
import defpackage.sn5;
import defpackage.tva;
import defpackage.uhc;
import defpackage.vgb0;
import defpackage.vpu;
import defpackage.xpu;
import defpackage.y7z;
import defpackage.y8j;
import defpackage.ypu;
import defpackage.z78;
import defpackage.z7z;
import defpackage.zpu;
import defpackage.zsu;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class PreMatchEventAdapter extends BaseEventDetailMarketListAdapter implements Subscriber {
    private static final int MARKET_TAB_POSITION_FAVORITE = 0;
    private final WeakReference<PreMatchEventActivity> activityRef;
    private rgy appliedOddsFilter;
    private final List<Map<String, String>> boostMatchList;
    private String currentTabId;
    private final aah favoriteMarketToggleListener;
    private final muh flashBoostViewTracker;
    private Long jokerOutcomesAnimationThreshold;
    private final lbp jokerViewTracker;
    private Event mEvent;
    private int mSelectedTabPosition;
    private boolean mShowUseBoost;
    private final Set<Pair<? extends Topic, Subscriber>> mTopicSet;
    private final zpu marketGrouper;
    private final a8z outcomeBoostResolver;
    private boolean showJokerOutcomes;
    private final Map<String, List<Market>> tabMarketsRef;
    private VisibleMarketViewHolder.a visibleMarketViewHolderCallback;

    public class a implements VisibleMarketViewHolder.a {
        public a() {
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean A(Market market) {
            return PreMatchEventAdapter.this.isFavoriteMarket(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean B() {
            return PreMatchEventAdapter.this.mShowUseBoost;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void C(Market market, int i) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            preMatchEventAdapter.expandMarket(market);
            preMatchEventAdapter.notifyItemChanged(i);
            preMatchEventAdapter.scrollToPosition(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List<Map<String, String>> D() {
            return PreMatchEventAdapter.this.boostMatchList;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final d9f0 E(String str) {
            return PreMatchEventAdapter.this.getCurrentTeamSelection(str);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void F(Market market, int i) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            boolean zIsCollapse = preMatchEventAdapter.isCollapse(market);
            Map<Market, Boolean> map = preMatchEventAdapter.mCollapsed;
            if (zIsCollapse) {
                map.put(market, Boolean.FALSE);
            } else {
                map.put(market, Boolean.TRUE);
            }
            preMatchEventAdapter.notifyItemRangeChanged(i, b3.Q(preMatchEventAdapter.mSportRule, market.id) ? preMatchEventAdapter.getFakeComboMarketItemsCount(market) : 1);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean G(Outcome outcome) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            if (preMatchEventAdapter.appliedOddsFilter == null || !hhy.b(preMatchEventAdapter.appliedOddsFilter)) {
                return false;
            }
            float fFloatValue = preMatchEventAdapter.appliedOddsFilter.b() != null ? preMatchEventAdapter.appliedOddsFilter.b().floatValue() : 0.0f;
            float fFloatValue2 = preMatchEventAdapter.appliedOddsFilter.a() != null ? preMatchEventAdapter.appliedOddsFilter.a().floatValue() : Float.MAX_VALUE;
            BigDecimal bigDecimal = new BigDecimal(outcome.odds);
            return outcome.isActive == 1 && bigDecimal.compareTo(new BigDecimal((double) fFloatValue)) >= 0 && bigDecimal.compareTo(new BigDecimal((double) fFloatValue2)) <= 0;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void a(String str, d9f0 d9f0Var) {
            PreMatchEventAdapter.this.setCurrentTeamSelection(str, d9f0Var);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean b() {
            return System.currentTimeMillis() < PreMatchEventAdapter.this.jokerOutcomesAnimationThreshold.longValue();
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void c(String str, String str2, int i) {
            PreMatchEventAdapter.this.setSelectedSpinnerPosition(str, str2, i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final int d(String str, String str2) {
            return PreMatchEventAdapter.this.getSelectedSpinnerPosition(str, str2);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean e(Selection selection) {
            e eVar;
            if (!w()) {
                return iu2.n(selection.a, selection.b, selection.c);
            }
            PreMatchEventActivity activity = PreMatchEventAdapter.this.getActivity();
            return (activity == null || (eVar = activity.L1) == null || !eVar.z1(selection)) ? false : true;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void f(Event event, Market market, z7z z7zVar) {
            if (z7zVar instanceof z7z.b) {
                PreMatchEventAdapter.this.flashBoostViewTracker.a(apg.b(event, market), brg.PRE_MATCH_EVENT_DETAILS);
            }
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final z7z g(Event event, Market market, Outcome outcome) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            return (preMatchEventAdapter.outcomeBoostResolver == null || w()) ? z7z.c.a : preMatchEventAdapter.outcomeBoostResolver.a(event, market, outcome);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean h(Market market, String str) {
            if (!w()) {
                return true;
            }
            PreMatchEventActivity activity = PreMatchEventAdapter.this.getActivity();
            if (activity == null) {
                return false;
            }
            return activity.J1(market, str);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final Market i(List<Market> list) {
            return PreMatchEventAdapter.this.resolveFavoriteToggleTarget(list);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void j(View view, boolean z, Selection selection) {
            PreMatchEventActivity activity = PreMatchEventAdapter.this.getActivity();
            if (activity == null) {
                return;
            }
            view.getClass();
            selection.getClass();
            if (activity.I1()) {
                e eVar = activity.L1;
                if (eVar != null) {
                    eVar.S1(selection, z);
                }
                if (z) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.BET_BUILDER_SELECTION_ADDED);
                    e eVar2 = activity.L1;
                    if (eVar2 != null) {
                        eVar2.O1(new sg2.c(eVar2.E1(), eVar2.D1()));
                    }
                    vgb0.a(AnalyticsEvent.CREATE_YOUR_OWN_SELECTION_ADDED);
                    activity.getFullStoryCommonManager().c(view, AnalyticsParam.BB_CREATE_YOUR_OWN_SELECTION);
                }
            } else {
                if (z) {
                    iym iymVarE1 = activity.E1();
                    PageMeta.INSTANCE.getClass();
                    iymVarE1.f(AnalyticsEvent.EVENT_DETAIL_ADD_TO_BETSLIP, PageMeta.Companion.a());
                    if (selection.q()) {
                        activity.E1().f(AnalyticsEvent.EVENT_PAGE__JOKER_OUTCOME__ADD_TO_BETSLIP, PageMeta.Companion.a());
                        y8j fullStoryCommonManager = activity.getFullStoryCommonManager();
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        fullStoryCommonManager.f(AnalyticsEvent.JOKER_ADD_ODDS, o2gVar);
                    }
                }
                if (iu2.m()) {
                    Event event = selection.a;
                    Market market = selection.b;
                    if (!event.isVirtualSoccer()) {
                        market.getClass();
                        String strB = apg.b(event, market);
                        if (z) {
                            s1p s1pVar = activity.K;
                            if (s1pVar == null) {
                                Intrinsics.n("isLfbBoostEligibleUseCase");
                                throw null;
                            }
                            gym.a(activity.E1(), new y7z(brg.PRE_MATCH_EVENT_DETAILS, strB, s1pVar.a(event.eventId, market.status, selection.c)));
                        } else {
                            gym.a(activity.E1(), new nt3(strB));
                        }
                    }
                }
            }
            of20 of20Var = activity.R0;
            if (z) {
                if (of20Var != null) {
                    of20Var.z1(selection);
                }
            } else if (of20Var != null) {
                of20Var.C.a(selection);
            }
            bsy bsyVar = activity.N1;
            if (bsyVar != null) {
                bsyVar.G1(selection, z, e8z.e);
            }
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List<List<Outcome>> k(List<List<Outcome>> list, String str, int i) {
            return PreMatchEventAdapter.this.getSortedOutcomeRows(list, str, i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void l(Market market, s6b s6bVar, int i) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            preMatchEventAdapter.updateCounter(preMatchEventAdapter.mEvent, market, s6bVar);
            preMatchEventAdapter.notifyItemChanged(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean m(Market market) {
            return market.showBoreDrawLabel(Objects.equals(PreMatchEventAdapter.this.mEvent.sport.id, "sr:sport:1"));
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean n() {
            return PreMatchEventAdapter.this.showJokerOutcomes;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void o(Market market) {
            PreMatchEventActivity activity = PreMatchEventAdapter.this.getActivity();
            if (activity == null || market == null || TextUtils.isEmpty(market.marketGuide) || TextUtils.isEmpty(market.desc)) {
                return;
            }
            TextView textView = new TextView(activity);
            textView.setText(market.desc);
            textView.setPadding(r0b.a(activity, 24), r0b.a(activity, 24), r0b.a(activity, 24), 0);
            textView.setTextAppearance(R.style.H3_M);
            textView.setTextColor(activity.getColor(R.color.text_primary));
            TextView textView2 = new TextView(activity);
            textView2.setText(market.marketGuide);
            textView2.setPadding(r0b.a(activity, 24), r0b.a(activity, 16), r0b.a(activity, 24), r0b.a(activity, 20));
            textView2.setTextAppearance(R.style.B1_R);
            textView2.setLineSpacing(0.0f, 1.5f);
            textView2.setTextColor(activity.getColor(R.color.text_primary));
            b.a aVar = new b.a(activity);
            aVar.a.e = textView;
            b.a view = aVar.setView(textView2);
            view.c(sn5.b(activity, R.string.common_functions__ok, new Object[0]), null);
            view.f();
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final String p(Market market) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            return preMatchEventAdapter.getCounter(preMatchEventAdapter.mEvent, market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void q(Market market) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            if (preMatchEventAdapter.getActivity() == null) {
                return;
            }
            preMatchEventAdapter.favoriteMarketToggleListener.a(market, preMatchEventAdapter.isFavoriteMarket(market));
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final List r(String str, ArrayList arrayList) {
            return PreMatchEventAdapter.this.getSortedMarkets(arrayList, str);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean s(Market market) {
            return PreMatchEventAdapter.this.isFakeCollapse(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final void t(Market market, int i) {
            PreMatchEventAdapter preMatchEventAdapter = PreMatchEventAdapter.this;
            PreMatchEventActivity activity = preMatchEventAdapter.getActivity();
            if (activity == null) {
                return;
            }
            preMatchEventAdapter.removeCounter(market);
            market.getClass();
            e eVar = activity.L1;
            if (eVar != null) {
                eVar.R1(market);
            }
            preMatchEventAdapter.notifyItemChanged(i);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean u(Market market) {
            return PreMatchEventAdapter.this.isMarketExpanded(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final mfb0 v() {
            return PreMatchEventAdapter.this.mSportRule;
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean w() {
            PreMatchEventActivity activity = PreMatchEventAdapter.this.getActivity();
            if (activity == null) {
                return false;
            }
            return activity.I1();
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean x(Market market) {
            return PreMatchEventAdapter.this.isFirstFakeComboMarket(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final boolean y(Market market) {
            return PreMatchEventAdapter.this.isCollapse(market);
        }

        @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder.a
        public final Event z() {
            return PreMatchEventAdapter.this.mEvent;
        }
    }

    public PreMatchEventAdapter(PreMatchEventActivity preMatchEventActivity, Event event, Map<String, List<Market>> map, mfb0 mfb0Var, aah aahVar, zsu zsuVar, a8z a8zVar, muh muhVar, lbp lbpVar) {
        super(null, zsuVar, mfb0Var);
        this.boostMatchList = new ArrayList();
        this.jokerOutcomesAnimationThreshold = 0L;
        this.mTopicSet = new HashSet();
        this.marketGrouper = new zpu();
        this.activityRef = new WeakReference<>(preMatchEventActivity);
        this.mEvent = event;
        this.favoriteMarketToggleListener = aahVar;
        this.tabMarketsRef = map;
        this.outcomeBoostResolver = a8zVar;
        this.flashBoostViewTracker = muhVar;
        this.jokerViewTracker = lbpVar;
        this.appliedOddsFilter = hhy.a().get(0);
        sub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PreMatchEventActivity getActivity() {
        PreMatchEventActivity preMatchEventActivity = this.activityRef.get();
        if (preMatchEventActivity == null || preMatchEventActivity.isFinishing()) {
            return null;
        }
        return preMatchEventActivity;
    }

    private void removeMarket(String str) {
        boolean zEquals;
        for (int size = getData().size() - 1; size >= 0; size--) {
            c2p item = getItem(size);
            if (!(item instanceof fqu)) {
                if (!(item instanceof z78)) {
                    zEquals = false;
                    break;
                }
                Iterator<Market> it = ((z78) item).b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().id.equals(str)) {
                            zEquals = true;
                            break;
                        }
                    } else {
                        zEquals = false;
                        break;
                    }
                }
            } else {
                zEquals = ((fqu) item).a.id.equals(str);
            }
            if (zEquals) {
                remove(size);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToPosition(int i) {
        PreMatchEventActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.R1(i, 0);
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
        ko70 ko70Var;
        c2p item = getItem(i);
        if (item instanceof qfi0) {
            return ((qfi0) item).a;
        }
        if (item instanceof z78) {
            Market market = ((z78) item).b.get(0);
            if (this.mSportRule.q(market.id)) {
                return 15;
            }
            return this.mSportRule.z(market.id) ? 14 : 21;
        }
        if (!(item instanceof fqu)) {
            return super.getDefItemViewType(i);
        }
        Market market2 = ((fqu) item).a;
        if (b3.R(market2, 3) || market2.isInactivePreMatchSportingRisk()) {
            return 21;
        }
        if (b3.Q(this.mSportRule, market2.id)) {
            return 13;
        }
        if (!this.mSportRule.r(market2.id)) {
            if (this.mSportRule.g(market2.id)) {
                return 12;
            }
            return (!market2.mode.equalsIgnoreCase("slider") || market2.parameters.isEmpty()) ? 11 : 16;
        }
        PreMatchEventActivity activity = getActivity();
        if (activity == null) {
            return 11;
        }
        e eVar = activity.L1;
        if (eVar != null) {
            ko70Var = (ko70) ((Map) eVar.V.getValue()).get(market2.id);
            if (ko70Var == null) {
                ko70Var = ko70.MODE_BUTTONS;
            }
        } else {
            ko70Var = null;
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
        if (this.mSelectedTabPosition == 0) {
            removeMarket(market.id);
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:81:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x018f A[Catch: Exception -> 0x0025, TryCatch #1 {Exception -> 0x0025, blocks: (B:3:0x0006, B:5:0x001a, B:9:0x0028, B:11:0x0034, B:13:0x0041, B:16:0x0048, B:17:0x005e, B:19:0x0064, B:21:0x008d, B:23:0x009d, B:25:0x00a7, B:29:0x00b0, B:31:0x00b9, B:35:0x00c6, B:38:0x00cb, B:40:0x00d3, B:41:0x00e5, B:43:0x00eb, B:48:0x0108, B:50:0x0116, B:54:0x0123, B:55:0x012b, B:64:0x0145, B:65:0x0150, B:67:0x0156, B:69:0x0166, B:71:0x0174, B:78:0x0186, B:82:0x018f, B:83:0x0191, B:33:0x00bf, B:58:0x0132, B:45:0x00fd), top: B:89:0x0006, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0 A[SYNTHETIC] */
    @Override // com.sportybet.ntespm.socket.Subscriber
    public void onReceive(String str) {
        int i;
        boolean z;
        int i2;
        try {
            lja0 socketData = parseSocketData(str);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
            aVar.n("socket market data %s", socketData);
            if (socketData == null) {
                aVar.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
                aVar.n("error when processing socket data: %s", str);
                return;
            }
            if (!TextUtils.equals(this.mEvent.eventId, socketData.a)) {
                aVar.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
                aVar.l("ignore unmatched eventId socket data: %s", str);
                return;
            }
            int i3 = 1;
            if (socketData.c == 1) {
                return;
            }
            aVar.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
            aVar.l("handle socket data: %s", str);
            for (Map.Entry<String, List<Market>> entry : this.tabMarketsRef.entrySet()) {
                List<Market> value = entry.getValue();
                boolean zEquals = entry.getKey().equals(this.currentTabId);
                boolean zEquals2 = TextUtils.equals("odds", socketData.d);
                int size = value.size() - i3;
                boolean z2 = false;
                while (true) {
                    if (size < 0) {
                        i = 0;
                        z = false;
                        break;
                    }
                    Market market = value.get(size);
                    if (TextUtils.equals(socketData.e, market.id)) {
                        if (market.match(socketData.e, socketData.f)) {
                            int i4 = market.status;
                            int i5 = socketData.b;
                            int i6 = i4 != i5 ? i3 : 0;
                            market.status = i5;
                            if (b3.R(market, 3) || market.isInactivePreMatchSportingRisk()) {
                                this.mCollapsed.remove(market);
                            }
                            if (zEquals2 && socketData.g != null) {
                                for (int i7 = 0; i7 < socketData.g.length(); i7++) {
                                    String[] strArrSplit = socketData.g.getString(i7).split("#");
                                    for (Outcome outcome : market.outcomes) {
                                        if (outcome.id.equals(strArrSplit[0])) {
                                            try {
                                                outcome.update(socketData.g.getString(i7));
                                            } catch (Exception e) {
                                                itf0.a aVar2 = itf0.a;
                                                aVar2.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
                                                aVar2.p(e, "error when processing socket data: %s", str);
                                            }
                                        }
                                    }
                                }
                            }
                            i = 0;
                            if (zEquals) {
                                if (i6 != 0) {
                                    refreshFakeComboMarketsData(3);
                                    notifyDataSetChanged();
                                } else {
                                    notifyItemChanged(size);
                                }
                            }
                            z2 = true;
                            z = true;
                            break;
                        }
                        z2 = true;
                    }
                    size--;
                    i3 = 1;
                }
                if (z2 && !z && zEquals && zEquals2) {
                    Market market2 = new Market(socketData.h);
                    int i8 = -1;
                    int i9 = i;
                    while (true) {
                        if (i9 < value.size()) {
                            Market market3 = value.get(i9);
                            if (TextUtils.equals(market3.id, market2.id)) {
                                if (market3.specifier.length() <= market2.specifier.length() && market3.specifier.compareTo(market2.specifier) <= 0) {
                                    i8 = i9;
                                }
                                i2 = i9;
                                if (i9 <= -1) {
                                    if (i2 == -1) {
                                        i2 = i9 + 1;
                                    }
                                    value.add(i2, market2);
                                    setMarkets(value, this.mSelectedTabPosition, this.currentTabId, this.appliedOddsFilter);
                                    notifyDataSetChanged();
                                }
                            } else if (i8 > -1) {
                            }
                            i9++;
                        }
                        i9 = i8;
                        i2 = -1;
                        if (i9 <= -1) {
                            if (i2 == -1) {
                                i2 = i9 + 1;
                            }
                            value.add(i2, market2);
                            setMarkets(value, this.mSelectedTabPosition, this.currentTabId, this.appliedOddsFilter);
                            notifyDataSetChanged();
                        }
                    }
                }
                i3 = 1;
            }
        } catch (Exception e2) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_PREMATCH_EVENT_ADAPTER);
            aVar3.p(e2, "error when processing socket data: %s", str);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.f
    public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
        if (baseViewHolder instanceof VisibleMarketViewHolder) {
            VisibleMarketViewHolder visibleMarketViewHolder = (VisibleMarketViewHolder) baseViewHolder;
            if (this.showJokerOutcomes && visibleMarketViewHolder.getMarket() != null && visibleMarketViewHolder.getMarket().hasJokerOutcome()) {
                lbp lbpVar = this.jokerViewTracker;
                if (lbpVar.c) {
                    return;
                }
                lbpVar.a.a(new bap(0), k00.d);
                lbpVar.c = true;
            }
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
        this.mEvent = event;
        sub();
    }

    public void setMarkets(List<Market> list, int i, String str, rgy rgyVar) {
        Object z78Var;
        Object fquVar;
        UiText stringUiText;
        List<String> list2;
        zpu.a bVar;
        ArrayList arrayList = new ArrayList(list);
        this.appliedOddsFilter = rgyVar;
        List listA = arrayList;
        if (rgyVar != null) {
            listA = vpu.a(arrayList, rgyVar);
        }
        this.mSelectedTabPosition = i;
        this.currentTabId = str;
        zpu zpuVar = this.marketGrouper;
        mfb0 mfb0Var = this.mSportRule;
        zpuVar.getClass();
        mfb0Var.getClass();
        ArrayList arrayListR = CollectionsKt.R(listA);
        ArrayList arrayList2 = new ArrayList(l48.r(arrayListR, 10));
        int size = arrayListR.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListR.get(i3);
            i3++;
            Market market = (Market) obj;
            if (mfb0Var.x(market.id)) {
                Map<String, ksu> map = ypu.a;
                String str2 = market.id;
                str2.getClass();
                String str3 = ypu.b.get(str2);
                bVar = str3 == null ? new zpu.a.b(market) : new zpu.a.C1409a(market, str3);
            } else {
                bVar = new zpu.a.b(market);
            }
            arrayList2.add(bVar);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            if (obj2 instanceof zpu.a.C1409a) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            zpu.a.C1409a c1409a = (zpu.a.C1409a) obj3;
            String str4 = c1409a.b;
            Object objA = linkedHashMap.get(str4);
            if (objA == null) {
                objA = r9i.a(str4, linkedHashMap);
            }
            ((List) objA).add(c1409a.a);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList2.size();
        while (i2 < size4) {
            Object obj4 = arrayList2.get(i2);
            i2++;
            zpu.a aVar = (zpu.a) obj4;
            if (aVar instanceof zpu.a.b) {
                fquVar = new fqu(((zpu.a.b) aVar).a);
            } else {
                if (!(aVar instanceof zpu.a.C1409a)) {
                    uhc.a();
                    return;
                }
                String str5 = ((zpu.a.C1409a) aVar).b;
                if (linkedHashSet.add(str5)) {
                    List listR0 = (List) kpu.c(str5, linkedHashMap);
                    Map<String, ksu> map2 = ypu.a;
                    String str6 = ((Market) CollectionsKt.T(listR0)).desc;
                    str6.getClass();
                    Map<String, ksu> map3 = ypu.a;
                    ksu ksuVar = map3.get(str5);
                    if (ksuVar == null || (stringUiText = ksuVar.b) == null) {
                        stringUiText = new StringUiText(str6);
                    }
                    ksu ksuVar2 = map3.get(str5);
                    if (ksuVar2 != null && (list2 = ksuVar2.d) != null) {
                        listR0 = CollectionsKt.r0(listR0, new xpu(list2));
                    }
                    z78Var = new z78(stringUiText, listR0);
                } else {
                    z78Var = null;
                }
                fquVar = z78Var;
            }
            if (fquVar != null) {
                arrayList4.add(fquVar);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.add(new qfi0());
        setList(arrayList5);
        refreshFakeComboMarketsData(3);
    }

    public void showJokerOutcomes(Boolean bool, Boolean bool2) {
        this.showJokerOutcomes = bool.booleanValue();
        if (bool.booleanValue() && bool2.booleanValue()) {
            this.jokerOutcomesAnimationThreshold = Long.valueOf(System.currentTimeMillis() + 1000);
        }
        notifyDataSetChanged();
    }

    public void showUseBoost(boolean z) {
        this.mShowUseBoost = z;
        notifyDataSetChanged();
    }

    public void sub() {
        unSub();
        Set<Pair<? extends Topic, Subscriber>> set = this.mTopicSet;
        Event event = this.mEvent;
        String str = tva.b;
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

    public Selection updateEvents(List<Event> list) {
        List<Market> list2;
        List<Market> list3;
        Market market;
        List<Outcome> list4;
        Selection selection = null;
        if (list != null && !list.isEmpty() && (list2 = this.mEvent.markets) != null && !list2.isEmpty()) {
            boolean z = false;
            for (Event event : list) {
                if (event != null && TextUtils.equals(this.mEvent.eventId, event.eventId) && (list3 = event.markets) != null && !list3.isEmpty() && (list4 = (market = event.markets.get(0)).outcomes) != null && !list4.isEmpty()) {
                    Outcome outcome = market.outcomes.get(0);
                    for (Market market2 : this.mEvent.markets) {
                        if (market2 != null && TextUtils.equals(market.id, market2.id) && TextUtils.equals(market.specifier, market2.specifier)) {
                            market2.status = market.status;
                            for (Outcome outcome2 : market2.outcomes) {
                                if (outcome2 != null && TextUtils.equals(outcome.id, outcome2.id) && TextUtils.equals(outcome.desc, outcome2.desc)) {
                                    outcome2.onSelectionChanged(outcome);
                                    Event event2 = this.mEvent;
                                    iu2.t(event2, market, outcome, iu2.n(event2, market, outcome), true ^ getVisibleMarketViewHolderCallback().w(), null, 16352);
                                    selection = new Selection(this.mEvent, market, outcome);
                                }
                            }
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                notifyDataSetChanged();
            }
        }
        return selection;
    }

    public Selection updateSelection(e880 e880Var) {
        Selection selection = e880Var.a;
        String str = this.mEvent.eventId;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Event event = selection.a;
        Outcome outcome = selection.c;
        Market market = selection.b;
        if (!event.eventId.equals(str)) {
            return null;
        }
        for (Market market2 : this.mEvent.markets) {
            String str2 = market.specifier;
            if (str2 == null && market2.specifier == null) {
                if (market2.id.equals(market.id)) {
                    return new Selection(this.mEvent, market2, market2.getOutcomeById(outcome.id));
                }
            } else if (market2.specifier != null && str2 != null && market2.id.equals(market.id) && market2.specifier.equals(market.specifier)) {
                return new Selection(this.mEvent, market2, market2.getOutcomeById(outcome.id));
            }
        }
        return null;
    }

    public void setMarkets(List<Market> list, int i, String str) {
        setMarkets(list, i, str, null);
    }
}
