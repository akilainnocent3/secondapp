package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$special$$inlined$flatMapLatest$1", f = "LNStreamPlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class rfr extends tje0 implements gaj<myh<? super mfr.d>, String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfr(v1b v1bVar, mfr mfrVar) {
        super(3, v1bVar);
        this.d = mfrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mfr.d> myhVar, String str, v1b<? super Unit> v1bVar) {
        rfr rfrVar = new rfr(v1bVar, this.d);
        rfrVar.b = myhVar;
        rfrVar.c = str;
        return rfrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            String str = (String) this.c;
            if (str != null) {
                mfr mfrVar = this.d;
                wek wekVar = mfrVar.w;
                String str2 = mfrVar.b;
                wekVar.getClass();
                str2.getClass();
                gzhVar = new agr(bm50.a(new vek(new or60(new x6q(wekVar.a, str2, str, null)), wekVar)), str);
            } else {
                gzhVar = new gzh(null);
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
