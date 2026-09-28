package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.quickinput.viewmodel.QuickInputViewModel$onTextFieldValueChanged$1", f = "QuickInputViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ih30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ jh30 b;

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
    public ih30(String str, jh30 jh30Var, v1b<? super ih30> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = jh30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ih30(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ih30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jh30 jh30Var = this.b;
        wwd0 wwd0Var = jh30Var.i;
        if (!Intrinsics.g(this.a, wwd0Var.getValue())) {
            wwd0Var.setValue(null);
            ch30 ch30Var = jh30Var.f;
            fg30 fg30Var = jh30Var.v;
            if (fg30Var == null) {
                Intrinsics.n("builder");
                throw null;
            }
            a aVar = new a(1, jh30Var, jh30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8);
            ch30Var.getClass();
            jh30Var.z1(ch30.b(fg30Var, aVar));
        }
        return Unit.a;
    }
}
