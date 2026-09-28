package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.kepay.withdraw.KeWithdrawViewModel$initFeeAndTaxConfigs$1", f = "KeWithdrawViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class elp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dlp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elp(dlp dlpVar, v1b<? super elp> v1bVar) {
        super(2, v1bVar);
        this.b = dlpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new elp(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((elp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            g1i g1iVarM0 = this.b.Q0.m0(pu0.c.a);
            this.a = 1;
            if (bm50.p(g1iVarM0, this) == y5bVar) {
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
