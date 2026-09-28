package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$getOldCMSPagesFlow$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class xn30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zn30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn30(zn30 zn30Var, v1b<? super xn30> v1bVar) {
        super(2, v1bVar);
        this.a = zn30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xn30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xn30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zn30 zn30Var = this.a;
        zn30Var.g.setLanguageCode(zn30Var.h.getLanguageCode());
        return Unit.a;
    }
}
