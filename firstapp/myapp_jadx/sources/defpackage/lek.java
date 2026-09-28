package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.status.GetStatusUseCase$invoke$2$1", f = "GetStatusUseCase.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class lek extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lek(nek nekVar, v1b<? super lek> v1bVar) {
        super(1, v1bVar);
        this.b = nekVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new lek(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((lek) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jum jumVar = this.b.a;
            rzs rzsVar = rzs.c;
            this.a = 1;
            if (jumVar.h(rzsVar) == y5bVar) {
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
