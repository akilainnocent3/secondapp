package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$initAlerts$1", f = "DepositBaseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class prd extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wrd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prd(wrd wrdVar, v1b<? super prd> v1bVar) {
        super(2, v1bVar);
        this.b = wrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        prd prdVar = new prd(this.b, v1bVar);
        prdVar.a = obj;
        return prdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((prd) create(uiText, v1bVar)).invokeSuspend(Unit.a);
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
