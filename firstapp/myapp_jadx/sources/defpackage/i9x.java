package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$getOldCMSPagesFlow$2", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class i9x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ f9x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9x(f9x f9xVar, v1b<? super i9x> v1bVar) {
        super(2, v1bVar);
        this.a = f9xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i9x(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i9x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        f9x f9xVar = this.a;
        f9xVar.g.setLanguageCode(f9xVar.h.getLanguageCode());
        return Unit.a;
    }
}
