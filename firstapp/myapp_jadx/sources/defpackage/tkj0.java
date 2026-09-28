package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawBaseViewModel$initAlerts$1", f = "WithdrawBaseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tkj0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ xkj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkj0(xkj0 xkj0Var, v1b<? super tkj0> v1bVar) {
        super(2, v1bVar);
        this.b = xkj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tkj0 tkj0Var = new tkj0(this.b, v1bVar);
        tkj0Var.a = obj;
        return tkj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((tkj0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qxd0<UiText> qxd0VarS1 = this.b.S1();
        qxd0VarS1.getClass();
        qxd0VarS1.a.invoke();
        qxd0VarS1.a(uiText);
        return Unit.a;
    }
}
