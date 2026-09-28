package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$setStreamViewVisible$1", f = "LNStreamPlayerViewModel.kt", l = {657}, m = "invokeSuspend", v = 2)
public final class qfr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mfr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfr(v1b v1bVar, mfr mfrVar) {
        super(2, v1bVar);
        this.b = mfrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qfr(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qfr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        mfr mfrVar = this.b;
        if (mfrVar.R == 0) {
            wwd0 wwd0Var = mfrVar.U;
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            wwd0 wwd0Var2 = mfrVar.I;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool);
            mfrVar.H1();
        }
        return Unit.a;
    }
}
