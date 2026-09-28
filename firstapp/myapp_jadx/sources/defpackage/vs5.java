package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$getDataFlowWithDefault$$inlined$flatMapLatest$1", f = "CachedResourceImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class vs5 extends tje0 implements gaj<myh<Object>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ts5 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs5(v1b v1bVar, ts5 ts5Var, Object obj) {
        super(3, v1bVar);
        this.d = ts5Var;
        this.e = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<Object> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        vs5 vs5Var = new vs5(v1bVar, this.d, this.e);
        vs5Var.b = myhVar;
        vs5Var.c = bool;
        return vs5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            xzh xzhVar = new xzh(this.d.c, new ys5(((Boolean) this.c).booleanValue(), this.e, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            h99.a(myhVar);
            Object objCollect = xzhVar.collect(new f1i.a(myhVar), this);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
