package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$special$$inlined$flatMapLatest$2", f = "LNStreamPlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class sfr extends tje0 implements gaj<myh<? super lk50<? extends b5q>>, mfr.c, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfr(v1b v1bVar, mfr mfrVar) {
        super(3, v1bVar);
        this.d = mfrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends b5q>> myhVar, mfr.c cVar, v1b<? super Unit> v1bVar) {
        sfr sfrVar = new sfr(v1bVar, this.d);
        sfrVar.b = myhVar;
        sfrVar.c = cVar;
        return sfrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            b5q b5qVar = ((mfr.c) this.c).a;
            lyh gzhVar = b5qVar != null ? new gzh(new lk50.c(b5qVar)) : new yfr(new f1i(this.d.X));
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
