package defpackage;

import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leoa0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class eoa0 extends j8i0 {
    public final ssw A;
    public final ConcurrentHashMap<String, Boolean> B;
    public final ConcurrentHashMap<String, Boolean> C;
    public ema a;
    public final ssw<String> b = new ssw<>();
    public final ssw<String> c = new ssw<>();
    public final ssw<String> d = new ssw<>();
    public final ssw<String> e = new ssw<>();
    public final ssw<String> f = new ssw<>();
    public final ssw<String> i = new ssw<>();
    public final ssw<String> v = new ssw<>();
    public final ssw<Boolean> w = new ssw<>();
    public boolean y;
    public final ssw<String> z;

    @c0d(c = "com.sportygames.pocketrocket.viewmodels.SocketViewModel$getException$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1e0 f1e0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return eoa0.this.new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eoa0.this.f.m(this.b.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.pocketrocket.viewmodels.SocketViewModel$lastRoundMultiplier$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f1e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1e0 f1e0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = f1e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return eoa0.this.new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eoa0.this.e.j(this.b.c);
            return Unit.a;
        }
    }

    public eoa0() {
        ssw<String> sswVar = new ssw<>();
        this.z = sswVar;
        this.A = sswVar;
        this.B = new ConcurrentHashMap<>();
        this.C = new ConcurrentHashMap<>();
    }

    public static String B1(String str, String str2) {
        return oxc.a(str, "_", str2);
    }

    public final void A1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        pjc pjcVar = pjc.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        int i = 1;
        b3i b3iVarF = new u2i(pjcVar.g(m3g0.a("round_info", country, null)).j(wm70.c), new az5(new tka0(this), i)).f(va0.a());
        final p360 p360Var = new p360(this, i);
        slr slrVar = new slr(new pya() { // from class: wka0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                p360Var.invoke(obj);
            }
        }, new cla0(new zka0()), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void C1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        pjc pjcVar = pjc.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        m3i m3iVarJ = pjcVar.g(n3g0.b("lastRoundMultiplier", country, "")).j(wm70.b);
        final c8j c8jVar = new c8j(this, 2);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: vja0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                c8jVar.invoke(obj);
            }
        }).f(wm70.c);
        final xja0 xja0Var = new xja0(this, 0);
        pya pyaVar = new pya() { // from class: zja0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                xja0Var.invoke(obj);
            }
        };
        new ijx(1);
        slr slrVar = new slr(pyaVar, new cka0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void D1(String str, Long l, Long l2, Function0<Unit> function0) {
        if (SportyGamesManager.getInstance().getUser() == null) {
            this.c.j("go_to_login");
            return;
        }
        pjc pjcVar = pjc.a;
        if (pjcVar.d()) {
            String strB1 = B1(String.valueOf(l), String.valueOf(l2));
            ConcurrentHashMap<String, Boolean> concurrentHashMap = this.C;
            Boolean bool = concurrentHashMap.get(strB1);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.g(bool, bool2)) {
                function0.invoke();
                return;
            }
            concurrentHashMap.put(B1(String.valueOf(l), String.valueOf(l2)), bool2);
            lm8 lm8Var = new lm8(new om8(pjcVar.f("/queue/v2/cashout", str, null), new wma0()).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: yma0
                @Override // defpackage.ib
                public final void run() {
                    this.a.w.j(Boolean.TRUE);
                }
            };
            final bna0 bna0Var = new bna0(0);
            hv5 hv5Var = new hv5(new pya() { // from class: ena0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    bna0Var.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void E1(long j, String str, String str2, Function0 function0) {
        List listC;
        if (SportyGamesManager.getInstance().getUser() == null) {
            this.c.j("go_to_login");
            return;
        }
        if (pjc.a.d()) {
            String strB1 = B1(String.valueOf(j), str2);
            ConcurrentHashMap<String, Boolean> concurrentHashMap = this.B;
            if (Intrinsics.g(concurrentHashMap.get(strB1), Boolean.TRUE)) {
                function0.invoke();
                return;
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
            String strValueOf = String.valueOf(j);
            strValueOf.getClass();
            concurrentHashMap.put(B1(strValueOf, str2), Boolean.TRUE);
            om8 om8Var = new om8(pjc.a.f("/queue/v2/bet", str, listC), new jma0());
            qm70 qm70Var = wm70.d;
            yby.b(qm70Var, "scheduler is null");
            lm8 lm8Var = new lm8(new fm8(om8Var, qm70Var).f(wm70.c), va0.a());
            ib ibVar = new ib() { // from class: mma0
                @Override // defpackage.ib
                public final void run() {
                    this.a.w.j(Boolean.TRUE);
                }
            };
            final oma0 oma0Var = new oma0(0);
            hv5 hv5Var = new hv5(new pya() { // from class: rma0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    oma0Var.invoke(obj);
                }
            }, ibVar);
            lm8Var.b(hv5Var);
            ema emaVar = this.a;
            if (emaVar != null) {
                emaVar.b(hv5Var);
            }
        }
    }

    public final void x1() {
        pjc pjcVar = pjc.a;
        if (pjcVar.d()) {
            this.y = false;
            pjcVar.a();
        }
    }

    public final void y1() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            return;
        }
        pjc pjcVar = pjc.a;
        String country = SportyGamesManager.getInstance().getCountry();
        country.getClass();
        m3i m3iVarJ = pjcVar.g(n3g0.b(AnalyticsParam.EVENT_PARAM_EXCEPTION, country, "")).j(wm70.c);
        int i = 1;
        final ux10 ux10Var = new ux10(this, i);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: wna0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                ux10Var.invoke(obj);
            }
        }).f(wm70.b);
        final i76 i76Var = new i76(this, i);
        pya pyaVar = new pya() { // from class: boa0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                i76Var.invoke(obj);
            }
        };
        final g7j g7jVar = new g7j(this, 3);
        slr slrVar = new slr(pyaVar, new pya() { // from class: sja0
            @Override // defpackage.pya
            public final void accept(Object obj) throws Throwable {
                g7jVar.invoke(obj);
            }
        }, new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }

    public final void z1(String str, String str2) {
        str.getClass();
        str2.getClass();
        m3i m3iVarJ = pjc.a.g(m3g0.a("round_bet", str2, str)).j(wm70.c);
        final rla0 rla0Var = new rla0(this);
        b3i b3iVarF = new u2i(m3iVarJ, new pya() { // from class: sla0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                rla0Var.invoke(obj);
            }
        }).f(wm70.b);
        final qej qejVar = new qej(this, 1);
        slr slrVar = new slr(new pya() { // from class: xla0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                qejVar.invoke(obj);
            }
        }, new dma0(), new vq4());
        b3iVarF.h(slrVar);
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.b(slrVar);
        }
    }
}
