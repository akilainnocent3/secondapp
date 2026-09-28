package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$init$1$renamingStateFlow$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mki0 extends tje0 implements gaj<rki0, rki0, v1b<? super qki0.b>, Object> {
    public /* synthetic */ rki0 a;
    public /* synthetic */ rki0 b;

    @Override // defpackage.gaj
    public final Object invoke(rki0 rki0Var, rki0 rki0Var2, v1b<? super qki0.b> v1bVar) {
        mki0 mki0Var = new mki0(3, v1bVar);
        mki0Var.a = rki0Var;
        mki0Var.b = rki0Var2;
        return mki0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rki0 rki0Var = this.a;
        rki0 rki0Var2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new qki0.b(rki0Var, rki0Var2);
    }
}
