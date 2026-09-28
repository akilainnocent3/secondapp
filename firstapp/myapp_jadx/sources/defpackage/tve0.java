package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$getOldCMSPagesFlow$2", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tve0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zve0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tve0(zve0 zve0Var, v1b<? super tve0> v1bVar) {
        super(2, v1bVar);
        this.a = zve0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tve0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tve0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zve0 zve0Var = this.a;
        zve0Var.d.setLanguageCode(zve0Var.g.getLanguageCode());
        return Unit.a;
    }
}
