package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchMyFavoriteViewModel$onLayoutUpdated$1", f = "PreMatchMyFavoriteViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xh20 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ yh20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh20(yh20 yh20Var, v1b<? super xh20> v1bVar) {
        super(2, v1bVar);
        this.b = yh20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xh20 xh20Var = new xh20(this.b, v1bVar);
        xh20Var.a = ((Boolean) obj).booleanValue();
        return xh20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((xh20) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.b.m(Boolean.valueOf(z));
        return Unit.a;
    }
}
