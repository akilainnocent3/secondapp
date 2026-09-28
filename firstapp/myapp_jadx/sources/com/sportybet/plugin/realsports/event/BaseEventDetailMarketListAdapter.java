package com.sportybet.plugin.realsports.event;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SliderRangeData;
import com.sportybet.plugin.realsports.event.viewholder.ComboViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.FakeComboViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.InvisibleMarketViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.NoVisibleMarketsViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.ScoreButtonsViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.ScoreCountersViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.SimpleViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.SingleColumnDropdownViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.SliderViewHolder;
import com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder;
import com.sportybet.plugin.realsports.event.widget.SliderMarketPanel;
import defpackage.b3;
import defpackage.c12;
import defpackage.c2p;
import defpackage.d12;
import defpackage.d40;
import defpackage.d9f0;
import defpackage.fqu;
import defpackage.iu2;
import defpackage.ksu;
import defpackage.lja0;
import defpackage.mfb0;
import defpackage.psu;
import defpackage.qsu;
import defpackage.rsu;
import defpackage.s6b;
import defpackage.ssu;
import defpackage.tru;
import defpackage.tsu;
import defpackage.uhc;
import defpackage.usu;
import defpackage.vpi;
import defpackage.vpu;
import defpackage.vsu;
import defpackage.wsu;
import defpackage.xsu;
import defpackage.ypu;
import defpackage.ysu;
import defpackage.zch0;
import defpackage.zsu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseEventDetailMarketListAdapter extends BaseQuickAdapter<c2p, BaseViewHolder> {
    private static final int EVENT_ID_INDEX = 3;
    private static final int MARKET_ID_INDEX = 5;
    private static final int MARKET_SPECIFIER_INDEX = 6;
    private static final int MARKET_STATUS_INDEX = 2;
    private static final int ODDS_DATA_INDEX = 8;
    private static final int PRODUCT_INDEX = 1;
    private static final int TOPICS_INDEX = 0;
    private final Object LOCKER_UPDATE_FOOTER_VIEW;
    private final Set<Integer> displayFavoriteMarketIds;
    private final Set<Integer> favoriteMarketIds;
    private View footerLayout;
    protected final Map<Market, Boolean> mCollapsed;
    protected final Map<Market, String> mCounters;
    protected final Map<Market, Boolean> mExpandedMarkets;
    protected List<Market> mFirstFakeComboMarkets;
    protected mfb0 mSportRule;
    private final Map<String, Map<String, Integer>> marketsSpinnerPositions;
    protected final zsu marketsTeamPlayersSorter;
    private final Map<String, d9f0> marketsTeamSelection;
    private NoVisibleMarketsViewHolder.a noMarketsMessageViewHolderCallback;
    protected Set<String> outcomeInVerticalOrientations;
    private View quickBetBackgroundView;
    private final SliderMarketPanel.b sliderDelegate;

    public class a implements SliderMarketPanel.b {
        public final HashMap<String, SliderRangeData> a = new HashMap<>();
    }

    public BaseEventDetailMarketListAdapter(List<c2p> list, zsu zsuVar, mfb0 mfb0Var) {
        super(-1, list);
        this.outcomeInVerticalOrientations = new HashSet();
        this.mExpandedMarkets = new HashMap();
        this.mCounters = new HashMap();
        this.mFirstFakeComboMarkets = new ArrayList();
        this.mCollapsed = new HashMap();
        this.LOCKER_UPDATE_FOOTER_VIEW = new Object();
        this.favoriteMarketIds = new LinkedHashSet();
        this.displayFavoriteMarketIds = new LinkedHashSet();
        this.marketsTeamSelection = new HashMap();
        this.marketsSpinnerPositions = new HashMap();
        this.sliderDelegate = new a();
        this.marketsTeamPlayersSorter = zsuVar;
        this.mSportRule = mfb0Var;
    }

    private List<Integer> getFavoriteGroupForMarket(int i) {
        Map<String, ksu> map = ypu.a;
        return ypu.a(String.valueOf(i));
    }

    private boolean isVisibleViewType(int i) {
        int itemViewType = getItemViewType(i);
        return itemViewType == 11 || itemViewType == 12 || itemViewType == 13 || itemViewType == 14 || itemViewType == 15 || itemViewType == 16 || itemViewType == 17 || itemViewType == 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$setFooterLayout$1(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$setSelectedSpinnerPosition$0(String str) {
        return new HashMap();
    }

    public void expandMarket(Market market) {
        boolean zContainsKey = this.mExpandedMarkets.containsKey(market);
        Map<Market, Boolean> map = this.mExpandedMarkets;
        if (zContainsKey) {
            map.put(market, Boolean.valueOf(!map.get(market).booleanValue()));
        } else {
            map.put(market, Boolean.TRUE);
        }
    }

    public String getCounter(Event event, Market market) {
        if (this.mCounters.containsKey(market)) {
            return this.mCounters.get(market);
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (Outcome outcome : market.outcomes) {
            if (outcome.isActive != 0) {
                try {
                    String[] strArrSplit = outcome.desc.split(":");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    if (iu2.n(event, market, outcome)) {
                        i2 = i4;
                        i = i3;
                        break;
                    }
                    if (i3 <= i && i4 <= i2) {
                        i2 = i4;
                        i = i3;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        String strA = (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) ? "0:0" : d40.a(i, i2, ":");
        this.mCounters.put(market, strA);
        return strA;
    }

    public d9f0 getCurrentTeamSelection(String str) {
        return this.marketsTeamSelection.getOrDefault(str, d9f0.a);
    }

    public abstract Event getEvent();

    public int getFakeComboMarketItemsCount(Market market) {
        int i;
        if (!b3.Q(this.mSportRule, market.id)) {
            return 1;
        }
        String str = market.id;
        String strO = b3.O(this.mSportRule, market);
        synchronized (this) {
            try {
                i = 0;
                for (c2p c2pVar : getData()) {
                    if (c2pVar instanceof fqu) {
                        Market market2 = ((fqu) c2pVar).a;
                        if (TextUtils.equals(str, market2.id) && TextUtils.equals(strO, b3.O(this.mSportRule, market2))) {
                            i++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public int getSelectedSpinnerPosition(String str, String str2) {
        Map<String, Integer> map = this.marketsSpinnerPositions.get(str);
        if (map == null) {
            return 0;
        }
        return map.getOrDefault(str2, 0).intValue();
    }

    public List<Market> getSortedMarkets(List<Market> list, String str) {
        d9f0 currentTeamSelection = getCurrentTeamSelection(str);
        Event event = getEvent();
        zsu zsuVar = this.marketsTeamPlayersSorter;
        zsuVar.getClass();
        list.getClass();
        currentTeamSelection.getClass();
        event.getClass();
        int iOrdinal = currentTeamSelection.ordinal();
        if (iOrdinal == 0) {
            return CollectionsKt.r0(list, new rsu(zsuVar));
        }
        if (iOrdinal == 1) {
            return CollectionsKt.r0(list, new ssu(new psu(zsuVar, event), zsuVar));
        }
        if (iOrdinal == 2) {
            return CollectionsKt.r0(list, new tsu(new qsu(zsuVar, event), zsuVar));
        }
        uhc.a();
        return null;
    }

    public List<List<Outcome>> getSortedOutcomeRows(List<List<Outcome>> list, String str, int i) {
        d9f0 currentTeamSelection = getCurrentTeamSelection(str);
        Event event = getEvent();
        zsu zsuVar = this.marketsTeamPlayersSorter;
        zsuVar.getClass();
        list.getClass();
        currentTeamSelection.getClass();
        event.getClass();
        int iOrdinal = currentTeamSelection.ordinal();
        if (iOrdinal == 0) {
            return CollectionsKt.r0(list, new wsu(zsuVar, i));
        }
        if (iOrdinal == 1) {
            return CollectionsKt.r0(list, new xsu(new usu(zsuVar, event), zsuVar, i));
        }
        if (iOrdinal == 2) {
            return CollectionsKt.r0(list, new ysu(new vsu(zsuVar, event), zsuVar, i));
        }
        uhc.a();
        return null;
    }

    public abstract VisibleMarketViewHolder.a getVisibleMarketViewHolderCallback();

    public boolean hasVisibleMarkets() {
        for (int i = 0; i < getData().size(); i++) {
            if (isVisibleViewType(i)) {
                return true;
            }
        }
        return false;
    }

    public void hideFooterQuickBetViewBackground() {
        synchronized (this.LOCKER_UPDATE_FOOTER_VIEW) {
            try {
                View view = this.quickBetBackgroundView;
                if (view != null) {
                    removeFooterView(view);
                    this.quickBetBackgroundView = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void highlightMarket(Market market) {
        this.mCollapsed.put(market, Boolean.FALSE);
        for (c2p c2pVar : getData()) {
            if (c2pVar instanceof fqu) {
                Market market2 = ((fqu) c2pVar).a;
                if (!isSameMarket(market, market2) && (!b3.Q(this.mSportRule, market2.id) || isFirstFakeComboMarket(market2))) {
                    this.mCollapsed.put(market2, Boolean.TRUE);
                }
            }
        }
        notifyDataSetChanged();
    }

    public boolean isCollapse(Market market) {
        return Boolean.TRUE.equals(this.mCollapsed.getOrDefault(market, Boolean.FALSE)) || isDefaultCollapse(market);
    }

    public boolean isDefaultCollapse(Market market) {
        return (this.mCollapsed.containsKey(market) || this.mSportRule.g(market.id) || market.outcomes.size() <= 4) ? false : true;
    }

    public boolean isFakeCollapse(Market market) {
        for (Market market2 : this.mFirstFakeComboMarkets) {
            if (isSameMarket(market, market2)) {
                return isCollapse(market2);
            }
        }
        return false;
    }

    public boolean isFavoriteMarket(Market market) {
        return this.displayFavoriteMarketIds.contains(Integer.valueOf(Integer.parseInt(market.id)));
    }

    public boolean isFirstFakeComboMarket(Market market) {
        return this.mFirstFakeComboMarkets.contains(market);
    }

    public boolean isMarketExpanded(Market market) {
        return this.mExpandedMarkets.containsKey(market) && this.mExpandedMarkets.get(market).booleanValue();
    }

    public boolean isSameMarket(Market market, Market market2) {
        if (!TextUtils.equals(market.id, market2.id)) {
            return false;
        }
        if (tru.c.contains(market.id)) {
            return tru.g(market.id, market.specifier) == tru.g(market2.id, market2.specifier);
        }
        if (this.mSportRule.o(market.id) || this.mSportRule.i(market.id)) {
            return TextUtils.equals(market.desc, market2.desc);
        }
        return true;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        if (i == 21) {
            return new InvisibleMarketViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_gone));
        }
        if (i == 31) {
            return new NoVisibleMarketsViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_empty), this.noMarketsMessageViewHolderCallback);
        }
        switch (i) {
            case 11:
                return new SimpleViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_simple_new), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            case 12:
                return new ComboViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_simple_new), getVisibleMarketViewHolderCallback());
            case 13:
                return new FakeComboViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_fake_combo_item), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            case 14:
                return new PlayerThreeColumnViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_player_three_column_container), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            case 15:
                return new SingleColumnDropdownViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_single_column_dropdown_container), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            case 16:
                return new SliderViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_slider_item), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations, this.sliderDelegate);
            case 17:
                return new ScoreButtonsViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_score_buttons_item), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            case 18:
                return new ScoreCountersViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.spr_event_score_counters_item), getVisibleMarketViewHolderCallback(), this.outcomeInVerticalOrientations);
            default:
                return super.onCreateDefViewHolder(viewGroup, i);
        }
    }

    public abstract void onFavoriteMarketStatusUpdated(Market market);

    public lja0 parseSocketData(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            String[] strArrSplit = jSONArray.getString(0).split("\\^");
            String str2 = strArrSplit[3];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String str4 = strArrSplit[5];
            String str5 = strArrSplit[6];
            return new lja0(str2, Integer.parseInt(jSONArray.getString(2)), Integer.parseInt(jSONArray.getString(1)), str3, str4, str5, jSONArray.optJSONArray(8), jSONArray);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void refreshFakeComboMarketsData(int i) {
        if (getData().isEmpty()) {
            return;
        }
        synchronized (this) {
            this.mFirstFakeComboMarkets = b3.L(this.mSportRule, getData(), i);
        }
    }

    public void removeCounter(Market market) {
        this.mCounters.remove(market);
    }

    public Market resolveFavoriteToggleTarget(List<Market> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Market market : list) {
            if (this.favoriteMarketIds.contains(Integer.valueOf(Integer.parseInt(market.id)))) {
                return market;
            }
        }
        return list.get(0);
    }

    public void setCallback(NoVisibleMarketsViewHolder.a aVar) {
        this.noMarketsMessageViewHolderCallback = aVar;
    }

    public void setCurrentTeamSelection(String str, d9f0 d9f0Var) {
        this.marketsTeamSelection.put(str, d9f0Var);
    }

    public void setFavoriteMarketIds(List<Integer> list) {
        this.favoriteMarketIds.clear();
        this.displayFavoriteMarketIds.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.favoriteMarketIds.addAll(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.displayFavoriteMarketIds.addAll(getFavoriteGroupForMarket(it.next().intValue()));
        }
    }

    public void setFooterLayout(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        synchronized (this.LOCKER_UPDATE_FOOTER_VIEW) {
            try {
                View view = this.footerLayout;
                if (view != null) {
                    removeFooterView(view);
                    this.footerLayout = null;
                }
                ComposeView composeViewA = vpi.a(viewGroup, new c12(onClickListener, 0));
                this.footerLayout = composeViewA;
                addFooterView(composeViewA, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = zch0.a(viewGroup.getContext(), 8);
                this.footerLayout.setLayoutParams(layoutParams);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSelectedSpinnerPosition(String str, String str2, int i) {
        this.marketsSpinnerPositions.computeIfAbsent(str, new d12()).put(str2, Integer.valueOf(i));
    }

    public void showFooterQuickBetViewBackground(Context context, int i) {
        synchronized (this.LOCKER_UPDATE_FOOTER_VIEW) {
            try {
                if (this.quickBetBackgroundView == null) {
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_footer_for_quickbetview, (ViewGroup) null);
                    this.quickBetBackgroundView = viewInflate;
                    addFooterView(viewInflate);
                }
                View viewFindViewById = this.quickBetBackgroundView.findViewById(R.id.remain_space);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = i;
                viewFindViewById.setLayoutParams(layoutParams);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean toggleFavorite(Market market) {
        List<Integer> favoriteGroupForMarket = getFavoriteGroupForMarket(Integer.parseInt(market.id));
        for (Integer num : favoriteGroupForMarket) {
            num.intValue();
            if (this.displayFavoriteMarketIds.contains(num)) {
                for (Integer num2 : favoriteGroupForMarket) {
                    num2.intValue();
                    this.displayFavoriteMarketIds.remove(num2);
                }
                return false;
            }
        }
        this.displayFavoriteMarketIds.addAll(favoriteGroupForMarket);
        return true;
    }

    public void updateCounter(Event event, Market market, s6b s6bVar) {
        String[] strArrSplit = getCounter(event, market).split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        Set<Integer> setE = vpu.e(market, true, i2);
        Set<Integer> setE2 = vpu.e(market, false, i);
        int iOrdinal = s6bVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3 && i2 > ((Integer) Collections.min(setE2)).intValue()) {
                        i2--;
                    }
                } else if (i2 < ((Integer) Collections.max(setE2)).intValue()) {
                    i2++;
                }
            } else if (i > ((Integer) Collections.min(setE)).intValue()) {
                i--;
            }
        } else if (i < ((Integer) Collections.max(setE)).intValue()) {
            i++;
        }
        this.mCounters.put(market, i + ":" + i2);
    }
}
