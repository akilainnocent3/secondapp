package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.jumpbank.JumpBankScreenKt$JumpBankScreen$1$1", f = "JumpBankScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bgp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ogp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(ogp ogpVar, v1b<? super bgp> v1bVar) {
        super(2, v1bVar);
        this.a = ogpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bgp(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bgp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ogp ogpVar = this.a;
        wwd0 wwd0Var = ogpVar.a.i;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
        ej5.c(o8i0.d(ogpVar), null, null, new ngp(ogpVar, null), 3);
        return Unit.a;
    }
}
