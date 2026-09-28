package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.event.viewholder.SingleColumnDropdownViewHolder;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a4h;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.d9f0;
import defpackage.fpy;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.hy4;
import defpackage.kw5;
import defpackage.l48;
import defpackage.m2g;
import defpackage.njd0;
import defpackage.ojd0;
import defpackage.p48;
import defpackage.q680;
import defpackage.r9i;
import defpackage.sn5;
import defpackage.ttr;
import defpackage.u6i0;
import defpackage.u8z;
import defpackage.uf00;
import defpackage.vpu;
import defpackage.wt90;
import defpackage.z78;
import defpackage.za90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010\u0012R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/sportybet/plugin/realsports/event/viewholder/SingleColumnDropdownViewHolder;", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder;", "Landroid/view/View;", "itemView", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;", "callback", "", "", "outcomesInVerticalOrientations", "<init>", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;Ljava/util/Set;)V", "", "Lcom/sportybet/plugin/realsports/data/Market;", "markets", "", "setupTitleAndFavorite", "(Ljava/util/List;)V", "setupTeamSelector", "()V", "updateTeamSelectorDropdown", "updateCollapsedUI", "refreshPlayerList", "marketId", "getSortedPlayerRows", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "rows", "renderRows", "setupShowMoreButton", "onShowMoreClick", "playerInfo", "Lcom/sportybet/plugin/realsports/event/viewholder/PlayerThreeColumnViewHolder$a;", "parsePlayerInfo", "(Ljava/lang/String;)Lcom/sportybet/plugin/realsports/event/viewholder/PlayerThreeColumnViewHolder$a;", "Lojd0;", "rowBinding", AnalyticsParam.MARKET_PARAM_MARKET, "bindRow", "(Lojd0;Lcom/sportybet/plugin/realsports/data/Market;)V", "setupSpecifierSpinner", "onBindView", "Lnjd0;", "binding", "Lnjd0;", "Landroid/view/LayoutInflater;", "inflater$delegate", "Lttr;", "getInflater", "()Landroid/view/LayoutInflater;", "inflater", "playerRows", "Ljava/util/List;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SingleColumnDropdownViewHolder extends VisibleMarketViewHolder {
    public static final int $stable = 8;
    private final njd0 binding;

    /* JADX INFO: renamed from: inflater$delegate, reason: from kotlin metadata */
    private final ttr inflater;
    private List<? extends Market> playerRows;

    public static final class a implements u8z.a {
        public a() {
        }

        @Override // u8z.a
        public final boolean a(Outcome outcome) {
            return SingleColumnDropdownViewHolder.this.callback.G(outcome);
        }

        @Override // u8z.a
        public final void b(OutcomeButton outcomeButton) {
            SingleColumnDropdownViewHolder.this.onOutcomeButtonClick(outcomeButton);
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ SingleColumnDropdownViewHolder b;

        public b(cq40 cq40Var, SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
            this.a = cq40Var;
            this.b = singleColumnDropdownViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List<Market> list;
            Market market;
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            SingleColumnDropdownViewHolder singleColumnDropdownViewHolder = this.b;
            z78 z78Var = singleColumnDropdownViewHolder.combinedMarkets;
            if (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null) {
                return;
            }
            singleColumnDropdownViewHolder.callback.q(market);
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ SingleColumnDropdownViewHolder b;

        public c(cq40 cq40Var, SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
            this.a = cq40Var;
            this.b = singleColumnDropdownViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List<Market> list;
            Market market;
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            SingleColumnDropdownViewHolder singleColumnDropdownViewHolder = this.b;
            z78 z78Var = singleColumnDropdownViewHolder.combinedMarkets;
            if (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null) {
                return;
            }
            singleColumnDropdownViewHolder.callback.o(market);
        }
    }

    public static final class d implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ SingleColumnDropdownViewHolder b;

        public d(cq40 cq40Var, SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
            this.a = cq40Var;
            this.b = singleColumnDropdownViewHolder;
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
        public final /* synthetic */ SingleColumnDropdownViewHolder b;

        public e(cq40 cq40Var, SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
            this.a = cq40Var;
            this.b = singleColumnDropdownViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List<Market> list;
            Market market;
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            SingleColumnDropdownViewHolder singleColumnDropdownViewHolder = this.b;
            z78 z78Var = singleColumnDropdownViewHolder.combinedMarkets;
            if (z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null) {
                return;
            }
            singleColumnDropdownViewHolder.callback.F(market, singleColumnDropdownViewHolder.getBindingAdapterPosition());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleColumnDropdownViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
        super(view, aVar, set);
        view.getClass();
        aVar.getClass();
        set.getClass();
        int i = R.id.boost_sign;
        ImageView imageView = (ImageView) h5e.a(R.id.boost_sign, view);
        if (imageView != null) {
            i = R.id.fav;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.fav, view);
            if (imageButton != null) {
                i = R.id.info;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.info, view);
                if (appCompatImageView != null) {
                    i = R.id.playerListContainer;
                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.playerListContainer, view);
                    if (linearLayout != null) {
                        i = R.id.showMoreButton;
                        ComposeView composeView = (ComposeView) h5e.a(R.id.showMoreButton, view);
                        if (composeView != null) {
                            i = R.id.teamSelectorCompose;
                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.teamSelectorCompose, view);
                            if (composeView2 != null) {
                                i = R.id.title;
                                TextView textView = (TextView) h5e.a(R.id.title, view);
                                if (textView != null) {
                                    this.binding = new njd0((ConstraintLayout) view, imageView, imageButton, appCompatImageView, linearLayout, composeView, composeView2, textView);
                                    this.inflater = hwr.b(new hy4(this, 1));
                                    this.playerRows = m2g.a;
                                    return;
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

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    private final void bindRow(final ojd0 rowBinding, Market market) {
        String str;
        List<Outcome> list = market.outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        if (outcome != null) {
            String strG = outcome.playerName;
            if (strG == null) {
                strG = vpu.g(outcome);
            } else {
                if (StringsKt.U(strG)) {
                    strG = null;
                }
                if (strG == null) {
                    strG = vpu.g(outcome);
                }
            }
            PlayerThreeColumnViewHolder.a playerInfo = parsePlayerInfo(strG);
            rowBinding.c.setText(playerInfo.a);
            rowBinding.e.setText(playerInfo.b);
        }
        setupSpecifierSpinner(rowBinding, market);
        String str2 = market.id;
        List<Outcome> list2 = market.outcomes;
        list2.getClass();
        Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list2);
        if (outcome2 == null || (str = outcome2.id) == null) {
            str = "";
        }
        int iD = this.callback.d(str2, str);
        List<Outcome> list3 = market.outcomes;
        list3.getClass();
        Outcome outcome3 = (Outcome) CollectionsKt.V(iD, list3);
        if (outcome3 == null) {
            List<Outcome> list4 = market.outcomes;
            list4.getClass();
            outcome3 = (Outcome) CollectionsKt.firstOrNull(list4);
        }
        Outcome outcome4 = outcome3;
        if (outcome4 != null) {
            stylizeOutcomeButton(rowBinding.b, this.layoutConfig, this.event, this.sportRule, market, outcome4, false, new View.OnClickListener() { // from class: vt90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SingleColumnDropdownViewHolder.bindRow$lambda$1$0(this.a, rowBinding, view);
                }
            });
        }
        ConstraintLayout constraintLayout = rowBinding.a;
        constraintLayout.getClass();
        constraintLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindRow$lambda$1$0(SingleColumnDropdownViewHolder singleColumnDropdownViewHolder, ojd0 ojd0Var, View view) {
        singleColumnDropdownViewHolder.onOutcomeButtonClick(ojd0Var.b);
    }

    private final LayoutInflater getInflater() {
        Object value = this.inflater.getValue();
        value.getClass();
        return (LayoutInflater) value;
    }

    private final List<Market> getSortedPlayerRows(List<? extends Market> markets, String marketId) {
        VisibleMarketViewHolder.a aVar = this.callback;
        ArrayList arrayListA = kw5.a(markets);
        for (Market market : markets) {
            List<Outcome> list = market.outcomes;
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String strG = vpu.g((Outcome) obj);
                Object objA = linkedHashMap.get(strG);
                if (objA == null) {
                    objA = r9i.a(strG, linkedHashMap);
                }
                ((List) objA).add(obj);
            }
            Collection<List> collectionValues = linkedHashMap.values();
            ArrayList arrayList = new ArrayList(l48.r(collectionValues, 10));
            for (List list2 : collectionValues) {
                Market market2 = new Market(market);
                market2.outcomes = CollectionsKt.C0(list2);
                arrayList.add(market2);
            }
            p48.w(arrayList, arrayListA);
        }
        List<Market> listR = aVar.r(marketId, arrayListA);
        listR.getClass();
        return listR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater inflater_delegate$lambda$0(SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
        return LayoutInflater.from(singleColumnDropdownViewHolder.ctx);
    }

    private final void onShowMoreClick() {
        List<Market> list;
        z78 z78Var = this.combinedMarkets;
        Market market = (z78Var == null || (list = z78Var.b) == null) ? null : (Market) CollectionsKt.firstOrNull(list);
        if (market != null) {
            this.callback.C(market, getBindingAdapterPosition());
        }
        refreshPlayerList();
    }

    private final PlayerThreeColumnViewHolder.a parsePlayerInfo(String playerInfo) {
        String string = StringsKt.t0(StringsKt.o0(playerInfo, "(")).toString();
        String string2 = StringsKt.t0(StringsKt.o0(StringsKt.k0(playerInfo, "(", playerInfo), ")")).toString();
        if (string.length() != 0) {
            playerInfo = string;
        }
        return new PlayerThreeColumnViewHolder.a(playerInfo, string2);
    }

    private final void refreshPlayerList() {
        List<Market> list;
        String str;
        z78 z78Var = this.combinedMarkets;
        if (z78Var == null || (list = z78Var.b) == null) {
            return;
        }
        Market market = (Market) CollectionsKt.firstOrNull(list);
        if (market == null || !this.callback.y(market)) {
            updateTeamSelectorDropdown();
            if (market == null || (str = market.id) == null) {
                str = "";
            }
            this.playerRows = getSortedPlayerRows(list, str);
            renderRows((market == null || !this.callback.u(market)) ? CollectionsKt.t0(this.playerRows, 4) : this.playerRows);
            setupShowMoreButton();
        }
    }

    private final void renderRows(List<? extends Market> rows) {
        this.binding.e.removeAllViews();
        for (Market market : rows) {
            View viewInflate = getInflater().inflate(R.layout.spr_single_column_player_item, (ViewGroup) this.binding.e, false);
            int i = R.id.outcomeButton;
            OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.outcomeButton, viewInflate);
            if (outcomeButton != null) {
                i = R.id.playerName;
                TextView textView = (TextView) h5e.a(R.id.playerName, viewInflate);
                if (textView != null) {
                    i = R.id.specifier_spinner;
                    ListenableSpinner listenableSpinner = (ListenableSpinner) h5e.a(R.id.specifier_spinner, viewInflate);
                    if (listenableSpinner != null) {
                        i = R.id.teamName;
                        TextView textView2 = (TextView) h5e.a(R.id.teamName, viewInflate);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            ojd0 ojd0Var = new ojd0(constraintLayout, outcomeButton, textView, listenableSpinner, textView2);
                            this.binding.e.addView(constraintLayout);
                            bindRow(ojd0Var, market);
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
    }

    private final void setupShowMoreButton() {
        List<Market> list;
        Market market;
        List<Market> list2;
        Market market2;
        int i = 0;
        boolean z = this.playerRows.size() > 4;
        ComposeView composeView = this.binding.f;
        composeView.setVisibility(z ? 0 : 8);
        if (z) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            z78 z78Var = this.combinedMarkets;
            boolean zU = (z78Var == null || (list2 = z78Var.b) == null || (market2 = (Market) CollectionsKt.firstOrNull(list2)) == null) ? false : this.callback.u(market2);
            z78 z78Var2 = this.combinedMarkets;
            za90.b(composeView, zU, (z78Var2 == null || (list = z78Var2.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null || !market.isLive()) ? false : true, new wt90(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupShowMoreButton$lambda$0$1(SingleColumnDropdownViewHolder singleColumnDropdownViewHolder) {
        singleColumnDropdownViewHolder.onShowMoreClick();
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0050 A[SYNTHETIC] */
    private final void setupSpecifierSpinner(final ojd0 rowBinding, final Market market) {
        String str;
        String str2;
        String str3;
        String str4;
        List<Outcome> list = market.outcomes;
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Outcome outcome = (Outcome) it.next();
            outcome.getClass();
            String str5 = outcome.playerScore;
            if (str5 == null) {
                str3 = outcome.desc;
                if (str3 == null) {
                    str3 = "";
                }
                str4 = (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str3, new String[]{" "}, false, 0, 6, null));
                if (str4 == null) {
                    str = str4;
                }
            } else {
                String str6 = StringsKt.U(str5) ? null : str5;
                if (str6 != null) {
                    str = str6;
                } else {
                    str3 = outcome.desc;
                    if (str3 == null) {
                        str3 = "";
                    }
                    str4 = (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str3, new String[]{" "}, false, 0, 6, null));
                    if (str4 == null) {
                        str = str4;
                    }
                }
            }
            Market market2 = new Market(market);
            market2.outcomes = kotlin.collections.a.c(outcome);
            arrayList.add(new Pair(str, market2));
        }
        Pair pairT = l48.t(arrayList);
        List list2 = (List) pairT.a;
        List<? extends Market> list3 = (List) pairT.b;
        ListenableSpinner listenableSpinner = rowBinding.d;
        u8z u8zVar = new u8z(listenableSpinner, null, new ArrayList(), market.isLive());
        Event event = this.event;
        event.getClass();
        u8zVar.f(event, list3);
        u8zVar.addAll(list2);
        listenableSpinner.setAdapter((SpinnerAdapter) u8zVar);
        final String str7 = market.id;
        List<Outcome> list4 = market.outcomes;
        list4.getClass();
        Outcome outcome2 = (Outcome) CollectionsKt.firstOrNull(list4);
        if (outcome2 != null && (str2 = outcome2.id) != null) {
            str = str2;
        }
        int iD = this.callback.d(str7, str);
        if (!list2.isEmpty() && iD < list2.size()) {
            listenableSpinner.setSelection(iD, false);
        }
        u8zVar.f = new a();
        listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: yt90
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                SingleColumnDropdownViewHolder.setupSpecifierSpinner$lambda$1(market, this, str7, rowBinding, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSpecifierSpinner$lambda$1(Market market, final SingleColumnDropdownViewHolder singleColumnDropdownViewHolder, String str, final ojd0 ojd0Var, AdapterView adapterView, View view, int i, long j) {
        List<Outcome> list = market.outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        if (outcome == null) {
            return;
        }
        singleColumnDropdownViewHolder.callback.c(str, outcome.id, i);
        List<Outcome> list2 = market.outcomes;
        list2.getClass();
        Outcome outcome2 = (Outcome) CollectionsKt.V(i, list2);
        if (outcome2 != null) {
            ojd0Var.b.setOnClickListener(null);
            singleColumnDropdownViewHolder.stylizeOutcomeButton(ojd0Var.b, singleColumnDropdownViewHolder.layoutConfig, singleColumnDropdownViewHolder.event, singleColumnDropdownViewHolder.sportRule, market, outcome2, false, new View.OnClickListener() { // from class: xt90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SingleColumnDropdownViewHolder.setupSpecifierSpinner$lambda$1$0$0(this.a, ojd0Var, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSpecifierSpinner$lambda$1$0$0(SingleColumnDropdownViewHolder singleColumnDropdownViewHolder, ojd0 ojd0Var, View view) {
        singleColumnDropdownViewHolder.onOutcomeButtonClick(ojd0Var.b);
    }

    private final void setupTeamSelector() {
        this.binding.i.setViewCompositionStrategy(u6i0.c.a);
        updateTeamSelectorDropdown();
    }

    private final void setupTitleAndFavorite(List<? extends Market> markets) {
        boolean z;
        List<Market> list;
        Market market;
        njd0 njd0Var = this.binding;
        njd0Var.c.setOnClickListener(new b(new cq40(), this));
        njd0Var.d.setOnClickListener(new c(new cq40(), this));
        ImageView imageView = njd0Var.b;
        imageView.setOnClickListener(new d(new cq40(), this));
        TextView textView = njd0Var.v;
        textView.setOnClickListener(new e(new cq40(), this));
        textView.setTextColor(this.layoutConfig.a);
        z78 z78Var = this.combinedMarkets;
        textView.setText((z78Var == null || (list = z78Var.b) == null || (market = (Market) CollectionsKt.firstOrNull(list)) == null) ? null : market.desc);
        ImageButton imageButton = njd0Var.c;
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
            } else if (this.callback.A((Market) it.next())) {
                z = true;
                break;
            }
        }
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context = this.ctx;
        bVar.getClass();
        imageButton.setImageDrawable(VisibleMarketViewHolder.b.a(context, z));
        if (this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, (Market) CollectionsKt.firstOrNull(markets), this.callback.D(), false)) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    private final void updateCollapsedUI(List<? extends Market> markets) {
        Market market = (Market) CollectionsKt.firstOrNull(markets);
        boolean zY = market != null ? this.callback.y(market) : true;
        njd0 njd0Var = this.binding;
        njd0Var.v.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(zY), (Drawable) null, (Drawable) null, (Drawable) null);
        njd0Var.i.setVisibility(!zY ? 0 : 8);
        njd0Var.e.setVisibility(zY ? 8 : 0);
        njd0Var.f.setVisibility(8);
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
        ComposeView composeView = this.binding.i;
        str2.getClass();
        q680.d(composeView, uf00VarA, str2, new Function1() { // from class: zt90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingleColumnDropdownViewHolder.updateTeamSelectorDropdown$lambda$0(uf00VarA, d9f0VarE, this, str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateTeamSelectorDropdown$lambda$0(uf00 uf00Var, d9f0 d9f0Var, SingleColumnDropdownViewHolder singleColumnDropdownViewHolder, String str, String str2) {
        d9f0 d9f0Var2;
        str2.getClass();
        int iIndexOf = uf00Var.indexOf(str2);
        if (iIndexOf >= 0 && (d9f0Var2 = (d9f0) d9f0.c.get(iIndexOf)) != d9f0Var) {
            singleColumnDropdownViewHolder.callback.a(str, d9f0Var2);
            singleColumnDropdownViewHolder.refreshPlayerList();
        }
        return Unit.a;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        List<Market> list;
        String str;
        z78 z78Var = this.combinedMarkets;
        if (z78Var == null || (list = z78Var.b) == null) {
            return;
        }
        if (list.isEmpty()) {
            ConstraintLayout constraintLayout = this.binding.a;
            constraintLayout.getClass();
            constraintLayout.setVisibility(8);
            return;
        }
        setupTitleAndFavorite(list);
        setupTeamSelector();
        updateCollapsedUI(list);
        Market market = (Market) CollectionsKt.firstOrNull(list);
        if (market == null || !this.callback.y(market)) {
            if (market == null || (str = market.id) == null) {
                str = "";
            }
            this.playerRows = getSortedPlayerRows(list, str);
            renderRows((market == null || !this.callback.u(market)) ? CollectionsKt.t0(this.playerRows, 4) : this.playerRows);
            setupShowMoreButton();
        }
    }
}
