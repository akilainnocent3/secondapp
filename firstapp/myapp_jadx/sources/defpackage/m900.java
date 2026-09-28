package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.PaymentScreenHostKt$PaymentScreenHost$1$1", f = "PaymentScreenHost.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m900 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ n000 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m900(n000 n000Var, v1b<? super m900> v1bVar) {
        super(2, v1bVar);
        this.a = n000Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m900(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m900) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        n000 n000Var = this.a;
        if (!n000Var.F) {
            n000Var.F = true;
            n000Var.U1();
            kzh.d(new g1i(n000Var.d.l, new p000(n000Var, null)), o8i0.d(n000Var));
        }
        return Unit.a;
    }
}
