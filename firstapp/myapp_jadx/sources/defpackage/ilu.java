package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$special$$inlined$flatMapLatest$1", f = "MainViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ilu extends tje0 implements gaj<myh<? super hrm>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oku d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilu(v1b v1bVar, oku okuVar) {
        super(3, v1bVar);
        this.d = okuVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hrm> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        ilu iluVar = new ilu(v1bVar, this.d);
        iluVar.b = myhVar;
        iluVar.c = bool;
        return iluVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Boolean) this.c).getClass();
            grm grmVar = this.d.K;
            lyh g1iVar = grmVar.c.n() ? new g1i(bm50.f(grmVar.a.j(z76.b)), new drm(grmVar, null)) : i2g.a;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, g1iVar, this) == y5bVar) {
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
