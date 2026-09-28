package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySessionDataHandlerImpl$init$$inlined$flatMapLatest$1", f = "SportyPenaltySessionDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class l1d0 extends tje0 implements gaj<myh<? super AccountInfo>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p1d0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1d0(v1b v1bVar, p1d0 p1d0Var, String str) {
        super(3, v1bVar);
        this.d = p1d0Var;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Long l, v1b<? super Unit> v1bVar) {
        l1d0 l1d0Var = new l1d0(v1bVar, this.d, this.e);
        l1d0Var.b = myhVar;
        l1d0Var.c = l;
        return l1d0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            p1d0 p1d0Var = this.d;
            yzh yzhVar = new yzh(new g1i(p1d0Var.c.getAccountInfoFlow(), new m1d0(null, p1d0Var, this.e)), new n1d0(p1d0Var, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, yzhVar, this) == y5bVar) {
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
