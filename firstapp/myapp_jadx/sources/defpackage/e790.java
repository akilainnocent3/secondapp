package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.shortcut.ShortcutRepositoryImpl$getShortcutsFlow$2", f = "ShortcutRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e790 extends tje0 implements gaj<myh<? super uf00<? extends x590>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uf00<? extends x590>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        e790 e790Var = new e790(3, v1bVar);
        e790Var.a = th;
        return e790Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.e(th);
        return Unit.a;
    }
}
