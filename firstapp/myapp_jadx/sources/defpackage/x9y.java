package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.nuvei.withdraw.NuveiWithdrawViewModel$emitSideEffect$1", f = "NuveiWithdrawViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class x9y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y9y b;
    public final /* synthetic */ w8y.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9y(y9y y9yVar, w8y.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = y9yVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x9y(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x9y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<w8y> ku90Var = this.b.Y;
            this.a = 1;
            if (ku90Var.a.emit(this.c, this) == y5bVar) {
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
