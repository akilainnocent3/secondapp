package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {105}, m = "invokeSuspend")
public final class ns5 extends tje0 implements gaj<myh<? super fmw<Object>>, kqz<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ et7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns5(v1b v1bVar, et7 et7Var) {
        super(3, v1bVar);
        this.d = et7Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fmw<Object>> myhVar, kqz<Object> kqzVar, v1b<? super Unit> v1bVar) {
        ns5 ns5Var = new ns5(v1bVar, this.d);
        ns5Var.b = myhVar;
        ns5Var.c = kqzVar;
        return ns5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            fmw fmwVar = new fmw(this.d, (kqz) this.c);
            this.a = 1;
            if (myhVar.emit(fmwVar, this) == y5bVar) {
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
