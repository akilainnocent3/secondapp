package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.kepay.deposit.KeDepositManagerImpl$initBountyAndTaxConfigs$1", f = "KeDepositManager.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class nip extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oip b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nip(oip oipVar, v1b<? super nip> v1bVar) {
        super(2, v1bVar);
        this.b = oipVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nip(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nip) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            g1i g1iVarH0 = this.b.a.h0(pu0.c.a);
            this.a = 1;
            if (bm50.p(g1iVarH0, this) == y5bVar) {
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
