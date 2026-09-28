package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetFavoriteLotteryIdUseCase$invoke$$inlined$flatMapLatest$1", f = "LNGetFavoriteLotteryIdUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ecq extends tje0 implements gaj<myh<? super qcn<? extends g7q>>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nnb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecq(v1b v1bVar, nnb nnbVar) {
        super(3, v1bVar);
        this.d = nnbVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qcn<? extends g7q>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        ecq ecqVar = new ecq(v1bVar, this.d);
        ecqVar.b = myhVar;
        ecqVar.c = bool;
        return ecqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVarD = ((Boolean) this.c).booleanValue() ? ((i6u) this.d.a).h.d(n1a0.c) : new gzh(n1a0.c);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarD, this) == y5bVar) {
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
