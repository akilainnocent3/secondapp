package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.quickinput.QuickInputDelegate$onTextFieldValueChanged$1", f = "QuickInputDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ng30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ hg30 b;

    public static final /* synthetic */ class a extends pf implements Function1<bh30, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bh30 bh30Var) {
            bh30 bh30Var2 = bh30Var;
            bh30Var2.getClass();
            hg30 hg30Var = (hg30) this.a;
            hg30Var.getClass();
            hg30Var.a(new mg30(hg30Var, bh30Var2, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng30(String str, hg30 hg30Var, v1b<? super ng30> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = hg30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ng30(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ng30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hg30 hg30Var = this.b;
        wwd0 wwd0Var = hg30Var.d;
        Object value = wwd0Var.getValue();
        String str = this.a;
        if (!Intrinsics.g(str, value)) {
            wwd0Var.setValue(null);
            fg30 fg30Var = hg30Var.f;
            if (fg30Var != null) {
                ch30 ch30Var = hg30Var.c;
                a aVar = new a(1, hg30Var, hg30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8);
                ch30Var.getClass();
                hg30Var.b(ch30.b(fg30Var, aVar));
            } else {
                hg30Var.g = str;
            }
        }
        return Unit.a;
    }
}
