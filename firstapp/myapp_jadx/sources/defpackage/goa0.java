package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgoa0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class goa0 extends j8i0 {
    public final ssw A;
    public final ConcurrentHashMap<String, Boolean> B;
    public final ConcurrentHashMap<String, Boolean> C;
    public ema a;
    public ssw<String> b = new ssw<>();
    public final ssw<String> c = new ssw<>();
    public final ssw<String> d = new ssw<>();
    public final ssw<String> e = new ssw<>();
    public final ssw<String> f = new ssw<>();
    public final ssw<String> i = new ssw<>();
    public final ssw<String> v = new ssw<>();
    public final ssw<Boolean> w = new ssw<>();
    public boolean y;
    public final ssw<String> z;

    @c0d(c = "com.sportygames.pingpong.viewmodels.SocketViewModel$getException$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1e0 f1e0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return goa0.this.new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            goa0.this.f.m(this.b.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.pingpong.viewmodels.SocketViewModel$lastRoundMultiplier$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1e0 f1e0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return goa0.this.new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            goa0.this.e.j(this.b.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.pingpong.viewmodels.SocketViewModel$room1Info$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f1e0 f1e0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return goa0.this.new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            goa0.this.d.m(this.b.c);
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

    public goa0() {
        ssw<String> sswVar = new ssw<>();
        this.z = sswVar;
        this.A = sswVar;
        this.B = new ConcurrentHashMap<>();
        this.C = new ConcurrentHashMap<>();
    }

    public static String E1(Long l, String str) {
        return str + "_" + l;
    }

    public static void H1(final goa0 goa0Var, String str, Long l, Long l2, Function0 function0) {
        goa0Var.getClass();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = goa0Var.C;
        if (SportyGamesManager.getInstance().getUser() == null) {
            goa0Var.c.j("go_to_login");
            return;
        }
        hic hicVar = hic.a;
        if (hicVar.d()) {
            Boolean bool = concurrentHashMap.get(E1(l2, String.valueOf(l)));
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.g(bool, bool2)) {
                function0.invoke();
                return;
            }
            concurrentHashMap.put(E1(l2, String.valueOf(l)), bool2);
            am8 am8VarE = hicVar.e(new f1e0("SEND", kotlin.collections.a.c(new e1e0("destination", "/queue/cashout")), str));
            new b5t(1);
            lm8 lm8Var = new lm8(new om8(am8VarE, new rq0()).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: ula0
                @Override // defpackage.ib
                public final void run() {
                    this.a.w.j(Boolean.TRUE);
                }
            };
            final wla0 wla0Var = new wla0();
            hv5 hv5Var = new hv5(new pya() { // from class: zla0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    wla0Var.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = goa0Var.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void A1(Integer num, String str) {
        str.getClass();
        this.B.put(E1(num != null ? Long.valueOf(num.intValue()) : null, str), Boolean.TRUE);
    }

    public final void B1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        hic hicVar = hic.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        m3i m3iVarJ = hicVar.f(l3g0.a(AnalyticsParam.EVENT_PARAM_EXCEPTION, country, "")).j(wm70.c);
        final una0 una0Var = new una0(this);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: zna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                una0Var.invoke(obj);
            }
        }).f(wm70.b);
        final hy10 hy10Var = new hy10(this, 1);
        slr slrVar = new slr(new pya() { // from class: doa0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                hy10Var.invoke(obj);
            }
        }, new zw5(new qja0(this)), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void C1(String str, String str2) {
        str.getClass();
        str2.getClass();
        b3i b3iVarF = new u2i(hic.a.f(l3g0.a("round_bet", str2, str)).j(wm70.c), new gla0(new x360(this, 1), 0)).f(wm70.b);
        final c460 c460Var = new c460(this, 1);
        slr slrVar = new slr(new pya() { // from class: kla0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                c460Var.invoke(obj);
            }
        }, new ola0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void D1() {
        try {
            if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
                return;
            }
            hic hicVar = hic.a;
            String country = SportyGamesManager.getInstance().getCountry();
            country.getClass();
            m3i m3iVarJ = hicVar.f(l3g0.a("round_info", country, null)).j(wm70.c);
            final sma0 sma0Var = new sma0(this);
            b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: vma0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    sma0Var.invoke(obj);
                }
            }).f(va0.a());
            final xma0 xma0Var = new xma0(this);
            pya pyaVar = new pya() { // from class: ana0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    xma0Var.invoke(obj);
                }
            };
            new aqo(1);
            slr slrVar = new slr(pyaVar, new k660(), new vq4());
            b3iVarF.h(slrVar);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(slrVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void F1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        hic hicVar = hic.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        b3i b3iVarF = new u2i(hicVar.f(l3g0.a("lastRoundMultiplier", country, "")).j(wm70.b), new cy5(new yu10(this, 2))).f(wm70.c);
        slr slrVar = new slr(new ky5(new hka0(this)), new qka0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void G1(String str) {
        str.getClass();
        m3i m3iVarJ = hic.a.f(l3g0.a("room1_info", str, "")).j(wm70.b);
        final ioo iooVar = new ioo(this, 1);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: gma0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                iooVar.invoke(obj);
            }
        }).f(wm70.c);
        final ima0 ima0Var = new ima0(this);
        slr slrVar = new slr(new pya() { // from class: lma0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                ima0Var.invoke(obj);
            }
        }, new qma0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void I1(String str, long j, Integer num, Function0 function0) {
        if (SportyGamesManager.getInstance().getUser() == null) {
            this.c.j("go_to_login");
            return;
        }
        hic hicVar = hic.a;
        if (hicVar.d()) {
            if (Intrinsics.g(this.B.get(E1(num != null ? Long.valueOf(num.intValue()) : null, String.valueOf(j))), Boolean.TRUE)) {
                function0.invoke();
                return;
            }
            A1(num, String.valueOf(j));
            am8 am8VarE = hicVar.e(new f1e0("SEND", kotlin.collections.a.c(new e1e0("destination", "/queue/bet")), str));
            new e8j(1);
            om8 om8Var = new om8(am8VarE, new wja0());
            qm70 qm70Var = wm70.d;
            yby.b(qm70Var, "scheduler is null");
            lm8 lm8Var = new lm8(new fm8(om8Var, qm70Var).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: yja0
                @Override // defpackage.ib
                public final void run() {
                    this.a.w.j(Boolean.TRUE);
                }
            };
            final aka0 aka0Var = new aka0();
            hv5 hv5Var = new hv5(new pya() { // from class: bka0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    aka0Var.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void x1(String str) {
        str.getClass();
        Set<String> setKeySet = this.B.keySet();
        setKeySet.getClass();
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            if (!kotlin.text.c.u(str2, str, false)) {
                it.remove();
            }
        }
        Set<String> setKeySet2 = this.C.keySet();
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

    public final void y1() {
        hic hicVar = hic.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        int i = 1;
        b3i b3iVarF = new u2i(hicVar.f(l3g0.a("multiplier", country, "")).j(wm70.c).k(), new zy5(new i360(this, i))).f(va0.a());
        final o360 o360Var = new o360(this, i);
        pya pyaVar = new pya() { // from class: vka0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                o360Var.invoke(obj);
            }
        };
        final yka0 yka0Var = new yka0(this);
        slr slrVar = new slr(pyaVar, new pya() { // from class: bla0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                yka0Var.invoke(obj);
            }
        }, taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void z1() {
        hic hicVar = hic.a;
        if (hicVar.d()) {
            this.y = false;
            hicVar.a();
        }
    }
}
