package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$init$$inlined$flatMapLatest$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class kki0 extends tje0 implements gaj<myh<? super qki0>, AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jki0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kki0(v1b v1bVar, jki0 jki0Var) {
        super(3, v1bVar);
        this.d = jki0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qki0> myhVar, AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        kki0 kki0Var = new kki0(v1bVar, this.d);
        kki0Var.b = myhVar;
        kki0Var.c = accountInfo;
        return kki0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh xzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((AccountInfo) this.c) == null) {
                rki0 rki0Var = rki0.SPORTY;
                xzhVar = new gzh(new qki0.b(rki0Var, rki0Var));
            } else {
                x66<rki0> x66Var = z76.x;
                jki0.a aVar = jki0.e;
                jki0 jki0Var = this.d;
                jki0Var.getClass();
                xzhVar = new xzh(new n1i(new or60(new pki0(jki0Var, x66Var, null)), new or60(new pki0(jki0Var, z76.y, null)), new mki0(3, null)), new lki0(2, null));
            }
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
