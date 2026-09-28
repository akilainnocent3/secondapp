package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$$inlined$flatMapLatest$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class bqn extends tje0 implements gaj<myh<? super gqn>, AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eqn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqn(v1b v1bVar, eqn eqnVar) {
        super(3, v1bVar);
        this.d = eqnVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super gqn> myhVar, AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        bqn bqnVar = new bqn(v1bVar, this.d);
        bqnVar.b = myhVar;
        bqnVar.c = accountInfo;
        return bqnVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh gzhVar = ((AccountInfo) this.c) == null ? new gzh(gqn.c.a) : new or60(new cqn(null, this.d));
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
