package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljvd;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jvd extends j8i0 {
    public static final long F;
    public static final /* synthetic */ int G = 0;
    public final t340 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final psm a;
    public final rdd0 b;
    public final ku90<ivd> c;
    public final ku90 d;
    public final ku90<Unit> e;
    public final ku90 f;
    public final ku90<com.sporty.android.common.uievent.a> i;
    public final t340 v;
    public final ku90<Unit> w;
    public final t340 y;
    public final ku90<spg0> z;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositConfirmCompletedViewModel$2", f = "DepositConfirmCompletedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ld00, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jvd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ld00 ld00Var, v1b<? super Unit> v1bVar) {
            return ((a) create(ld00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ld00 ld00Var = (ld00) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!ld00Var.f.equals(vch0.a)) {
                int i = jvd.G;
                jvd.this.b.a(new knd("bill_prompt_failure"), k00.d);
            }
            return Unit.a;
        }
    }

    static {
        b.a aVar = b.b;
        F = c.h(2000, rgf.MILLISECONDS);
    }

    public jvd(psm psmVar, rdd0 rdd0Var) {
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = psmVar;
        this.b = rdd0Var;
        ku90<ivd> ku90Var = new ku90<>();
        this.c = ku90Var;
        this.d = ku90Var;
        ku90<Unit> ku90Var2 = new ku90<>();
        this.e = ku90Var2;
        this.f = ku90Var2;
        ku90<com.sporty.android.common.uievent.a> ku90Var3 = new ku90<>();
        this.i = ku90Var3;
        this.v = e1i.a(ku90Var3);
        ku90<Unit> ku90Var4 = new ku90<>();
        this.w = ku90Var4;
        this.y = e1i.a(ku90Var4);
        ku90<spg0> ku90Var5 = new ku90<>();
        this.z = ku90Var5;
        this.A = e1i.a(ku90Var5);
        wwd0 wwd0VarA = xwd0.a(tzs.a.a);
        this.B = wwd0VarA;
        this.C = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.D = wwd0VarA2;
        v340 v340VarB = e1i.b(wwd0VarA2);
        this.E = v340VarB;
        f1i f1iVar = new f1i(v340VarB);
        zt9 zt9Var = new zt9(1);
        y8h0.d(2, zt9Var);
        kzh.d(new g1i(uzh.c(f1iVar, uzh.a, zt9Var), new a(null)), o8i0.d(this));
    }
}
