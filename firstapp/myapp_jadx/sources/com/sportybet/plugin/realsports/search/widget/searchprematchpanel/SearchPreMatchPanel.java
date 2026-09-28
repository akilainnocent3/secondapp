package com.sportybet.plugin.realsports.search.widget.searchprematchpanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.BetMarketOptionType;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.SportsEventNum;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a23;
import defpackage.ag20;
import defpackage.avy;
import defpackage.bmy;
import defpackage.ckf;
import defpackage.cx70;
import defpackage.dx70;
import defpackage.ex70;
import defpackage.h5e;
import defpackage.hkf;
import defpackage.hwr;
import defpackage.ing;
import defpackage.ity;
import defpackage.iu2;
import defpackage.jpc;
import defpackage.k0e0;
import defpackage.l48;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.mjd0;
import defpackage.mpe0;
import defpackage.rru;
import defpackage.sn5;
import defpackage.tru;
import defpackage.uhc;
import defpackage.vjt;
import defpackage.whh0;
import defpackage.wj90;
import defpackage.xhh0;
import defpackage.yay;
import defpackage.yw70;
import defpackage.zf20;
import defpackage.zh20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0019\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010<\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u001aR(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010\u001a¨\u0006G"}, d2 = {"Lcom/sportybet/plugin/realsports/search/widget/searchprematchpanel/SearchPreMatchPanel;", "Landroid/widget/FrameLayout;", "Lag20;", "Lcom/google/android/material/tabs/TabLayout$d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getLanguageCode", "()Ljava/lang/String;", "Lcom/google/android/material/tabs/TabLayout;", "sportTabLayout", "", "setSportTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "marketTabLayout", "setMarketTabLayout", "Lkotlin/Function0;", "Lavy;", "getter", "setOneTwoUpSwitchStatusGetter", "(Lkotlin/jvm/functions/Function0;)V", "", "setOUEarlyGoalsSwitchStatusGetter", "Lity;", "presenter", "setOneUpPromoPresenter", "(Lity;)V", "update", "setupMarketTabLayout", "(Z)V", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", AnalyticsParam.MARKET_PARAM_MARKET, "setUpEvents", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "Lhkf;", "c", "Lhkf;", "getEarlyPayoutMarketResolver", "()Lhkf;", "setEarlyPayoutMarketResolver", "(Lhkf;)V", "earlyPayoutMarketResolver", "Lxhh0;", "d", "Lxhh0;", "getUpMarketTabUseCase", "()Lxhh0;", "setUpMarketTabUseCase", "(Lxhh0;)V", "upMarketTabUseCase", "v", "Lttr;", "getDecorationHeight", "()I", "decorationHeight", "G", "Lkotlin/jvm/functions/Function0;", "getOneUpTwoUpSwitchStatus", "()Lkotlin/jvm/functions/Function0;", "setOneUpTwoUpSwitchStatus", "oneUpTwoUpSwitchStatus", "H", "getOuEarlyGoalsSwitchStatus", "setOuEarlyGoalsSwitchStatus", "ouEarlyGoalsSwitchStatus", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchPreMatchPanel extends Hilt_SearchPreMatchPanel implements ag20, TabLayout.d {
    public static final /* synthetic */ int J = 0;
    public final yw70 A;
    public mfb0 B;
    public RegularMarketRule C;
    public int D;
    public final ArrayList E;
    public zh20 F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Function0<? extends avy> oneUpTwoUpSwitchStatus;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Function0<Boolean> ouEarlyGoalsSwitchStatus;
    public ArrayList I;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public hkf earlyPayoutMarketResolver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public xhh0 upMarketTabUseCase;
    public final mjd0 e;
    public final ArrayList f;
    public final ArrayList i;
    public final mpe0 v;
    public TabLayout w;
    public TabLayout y;
    public final k0e0 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BetMarketOptionType.values().length];
            try {
                iArr[BetMarketOptionType.UP_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetMarketOptionType.OVER_UNDER_EARLY_GOALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPreMatchPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((ex70) generatedComponent()).C(this);
        }
        LayoutInflater.from(context).inflate(R.layout.spr_search_prematch_panel, this);
        int i2 = R.id.event_list;
        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.event_list, this);
        if (recyclerView != null) {
            i2 = R.id.loading;
            LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, this);
            if (loadingView != null) {
                this.e = new mjd0(this, recyclerView, loadingView);
                this.f = new ArrayList();
                this.i = new ArrayList();
                this.v = hwr.b(new cx70(this, 0));
                this.z = new k0e0();
                this.E = new ArrayList();
                this.oneUpTwoUpSwitchStatus = new a23(2);
                this.ouEarlyGoalsSwitchStatus = new dx70();
                Context context2 = getContext();
                context2.getClass();
                this.A = new yw70(context2, this);
                recyclerView.setItemAnimator(null);
                this.I = new ArrayList();
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getDecorationHeight() {
        return ((Number) this.v.getValue()).intValue();
    }

    public static final void k(TabLayout tabLayout, SearchPreMatchPanel searchPreMatchPanel, boolean z, List list) {
        String str;
        tabLayout.o(searchPreMatchPanel);
        list.getClass();
        ArrayList arrayList = searchPreMatchPanel.i;
        TabLayout tabLayout2 = searchPreMatchPanel.y;
        if (tabLayout2 == null) {
            Intrinsics.n("marketTabLayout");
            throw null;
        }
        arrayList.clear();
        searchPreMatchPanel.D = 0;
        RegularMarketRule regularMarketRule = searchPreMatchPanel.C;
        if (regularMarketRule != null) {
            searchPreMatchPanel.getEarlyPayoutMarketResolver().getClass();
            str = hkf.d(regularMarketRule).a;
        } else {
            str = null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            RegularMarketRule regularMarketRule2 = (RegularMarketRule) obj;
            searchPreMatchPanel.e.a.getContext();
            HashSet hashSet = tru.a;
            String str2 = regularMarketRule2.b;
            String str3 = regularMarketRule2.a;
            mfb0 mfb0Var = searchPreMatchPanel.B;
            if (searchPreMatchPanel.getUpMarketTabUseCase().e(regularMarketRule2, mfb0Var != null ? mfb0Var.getId() : null, false)) {
                RegularMarketRule regularMarketRuleB = searchPreMatchPanel.getUpMarketTabUseCase().b(searchPreMatchPanel.oneUpTwoUpSwitchStatus.invoke(), regularMarketRule2, mfb0Var != null ? mfb0Var.getId() : null, false);
                if (regularMarketRuleB != null) {
                    regularMarketRule2 = regularMarketRuleB;
                }
                TabLayout.g gVarL = tabLayout2.l();
                gVarL.e(str2);
                gVarL.a = regularMarketRule2;
                tabLayout2.b(gVarL);
                arrayList.add(regularMarketRule2);
            } else {
                hkf earlyPayoutMarketResolver = searchPreMatchPanel.getEarlyPayoutMarketResolver();
                ckf ckfVar = ckf.c;
                String id = mfb0Var != null ? mfb0Var.getId() : null;
                earlyPayoutMarketResolver.getClass();
                if (earlyPayoutMarketResolver.a.b(ckfVar, id, str3, false)) {
                    RegularMarketRule regularMarketRuleA = searchPreMatchPanel.getEarlyPayoutMarketResolver().a(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule2, searchPreMatchPanel.ouEarlyGoalsSwitchStatus.invoke().booleanValue(), false);
                    if (regularMarketRuleA != null) {
                        TabLayout.g gVarL2 = tabLayout2.l();
                        gVarL2.e(str2);
                        gVarL2.a = regularMarketRuleA;
                        tabLayout2.b(gVarL2);
                        arrayList.add(regularMarketRuleA);
                    } else {
                        TabLayout.g gVarL3 = tabLayout2.l();
                        gVarL3.e(str2);
                        gVarL3.a = regularMarketRule2;
                        tabLayout2.b(gVarL3);
                        arrayList.add(regularMarketRule2);
                    }
                } else {
                    TabLayout.g gVarL4 = tabLayout2.l();
                    gVarL4.e(str2);
                    gVarL4.a = regularMarketRule2;
                    tabLayout2.b(gVarL4);
                    arrayList.add(regularMarketRule2);
                }
            }
            if (z && Intrinsics.g(str, str3)) {
                searchPreMatchPanel.D = i;
                TabLayout.g gVarK = tabLayout2.k(i);
                if (gVarK != null) {
                    gVarK.b();
                }
            }
            i = i2;
        }
        tabLayout.a(searchPreMatchPanel);
        if (arrayList.size() > 0) {
            RegularMarketRule regularMarketRule3 = (RegularMarketRule) arrayList.get(searchPreMatchPanel.D);
            searchPreMatchPanel.C = regularMarketRule3;
            if (regularMarketRule3 != null) {
                searchPreMatchPanel.setUpEvents(regularMarketRule3);
            }
        }
        zh20 zh20Var = searchPreMatchPanel.F;
        if (zh20Var != null) {
            zh20Var.e(searchPreMatchPanel.B, searchPreMatchPanel.C);
        }
    }

    private final void setUpEvents(RegularMarketRule market) {
        final ArrayList arrayListG;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.E;
        int size = arrayList2.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Event event = (Event) obj;
            ing ingVar = new ing();
            ingVar.a = event;
            ingVar.v = false;
            Category category = event.sport.category;
            if (category != null) {
                ingVar.i = category.tournament.name;
                ingVar.f = category.name;
            }
            boolean zA = vjt.a(j, event.estimateStartTime);
            boolean z = !zA;
            if (!zA) {
                arrayList.add(new zf20(market, new rru(ingVar.a.estimateStartTime)));
            }
            ingVar.c = z;
            j = ingVar.a.estimateStartTime;
            arrayList.add(new zf20(market, ingVar));
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(zf20.a((zf20) obj2));
        }
        this.I = arrayList3;
        xhh0 upMarketTabUseCase = getUpMarketTabUseCase();
        mfb0 mfb0Var = this.B;
        whh0 whh0VarC = upMarketTabUseCase.c(market, mfb0Var != null ? mfb0Var.getId() : null, false);
        hkf earlyPayoutMarketResolver = getEarlyPayoutMarketResolver();
        ckf ckfVar = ckf.c;
        mfb0 mfb0Var2 = this.B;
        String id = mfb0Var2 != null ? mfb0Var2.getId() : null;
        String str = market.a;
        earlyPayoutMarketResolver.getClass();
        boolean zB = earlyPayoutMarketResolver.a.b(ckfVar, id, str, false);
        boolean zF = yay.f(market);
        if ((whh0VarC != null ? whh0VarC.b : null) != null) {
            arrayListG = g(market, arrayList, whh0VarC, BetMarketOptionType.UP_MARKET);
        } else {
            arrayListG = (zB && zF) ? g(market, arrayList, whh0VarC, BetMarketOptionType.OVER_UNDER_EARLY_GOALS) : arrayList;
        }
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(l48.r(arrayList, 10));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList4.add(((zf20) obj3).b);
        }
        yw70Var.b.b(market, arrayList4, false);
        if (yw70Var != null) {
            yw70Var.j(arrayListG, new Runnable() { // from class: bx70
                @Override // java.lang.Runnable
                public final void run() {
                    SearchPreMatchPanel searchPreMatchPanel = this.a;
                    mjd0 mjd0Var = searchPreMatchPanel.e;
                    mjd0Var.b.o0(0);
                    mjd0Var.b.setVisibility(0);
                    boolean zIsEmpty = arrayListG.isEmpty();
                    LoadingView loadingView = mjd0Var.c;
                    if (zIsEmpty) {
                        Context context = searchPreMatchPanel.getContext();
                        context.getClass();
                        loadingView.H(sn5.b(context, R.string.common_functions__no_game, new Object[0]));
                    } else {
                        loadingView.E();
                    }
                    searchPreMatchPanel.j();
                }
            });
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    private final void setupMarketTabLayout(final boolean update) {
        final TabLayout tabLayout = this.y;
        if (tabLayout == null) {
            Intrinsics.n("marketTabLayout");
            throw null;
        }
        tabLayout.n();
        QuickMarketSpotEnum quickMarketSpotEnum = QuickMarketSpotEnum.SPORTS_PAGE_PRE_MATCH;
        mfb0 mfb0Var = this.B;
        QuickMarketHelper.fetch(quickMarketSpotEnum, mfb0Var != null ? mfb0Var.getId() : null, new QuickMarketHelper.FetchCallback() { // from class: ax70
            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
            public final void onResult(List list) {
                SearchPreMatchPanel.k(tabLayout, this, update, list);
            }
        });
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        Object obj = gVar != null ? gVar.a : null;
        mfb0 mfb0Var = obj instanceof mfb0 ? (mfb0) obj : null;
        if (mfb0Var != null) {
            this.B = mfb0Var;
            zh20 zh20Var = this.F;
            if (zh20Var != null) {
                zh20Var.b(mfb0Var);
            }
        }
        Object obj2 = gVar != null ? gVar.a : null;
        RegularMarketRule regularMarketRule = obj2 instanceof RegularMarketRule ? (RegularMarketRule) obj2 : null;
        if (regularMarketRule != null) {
            this.C = regularMarketRule;
            zh20 zh20Var2 = this.F;
            if (zh20Var2 != null) {
                zh20Var2.e(this.B, regularMarketRule);
            }
            m(regularMarketRule);
        }
    }

    @Override // defpackage.ag20
    public final void a(Event event) {
        zh20 zh20Var = this.F;
        if (zh20Var != null) {
            zh20Var.a(event);
        }
    }

    @Override // defpackage.ag20
    public final void b(Event event) {
        event.getClass();
        zh20 zh20Var = this.F;
        if (zh20Var != null) {
            zh20Var.f(event);
        }
    }

    @Override // defpackage.ag20
    public final void c(Event event) {
        zh20 zh20Var = this.F;
        if (zh20Var != null) {
            zh20Var.c(event);
        }
    }

    @Override // defpackage.ag20
    public final void d(OutcomeButton outcomeButton, boolean z, Selection selection) {
        outcomeButton.getClass();
        boolean zT = iu2.t(selection.a, selection.b, selection.c, z, false, null, 16368);
        if (!zT) {
            outcomeButton.setChecked(false);
        }
        zh20 zh20Var = this.F;
        if (zh20Var != null) {
            zh20Var.d(selection, z, zT);
        }
        if (iu2.p() && z && !iu2.o(selection)) {
            iu2.e(getContext(), selection);
        }
    }

    @Override // defpackage.ag20
    public final String e(String str) {
        str.getClass();
        yw70 yw70Var = this.A;
        if (yw70Var != null) {
            str.getClass();
            return yw70Var.b.e(str);
        }
        Intrinsics.n("adapter");
        throw null;
    }

    @Override // defpackage.ag20
    public final void f(zf20 zf20Var, String str) {
        zf20Var.getClass();
        str.getClass();
        jpc jpcVar = zf20Var.b;
        ing ingVar = jpcVar instanceof ing ? (ing) jpcVar : null;
        if (ingVar == null) {
            return;
        }
        String str2 = ingVar.a.eventId;
        str2.getClass();
        String str3 = zf20Var.a.a;
        str3.getClass();
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        for (T t : yw70Var.a.f) {
            jpc jpcVar2 = t.b;
            if ((jpcVar2 instanceof ing) && str2.equals(((ing) jpcVar2).a.eventId)) {
                ((ing) t.b).d(str3, str);
                break;
            }
        }
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        yw70Var.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    public final ArrayList g(RegularMarketRule regularMarketRule, List list, whh0 whh0Var, BetMarketOptionType betMarketOptionType) {
        boolean zA;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jpc jpcVar = ((zf20) it.next()).b;
            ing ingVar = jpcVar instanceof ing ? (ing) jpcVar : null;
            if (ingVar != null) {
                arrayList2.add(ingVar);
            }
        }
        hkf earlyPayoutMarketResolver = getEarlyPayoutMarketResolver();
        mfb0 mfb0Var = this.B;
        List listB = earlyPayoutMarketResolver.b(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule.a, arrayList2, false, true);
        ArrayList arrayList3 = new ArrayList(l48.r(listB, 10));
        Iterator it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ing) it2.next()).a.eventId);
        }
        Set setE0 = CollectionsKt.E0(arrayList3);
        Iterator it3 = list.iterator();
        long j = 0;
        while (it3.hasNext()) {
            zf20 zf20Var = (zf20) it3.next();
            if (zf20Var.b.a() == 2) {
                jpc jpcVar2 = zf20Var.b;
                ing ingVar2 = jpcVar2 instanceof ing ? (ing) jpcVar2 : null;
                if (ingVar2 == null) {
                    break;
                }
                int i = a.a[betMarketOptionType.ordinal()];
                if (i == 1) {
                    if ((whh0Var != null ? whh0Var.b : null) != null && setE0.contains(ingVar2.a.eventId)) {
                        zA = vjt.a(j, ingVar2.a.estimateStartTime);
                        boolean z = !zA;
                        if (!zA) {
                            arrayList.add(new zf20(regularMarketRule, new rru(ingVar2.a.estimateStartTime)));
                        }
                        ingVar2.c = z;
                        j = ingVar2.a.estimateStartTime;
                        arrayList.add(zf20Var);
                    }
                } else {
                    if (i != 2) {
                        uhc.a();
                        return null;
                    }
                    if (yay.f(regularMarketRule) && setE0.contains(ingVar2.a.eventId)) {
                        zA = vjt.a(j, ingVar2.a.estimateStartTime);
                        boolean z2 = !zA;
                        if (!zA) {
                            arrayList.add(new zf20(regularMarketRule, new rru(ingVar2.a.estimateStartTime)));
                        }
                        ingVar2.c = z2;
                        j = ingVar2.a.estimateStartTime;
                        arrayList.add(zf20Var);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    public final hkf getEarlyPayoutMarketResolver() {
        hkf hkfVar = this.earlyPayoutMarketResolver;
        if (hkfVar != null) {
            return hkfVar;
        }
        Intrinsics.n("earlyPayoutMarketResolver");
        throw null;
    }

    @Override // defpackage.ag20
    public String getLanguageCode() {
        String languageCode;
        zh20 zh20Var = this.F;
        return (zh20Var == null || (languageCode = zh20Var.getLanguageCode()) == null) ? "" : languageCode;
    }

    public final Function0<avy> getOneUpTwoUpSwitchStatus() {
        return this.oneUpTwoUpSwitchStatus;
    }

    public final Function0<Boolean> getOuEarlyGoalsSwitchStatus() {
        return this.ouEarlyGoalsSwitchStatus;
    }

    public final xhh0 getUpMarketTabUseCase() {
        xhh0 xhh0Var = this.upMarketTabUseCase;
        if (xhh0Var != null) {
            return xhh0Var;
        }
        Intrinsics.n("upMarketTabUseCase");
        throw null;
    }

    public final void h() {
        mjd0 mjd0Var = this.e;
        RecyclerView recyclerView = mjd0Var.b;
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        recyclerView.setAdapter(yw70Var);
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        k0e0 k0e0Var = this.z;
        k0e0Var.b();
        k0e0Var.a(mjd0Var.b, yw70Var, yw70Var);
        recyclerView.i(new wj90(getDecorationHeight()));
    }

    public final void i(List<SportsEventNum> list, List<? extends Event> list2, zh20 zh20Var) {
        Object obj;
        list.getClass();
        list2.getClass();
        zh20Var.getClass();
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        ity ityVar = yw70Var.d;
        if (ityVar == null) {
            Intrinsics.n("oneUpPromoPresenter");
            throw null;
        }
        ityVar.d();
        this.F = zh20Var;
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.addAll(list2);
        if (!list.isEmpty()) {
            TabLayout tabLayout = this.w;
            if (tabLayout == null) {
                Intrinsics.n("sportTabLayout");
                throw null;
            }
            tabLayout.n();
            ArrayList arrayList2 = this.f;
            arrayList2.clear();
            tabLayout.o(this);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mfb0 mfb0VarE = lfb0.d().e(((SportsEventNum) it.next()).getSportId());
                if (mfb0VarE != null) {
                    arrayList3.add(mfb0VarE);
                }
            }
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList3.get(i);
                i++;
                mfb0 mfb0Var = (mfb0) obj2;
                TabLayout.g gVarL = tabLayout.l();
                UiText uiTextC = mfb0Var.c();
                Context context = tabLayout.getContext();
                context.getClass();
                gVarL.e(uiTextC.e(context));
                gVarL.a = mfb0Var;
                tabLayout.b(gVarL);
                arrayList2.add(mfb0Var);
            }
            tabLayout.a(this);
            TabLayout.g gVarK = tabLayout.k(0);
            if (gVarK != null && (obj = gVarK.a) != null) {
                mfb0 mfb0Var2 = (mfb0) (obj instanceof mfb0 ? obj : null);
                if (mfb0Var2 != null) {
                    this.B = mfb0Var2;
                    setupMarketTabLayout(false);
                    Unit unit = Unit.a;
                }
            }
        }
        setVisibility(list.isEmpty() ? 8 : 0);
    }

    public final void j() {
        this.z.d(true);
    }

    public final void l(String str) {
        mjd0 mjd0Var = this.e;
        mjd0Var.b.setVisibility(8);
        mjd0Var.c.H(str);
        setupMarketTabLayout(true);
    }

    public final void m(RegularMarketRule regularMarketRule) {
        final ArrayList arrayListG;
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        Collection collection = yw70Var.a.f;
        collection.getClass();
        ArrayList arrayList = new ArrayList(l48.r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((zf20) it.next()).b);
        }
        int i = 0;
        yw70Var.b.b(regularMarketRule, arrayList, false);
        xhh0 upMarketTabUseCase = getUpMarketTabUseCase();
        mfb0 mfb0Var = this.B;
        whh0 whh0VarC = upMarketTabUseCase.c(regularMarketRule, mfb0Var != null ? mfb0Var.getId() : null, false);
        hkf earlyPayoutMarketResolver = getEarlyPayoutMarketResolver();
        ckf ckfVar = ckf.c;
        mfb0 mfb0Var2 = this.B;
        String id = mfb0Var2 != null ? mfb0Var2.getId() : null;
        String str = regularMarketRule.a;
        earlyPayoutMarketResolver.getClass();
        boolean zB = earlyPayoutMarketResolver.a.b(ckfVar, id, str, false);
        boolean zF = yay.f(regularMarketRule);
        if ((whh0VarC != null ? whh0VarC.b : null) != null) {
            if (yw70Var == null) {
                Intrinsics.n("adapter");
                throw null;
            }
            List list = yw70Var.a.f;
            list.getClass();
            arrayListG = g(regularMarketRule, list, whh0VarC, BetMarketOptionType.UP_MARKET);
        } else if (!zB || !zF) {
            arrayListG = this.I;
        } else {
            if (yw70Var == null) {
                Intrinsics.n("adapter");
                throw null;
            }
            List list2 = yw70Var.a.f;
            list2.getClass();
            arrayListG = g(regularMarketRule, list2, whh0VarC, BetMarketOptionType.OVER_UNDER_EARLY_GOALS);
        }
        int size = arrayListG.size();
        while (i < size) {
            Object obj = arrayListG.get(i);
            i++;
            zf20 zf20Var = (zf20) obj;
            zf20Var.getClass();
            zf20Var.a = regularMarketRule;
        }
        if (yw70Var != null) {
            yw70Var.j(arrayListG, new Runnable() { // from class: zw70
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = SearchPreMatchPanel.J;
                    boolean zIsEmpty = arrayListG.isEmpty();
                    SearchPreMatchPanel searchPreMatchPanel = this;
                    mjd0 mjd0Var = searchPreMatchPanel.e;
                    if (zIsEmpty) {
                        LoadingView loadingView = mjd0Var.c;
                        Context context = searchPreMatchPanel.getContext();
                        context.getClass();
                        loadingView.H(sn5.b(context, R.string.common_functions__no_game, new Object[0]));
                    } else {
                        mjd0Var.c.E();
                    }
                    yw70 yw70Var2 = searchPreMatchPanel.A;
                    if (yw70Var2 == null) {
                        Intrinsics.n("adapter");
                        throw null;
                    }
                    yw70Var2.notifyDataSetChanged();
                    searchPreMatchPanel.j();
                }
            });
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    public final void n(List<? extends Event> list) {
        list.getClass();
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        ity ityVar = yw70Var.d;
        if (ityVar == null) {
            Intrinsics.n("oneUpPromoPresenter");
            throw null;
        }
        ityVar.d();
        if (list.isEmpty()) {
            LoadingView loadingView = this.e.c;
            Context context = getContext();
            context.getClass();
            loadingView.H(sn5.b(context, R.string.common_functions__no_game, new Object[0]));
        }
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.addAll(list);
        setupMarketTabLayout(true);
    }

    public final void setEarlyPayoutMarketResolver(hkf hkfVar) {
        hkfVar.getClass();
        this.earlyPayoutMarketResolver = hkfVar;
    }

    public final void setMarketTabLayout(TabLayout marketTabLayout) {
        marketTabLayout.getClass();
        this.y = marketTabLayout;
        marketTabLayout.setTabMode(0);
    }

    public final void setOUEarlyGoalsSwitchStatusGetter(Function0<Boolean> getter) {
        getter.getClass();
        this.ouEarlyGoalsSwitchStatus = getter;
    }

    public final void setOneTwoUpSwitchStatusGetter(Function0<? extends avy> getter) {
        getter.getClass();
        this.oneUpTwoUpSwitchStatus = getter;
    }

    public final void setOneUpPromoPresenter(ity presenter) {
        presenter.getClass();
        yw70 yw70Var = this.A;
        if (yw70Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        presenter.getClass();
        yw70Var.d = presenter;
    }

    public final void setOneUpTwoUpSwitchStatus(Function0<? extends avy> function0) {
        function0.getClass();
        this.oneUpTwoUpSwitchStatus = function0;
    }

    public final void setOuEarlyGoalsSwitchStatus(Function0<Boolean> function0) {
        function0.getClass();
        this.ouEarlyGoalsSwitchStatus = function0;
    }

    public final void setSportTabLayout(TabLayout sportTabLayout) {
        sportTabLayout.getClass();
        this.w = sportTabLayout;
        sportTabLayout.setTabMode(0);
    }

    public final void setUpMarketTabUseCase(xhh0 xhh0Var) {
        xhh0Var.getClass();
        this.upMarketTabUseCase = xhh0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchPreMatchPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchPreMatchPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SearchPreMatchPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
