package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetMyNumberUseCase$invoke$$inlined$flatMapLatest$1", f = "GetMyNumberUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class o9k extends tje0 implements gaj<myh<? super dvq>, avq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r9k d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qcn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9k(v1b v1bVar, r9k r9kVar, String str, qcn qcnVar) {
        super(3, v1bVar);
        this.d = r9kVar;
        this.e = str;
        this.f = qcnVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super dvq> myhVar, avq avqVar, v1b<? super Unit> v1bVar) {
        o9k o9kVar = new o9k(v1bVar, this.d, this.e, this.f);
        o9kVar.b = myhVar;
        o9kVar.c = avqVar;
        return o9kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((avq) this.c).g) {
                a7q a7qVar = this.d.b;
                String str = this.e;
                str.getClass();
                gzhVar = new q9k(new or60(new w6q(a7qVar, str, null)), this.f);
            } else {
                gzhVar = new gzh(dvq.c.a);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
