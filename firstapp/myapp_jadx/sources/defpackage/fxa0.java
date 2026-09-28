package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$observeAlert$1", f = "SpeiByStpWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fxa0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zwa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxa0(zwa0 zwa0Var, v1b<? super fxa0> v1bVar) {
        super(2, v1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fxa0 fxa0Var = new fxa0(this.b, v1bVar);
        fxa0Var.a = obj;
        return fxa0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((fxa0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.E;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, wwa0.a((wwa0) value, uiText, null, null, false, false, 30)));
        return Unit.a;
    }
}
