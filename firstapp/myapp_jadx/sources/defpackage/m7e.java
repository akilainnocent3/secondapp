package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.DepositToUnlockBtManagerImpl$recordCloseTime$1", f = "DepositToUnlockBtManagerImpl.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class m7e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j7e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7e(j7e j7eVar, v1b<? super m7e> v1bVar) {
        super(2, v1bVar);
        this.b = j7eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m7e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m7e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            w1j0 w1j0Var = this.b.c;
            wm20 wm20VarA = w1j0Var.g.a(w1j0Var, w1j0.i[5]);
            Long l = new Long(System.currentTimeMillis());
            this.a = 1;
            if (wm20VarA.g(this, l) == y5bVar) {
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
