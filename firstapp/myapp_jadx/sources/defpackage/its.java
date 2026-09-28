package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.BetMarketOptionType;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.LiveSectionData;
import com.sportybet.plugin.realsports.prematch.widget.LiveEventsRecyclerView;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class its {
    public final /* synthetic */ vfh0 a;
    public final LiveTogglesContainer b;
    public final MarketsTabs c;
    public final gid0 d;
    public final LiveEventsRecyclerView e;
    public final LoadingView f;
    public final OneUpTwoUpSwitch g;
    public final OUEarlyGoalsSwitch h;
    public final View i;
    public final BubbleView j;
    public final iuy k;
    public final mjf l;
    public final xhh0 m;
    public final zhh0 n;
    public final p5b o;
    public final wk20 p;
    public final xk20 q;
    public final PreMatchSportActivity.c r;
    public lk50<LiveSectionData> s = lk50.b.a;
    public String t;
    public RegularMarketRule u;
    public final mpe0 v;

    public its(Context context, LiveTogglesContainer liveTogglesContainer, MarketsTabs marketsTabs, gid0 gid0Var, LiveEventsRecyclerView liveEventsRecyclerView, LoadingView loadingView, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, View view, BubbleView bubbleView, iuy iuyVar, mjf mjfVar, xhh0 xhh0Var, zhh0 zhh0Var, p5b p5bVar, wk20 wk20Var, xk20 xk20Var, PreMatchSportActivity.c cVar) {
        this.a = new vfh0(context, "prematch/live");
        this.b = liveTogglesContainer;
        this.c = marketsTabs;
        this.d = gid0Var;
        this.e = liveEventsRecyclerView;
        this.f = loadingView;
        this.g = oneUpTwoUpSwitch;
        this.h = oUEarlyGoalsSwitch;
        this.i = view;
        this.j = bubbleView;
        this.k = iuyVar;
        this.l = mjfVar;
        this.m = xhh0Var;
        this.n = zhh0Var;
        this.o = p5bVar;
        this.p = wk20Var;
        this.q = xk20Var;
        this.r = cVar;
        mpe0 mpe0VarB = hwr.b(new a7e(this, 1));
        this.v = mpe0VarB;
        gid0Var.b.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        liveTogglesContainer.setToggleContainerListener(new gts(this));
        marketsTabs.setMarketSelected(new Function1() { // from class: cts
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RegularMarketRule regularMarketRule = (RegularMarketRule) obj;
                regularMarketRule.getClass();
                its itsVar = this.a;
                lk50<LiveSectionData> lk50Var = itsVar.s;
                lk50.c cVar2 = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
                if (cVar2 != null) {
                    List<Tournament> tournaments = ((LiveSectionData) cVar2.a).getTournaments();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = tournaments.iterator();
                    while (it.hasNext()) {
                        Iterable iterable = ((Tournament) it.next()).events;
                        if (iterable == null) {
                            iterable = m2g.a;
                        }
                        p48.w(iterable, arrayList);
                    }
                    itsVar.a.b(regularMarketRule, arrayList, true);
                }
                itsVar.u = regularMarketRule;
                itsVar.a(regularMarketRule);
                itsVar.c(regularMarketRule, ((Boolean) itsVar.o.invoke()).booleanValue());
                itsVar.e.F0(regularMarketRule);
                itsVar.r.b(regularMarketRule);
                return Unit.a;
            }
        });
        liveEventsRecyclerView.setTournamentsListener(new hts(this));
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: dts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                preMatchSportActivity.E1().x1();
            }
        });
        loadingView.getErrorView().getTitle().setTextColor(-1);
    }

    public final void a(final RegularMarketRule regularMarketRule) {
        gid0 gid0Var = this.d;
        TextView textView = gid0Var.c;
        ListenableSpinner listenableSpinner = gid0Var.b;
        List listK = b.k(textView, gid0Var.d, gid0Var.e, gid0Var.f);
        String[] strArr = regularMarketRule.d;
        strArr.getClass();
        int size = listK.size();
        int i = 0;
        while (true) {
            int i2 = 8;
            if (i >= size) {
                break;
            }
            if (i < strArr.length) {
                ((TextView) listK.get(i)).setText(strArr[i]);
            }
            Object obj = listK.get(i);
            obj.getClass();
            View view = (View) obj;
            if (i < strArr.length) {
                i2 = 0;
            }
            view.setVisibility(i2);
            i++;
        }
        if (!regularMarketRule.c) {
            listenableSpinner.setVisibility(8);
            return;
        }
        listenableSpinner.setVisibility(0);
        listenableSpinner.setOnItemSelectedListener(null);
        mpe0 mpe0Var = this.v;
        ((eru) mpe0Var.getValue()).clear();
        eru eruVar = (eru) mpe0Var.getValue();
        vfh0 vfh0Var = this.a;
        eruVar.addAll(vfh0Var.g());
        String str = regularMarketRule.a;
        str.getClass();
        listenableSpinner.setSelection(vfh0Var.f(str));
        listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: ets
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view2, int i3, long j) {
                final RegularMarketRule regularMarketRule2 = regularMarketRule;
                String str2 = regularMarketRule2.a;
                str2.getClass();
                final its itsVar = this.a;
                itsVar.a.h(i3, str2, new Function1() { // from class: fts
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LiveEventsRecyclerView liveEventsRecyclerView = itsVar.e;
                        String str3 = regularMarketRule2.a;
                        str3.getClass();
                        liveEventsRecyclerView.z0(str3, (String) obj2);
                        return Unit.a;
                    }
                });
            }
        });
    }

    public final void b() {
        boolean zIsChecked = this.b.a.e.isChecked();
        LiveEventsRecyclerView liveEventsRecyclerView = this.e;
        gid0 gid0Var = this.d;
        MarketsTabs marketsTabs = this.c;
        LoadingView loadingView = this.f;
        if (!zIsChecked) {
            c8i0.f(marketsTabs);
            gid0Var.a.setVisibility(8);
            c8i0.f(liveEventsRecyclerView);
            loadingView.E();
            c(this.u, true);
            return;
        }
        lk50<LiveSectionData> lk50Var = this.s;
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            loadingView.K();
            c8i0.f(marketsTabs);
            gid0Var.a.setVisibility(8);
            c8i0.f(liveEventsRecyclerView);
        } else if (lk50Var instanceof lk50.a) {
            loadingView.I();
            c8i0.f(marketsTabs);
            gid0Var.a.setVisibility(8);
            c8i0.f(liveEventsRecyclerView);
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return;
            }
            loadingView.E();
            c8i0.n(marketsTabs);
            gid0Var.a.setVisibility(0);
            c8i0.n(liveEventsRecyclerView);
        }
        c(this.u, false);
    }

    public final void c(RegularMarketRule regularMarketRule, boolean z) {
        String str = this.t;
        xhh0 xhh0Var = this.m;
        boolean zE = xhh0Var.e(regularMarketRule, str, true);
        boolean zB = this.l.b(ckf.c, this.t, regularMarketRule != null ? regularMarketRule.a : null, true);
        boolean zBooleanValue = ((Boolean) this.p.invoke()).booleanValue();
        PreMatchSportActivity.c cVar = this.r;
        View view = this.i;
        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = this.h;
        OneUpTwoUpSwitch oneUpTwoUpSwitch = this.g;
        BubbleView bubbleView = this.j;
        if (!z && zE) {
            whh0 whh0VarD = xhh0Var.d(this.t, regularMarketRule != null ? regularMarketRule.a : null, true);
            this.n.getClass();
            yhh0 yhh0VarA = zhh0.a(whh0VarD);
            hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
            hih0.c(oneUpTwoUpSwitch, yhh0VarA.b, false, true);
            oneUpTwoUpSwitch.setVisibility(0);
            c8i0.f(oUEarlyGoalsSwitch);
            c8i0.n(view);
            jqu jquVar = (((Boolean) this.q.invoke()).booleanValue() || !((whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a))) ? null : jqu.b;
            if (jquVar != null) {
                lqu.c(bubbleView, jquVar, null);
            }
            c8i0.o(bubbleView, jquVar != null);
            cVar.a(BetMarketOptionType.UP_MARKET, regularMarketRule);
            return;
        }
        if (z || !zB) {
            c8i0.f(oneUpTwoUpSwitch);
            c8i0.f(oUEarlyGoalsSwitch);
            c8i0.f(view);
            c8i0.f(bubbleView);
            return;
        }
        c8i0.f(oneUpTwoUpSwitch);
        c8i0.n(oUEarlyGoalsSwitch);
        c8i0.n(view);
        if (zBooleanValue) {
            lqu.c(bubbleView, jqu.a, null);
        }
        c8i0.o(bubbleView, zBooleanValue);
        cVar.a(BetMarketOptionType.OVER_UNDER_EARLY_GOALS, regularMarketRule);
    }

    public final void d(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        MarketsTabs marketsTabs = this.c;
        int tabCount = marketsTabs.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g gVarK = marketsTabs.k(i);
            Object obj = gVarK != null ? gVarK.a : null;
            RegularMarketRule regularMarketRule3 = obj instanceof RegularMarketRule ? (RegularMarketRule) obj : null;
            if (Intrinsics.g(regularMarketRule3 != null ? regularMarketRule3.a : null, regularMarketRule.a)) {
                gVarK.a = regularMarketRule2;
                marketsTabs.getMarketSelected().invoke(regularMarketRule2);
                return;
            }
        }
    }
}
