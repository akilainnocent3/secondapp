package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a4h;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.d9f0;
import defpackage.djd0;
import defpackage.ejd0;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.j5j;
import defpackage.ksu;
import defpackage.l5j;
import defpackage.m2g;
import defpackage.m5j;
import defpackage.mgx;
import defpackage.n5j;
import defpackage.p48;
import defpackage.p5j;
import defpackage.q680;
import defpackage.r9i;
import defpackage.sn5;
import defpackage.ttr;
import defpackage.tx5;
import defpackage.u6i0;
import defpackage.uf00;
import defpackage.ypu;
import defpackage.z78;
import defpackage.za90;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0001IB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J)\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001f\u001a\u00020\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0012J;\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0014¢\u0006\u0004\b.\u0010\u0012R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010;\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010:R\u001b\u0010A\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010:R\u001b\u0010D\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010:R\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/sportybet/plugin/realsports/event/viewholder/PlayerThreeColumnViewHolder;", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder;", "Landroid/view/View;", "itemView", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;", "callback", "", "", "outcomesInVerticalOrientations", "<init>", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;Ljava/util/Set;)V", "", "Lcom/sportybet/plugin/realsports/data/Market;", "markets", "", "setupTitleAndFavourite", "(Ljava/util/List;)V", "setupTeamSelector", "()V", "updateTeamSelectorDropdown", "refreshPlayerList", "updateCollapsedUI", "", "columnCount", "updateActiveColumnWidth", "(I)V", "renderHeaders", "Lcom/sportybet/plugin/realsports/data/Outcome;", "extractOutcomeRows", "(Ljava/util/List;)Ljava/util/List;", "rows", "renderRows", "(Ljava/util/List;Ljava/util/List;)V", "setupShowMoreButton", "onShowMoreClick", "Lejd0;", "rowBinding", "outcomes", "Lcom/sportybet/plugin/realsports/data/Event;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "bindRow", "(Lejd0;Ljava/util/List;Ljava/util/List;Lcom/sportybet/plugin/realsports/data/Event;)V", "desc", "Lcom/sportybet/plugin/realsports/event/viewholder/PlayerThreeColumnViewHolder$a;", "parsePlayerInfo", "(Ljava/lang/String;)Lcom/sportybet/plugin/realsports/event/viewholder/PlayerThreeColumnViewHolder$a;", "onBindView", "Ldjd0;", "binding", "Ldjd0;", "Landroid/view/LayoutInflater;", "inflater$delegate", "Lttr;", "getInflater", "()Landroid/view/LayoutInflater;", "inflater", "columnWidthPx$delegate", "getColumnWidthPx", "()I", "columnWidthPx", "columnHeightPx$delegate", "getColumnHeightPx", "columnHeightPx", "columnGapPx$delegate", "getColumnGapPx", "columnGapPx", "totalColumnsWidthPx$delegate", "getTotalColumnsWidthPx", "totalColumnsWidthPx", "activeColumnWidthPx", "I", "combinedMarketsOutcomes", "Ljava/util/List;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayerThreeColumnViewHolder extends VisibleMarketViewHolder {
    public static final int $stable = 8;
    private int activeColumnWidthPx;
    private final djd0 binding;

    /* JADX INFO: renamed from: columnGapPx$delegate, reason: from kotlin metadata */
    private final ttr columnGapPx;

    /* JADX INFO: renamed from: columnHeightPx$delegate, reason: from kotlin metadata */
    private final ttr columnHeightPx;

    /* JADX INFO: renamed from: columnWidthPx$delegate, reason: from kotlin metadata */
    private final ttr columnWidthPx;
    private List<? extends List<? extends Outcome>> combinedMarketsOutcomes;

    /* JADX INFO: renamed from: inflater$delegate, reason: from kotlin metadata */
    private final ttr inflater;

    /* JADX INFO: renamed from: totalColumnsWidthPx$delegate, reason: from kotlin metadata */
    private final ttr totalColumnsWidthPx;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("PlayerInfo(playerName=", this.a, ", teamName=", this.b, ")");
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ PlayerThreeColumnViewHolder b;

        public b(cq40 cq40Var, PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
            this.a = cq40Var;
            this.b = playerThreeColumnViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            PlayerThreeColumnViewHolder playerThreeColumnViewHolder = this.b;
            Market marketI = playerThreeColumnViewHolder.callback.i(playerThreeColumnViewHolder.combinedMarkets.b);
            if (marketI != null) {
                playerThreeColumnViewHolder.callback.q(marketI);
            }
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ PlayerThreeColumnViewHolder b;

        public c(cq40 cq40Var, PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
            this.a = cq40Var;
            this.b = playerThreeColumnViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            PlayerThreeColumnViewHolder playerThreeColumnViewHolder = this.b;
            Market market = (Market) CollectionsKt.firstOrNull(playerThreeColumnViewHolder.combinedMarkets.b);
            if (market != null) {
                playerThreeColumnViewHolder.callback.o(market);
            }
        }
    }

    public static final class d implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ PlayerThreeColumnViewHolder b;

        public d(cq40 cq40Var, PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
            this.a = cq40Var;
            this.b = playerThreeColumnViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            this.b.openOddsBoostPage();
        }
    }

    public static final class e implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ PlayerThreeColumnViewHolder b;

        public e(cq40 cq40Var, PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
            this.a = cq40Var;
            this.b = playerThreeColumnViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            PlayerThreeColumnViewHolder playerThreeColumnViewHolder = this.b;
            Iterator<T> it = playerThreeColumnViewHolder.combinedMarkets.b.iterator();
            while (it.hasNext()) {
                playerThreeColumnViewHolder.callback.F((Market) it.next(), playerThreeColumnViewHolder.getBindingAdapterPosition());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerThreeColumnViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
        super(view, aVar, set);
        view.getClass();
        aVar.getClass();
        set.getClass();
        int i = R.id.boost_sign;
        ImageView imageView = (ImageView) h5e.a(R.id.boost_sign, view);
        if (imageView != null) {
            i = R.id.combinedMarketContainer;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.combinedMarketContainer, view);
            if (linearLayout != null) {
                i = R.id.fav;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.fav, view);
                if (imageButton != null) {
                    i = R.id.headerColumns;
                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.headerColumns, view);
                    if (linearLayout2 != null) {
                        i = R.id.headers;
                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.headers, view);
                        if (linearLayout3 != null) {
                            i = R.id.info;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.info, view);
                            if (appCompatImageView != null) {
                                i = R.id.showMoreButton;
                                ComposeView composeView = (ComposeView) h5e.a(R.id.showMoreButton, view);
                                if (composeView != null) {
                                    i = R.id.teamSelectorCompose;
                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.teamSelectorCompose, view);
                                    if (composeView2 != null) {
                                        i = R.id.title;
                                        TextView textView = (TextView) h5e.a(R.id.title, view);
                                        if (textView != null) {
                                            this.binding = new djd0((ConstraintLayout) view, imageView, linearLayout, imageButton, linearLayout2, linearLayout3, appCompatImageView, composeView, composeView2, textView);
                                            int i2 = 2;
                                            this.inflater = hwr.b(new j5j(this, i2));
                                            this.columnWidthPx = hwr.b(new mgx(this, 1));
                                            this.columnHeightPx = hwr.b(new l5j(this, i2));
                                            this.columnGapPx = hwr.b(new m5j(this, i2));
                                            this.totalColumnsWidthPx = hwr.b(new n5j(this, i2));
                                            this.combinedMarketsOutcomes = m2g.a;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    private final void bindRow(ejd0 rowBinding, List<? extends Outcome> outcomes, List<? extends Market> markets, Event event) {
        String str = ((Outcome) CollectionsKt.T(outcomes)).desc;
        str.getClass();
        a playerInfo = parsePlayerInfo(str);
        rowBinding.c.setText(playerInfo.a);
        rowBinding.d.setText(playerInfo.b);
        LinearLayout linearLayout = rowBinding.b;
        linearLayout.removeAllViews();
        int i = 0;
        for (Object obj : markets) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            Market market = (Market) obj;
            Outcome outcome = (Outcome) CollectionsKt.V(i, outcomes);
            Context context = this.ctx;
            context.getClass();
            final OutcomeButton outcomeButton = new OutcomeButton(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.activeColumnWidthPx, getColumnHeightPx());
            layoutParams.setMarginEnd(i == markets.size() + (-1) ? 0 : getColumnGapPx());
            outcomeButton.setLayoutParams(layoutParams);
            stylizeOutcomeButton(outcomeButton, this.layoutConfig, event, this.sportRule, market, outcome, false, new View.OnClickListener() { // from class: lq10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.onOutcomeButtonClick(outcomeButton);
                }
            });
            linearLayout.addView(outcomeButton);
            i = i2;
        }
        LinearLayout linearLayout2 = rowBinding.a;
        linearLayout2.getClass();
        linearLayout2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int columnGapPx_delegate$lambda$0(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        return zch0.a(playerThreeColumnViewHolder.ctx, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int columnHeightPx_delegate$lambda$0(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        return zch0.a(playerThreeColumnViewHolder.ctx, 34);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int columnWidthPx_delegate$lambda$0(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        return zch0.a(playerThreeColumnViewHolder.ctx, 53);
    }

    private final List<List<Outcome>> extractOutcomeRows(List<? extends Market> markets) {
        String str;
        List<Market> list;
        Market market;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = markets.iterator();
        while (it.hasNext()) {
            List<Outcome> list2 = ((Market) it.next()).outcomes;
            list2.getClass();
            p48.w(list2, arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((Outcome) obj).id;
            Object objA = linkedHashMap.get(str2);
            if (objA == null) {
                objA = r9i.a(str2, linkedHashMap);
            }
            ((List) objA).add(obj);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            List list3 = (List) obj2;
            if (list3 == null || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((Outcome) it2.next()).isActive != 0) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        List<List<Outcome>> listA0 = CollectionsKt.A0(arrayList2);
        z78 z78Var = this.combinedMarkets;
        if (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null || (str = market.id) == null) {
            str = "";
        }
        List<List<Outcome>> listK = this.callback.k(listA0, str, markets.size());
        listK.getClass();
        return listK;
    }

    private final int getColumnGapPx() {
        return ((Number) this.columnGapPx.getValue()).intValue();
    }

    private final int getColumnHeightPx() {
        return ((Number) this.columnHeightPx.getValue()).intValue();
    }

    private final int getColumnWidthPx() {
        return ((Number) this.columnWidthPx.getValue()).intValue();
    }

    private final LayoutInflater getInflater() {
        Object value = this.inflater.getValue();
        value.getClass();
        return (LayoutInflater) value;
    }

    private final int getTotalColumnsWidthPx() {
        return ((Number) this.totalColumnsWidthPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater inflater_delegate$lambda$0(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        return LayoutInflater.from(playerThreeColumnViewHolder.ctx);
    }

    private final void onShowMoreClick() {
        List<Market> list;
        List<Market> list2;
        z78 z78Var = this.combinedMarkets;
        Market market = (z78Var == null || (list2 = z78Var.b) == null) ? null : (Market) CollectionsKt.firstOrNull(list2);
        if (market != null) {
            this.callback.C(market, getBindingAdapterPosition());
        }
        z78 z78Var2 = this.combinedMarkets;
        if (z78Var2 == null || (list = z78Var2.b) == null) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.callback.y((Market) it.next())) {
                    return;
                }
            }
        }
        updateTeamSelectorDropdown();
        renderRows((market == null || !this.callback.u(market)) ? CollectionsKt.t0(this.combinedMarketsOutcomes, 4) : this.combinedMarketsOutcomes, list);
        setupShowMoreButton();
    }

    private final a parsePlayerInfo(String desc) {
        return new a(StringsKt.t0(StringsKt.o0(desc, "(")).toString(), StringsKt.t0(StringsKt.o0(StringsKt.k0(desc, "(", desc), ")")).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final void refreshPlayerList() {
        List<Market> list;
        String str;
        List<Market> list2;
        Market market;
        List<Market> list3;
        z78 z78Var = this.combinedMarkets;
        if (z78Var == null || (list = z78Var.b) == null) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.callback.y((Market) it.next())) {
                    return;
                }
            }
        }
        updateTeamSelectorDropdown();
        z78 z78Var2 = this.combinedMarkets;
        Market market2 = (z78Var2 == null || (list3 = z78Var2.b) == null) ? null : (Market) CollectionsKt.firstOrNull(list3);
        z78 z78Var3 = this.combinedMarkets;
        if (z78Var3 == null || (list2 = z78Var3.b) == null || (market = (Market) CollectionsKt.firstOrNull(list2)) == null || (str = market.id) == null) {
            str = "";
        }
        List<List<Outcome>> listK = this.callback.k(this.combinedMarketsOutcomes, str, list.size());
        listK.getClass();
        this.combinedMarketsOutcomes = listK;
        renderRows((market2 == null || !this.callback.u(market2)) ? CollectionsKt.t0(this.combinedMarketsOutcomes, 4) : this.combinedMarketsOutcomes, list);
        setupShowMoreButton();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    private final void renderHeaders(List<? extends Market> markets) {
        String str;
        String string;
        ksu ksuVar;
        Map<String, UiText> map;
        this.binding.e.removeAllViews();
        int i = 0;
        for (Object obj : markets) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            Market market = (Market) obj;
            View viewInflate = getInflater().inflate(R.layout.spr_player_three_column_header_item, (ViewGroup) this.binding.e, false);
            Map<String, ksu> map2 = ypu.a;
            String str2 = market.id;
            str2.getClass();
            String str3 = ypu.b.get(str2);
            UiText uiText = (str3 == null || (ksuVar = ypu.a.get(str3)) == null || (map = ksuVar.e) == null) ? null : map.get(str2);
            if (uiText != null) {
                Context context = this.ctx;
                context.getClass();
                string = uiText.e(context).toString();
                if (string == null) {
                    str = market.desc;
                    str.getClass();
                    string = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null));
                    if (string == null) {
                        string = str;
                    }
                }
            } else {
                str = market.desc;
                str.getClass();
                string = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null));
                if (string == null) {
                    string = str;
                }
            }
            TextView textView = viewInflate instanceof TextView ? (TextView) viewInflate : null;
            if (textView != null) {
                textView.setText(string);
            }
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.width = this.activeColumnWidthPx;
                marginLayoutParams.setMarginEnd(i == markets.size() + (-1) ? 0 : getColumnGapPx());
            }
            this.binding.e.addView(viewInflate);
            i = i2;
        }
    }

    private final void renderRows(List<? extends List<? extends Outcome>> rows, List<? extends Market> markets) {
        this.binding.c.removeAllViews();
        for (List<? extends Outcome> list : rows) {
            View viewInflate = getInflater().inflate(R.layout.spr_player_three_column_item, (ViewGroup) this.binding.c, false);
            int i = R.id.oddsButtonsContainer;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.oddsButtonsContainer, viewInflate);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                int i2 = R.id.playerName;
                TextView textView = (TextView) h5e.a(R.id.playerName, viewInflate);
                if (textView != null) {
                    i2 = R.id.teamName;
                    TextView textView2 = (TextView) h5e.a(R.id.teamName, viewInflate);
                    if (textView2 != null) {
                        ejd0 ejd0Var = new ejd0(linearLayout2, linearLayout, textView, textView2);
                        this.binding.c.addView(linearLayout2);
                        Event event = this.event;
                        event.getClass();
                        bindRow(ejd0Var, list, markets, event);
                    }
                }
                i = i2;
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
    }

    private final void setupShowMoreButton() {
        List<Market> list;
        Market market;
        boolean z = this.combinedMarketsOutcomes.size() > 4;
        ComposeView composeView = this.binding.v;
        composeView.setVisibility(z ? 0 : 8);
        if (z) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            z78 z78Var = this.combinedMarkets;
            boolean zU = (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null) ? false : this.callback.u(market);
            Market market2 = (Market) CollectionsKt.firstOrNull(this.combinedMarkets.b);
            za90.b(composeView, zU, market2 != null && market2.isLive(), new p5j(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupShowMoreButton$lambda$0$1(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        playerThreeColumnViewHolder.onShowMoreClick();
        return Unit.a;
    }

    private final void setupTeamSelector() {
        this.binding.w.setViewCompositionStrategy(u6i0.c.a);
        updateTeamSelectorDropdown();
    }

    private final void setupTitleAndFavourite(List<? extends Market> markets) {
        boolean z;
        djd0 djd0Var = this.binding;
        djd0Var.d.setOnClickListener(new b(new cq40(), this));
        djd0Var.i.setOnClickListener(new c(new cq40(), this));
        ImageView imageView = djd0Var.b;
        imageView.setOnClickListener(new d(new cq40(), this));
        TextView textView = djd0Var.y;
        textView.setOnClickListener(new e(new cq40(), this));
        textView.setTextColor(this.layoutConfig.a);
        UiText uiText = this.combinedMarkets.a;
        Context context = this.binding.a.getContext();
        context.getClass();
        uiText.getClass();
        textView.setText(uiText.e(context).toString());
        ImageButton imageButton = djd0Var.d;
        int i = 8;
        imageButton.setVisibility(!this.event.isVirtualSoccer() ? 0 : 8);
        if (markets != null && markets.isEmpty()) {
            z = false;
            break;
        }
        Iterator<T> it = markets.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else {
                if (this.callback.A((Market) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context2 = this.ctx;
        bVar.getClass();
        imageButton.setImageDrawable(VisibleMarketViewHolder.b.a(context2, z));
        if (this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, (Market) CollectionsKt.firstOrNull(markets), this.callback.D(), false)) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int totalColumnsWidthPx_delegate$lambda$0(PlayerThreeColumnViewHolder playerThreeColumnViewHolder) {
        return (playerThreeColumnViewHolder.getColumnGapPx() * 2) + (playerThreeColumnViewHolder.getColumnWidthPx() * 3);
    }

    private final void updateActiveColumnWidth(int columnCount) {
        if (columnCount <= 0) {
            return;
        }
        this.activeColumnWidthPx = (getTotalColumnsWidthPx() - ((columnCount - 1) * getColumnGapPx())) / columnCount;
    }

    private final void updateCollapsedUI(List<? extends Market> markets) {
        boolean z;
        if (markets != null && markets.isEmpty()) {
            z = false;
            break;
        }
        Iterator<T> it = markets.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else {
                if (this.callback.y((Market) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        djd0 djd0Var = this.binding;
        djd0Var.y.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(z), (Drawable) null, (Drawable) null, (Drawable) null);
        djd0Var.f.setVisibility(!z ? 0 : 8);
        djd0Var.c.setVisibility(z ? 8 : 0);
        djd0Var.v.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateTeamSelectorDropdown() {
        final String str;
        List<Market> list;
        Market market;
        Context context = this.binding.a.getContext();
        context.getClass();
        String strB = sn5.b(context, R.string.common_functions__all_players, new Object[0]);
        Event event = this.event;
        final uf00 uf00VarA = a4h.a(strB, event.homeTeamName, event.awayTeamName);
        z78 z78Var = this.combinedMarkets;
        if (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null || (str = market.id) == null) {
            str = "";
        }
        final d9f0 d9f0VarE = this.callback.E(str);
        String str2 = (String) uf00VarA.get(d9f0VarE.ordinal());
        ComposeView composeView = this.binding.w;
        str2.getClass();
        q680.d(composeView, uf00VarA, str2, new Function1() { // from class: kq10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayerThreeColumnViewHolder.updateTeamSelectorDropdown$lambda$0(uf00VarA, d9f0VarE, this, str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateTeamSelectorDropdown$lambda$0(uf00 uf00Var, d9f0 d9f0Var, PlayerThreeColumnViewHolder playerThreeColumnViewHolder, String str, String str2) {
        d9f0 d9f0Var2;
        str2.getClass();
        int iIndexOf = uf00Var.indexOf(str2);
        if (iIndexOf >= 0 && (d9f0Var2 = (d9f0) d9f0.c.get(iIndexOf)) != d9f0Var) {
            playerThreeColumnViewHolder.callback.a(str, d9f0Var2);
            playerThreeColumnViewHolder.refreshPlayerList();
        }
        return Unit.a;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        z78 z78Var = this.combinedMarkets;
        List<Market> list = z78Var != null ? z78Var.b : null;
        if (list == null || list.isEmpty() || list.size() > 3) {
            ConstraintLayout constraintLayout = this.binding.a;
            constraintLayout.getClass();
            constraintLayout.setVisibility(8);
            return;
        }
        setupTitleAndFavourite(list);
        setupTeamSelector();
        updateCollapsedUI(list);
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.callback.y((Market) it.next())) {
                    return;
                }
            }
        }
        updateActiveColumnWidth(list.size());
        renderHeaders(list);
        this.combinedMarketsOutcomes = extractOutcomeRows(list);
        Market market = (Market) CollectionsKt.firstOrNull(list);
        renderRows(CollectionsKt.t0(this.combinedMarketsOutcomes, (market == null || !this.callback.u(market)) ? 4 : this.combinedMarketsOutcomes.size()), list);
        setupShowMoreButton();
    }
}
