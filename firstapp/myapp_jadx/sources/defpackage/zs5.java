package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$getDataFlowWithNull$$inlined$flatMapLatest$1", f = "CachedResourceImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class zs5 extends tje0 implements gaj<myh<Object>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ts5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs5(ts5 ts5Var, v1b v1bVar) {
        super(3, v1bVar);
        this.d = ts5Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<Object> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        zs5 zs5Var = new zs5(this.d, v1bVar);
        zs5Var.b = myhVar;
        zs5Var.c = bool;
        return zs5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            xzh xzhVar = new xzh(new dt5(this.d.c), new ct5(((Boolean) this.c).booleanValue(), null));
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
