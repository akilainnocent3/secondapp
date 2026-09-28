package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.AddMuNumberUseCase$invoke$$inlined$flatMapLatest$1", f = "AddMuNumberUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class kh extends tje0 implements gaj<myh<? super xwq>, lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oh d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qcn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(v1b v1bVar, oh ohVar, String str, qcn qcnVar) {
        super(3, v1bVar);
        this.d = ohVar;
        this.e = str;
        this.f = qcnVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xwq> myhVar, lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        kh khVar = new kh(v1bVar, this.d, this.e, this.f);
        khVar.b = myhVar;
        khVar.c = lk50Var;
        return khVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            nh nhVar = new nh(this.d.b.a(this.f, this.e), (lk50) this.c);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, nhVar, this) == y5bVar) {
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
