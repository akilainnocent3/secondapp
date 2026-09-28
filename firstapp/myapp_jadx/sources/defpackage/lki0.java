package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$init$1$1", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class lki0 extends tje0 implements Function2<myh<? super qki0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lki0 lki0Var = new lki0(2, v1bVar);
        lki0Var.b = obj;
        return lki0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super qki0> myhVar, v1b<? super Unit> v1bVar) {
        return ((lki0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            qki0.a aVar = qki0.a.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
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
