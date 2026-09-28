package com.sportybet.android.instantwin.presentation.openbet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.SubTitleBar;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1z;
import defpackage.a5o;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.dz50;
import defpackage.e1i;
import defpackage.ghh0;
import defpackage.hb5;
import defpackage.i2i;
import defpackage.jq40;
import defpackage.jqc;
import defpackage.k00;
import defpackage.kb2;
import defpackage.lfy;
import defpackage.mta0;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.pcb;
import defpackage.phl;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.s8i0;
import defpackage.t0z;
import defpackage.uyl;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.w1k;
import defpackage.wga;
import defpackage.wgi;
import defpackage.x0z;
import defpackage.xzy;
import defpackage.yy50;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class OpenBetsActivity extends uyl implements phl.a, bb40 {
    public static final /* synthetic */ int J = 0;
    public OpenBetInput B;
    public SubTitleBar C;
    public a1z D;
    public View E;
    public ProgressButton F;
    public dz50 G;
    public ghh0 H;
    public rdd0 I;

    public class a implements com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a {
        public a() {
        }

        @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
        public final void a() {
            OpenBetsActivity openBetsActivity = OpenBetsActivity.this;
            openBetsActivity.startActivity(openBetsActivity.e.t(openBetsActivity, new InstantWinBetHistoryInput(openBetsActivity.i.c())));
            rdd0 rdd0Var = openBetsActivity.I;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.CONTENT_TYPE, "bet_history_event_page")};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) == null) {
                rdd0Var.a(new a5o.g0(Collections.unmodifiableMap(map)), k00.b, k00.a, k00.c);
            } else {
                hb5.a(wga.a(key, "duplicate key: "));
            }
        }

        @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
        public final void b() {
            OpenBetsActivity.this.finish();
        }

        @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
        public final void c(boolean z) {
        }
    }

    public final void G1(ArrayList arrayList, Round round, List list, int i, String str) {
        arrayList.add(new xzy(round, list, 1, null, this.f, 0, false, str));
        arrayList.add(new xzy(round, list, 2, null, this.f, i, false, str));
        arrayList.add(new xzy(round, list, 5, null, this.f, 0, false, str));
    }

    public final void H1() {
        startActivity(this.e.j(this, new FootballFamilySettlementInput(this.i.c(), this.B.a, this.G.d.b())));
    }

    public final void I1() {
        String strC = this.i.c();
        ghh0 ghh0Var = this.H;
        ghh0Var.getClass();
        Intent intentL = this.e.l(this, new InstantWinInput(strC, null, null, ghh0Var.b.B(strC)));
        intentL.addFlags(65536);
        startActivity(intentL);
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OpenBetInput openBetInput = (OpenBetInput) getIntent().getParcelableExtra("ARG_INPUT");
        this.B = openBetInput;
        if (openBetInput == null || TextUtils.isEmpty(openBetInput.a)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_iwqk_open_bets);
        E0((ActionBar) findViewById(R.id.action_bar), i0(), true, true, true, new a());
        SubTitleBar subTitleBar = (SubTitleBar) findViewById(R.id.sub_title_bar);
        this.C = subTitleBar;
        int i = 0;
        String cMSString = getCMSString(R.string.common_functions__open_bets, new Object[0]);
        cMSString.getClass();
        if (subTitleBar != null) {
            subTitleBar.setTitle(cMSString);
        }
        View viewFindViewById = findViewById(R.id.btn_keep_betting);
        this.E = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: r0z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = OpenBetsActivity.J;
                OpenBetsActivity openBetsActivity = this.a;
                openBetsActivity.I.a(new a5o.c0(openBetsActivity.i.c()), k00.d);
                if (!openBetsActivity.i.N()) {
                    openBetsActivity.finish();
                } else {
                    n4p n4pVar = openBetsActivity.i;
                    sqo.i(openBetsActivity, n4pVar.s, n4pVar.F());
                }
            }
        });
        int i2 = this.i.F() ? R.string.page_instant_virtual__start_game : R.string.page_instant_virtual__kick_off;
        ProgressButton progressButton = (ProgressButton) findViewById(R.id.btn_kick_off);
        this.F = progressButton;
        progressButton.setButtonText(getCMSString(i2, new Object[0]));
        this.F.setTextTypeFace(Typeface.defaultFromStyle(1));
        this.F.setOnClickListener(new View.OnClickListener() { // from class: s0z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = OpenBetsActivity.J;
                OpenBetsActivity openBetsActivity = this.a;
                openBetsActivity.G.c.b();
                dz50 dz50Var = openBetsActivity.G;
                OpenBetInput openBetInput2 = openBetsActivity.B;
                String str = openBetInput2.a;
                InstantWinBetSource instantWinBetSource = openBetInput2.c;
                dz50Var.getClass();
                str.getClass();
                instantWinBetSource.getClass();
                e4p e4pVar = dz50Var.a;
                e4pVar.getClass();
                String str2 = null;
                kzh.d(new yzh(new g1i(new az50(bm50.a(((eko) e4pVar.a).c(((n4p) e4pVar.b).c(), str, instantWinBetSource)), dz50Var), new bz50(2, null)), new cz50(dz50Var, null)), o8i0.d(dz50Var));
                openBetsActivity.F.setClickable(false);
                openBetsActivity.F.setLoading(true);
                openBetsActivity.E.setClickable(false);
                if (openBetsActivity.G.d.b()) {
                    zta0 zta0Var = (zta0) e1i.b(openBetsActivity.G.d.e).a.getValue();
                    if (zta0Var instanceof zta0.a.C1422a) {
                        str2 = "1x";
                    } else if (zta0Var instanceof zta0.a.b) {
                        str2 = "2x";
                    } else if (zta0Var instanceof zta0.b) {
                        str2 = "skip";
                    }
                }
                openBetsActivity.I.a(new a5o.d0(openBetsActivity.i.c(), str2), k00.d, k00.c);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.open_bets_list);
        recyclerView.setItemAnimator(null);
        a1z a1zVar = new a1z(this.f, this.i, this);
        this.D = a1zVar;
        recyclerView.setAdapter(a1zVar);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(dz50.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        dz50 dz50Var = (dz50) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.G = dz50Var;
        String strC = this.i.c();
        if (dz50Var.i.compareAndSet(false, true)) {
            dz50Var.d.c(o8i0.d(dz50Var), strC);
        }
        dz50 dz50Var2 = this.G;
        String strC2 = this.i.c();
        dz50Var2.getClass();
        dz50Var2.c.a(o8i0.d(dz50Var2), strC2);
        this.G.getClass();
        yy50.a.m(new jqc());
        this.G.f.f(this, new lfy() { // from class: u0z
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                int i3 = OpenBetsActivity.J;
                boolean z = hqcVar instanceof nqc;
                final OpenBetsActivity openBetsActivity = this.a;
                if (z) {
                    T t = ((nqc) hqcVar).a;
                    if (t instanceof Round) {
                        if (TextUtils.equals(openBetsActivity.B.a, ((Round) t).roundId)) {
                            openBetsActivity.D1();
                            n4p n4pVar = openBetsActivity.i;
                            n4pVar.K = 0;
                            if (!n4pVar.G()) {
                                openBetsActivity.e.o(openBetsActivity, openBetsActivity.B.a);
                                return;
                            } else if (openBetsActivity.G.d.e()) {
                                openBetsActivity.G.d.f();
                                return;
                            } else {
                                openBetsActivity.H1();
                                return;
                            }
                        }
                        return;
                    }
                }
                if (hqcVar instanceof lqc) {
                    openBetsActivity.F1(0);
                    return;
                }
                if (hqcVar instanceof kqc) {
                    openBetsActivity.D1();
                    kqc kqcVar = (kqc) hqcVar;
                    String str = kqcVar.b;
                    String str2 = kqcVar.a;
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                        sqo.j(openBetsActivity, new w0z(openBetsActivity));
                    } else {
                        sqo.l(openBetsActivity, str2, str, openBetsActivity.getCMSString(R.string.page_instant_virtual__next_round, new Object[0]), new DialogInterface.OnClickListener() { // from class: v0z
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = OpenBetsActivity.J;
                                openBetsActivity.I1();
                            }
                        });
                    }
                    openBetsActivity.F.setClickable(true);
                    openBetsActivity.F.setLoading(false);
                    openBetsActivity.E.setClickable(true);
                }
            }
        });
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(ghh0.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ghh0 ghh0Var = (ghh0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.H = ghh0Var;
        v340 v340Var = ghh0Var.d;
        v340Var.getClass();
        i2i.c(v340Var, null, 3).f(this, new x0z(this));
        ComposeView composeView = (ComposeView) findViewById(R.id.composeview_open_bets_speed_controller);
        v340 v340VarB = e1i.b(this.G.d.f);
        t0z t0zVar = new t0z(this, i);
        composeView.getClass();
        composeView.setContent(new op8(-1535916347, new mta0(v340VarB, t0zVar), true));
        ComposeView composeView2 = (ComposeView) findViewById(R.id.composeview_open_bets_speed_controller_tooltip);
        final v340 v340VarB2 = e1i.b(this.G.d.i);
        final pcb pcbVar = new pcb(this, 2);
        composeView2.getClass();
        composeView2.setContent(new op8(-1028578795, new Function2() { // from class: uta0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final uwd0 uwd0Var = v340VarB2;
                    final pcb pcbVar2 = pcbVar;
                    o0z.a(null, null, null, null, null, pp8.b(-330903356, new Function2() { // from class: vta0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (!aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                aVar2.G();
                            } else if (((lni0) wyh.c(uwd0Var, aVar2, 0, 7).getValue()) == lni0.b) {
                                aVar2.N(-991809003);
                                yta0.a(pcbVar2, aVar2, 0);
                                aVar2.H();
                            } else {
                                aVar2.N(-991738850);
                                aVar2.H();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        wgi.c((ComposeView) findViewById(R.id.composeview_open_bets_skip_to_result_dialog), e1i.b(this.G.d.g), new kb2(this, 3));
    }
}
