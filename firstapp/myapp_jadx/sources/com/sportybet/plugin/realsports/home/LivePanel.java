package com.sportybet.plugin.realsports.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.home.LivePanel;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.a8z;
import defpackage.asy;
import defpackage.avy;
import defpackage.crs;
import defpackage.dfm;
import defpackage.djs;
import defpackage.e8z;
import defpackage.f00;
import defpackage.g8z;
import defpackage.gby;
import defpackage.gr0;
import defpackage.gym;
import defpackage.hb5;
import defpackage.hgm;
import defpackage.hih0;
import defpackage.hkf;
import defpackage.inm;
import defpackage.ins;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iuy;
import defpackage.iym;
import defpackage.jrs;
import defpackage.js;
import defpackage.k650;
import defpackage.krs;
import defpackage.lfb0;
import defpackage.mjf;
import defpackage.muh;
import defpackage.nns;
import defpackage.o5e;
import defpackage.osa0;
import defpackage.ovs;
import defpackage.qbm;
import defpackage.qvs;
import defpackage.s3p;
import defpackage.sn5;
import defpackage.tay;
import defpackage.uhm;
import defpackage.urs;
import defpackage.v5k;
import defpackage.vgb0;
import defpackage.vj5;
import defpackage.vuy;
import defpackage.w1k;
import defpackage.w7i0;
import defpackage.wga;
import defpackage.wwd0;
import defpackage.xhh0;
import defpackage.xul;
import defpackage.y8j;
import defpackage.zhh0;
import defpackage.zuy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class LivePanel extends xul implements iu2.b, djs.d {
    public static final /* synthetic */ int c0 = 0;
    public hkf A;
    public xhh0 B;
    public zhh0 C;
    public LoadingView D;
    public TabLayout E;
    public TabLayout F;
    public RelativeLayout G;
    public List<Event> H;
    public View I;
    public OneUpTwoUpSwitch J;
    public OUEarlyGoalsSwitch K;
    public View L;
    public BubbleView M;
    public djs N;
    public nns O;
    public qbm P;
    public g8z Q;
    public asy R;
    public tay S;
    public Boolean T;
    public final Rect U;
    public w7i0 V;
    public final a W;
    public final b a0;
    public TextView b0;
    public y8j c;
    public iym d;
    public k650 e;
    public a8z f;
    public muh i;
    public v5k v;
    public final HashMap w;
    public iuy y;
    public mjf z;

    public class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            Sport sport = (Sport) gVar.a;
            int i = LivePanel.c0;
            LivePanel livePanel = LivePanel.this;
            livePanel.r(sport);
            nns nnsVar = livePanel.O;
            if (nnsVar == null || sport == null) {
                return;
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_PANEL);
            aVar.a(inm.a("onSportChanged sportId: ", sport.id), new Object[0]);
            if (sport.equals(nnsVar.z)) {
                return;
            }
            nnsVar.z = sport;
            nnsVar.A = null;
            wwd0 wwd0Var = nnsVar.C;
            avy avyVar = avy.c;
            wwd0Var.getClass();
            wwd0Var.k(null, avyVar);
            wwd0 wwd0Var2 = nnsVar.E;
            Boolean bool = Boolean.FALSE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool);
            wwd0 wwd0Var3 = nnsVar.O;
            Object data = ((UIState) wwd0Var3.getValue()).getData();
            wwd0Var3.setValue(data != null ? new UIState.Loading(ins.a((ins) data, sport, null, null, null, null, 37)) : UIState.Idle.INSTANCE);
            nnsVar.z1();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            LivePanel livePanel;
            nns nnsVar;
            RegularMarketRule regularMarketRule = (RegularMarketRule) gVar.a;
            if (regularMarketRule == null || (nnsVar = (livePanel = LivePanel.this).O) == null) {
                return;
            }
            nnsVar.B1(regularMarketRule, false);
            Sport selectedSport = livePanel.getSelectedSport();
            RegularMarketRule selectedMarket = livePanel.getSelectedMarket();
            if (selectedSport == null || selectedMarket == null) {
                return;
            }
            f00 f00Var = vgb0.a;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.CONTENT_TYPE, "A_" + selectedSport.id + "_" + selectedMarket.a)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
            mapUnmodifiableMap.getClass();
            vgb0.c("quick_market", mapUnmodifiableMap, false);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public class c extends OneUpTwoUpSwitch.d {
        public c() {
        }

        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
        public final void d(OneUpTwoUpSwitch.f fVar) {
            LivePanel livePanel = LivePanel.this;
            asy asyVar = livePanel.R;
            if (asyVar != null) {
                asyVar.d(fVar);
            }
            livePanel.n(hih0.g(fVar));
        }
    }

    public LivePanel(Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((urs) generatedComponent()).a(this);
        }
        this.w = new HashMap();
        this.H = new ArrayList();
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.R = null;
        this.S = null;
        this.T = Boolean.FALSE;
        this.U = new Rect();
        this.W = new a();
        this.a0 = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RegularMarketRule getSelectedMarket() {
        int selectedTabPosition = this.F.getTabCount() > 0 ? this.F.getSelectedTabPosition() : -1;
        if (selectedTabPosition > -1) {
            return (RegularMarketRule) this.F.k(selectedTabPosition).a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Sport getSelectedSport() {
        int selectedTabPosition = this.E.getTabCount() > 0 ? this.E.getSelectedTabPosition() : -1;
        if (selectedTabPosition > -1) {
            return (Sport) this.E.k(selectedTabPosition).a;
        }
        return null;
    }

    private void setTotalEvents(List<Sport> list) {
        ArrayList arrayListF = lfb0.d().f(list);
        int size = arrayListF.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListF.get(i2);
            i2++;
            i += ((Sport) obj).eventSize;
        }
        this.b0.setText(sn5.b(getContext(), R.string.live__all_events, String.valueOf(i)));
    }

    @Override // iu2.a
    public final void C() {
        HashMap map = this.w;
        map.values().removeIf(new jrs());
        map.values().forEach(new krs());
    }

    @Override // djs.d
    public final void a(Event event) {
        qbm qbmVar = this.P;
        if (qbmVar != null) {
            ((dfm) qbmVar).a(event);
        }
    }

    @Override // djs.d
    public final void c(Event event) {
        qbm qbmVar = this.P;
        if (qbmVar != null) {
            dfm dfmVar = (dfm) qbmVar;
            String str = event.sport.id;
            if (str == null) {
                str = "";
            }
            ovs ovsVar = new ovs(str);
            dfmVar.J.f("lv__match_tracker__click", ovsVar.createCustomMetrics());
            gym.a(dfmVar.R, ovsVar);
            qvs qvsVar = new qvs();
            qvsVar.setArguments(vj5.a(new Pair("ARG_EVENT", event)));
            qvsVar.show(dfmVar.requireActivity().getSupportFragmentManager(), "LiveVirtualMatchTrackerDialogFragment");
        }
    }

    @Override // djs.d
    public final void d(Selection selection, boolean z) {
        g8z g8zVar = this.Q;
        if (g8zVar != null) {
            g8zVar.a(selection, z, e8z.c);
        }
    }

    @Override // djs.d
    public final void e() {
        Context context = getContext();
        String strB = sn5.b(getContext(), R.string.common_functions__dynamic_market_info_text, new Object[0]);
        context.getClass();
        js.d(context, R.string.common_functions__dynamic_market_info_title, strB, null, null, 48);
    }

    @Override // djs.d
    public final void f(String str, String str2) {
        nns nnsVar = this.O;
        if (nnsVar != null) {
            nnsVar.getClass();
            str.getClass();
            str2.getClass();
            nnsVar.D1(str, str2);
        }
    }

    @Override // djs.d
    public final boolean g() {
        return false;
    }

    public final /* synthetic */ void k() {
        Sport selectedSport = getSelectedSport();
        if (selectedSport != null) {
            Intent intent = new Intent(getContext(), (Class<?>) LivePageActivity.class);
            intent.putExtra("key_sport_id", selectedSport.id);
            getContext().startActivity(intent);
        }
    }

    public final void l(boolean z) {
        nns nnsVar;
        tay tayVar = this.S;
        if (tayVar != null) {
            tayVar.onStateChanged(z);
        }
        Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || selectedMarket == null || (nnsVar = this.O) == null) {
            return;
        }
        osa0.a(z, nnsVar.E, null);
        String str = selectedSport.id;
        str.getClass();
        RegularMarketRule regularMarketRuleY1 = nnsVar.y1(str, selectedMarket);
        nnsVar.G1(selectedMarket, regularMarketRuleY1);
        if (TextUtils.equals(regularMarketRuleY1.a, selectedMarket.a)) {
            return;
        }
        m(selectedMarket, regularMarketRuleY1);
    }

    public final void m(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        if (this.O == null) {
            return;
        }
        for (int i = 0; i < this.F.getTabCount(); i++) {
            TabLayout.g gVarK = this.F.k(i);
            if (gVarK != null) {
                Object obj = gVarK.a;
                if ((obj instanceof RegularMarketRule) && TextUtils.equals(((RegularMarketRule) obj).a, regularMarketRule.a)) {
                    gVarK.a = regularMarketRule2;
                    break;
                }
            }
        }
        this.O.B1(regularMarketRule2, true);
    }

    public final void n(avy avyVar) {
        nns nnsVar;
        Sport selectedSport = getSelectedSport();
        RegularMarketRule selectedMarket = getSelectedMarket();
        if (selectedSport == null || selectedMarket == null || (nnsVar = this.O) == null) {
            return;
        }
        wwd0 wwd0Var = nnsVar.C;
        wwd0Var.getClass();
        wwd0Var.k(null, avyVar);
        String str = selectedSport.id;
        str.getClass();
        RegularMarketRule regularMarketRuleY1 = nnsVar.y1(str, selectedMarket);
        nnsVar.G1(selectedMarket, regularMarketRuleY1);
        if (TextUtils.equals(regularMarketRuleY1.a, selectedMarket.a)) {
            return;
        }
        m(selectedMarket, regularMarketRuleY1);
    }

    public final void o() {
        this.V.a.removeAllViews();
        this.w.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = Boolean.valueOf(getGlobalVisibleRect(this.U));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = Boolean.FALSE;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.D = loadingView;
        loadingView.getEmptyView().setTextColor(-1);
        this.D.getErrorView().getTitle().setTextColor(-1);
        Button button = this.D.getErrorView().getButton();
        button.setBackgroundResource(R.drawable.bg_fiilled_brand_secondary_3_radius);
        button.setTextColor(getContext().getColor(R.color.absolute_type1));
        button.setText(sn5.c(this, R.string.common_functions__retry, new Object[0]));
        TextView textView = (TextView) findViewById(R.id.bottom_all);
        this.b0 = textView;
        textView.setTextColor(getResources().getColor(R.color.brand_secondary_variable_type3));
        this.b0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(getContext(), R.drawable.spr_ic_chevron_right_black_24dp), (Drawable) null);
        this.b0.setOnClickListener(new View.OnClickListener() { // from class: irs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = LivePanel.c0;
                this.a.k();
            }
        });
        this.V = new w7i0((ViewGroup) findViewById(R.id.event_view_container));
    }

    public final void p(List<Sport> list, Sport sport) {
        if (list == null || sport == null) {
            return;
        }
        int tabCount = this.E.getTabCount();
        if (tabCount == list.size()) {
            for (int i = 0; i < tabCount; i++) {
                if (((Sport) this.E.k(i).a).equals(list.get(i))) {
                }
            }
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIVE_PANEL);
        aVar.a("Render sports tab", new Object[0]);
        if (list.isEmpty()) {
            View view = this.I;
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            return;
        }
        TabLayout tabLayout = this.E;
        a aVar2 = this.W;
        tabLayout.o(aVar2);
        this.E.n();
        for (Sport sport2 : list) {
            TabLayout.g gVarL = this.E.l();
            gVarL.e(sport2.name);
            gVarL.a = sport2;
            this.E.b(gVarL);
            if (TextUtils.equals(sport.id, sport2.id)) {
                gVarL.b();
            }
        }
        this.E.a(aVar2);
        r((Sport) CollectionsKt.firstOrNull(list));
        setTotalEvents(list);
        setVisibility(0);
        View view2 = this.I;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.b0.setVisibility(0);
    }

    public final void q(boolean z) {
        Sport selectedSport;
        boolean globalVisibleRect = getGlobalVisibleRect(this.U);
        boolean zBooleanValue = false;
        boolean z2 = this.T.booleanValue() != globalVisibleRect;
        if (z2) {
            this.T = Boolean.valueOf(globalVisibleRect);
        }
        if (!z) {
            zBooleanValue = this.T.booleanValue();
        } else if (z2 && this.T.booleanValue()) {
            zBooleanValue = true;
        }
        if (zBooleanValue && (selectedSport = getSelectedSport()) != null && selectedSport.isValid() && !this.H.isEmpty()) {
            iym iymVar = this.d;
            String str = selectedSport.id;
            PageMeta.INSTANCE.getClass();
            gym.a(iymVar, new hgm(str, PageMeta.Companion.b()));
        }
    }

    public final void r(Sport sport) {
        if (sport == null || !"sr:sport:202120001".equals(sport.id)) {
            return;
        }
        uhm uhmVar = new uhm();
        this.c.f("home_view", new HashMap());
        gym.a(this.d, uhmVar);
    }

    public final void s(int i, int i2) {
        if (this.V.a.getChildCount() != this.H.size() || i == -1) {
            o();
            for (int i3 = 0; i3 < this.H.size(); i3++) {
                s3p s3pVar = (s3p) this.N.onCreateViewHolder(this, 1);
                this.N.onBindViewHolder(s3pVar, i3);
                s3pVar.itemView.setTag(R.id.live_panel, Integer.valueOf(i3));
                this.V.a.addView(s3pVar.itemView);
            }
        } else {
            for (int i4 = i; i4 < i + i2; i4++) {
                View childAt = this.V.a.getChildAt(i4);
                if (childAt == null) {
                    s(-1, -1);
                    return;
                }
                this.V.a.removeView(childAt);
                s3p s3pVar2 = (s3p) this.N.onCreateViewHolder(this, 1);
                this.N.onBindViewHolder(s3pVar2, i4);
                s3pVar2.itemView.setTag(R.id.live_panel, Integer.valueOf(i4));
                this.V.a.addView(s3pVar2.itemView, i4);
            }
        }
        this.V.a.setVisibility(0);
        this.D.E();
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    public void setActionListener(qbm qbmVar) {
        this.P = qbmVar;
    }

    public void setMarketOptionViews(OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, View view, final BubbleView bubbleView) {
        this.J = oneUpTwoUpSwitch;
        this.K = oUEarlyGoalsSwitch;
        this.L = view;
        this.M = bubbleView;
        oneUpTwoUpSwitch.setOnStateChangedListener(new c());
        oUEarlyGoalsSwitch.setOnStateChangedListener(new crs(this));
        gby.a(bubbleView.getDescriptionView(), new o5e(bubbleView, 2));
        bubbleView.setOnClickedClose(new Function0() { // from class: hrs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                asy asyVar;
                int i = LivePanel.c0;
                jqu jquVarB = lqu.b(bubbleView);
                jqu jquVar = jqu.b;
                LivePanel livePanel = this.a;
                if (jquVarB != jquVar || (asyVar = livePanel.R) == null) {
                    tay tayVar = livePanel.S;
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
        this.F = tabLayout;
        tabLayout.setTabMode(0);
    }

    public void setMarketTitle(RelativeLayout relativeLayout) {
        this.G = relativeLayout;
    }

    public void setOUEarlyGoalsCoordinator(tay tayVar) {
        this.S = tayVar;
    }

    public void setOneTwoUpStateCoordinator(asy asyVar) {
        this.R = asyVar;
    }

    public void setOutcomeChangeListener(g8z g8zVar) {
        this.Q = g8zVar;
    }

    public void setSportTabLayout(TabLayout tabLayout) {
        this.E = tabLayout;
        tabLayout.setTabMode(0);
    }

    public void setupUpMarketViews() {
        zuy zuyVarA = vuy.a(this.y.e());
        OneUpTwoUpSwitch oneUpTwoUpSwitch = this.J;
        if (oneUpTwoUpSwitch != null) {
            zuy zuyVarE = hih0.e(oneUpTwoUpSwitch.getA());
            avy avyVarG = hih0.g(this.J.getB());
            if (zuyVarE == zuyVarA || avyVarG != avy.c) {
                return;
            }
            hih0.a(this.J, zuyVarA);
        }
    }

    public LivePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new HashMap();
        this.H = new ArrayList();
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.R = null;
        this.S = null;
        this.T = Boolean.FALSE;
        this.U = new Rect();
        this.W = new a();
        this.a0 = new b();
    }
}
