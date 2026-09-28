package com.sportybet.plugin.realsports.outrights.detail;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import com.sportybet.plugin.realsports.widget.PreMatchSpinnerTextView;
import defpackage.abz;
import defpackage.bb40;
import defpackage.bm50;
import defpackage.bmy;
import defpackage.br3;
import defpackage.cyb;
import defpackage.e880;
import defpackage.ebs;
import defpackage.ecz;
import defpackage.fbz;
import defpackage.g1i;
import defpackage.gcz;
import defpackage.gqu;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hcz;
import defpackage.hp0;
import defpackage.hqu;
import defpackage.ibz;
import defpackage.icz;
import defpackage.ij90;
import defpackage.iu2;
import defpackage.jbz;
import defpackage.jpy;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.kbz;
import defpackage.kzh;
import defpackage.l48;
import defpackage.ld;
import defpackage.lfy;
import defpackage.m2g;
import defpackage.mmc;
import defpackage.o8i0;
import defpackage.of20;
import defpackage.paj;
import defpackage.pbz;
import defpackage.q8i0;
import defpackage.qbz;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rpu;
import defpackage.s9s;
import defpackage.sn5;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vbz;
import defpackage.wsm;
import defpackage.wyl;
import defpackage.xbz;
import defpackage.xec;
import defpackage.zaz;
import defpackage.zyh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/outrights/detail/OutrightsActivity;", "Lpy1;", "", "Lhqu;", "Liu2$b;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutrightsActivity extends wyl implements hqu, iu2.b, bb40 {
    public static final /* synthetic */ int F = 0;
    public Market A;
    public wsm E;
    public ld b;
    public zaz c;
    public rpu d;
    public abz e;
    public xec f;
    public Event i;
    public String v;
    public String w;
    public String z;
    public String y = "sr:sport:1";
    public boolean B = true;
    public final q8i0 C = new q8i0(jq40.a(qbz.class), new c(), new b(), new d());
    public final q8i0 D = new q8i0(jq40.a(of20.class), new f(), new e(), new g());

    public static final class a implements lfy, paj {
        public final /* synthetic */ ecz a;

        public a(ecz eczVar) {
            this.a = eczVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return OutrightsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return OutrightsActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return OutrightsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return OutrightsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return OutrightsActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return OutrightsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static void C1(OutrightsActivity outrightsActivity, String str) {
        ld ldVar = outrightsActivity.b;
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        PreMatchSpinnerTextView preMatchSpinnerTextView = ldVar.c;
        if (!StringsKt.U(str)) {
            preMatchSpinnerTextView.setText(str);
        }
        preMatchSpinnerTextView.setTextColor(outrightsActivity.getColor(R.color.text_type1_primary));
    }

    public final qbz A1() {
        return (qbz) this.C.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final void B1(Market market) {
        ?? arrayList;
        List<Outcome> list;
        fbz fbzVar;
        if (market == null || (list = market.outcomes) == null) {
            arrayList = m2g.a;
        } else {
            arrayList = new ArrayList(l48.r(list, 10));
            for (Outcome outcome : list) {
                Event event = this.i;
                if (event != null) {
                    outcome.getClass();
                    fbzVar = new fbz(event, market, outcome, this);
                } else {
                    fbzVar = null;
                }
                arrayList.add(fbzVar);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ld ldVar = this.b;
        if (zIsEmpty) {
            if (ldVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ldVar.w.setVisibility(8);
            D1(true);
            return;
        }
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ldVar.e.E();
        ld ldVar2 = this.b;
        if (ldVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ldVar2.w.setVisibility(0);
        zaz zazVar = this.c;
        if (zazVar == null) {
            Intrinsics.n("outrightAdapter");
            throw null;
        }
        zazVar.i(arrayList);
    }

    @Override // iu2.a
    public final void C() {
        zaz zazVar = this.c;
        if (zazVar != null) {
            zazVar.notifyDataSetChanged();
        } else {
            Intrinsics.n("outrightAdapter");
            throw null;
        }
    }

    public final void D1(boolean z) {
        ld ldVar = this.b;
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ldVar.f.setVisibility(z ? 0 : 8);
        ldVar.y.setVisibility(z ? 0 : 8);
        ldVar.e.G(R.string.common_functions__no_game);
    }

    public final void E1(boolean z) {
        ld ldVar = this.b;
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ldVar.i.setVisibility(z ? 0 : 8);
        ldVar.v.setVisibility(z ? 0 : 8);
        ldVar.A.setVisibility(8);
        ldVar.b.setVisibility(8);
        ldVar.y.setViewStatus(z);
    }

    public final void F1(e880 e880Var) {
        Event event = this.i;
        if (event != null) {
            Selection selection = e880Var.a;
            String str = event.eventId;
            str.getClass();
            if (str.length() > 0) {
                Event event2 = selection.a;
                Market market = selection.b;
                if (Intrinsics.g(event2.eventId, str)) {
                    for (Market market2 : event.markets) {
                        String str2 = market.specifier;
                        if (str2 == null && market2.specifier == null) {
                            if (Intrinsics.g(market2.id, market.id)) {
                                market2.updateForOutright(e880Var.b);
                                zaz zazVar = this.c;
                                if (zazVar != null) {
                                    zazVar.notifyDataSetChanged();
                                    return;
                                } else {
                                    Intrinsics.n("outrightAdapter");
                                    throw null;
                                }
                            }
                        } else if (market2.specifier != null && str2 != null && Intrinsics.g(market2.id, market.id) && Intrinsics.g(market2.specifier, market.specifier)) {
                            market2.updateForOutright(e880Var.b);
                            zaz zazVar2 = this.c;
                            if (zazVar2 != null) {
                                zazVar2.notifyDataSetChanged();
                                return;
                            } else {
                                Intrinsics.n("outrightAdapter");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.hqu
    public final void X0(Market market) {
        this.A = market;
        String str = market.desc;
        str.getClass();
        ld ldVar = this.b;
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        SearchMarketView searchMarketView = ldVar.y;
        ibz ibzVar = searchMarketView.F;
        AppCompatEditText appCompatEditText = ibzVar.c;
        TextView textView = ibzVar.b;
        appCompatEditText.setText("");
        searchMarketView.clearFocus();
        searchMarketView.J = str;
        textView.setVisibility(0);
        textView.setText(str);
        E1(false);
        B1(market);
        E1(false);
        rpu rpuVar = this.d;
        if (rpuVar == null) {
            Intrinsics.n("marketAdapter");
            throw null;
        }
        Collection<gqu> collection = rpuVar.a.f;
        collection.getClass();
        for (gqu gquVar : collection) {
            gquVar.b = gquVar.a.equals(this.A);
        }
        rpu rpuVar2 = this.d;
        if (rpuVar2 == null) {
            Intrinsics.n("marketAdapter");
            throw null;
        }
        rpuVar2.notifyItemRangeChanged(0, rpuVar2.a.f.size());
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [fcz] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_outrights, (ViewGroup) null, false);
        int i = R.id.bottom_gradient;
        View viewA = h5e.a(R.id.bottom_gradient, viewInflate);
        if (viewA != null) {
            i = R.id.category_spinner;
            PreMatchSpinnerTextView preMatchSpinnerTextView = (PreMatchSpinnerTextView) h5e.a(R.id.category_spinner, viewInflate);
            if (preMatchSpinnerTextView != null) {
                i = R.id.event_divider_line;
                View viewA2 = h5e.a(R.id.event_divider_line, viewInflate);
                if (viewA2 != null) {
                    i = R.id.loading;
                    LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
                    if (loadingView != null) {
                        i = R.id.market_divider_line;
                        View viewA3 = h5e.a(R.id.market_divider_line, viewInflate);
                        if (viewA3 != null) {
                            i = R.id.market_mask;
                            View viewA4 = h5e.a(R.id.market_mask, viewInflate);
                            if (viewA4 != null) {
                                i = R.id.market_recycler;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.market_recycler, viewInflate);
                                if (recyclerView != null) {
                                    i = R.id.recycler;
                                    RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.recycler, viewInflate);
                                    if (recyclerView2 != null) {
                                        i = R.id.search_spinner;
                                        SearchMarketView searchMarketView = (SearchMarketView) h5e.a(R.id.search_spinner, viewInflate);
                                        if (searchMarketView != null) {
                                            i = R.id.title_bar;
                                            View viewA5 = h5e.a(R.id.title_bar, viewInflate);
                                            if (viewA5 != null) {
                                                ij90 ij90VarA = ij90.a(viewA5);
                                                i = R.id.top_gradient;
                                                View viewA6 = h5e.a(R.id.top_gradient, viewInflate);
                                                if (viewA6 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    this.b = new ld(constraintLayout, viewA, preMatchSpinnerTextView, viewA2, loadingView, viewA3, viewA4, recyclerView, recyclerView2, searchMarketView, ij90VarA, viewA6);
                                                    setContentView(constraintLayout);
                                                    this.v = getIntent().getStringExtra("EXTRA_EVENT_ID");
                                                    this.w = getIntent().getStringExtra("EXTRA_MARKET_ID");
                                                    this.z = getIntent().getStringExtra("EXTRA_MARKET_SPECIFIER");
                                                    this.y = String.valueOf(getIntent().getStringExtra("key_sport_id"));
                                                    ld ldVar = this.b;
                                                    if (ldVar == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    final SimpleActionBar simpleActionBar = ldVar.z.a;
                                                    simpleActionBar.setTitle(sn5.c(simpleActionBar, R.string.common_functions__outrights, new Object[0]));
                                                    simpleActionBar.setSearchActionButton(new View.OnClickListener() { // from class: bcz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i2 = OutrightsActivity.F;
                                                            yrh0.k(this.a);
                                                        }
                                                    });
                                                    simpleActionBar.setBackButton(new View.OnClickListener() { // from class: ccz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i2 = OutrightsActivity.F;
                                                            this.a.onBackPressed();
                                                        }
                                                    });
                                                    simpleActionBar.setHomeButton(new View.OnClickListener() { // from class: dcz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i2 = OutrightsActivity.F;
                                                            sh8.c().e(o7d.a(wae.HOME));
                                                            c8i0.g(simpleActionBar);
                                                        }
                                                    });
                                                    ld ldVar2 = this.b;
                                                    if (ldVar2 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    this.e = new abz(new jpy() { // from class: fcz
                                                        @Override // defpackage.jpy
                                                        public final void a(String str, String str2) {
                                                            int i2 = OutrightsActivity.F;
                                                            str.getClass();
                                                            str2.getClass();
                                                            OutrightsActivity outrightsActivity = this.a;
                                                            xec xecVar = outrightsActivity.f;
                                                            if (xecVar == null) {
                                                                Intrinsics.n("tournamentListPopWindow");
                                                                throw null;
                                                            }
                                                            xecVar.a();
                                                            outrightsActivity.v = str;
                                                            outrightsActivity.A1().x1(str);
                                                            OutrightsActivity.C1(outrightsActivity, str2);
                                                        }
                                                    });
                                                    this.d = new rpu(this);
                                                    RecyclerView recyclerView3 = ldVar2.v;
                                                    recyclerView3.setItemAnimator(null);
                                                    rpu rpuVar = this.d;
                                                    if (rpuVar == null) {
                                                        Intrinsics.n("marketAdapter");
                                                        throw null;
                                                    }
                                                    recyclerView3.setAdapter(rpuVar);
                                                    recyclerView3.k(new gcz(this));
                                                    this.c = new zaz(new zaz.a());
                                                    o oVar = new o(this);
                                                    Drawable drawable = getDrawable(R.drawable.line_divider);
                                                    if (drawable != null) {
                                                        oVar.a = drawable;
                                                    }
                                                    RecyclerView recyclerView4 = ldVar2.w;
                                                    recyclerView4.setItemAnimator(null);
                                                    zaz zazVar = this.c;
                                                    if (zazVar == null) {
                                                        Intrinsics.n("outrightAdapter");
                                                        throw null;
                                                    }
                                                    recyclerView4.setAdapter(zazVar);
                                                    recyclerView4.i(oVar);
                                                    PreMatchSpinnerTextView preMatchSpinnerTextView2 = ldVar2.c;
                                                    preMatchSpinnerTextView2.setOnClickListener(new View.OnClickListener() { // from class: zbz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            OutrightsActivity outrightsActivity = this.a;
                                                            ld ldVar3 = outrightsActivity.b;
                                                            if (ldVar3 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            ldVar3.c.setExpanded(true);
                                                            View viewInflate2 = LayoutInflater.from(outrightsActivity).inflate(R.layout.outright_touranament_list, (ViewGroup) null);
                                                            viewInflate2.getClass();
                                                            View viewFindViewById = viewInflate2.findViewById(R.id.tournament_recycler);
                                                            viewFindViewById.getClass();
                                                            RecyclerView recyclerView5 = (RecyclerView) viewFindViewById;
                                                            abz abzVar = outrightsActivity.e;
                                                            if (abzVar == null) {
                                                                Intrinsics.n("outrightCategoryAdapter");
                                                                throw null;
                                                            }
                                                            recyclerView5.setAdapter(abzVar);
                                                            xec.a aVar = new xec.a(outrightsActivity);
                                                            xec xecVar = aVar.a;
                                                            xecVar.f = viewInflate2;
                                                            xecVar.e = -1;
                                                            xecVar.b = -1;
                                                            xecVar.c = -2;
                                                            xecVar.d = true;
                                                            xecVar.y = true;
                                                            xecVar.v = new wbz(outrightsActivity);
                                                            xec xecVarA = aVar.a();
                                                            ld ldVar4 = outrightsActivity.b;
                                                            if (ldVar4 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            PreMatchSpinnerTextView preMatchSpinnerTextView3 = ldVar4.c;
                                                            PopupWindow popupWindow = xecVarA.i;
                                                            if (popupWindow != null) {
                                                                popupWindow.showAsDropDown(preMatchSpinnerTextView3, 0, 0);
                                                            }
                                                            outrightsActivity.f = xecVarA;
                                                            outrightsActivity.E1(false);
                                                        }
                                                    });
                                                    preMatchSpinnerTextView2.setTextColor(getColor(R.color.text_type1_primary));
                                                    ldVar2.e.getErrorView().getButton().setOnClickListener(new View.OnClickListener() { // from class: acz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i2 = OutrightsActivity.F;
                                                            this.a.z1();
                                                        }
                                                    });
                                                    ld ldVar3 = this.b;
                                                    if (ldVar3 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    ldVar3.i.setOnClickListener(new View.OnClickListener() { // from class: ybz
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i2 = OutrightsActivity.F;
                                                            this.a.E1(false);
                                                        }
                                                    });
                                                    z1();
                                                    v340 v340Var = A1().f;
                                                    s9s lifecycle = getLifecycle();
                                                    s9s.b bVar = s9s.b.d;
                                                    kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar), new hcz(this, null)), ebs.a(getLifecycle()));
                                                    kzh.d(new g1i(zyh.a(A1().d, getLifecycle(), bVar), new icz(this, null)), ebs.a(getLifecycle()));
                                                    ((of20) this.D.getValue()).D.f(this, new a(new ecz(this)));
                                                    ld ldVar4 = this.b;
                                                    if (ldVar4 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    ldVar4.y.setupSearchableView(new vbz(this), new xbz(this));
                                                    iu2.a(this);
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        iu2.q(this);
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, false);
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
    }

    public final void z1() {
        String str;
        Sport sport;
        this.B = true;
        String str2 = this.v;
        if (str2 != null) {
            A1().x1(str2);
        }
        qbz qbzVarA1 = A1();
        Event event = this.i;
        if (event == null || (sport = event.sport) == null || (str = sport.id) == null) {
            str = this.y;
        }
        str.getClass();
        jvd0 jvd0Var = qbzVarA1.w;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        kbz kbzVar = qbzVarA1.a;
        kbzVar.getClass();
        qbzVarA1.w = kzh.d(new g1i(bm50.a(new jbz(kbzVar.a.t(str, ""), true, kbzVar)), new pbz(qbzVarA1, null)), o8i0.d(qbzVarA1));
    }
}
