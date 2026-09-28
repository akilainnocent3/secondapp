package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositViewModelLegacy$observeAlert$1", f = "DepositViewModelLegacy.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o9e extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r9e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9e(r9e r9eVar, v1b<? super o9e> v1bVar) {
        super(2, v1bVar);
        this.b = r9eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o9e o9eVar = new o9e(this.b, v1bVar);
        o9eVar.a = obj;
        return o9eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((o9e) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.D;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, uiText));
        return Unit.a;
    }
}
