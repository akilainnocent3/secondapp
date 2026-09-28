package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.SavedAssetsScreenKt$SavedAssetsContent$7$1", f = "SavedAssetsScreen.kt", l = {167}, m = "invokeSuspend", v = 2)
public final class pu60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zp70 b;
    public final /* synthetic */ ytw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu60(v1b v1bVar, ytw ytwVar, zp70 zp70Var) {
        super(2, v1bVar);
        this.b = zp70Var;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pu60(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pu60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (((Boolean) this.c.getValue()).booleanValue()) {
                zp70 zp70Var = this.b;
                int iH = zp70Var.h();
                this.a = 1;
                if (zp70Var.f(iH, new fkd0(null, 7), this) == y5bVar) {
                    return y5bVar;
                }
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
