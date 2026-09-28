package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.AddNewAccountDialogScreenKt$AddNewAccountDialogEntry$2$1", f = "AddNewAccountDialogScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ai extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mjj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(mjj0 mjj0Var, v1b<? super ai> v1bVar) {
        super(2, v1bVar);
        this.a = mjj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ai(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ai) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.v0;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
        return Unit.a;
    }
}
