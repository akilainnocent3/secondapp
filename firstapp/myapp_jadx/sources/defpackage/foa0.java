package defpackage;

import android.content.Context;
import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfoa0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class foa0 extends j8i0 {
    public boolean A;
    public final ssw<String> B;
    public final ssw C;
    public final ConcurrentHashMap<String, Boolean> D;
    public final ConcurrentHashMap<String, Boolean> E;
    public ema a;
    public ssw<String> b = new ssw<>();
    public final ssw<String> c = new ssw<>();
    public final ssw<String> d = new ssw<>();
    public final ssw<String> e = new ssw<>();
    public final ssw<String> f = new ssw<>();
    public final ssw<String> i = new ssw<>();
    public final ssw<String> v = new ssw<>();
    public final ssw<String> w = new ssw<>();
    public final ssw<String> y = new ssw<>();
    public final ssw<Boolean> z = new ssw<>();

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.sportyherov2.viewmodels.SocketViewModel$getException$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1e0 f1e0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return foa0.this.new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            foa0.this.f.m(this.b.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherov2.viewmodels.SocketViewModel$lastRoundMultiplier$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1e0 f1e0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return foa0.this.new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            foa0.this.e.j(this.b.c);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.sportyherov2.viewmodels.SocketViewModel$room1Info$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f1e0 f1e0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return foa0.this.new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            foa0.this.d.m(this.b.c);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public foa0() {
        ssw<String> sswVar = new ssw<>();
        this.B = sswVar;
        this.C = sswVar;
        this.D = new ConcurrentHashMap<>();
        this.E = new ConcurrentHashMap<>();
    }

    public static String H1(Long l, String str) {
        return str + "_" + l;
    }

    public final void A1(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
                return;
            }
            m3i m3iVarJ = iic.a.h(n3g0.b("rain_claim_response", str2, str)).j(wm70.c);
            final eaa eaaVar = new eaa(this, 3);
            b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: qla0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    eaaVar.invoke(obj);
                }
            }).f(va0.a());
            final m460 m460Var = new m460(this, 1);
            slr slrVar = new slr(new pya() { // from class: tla0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    m460Var.invoke(obj);
                }
            }, new yla0(), new vq4());
            b3iVarF.h(slrVar);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(slrVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void B1() {
        iic iicVar = iic.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        p3i p3iVarK = iicVar.h(n3g0.b("multiplier", country, "")).j(wm70.c).k();
        int i = 2;
        final egj egjVar = new egj(this, i);
        b3i b3iVarF = new u2i(p3iVarK, new pya() { // from class: hna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                egjVar.invoke(obj);
            }
        }).f(va0.a());
        final ggj ggjVar = new ggj(this, i);
        pya pyaVar = new pya() { // from class: ina0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                ggjVar.invoke(obj);
            }
        };
        final px10 px10Var = new px10(this, 1);
        slr slrVar = new slr(pyaVar, new pya() { // from class: jna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                px10Var.invoke(obj);
            }
        }, taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void C1() {
        iic iicVar = iic.a;
        if (iicVar.d()) {
            this.A = false;
            iicVar.a();
        }
    }

    public final void D1(int i, String str) {
        str.getClass();
        this.D.put(H1(Long.valueOf(i), str), Boolean.TRUE);
    }

    public final void E1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        iic iicVar = iic.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        b3i b3iVarF = new u2i(iicVar.h(n3g0.b(AnalyticsParam.EVENT_PARAM_EXCEPTION, country, "")).j(wm70.c), new g8j(1, new nu10(this, 1))).f(wm70.b);
        kx5 kx5Var = new kx5(new j8j(this, 1));
        final uu10 uu10Var = new uu10(this, 1);
        slr slrVar = new slr(kx5Var, new pya() { // from class: dka0
            @Override // defpackage.pya
            public final void accept(Object obj) throws Throwable {
                uu10Var.invoke(obj);
            }
        }, new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void F1(String str, String str2) {
        str.getClass();
        str2.getClass();
        m3i m3iVarJ = iic.a.h(n3g0.b("round_bet", str2, str)).j(wm70.c);
        final u460 u460Var = new u460(this, 1);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: ema0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                u460Var.invoke(obj);
            }
        }).f(wm70.b);
        final gfj gfjVar = new gfj(this, 2);
        pya pyaVar = new pya() { // from class: kma0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                gfjVar.invoke(obj);
            }
        };
        new bpo(1);
        slr slrVar = new slr(pyaVar, new pma0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void G1() {
        try {
            if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
                return;
            }
            iic iicVar = iic.a;
            String country = SportyGamesManager.getInstance().getCountry();
            country.getClass();
            m3i m3iVarJ = iicVar.h(n3g0.b("round_info", country, null)).j(wm70.c);
            final pme pmeVar = new pme(this, 1);
            b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: uma0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    pmeVar.invoke(obj);
                }
            }).f(va0.a());
            final f560 f560Var = new f560(this, 1);
            slr slrVar = new slr(new pya() { // from class: zma0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    f560Var.invoke(obj);
                }
            }, new fna0(), new vq4());
            b3iVarF.h(slrVar);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(slrVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void J1(String str) {
        str.getClass();
        m3i m3iVarJ = iic.a.h(n3g0.b("room1_info", str, "")).j(wm70.b);
        int i = 1;
        final vx10 vx10Var = new vx10(this, i);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: pna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                vx10Var.invoke(obj);
            }
        }).f(wm70.c);
        final xx10 xx10Var = new xx10(this, i);
        slr slrVar = new slr(new pya() { // from class: qna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                xx10Var.invoke(obj);
            }
        }, new sna0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void K1(String str, String str2, Long l, Long l2, Function0<Unit> function0) {
        if (iic.a.d()) {
            String strH1 = H1(l2, String.valueOf(l));
            ConcurrentHashMap<String, Boolean> concurrentHashMap = this.E;
            Boolean bool = concurrentHashMap.get(strH1);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.g(bool, bool2) && str2.equals("CLASSIC")) {
                function0.invoke();
                return;
            }
            int iHashCode = str2.hashCode();
            String str3 = "/queue/cashout";
            if (iHashCode != -905579635) {
                if (iHashCode != 77742365) {
                    if (iHashCode == 1571603570) {
                        str2.equals("CLASSIC");
                    }
                } else if (str2.equals("RANGE")) {
                    str3 = "/queue/cashout/range";
                }
            } else if (str2.equals("OVER_UNDER")) {
                str3 = "/queue/cashout/over-under";
            }
            if (str2.equals("CLASSIC")) {
                concurrentHashMap.put(H1(l2, String.valueOf(l)), bool2);
            }
            lm8 lm8Var = new lm8(new om8(iic.a.f(str3, str, null), new bz5(new acj(1))).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: uka0
                @Override // defpackage.ib
                public final void run() {
                    this.a.z.j(Boolean.TRUE);
                }
            };
            final xka0 xka0Var = new xka0();
            hv5 hv5Var = new hv5(new pya() { // from class: ala0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    xka0Var.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void M1(long j, List<String> list) {
        if (iic.a.d()) {
            StringBuilder sbA = b0.a(j, "{\"betId\":", ",\"tournamentIds\":[", CollectionsKt.a0(list, ",", null, null, new pro(1), 30));
            sbA.append("]}");
            lm8 lm8Var = new lm8(new om8(iic.a.f("/queue/lost-bets", sbA.toString(), null), new vna0()).f(wm70.c), va0.a());
            vq4 vq4Var = new vq4();
            final sro sroVar = new sro(1);
            hv5 hv5Var = new hv5(new pya() { // from class: xna0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    sroVar.invoke(obj);
                }
            }, vq4Var);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void N1(String str, String str2, long j, int i, Function0<Unit> function0) {
        List listC;
        if (SportyGamesManager.getInstance().getUser() == null) {
            this.c.j("go_to_login");
            return;
        }
        if (iic.a.d()) {
            if (Intrinsics.g(this.D.get(H1(Long.valueOf(i), String.valueOf(j))), Boolean.TRUE) && str2.equals("CLASSIC")) {
                function0.invoke();
                return;
            }
            int iHashCode = str2.hashCode();
            String str3 = "/queue/bet";
            if (iHashCode != -905579635) {
                if (iHashCode != 77742365) {
                    if (iHashCode == 1571603570) {
                        str2.equals("CLASSIC");
                    }
                } else if (str2.equals("RANGE")) {
                    str3 = "/queue/bet/range";
                }
            } else if (str2.equals("OVER_UNDER")) {
                str3 = "/queue/bet/over-under";
            }
            try {
                Context applicationContext = SportyGamesManager.getApplicationContext();
                if (applicationContext != null) {
                    listC = kotlin.collections.a.c(new e1e0("download-source", SportyGamesManager.getInstance().isSideLoading(applicationContext) ? "external-link" : "google-play-store"));
                } else {
                    listC = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (str2.equals("CLASSIC")) {
                D1(i, String.valueOf(j));
            }
            om8 om8Var = new om8(iic.a.f(str3, str, listC), new fla0());
            qm70 qm70Var = wm70.d;
            yby.b(qm70Var, "scheduler is null");
            lm8 lm8Var = new lm8(new fm8(om8Var, qm70Var).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: ila0
                @Override // defpackage.ib
                public final void run() {
                    this.a.z.j(Boolean.TRUE);
                }
            };
            final w9a w9aVar = new w9a(1);
            hv5 hv5Var = new hv5(new pya() { // from class: mla0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    w9aVar.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void x1(long j, String str) {
        str.getClass();
        this.E.remove(H1(Long.valueOf(j), str));
    }

    public final void y1(int i, String str) {
        str.getClass();
        this.D.remove(H1(Long.valueOf(i), str));
    }

    public final void z1(String str) {
        str.getClass();
        Set<String> setKeySet = this.D.keySet();
        setKeySet.getClass();
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            if (!kotlin.text.c.u(str2, str, false)) {
                it.remove();
            }
        }
        Set<String> setKeySet2 = this.E.keySet();
        setKeySet2.getClass();
        Iterator<T> it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            str3.getClass();
            if (!kotlin.text.c.u(str3, str, false)) {
                it2.remove();
            }
        }
    }

    public final void I1() {
        if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getCountry() != null) {
            iic iicVar = iic.a;
            String country = SportyGamesManager.getInstance().getCountry();
            country.getClass();
            m3i m3iVarJ = iicVar.h(n3g0.b("lastRoundMultiplier", country, Chyeyik.eQY)).j(wm70.b);
            final sx10 sx10Var = new sx10(this, 1);
            b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: yna0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    sx10Var.invoke(obj);
                }
            }).f(wm70.c);
            final aoa0 aoa0Var = new aoa0(this);
            pya pyaVar = new pya() { // from class: coa0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    aoa0Var.invoke(obj);
                }
            };
            new ok0(2);
            slr slrVar = new slr(pyaVar, new tja0(), new vq4());
            b3iVarF.h(slrVar);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(slrVar);
            }
        }
    }
}
