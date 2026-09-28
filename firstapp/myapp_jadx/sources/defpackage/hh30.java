package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.quickinput.viewmodel.QuickInputViewModel$onItemSelected$1", f = "QuickInputViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hh30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ jh30 a;
    public final /* synthetic */ bh30 b;

    public static final /* synthetic */ class a extends pf implements Function1<bh30, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bh30 bh30Var) {
            bh30 bh30Var2 = bh30Var;
            bh30Var2.getClass();
            jh30 jh30Var = (jh30) this.a;
            jh30Var.getClass();
            jh30Var.y1(new hh30(jh30Var, bh30Var2, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh30(jh30 jh30Var, bh30 bh30Var, v1b<? super hh30> v1bVar) {
        super(2, v1bVar);
        this.a = jh30Var;
        this.b = bh30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hh30(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hh30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jh30 jh30Var = this.a;
        wwd0 wwd0Var = jh30Var.i;
        bh30 bh30Var = this.b;
        wwd0Var.setValue(bh30Var.d ? "" : bh30Var.b);
        ch30 ch30Var = jh30Var.f;
        fg30 fg30Var = jh30Var.v;
        if (fg30Var == null) {
            Intrinsics.n("builder");
            throw null;
        }
        a aVar = new a(1, jh30Var, jh30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8);
        ch30Var.getClass();
        jh30Var.z1(ch30.d(fg30Var, bh30Var, aVar));
        return Unit.a;
    }
}
