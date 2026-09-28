package defpackage;

import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$special$$inlined$flatMapLatest$1", f = "WelcomeRewardViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class o5j0 extends tje0 implements gaj<myh<? super q1j0>, NonFtdEngagement, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w4j0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(3, v1bVar);
        this.d = w4j0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super q1j0> myhVar, NonFtdEngagement nonFtdEngagement, v1b<? super Unit> v1bVar) {
        o5j0 o5j0Var = new o5j0(v1bVar, this.d);
        o5j0Var.b = myhVar;
        o5j0Var.c = nonFtdEngagement;
        return o5j0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) this.c;
            w4j0 w4j0Var = this.d;
            w5j0 w5j0Var = new w5j0((nonFtdEngagement.getEnabled() && w4j0Var.f.O()) ? new v5j0(w4j0Var.D) : new gzh(Boolean.valueOf(nonFtdEngagement.getEnabled())), w4j0Var, nonFtdEngagement);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, w5j0Var, this) == y5bVar) {
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
