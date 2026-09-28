package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$setTabLayoutTooltipCloseForever$1", f = "PayMethodsViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class d400 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e400 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d400(e400 e400Var, v1b<? super d400> v1bVar) {
        super(2, v1bVar);
        this.b = e400Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d400(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d400) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b700 b700Var = this.b.b;
            this.a = 1;
            if (b700Var.i("PREF_KEY_NEW_FEATURE_TAB_LAYOUT_SCROLL_BTN", this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
