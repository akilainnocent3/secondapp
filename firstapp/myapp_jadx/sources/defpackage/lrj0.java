package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawViewModelLegacy$observeAlert$1", f = "WithdrawViewModelLegacy.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lrj0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nrj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrj0(nrj0 nrj0Var, v1b<? super lrj0> v1bVar) {
        super(2, v1bVar);
        this.b = nrj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lrj0 lrj0Var = new lrj0(this.b, v1bVar);
        lrj0Var.a = obj;
        return lrj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((lrj0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.y;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, uiText));
        return Unit.a;
    }
}
