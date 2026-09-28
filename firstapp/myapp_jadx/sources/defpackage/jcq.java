package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetResultsUseCase$invoke$$inlined$flatMapLatest$1", f = "LNGetResultsUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class jcq extends tje0 implements gaj<myh<? super lk50<? extends d7r>>, Unit, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n1i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcq(v1b v1bVar, n1i n1iVar) {
        super(3, v1bVar);
        this.d = n1iVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends d7r>> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
        jcq jcqVar = new jcq(v1bVar, this.d);
        jcqVar.b = myhVar;
        jcqVar.c = unit;
        return jcqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            xzh xzhVar = new xzh(this.d, new kcq(2, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, xzhVar, this) == y5bVar) {
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
