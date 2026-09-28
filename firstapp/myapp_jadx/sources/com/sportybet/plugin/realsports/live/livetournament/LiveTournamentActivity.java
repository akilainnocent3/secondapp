package com.sportybet.plugin.realsports.live.livetournament;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.cruxlab.sectionedrecyclerview.lib.SectionHeaderLayout;
import com.cruxlab.sectionedrecyclerview.lib.d.C0186d;
import defpackage.a8z;
import defpackage.avl;
import defpackage.avs;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.evs;
import defpackage.haj;
import defpackage.hkf;
import defpackage.iym;
import defpackage.joi;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.k650;
import defpackage.kgb0;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.lq1;
import defpackage.m2g;
import defpackage.mco;
import defpackage.mfb0;
import defpackage.mjf;
import defpackage.muh;
import defpackage.n3a;
import defpackage.paj;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s1p;
import defpackage.u22;
import defpackage.v8i0;
import defpackage.w9s;
import defpackage.xhh0;
import defpackage.xss;
import defpackage.xus;
import defpackage.ypi;
import defpackage.yus;
import defpackage.zhh0;
import defpackage.zus;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/live/livetournament/LiveTournamentActivity;", "Ll22;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveTournamentActivity extends avl {
    public static final /* synthetic */ int I = 0;
    public muh A;
    public s1p B;
    public xhh0 C;
    public zhh0 D;
    public xss F;
    public jvd0 G;
    public lq1 f;
    public k650 i;
    public iym v;
    public mjf w;
    public hkf y;
    public a8z z;
    public final q8i0 E = new q8i0(jq40.a(evs.class), new c(), new b(), new d());
    public final w9s H = new w9s(new mco(this, 1));

    public static final class a implements lfy, paj {
        public final /* synthetic */ xus a;

        public a(xus xusVar) {
            this.a = xusVar;
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
            return LiveTournamentActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LiveTournamentActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LiveTournamentActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.l22
    public final String A1() {
        mfb0 mfb0Var = D1().B;
        String id = mfb0Var != null ? mfb0Var.getId() : null;
        return id == null ? "" : id;
    }

    @Override // defpackage.l22
    public final void B1() {
        RecyclerView recyclerView = z1().e;
        recyclerView.setItemAnimator(null);
        com.cruxlab.sectionedrecyclerview.lib.d dVar = new com.cruxlab.sectionedrecyclerview.lib.d();
        lq1 lq1Var = this.f;
        if (lq1Var == null) {
            Intrinsics.n("boConfigSource");
            throw null;
        }
        k650 k650Var = this.i;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        mjf mjfVar = this.w;
        if (mjfVar == null) {
            Intrinsics.n("earlyPayoutConfigManager");
            throw null;
        }
        hkf hkfVar = this.y;
        if (hkfVar == null) {
            Intrinsics.n("earlyPayoutMarketResolver");
            throw null;
        }
        xhh0 xhh0Var = this.C;
        if (xhh0Var == null) {
            Intrinsics.n("upMarketTabUseCase");
            throw null;
        }
        zhh0 zhh0Var = this.D;
        if (zhh0Var == null) {
            Intrinsics.n("upPageToggleStateUseCase");
            throw null;
        }
        a8z a8zVar = this.z;
        if (a8zVar == null) {
            Intrinsics.n("outcomeBoostResolver");
            throw null;
        }
        muh muhVar = this.A;
        if (muhVar == null) {
            Intrinsics.n("flashBoostViewTracker");
            throw null;
        }
        xss xssVar = new xss(this, lq1Var, k650Var, mjfVar, hkfVar, xhh0Var, zhh0Var, a8zVar, muhVar);
        xssVar.z = new yus(this, xssVar);
        this.F = xssVar;
        dVar.a(xssVar, (short) 1);
        recyclerView.setAdapter(new f(dVar.h, new joi(ypi.b(new n3a(recyclerView, 3)))));
        SectionHeaderLayout sectionHeaderLayout = z1().f;
        sectionHeaderLayout.a = recyclerView;
        com.cruxlab.sectionedrecyclerview.lib.d.C0186d c0186d = dVar.new C0186d(sectionHeaderLayout.c);
        dVar.g = c0186d;
        sectionHeaderLayout.b = c0186d;
        recyclerView.k(sectionHeaderLayout.d);
        sectionHeaderLayout.b.b();
    }

    @Override // defpackage.l22
    public final void C1() {
        E1();
    }

    public final evs D1() {
        return (evs) this.E.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[PHI: r10
      0x0042: PHI (r10v7 mfb0) = (r10v6 mfb0), (r10v11 mfb0) binds: [B:13:0x0033, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void E1() {
        evs evsVarD1 = D1();
        evs evsVarD2 = D1();
        String stringExtra = getIntent().getStringExtra("key_sport_id");
        String string = "";
        String str = stringExtra == null ? "" : stringExtra;
        List stringArrayListExtra = getIntent().getStringArrayListExtra("key_tournament_ids");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = m2g.a;
        }
        List list = stringArrayListExtra;
        list.getClass();
        String str2 = evsVarD2.H;
        if (str2 == null) {
            mfb0 mfb0VarE = evsVarD2.B;
            if (mfb0VarE == null) {
                mfb0VarE = lfb0.d().e(str);
                evsVarD2.B = mfb0VarE;
                if (mfb0VarE != null) {
                    string = kgb0.d(str, mfb0VarE.j().a, list, 0.0d, 1).toString();
                    evsVarD2.H = string;
                    string.getClass();
                }
            } else {
                string = kgb0.d(str, mfb0VarE.j().a, list, 0.0d, 1).toString();
                evsVarD2.H = string;
                string.getClass();
            }
        } else {
            string = str2;
        }
        u22.z1(evsVarD1, string);
    }

    @Override // defpackage.l22, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.H);
        D1().A.f(this, new a(new xus(this, z1())));
        ej5.c(ebs.a(getLifecycle()), null, null, new zus(this, null), 3);
        E1();
    }

    @Override // defpackage.l22, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        D1().B1(false);
        super.onPause();
    }

    @Override // defpackage.l22, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        jvd0 jvd0Var = this.G;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.G = ebs.a(getLifecycle()).b(new avs(this, null));
    }
}
