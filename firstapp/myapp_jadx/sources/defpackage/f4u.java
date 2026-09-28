package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$flatMapLatest$2", f = "LoyaltyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class f4u extends tje0 implements gaj<myh<? super p34>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m7e0 d;
    public final /* synthetic */ uek e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4u(v1b v1bVar, m7e0 m7e0Var, uek uekVar) {
        super(3, v1bVar);
        this.d = m7e0Var;
        this.e = uekVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super p34> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        f4u f4uVar = new f4u(v1bVar, this.d, this.e);
        f4uVar.b = myhVar;
        f4uVar.c = bool;
        return f4uVar.invokeSuspend(Unit.a);
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
                yzh yzhVar = new yzh(new or60(new sek(this.e, null)), new tek(3, null));
                m7e0 m7e0Var = this.d;
                m7e0Var.getClass();
                gzhVar = new n1i(bm50.f(yzhVar), bm50.f(new yzh(new or60(new u3k(m7e0Var.a, null)), new v3k(3, null))), new l7e0(m7e0Var, null));
            } else {
                gzhVar = new gzh(new p34(false, null, null, 31));
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
