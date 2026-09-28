package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$getOldCMSPagesFlow$2", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class md60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ od60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md60(od60 od60Var, v1b<? super md60> v1bVar) {
        super(2, v1bVar);
        this.a = od60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new md60(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((md60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        od60 od60Var = this.a;
        od60Var.e.setLanguageCode(od60Var.f.getLanguageCode());
        return Unit.a;
    }
}
