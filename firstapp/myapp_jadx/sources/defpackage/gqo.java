package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.topappbar.InstantWinTopAppBarUserStatusHandlerImpl$init$$inlined$flatMapLatest$1", f = "InstantWinTopAppBarUserStatusHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class gqo extends tje0 implements gaj<myh<? super fqo.c>, AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kqo d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqo(v1b v1bVar, kqo kqoVar, boolean z) {
        super(3, v1bVar);
        this.d = kqoVar;
        this.e = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fqo.c> myhVar, AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        gqo gqoVar = new gqo(v1bVar, this.d, this.e);
        gqoVar.b = myhVar;
        gqoVar.c = accountInfo;
        return gqoVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh jqoVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((AccountInfo) this.c) == null) {
                jqoVar = new gzh(new fqo.c.C0581c(fqo.b.a.a));
            } else {
                kqo kqoVar = this.d;
                jqoVar = new jqo(kqoVar.a.h(pu0.b.a), kqoVar, this.e);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, jqoVar, this) == y5bVar) {
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
