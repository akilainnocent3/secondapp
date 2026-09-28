package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$invoke$$inlined$flatMapLatest$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class rey extends tje0 implements gaj<myh<? super b8q>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ afy d;
    public final /* synthetic */ wwd0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rey(v1b v1bVar, afy afyVar, wwd0 wwd0Var) {
        super(3, v1bVar);
        this.d = afyVar;
        this.e = wwd0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super b8q> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        rey reyVar = new rey(v1bVar, this.d, this.e);
        reyVar.b = myhVar;
        reyVar.c = bool;
        return reyVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVarB = ((Boolean) this.c).booleanValue() ? hzh.b(new yey(null, this.d, this.e)) : new gzh(new b8q(null, false, null, 31));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarB, this) == y5bVar) {
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
