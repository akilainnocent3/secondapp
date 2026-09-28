package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln5d;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n5d extends j8i0 {
    public final sr10 a;
    public jvd0 b;
    public final ku90<com.sporty.android.common.uievent.a> c;
    public final t340 d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DedicatedAccountBVNVerifyViewModel$1", f = "DedicatedAccountBVNVerifyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ijf0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = n5d.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ijf0 ijf0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(ijf0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            ijf0 ijf0Var = (ijf0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = n5d.this.f;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, er1.a((er1) value, ijf0Var, ijf0Var.a.b.length() == 11 ? uxs.ENABLE : uxs.DISABLE, 4)));
            return Unit.a;
        }
    }

    public n5d(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.c = ku90Var;
        this.d = e1i.a(ku90Var);
        wwd0 wwd0VarA = xwd0.a(new ijf0((String) null, 0L, 7));
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new er1(0));
        this.f = wwd0VarA2;
        this.i = e1i.b(wwd0VarA2);
        kzh.d(new g1i(wwd0VarA, new a(null)), o8i0.d(this));
    }
}
