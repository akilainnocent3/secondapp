package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.OnConfirmJoinRoomUseCase$downloadSpineData$spineDownloadedSuccessfully$1", f = "OnConfirmJoinRoomUseCase.kt", l = {33}, m = "invokeSuspend", v = 1)
public final class vny extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xny b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vny(xny xnyVar, v1b<? super vny> v1bVar) {
        super(1, v1bVar);
        this.b = xnyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vny(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((vny) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jum jumVar = this.b.a;
            rzs rzsVar = rzs.b;
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
