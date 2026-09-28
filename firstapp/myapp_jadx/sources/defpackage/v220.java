package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$checkIfPopoverIsHidden$1", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v220 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ e320 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v220(e320 e320Var, v1b<? super v220> v1bVar) {
        super(2, v1bVar);
        this.b = e320Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v220 v220Var = new v220(this.b, v1bVar);
        v220Var.a = ((Boolean) obj).booleanValue();
        return v220Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((v220) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.f.m(Boolean.valueOf(z));
        return Unit.a;
    }
}
