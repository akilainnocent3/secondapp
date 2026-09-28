package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$1", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class h3r extends tje0 implements gaj<myh<? super v4r>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f2r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3r(v1b v1bVar, f2r f2rVar) {
        super(3, v1bVar);
        this.d = f2rVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super v4r> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        h3r h3rVar = new h3r(v1bVar, this.d);
        h3rVar.b = myhVar;
        h3rVar.c = bool;
        return h3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                f2r f2rVar = this.d;
                gzhVar = new xzh(new e3r(f2rVar.D.a(f2rVar.R, f2rVar.S, f2rVar.b)), new d3r(null, f2rVar));
            } else {
                gzhVar = new gzh(v4r.a.a);
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
