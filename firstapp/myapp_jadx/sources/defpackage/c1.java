package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc1;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c1 extends j8i0 {
    public static final HashSet<String> F;
    public final v340 A;
    public final ssw<UIState<List<Sport>>> B;
    public final ssw C;
    public final ssw<UIState<fq1>> D;
    public final ssw E;
    public final h530 a;
    public final h940 b;
    public final e8h c;
    public final muj d;
    public final rdd0 e;
    public final q6d0 f;
    public final ssw<Boolean> i;
    public final ssw v;
    public final ssw<Boolean> w;
    public final ssw y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$1", f = "AZMenuViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ssw a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ssw sswVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                c1 c1Var = c1.this;
                ssw<Boolean> sswVar2 = c1Var.w;
                q6d0 q6d0Var = c1Var.f;
                this.a = sswVar2;
                this.b = 1;
                obj = qq1.k(q6d0Var.a, BOConfigParam.SportyPicks, q6d0Var.b.b().a(), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                sswVar = sswVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sswVar = this.a;
                uj50.b(obj);
            }
            sswVar.m(obj);
            return Unit.a;
        }
    }

    public static final class b {
        public b() {
        }

        public final void a() {
            c1.this.i.m(Boolean.FALSE);
        }
    }

    static {
        wae.a aVar = wae.b;
        F = new HashSet<>(kotlin.collections.a.c("liveGame"));
    }

    public c1(h530 h530Var, h940 h940Var, e8h e8hVar, muj mujVar, rdd0 rdd0Var, q6d0 q6d0Var, bnh0 bnh0Var) {
        h530Var.getClass();
        h940Var.getClass();
        e8hVar.getClass();
        rdd0Var.getClass();
        bnh0Var.getClass();
        this.a = h530Var;
        this.b = h940Var;
        this.c = e8hVar;
        this.d = mujVar;
        this.e = rdd0Var;
        this.f = q6d0Var;
        ssw<Boolean> sswVar = new ssw<>();
        this.i = sswVar;
        this.v = sswVar;
        ssw<Boolean> sswVar2 = new ssw<>();
        this.w = sswVar2;
        this.y = sswVar2;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        xxi0[] xxi0VarArr = xxi0.a;
        wwd0 wwd0VarA = xwd0.a(new m1(bnh0Var.h("/m/promotions"), bnh0Var.h("/m/features"), 10));
        this.z = wwd0VarA;
        this.A = e1i.b(wwd0VarA);
        ssw<UIState<List<Sport>>> sswVar3 = new ssw<>();
        this.B = sswVar3;
        this.C = sswVar3;
        ssw<UIState<fq1>> sswVar4 = new ssw<>();
        this.D = sswVar4;
        this.E = sswVar4;
    }

    public final void x1() {
        b bVar = new b();
        muj mujVar = this.d;
        mujVar.getClass();
        bcp bcpVar = new bcp();
        xdp xdpVar = new xdp();
        xdpVar.i("appId", "common");
        xdpVar.i("namespace", "config");
        xdpVar.i("configKey", "games_lobby_android");
        bcpVar.h(xdpVar);
        boolean zR = mujVar.a.r();
        ta8 ta8Var = mujVar.b;
        (zR ? ta8Var.b(bcpVar.toString()) : ta8Var.c(bcpVar.toString())).G(new luj(mujVar, bVar));
    }
}
