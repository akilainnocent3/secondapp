package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wqr implements Function1<Throwable, Unit> {
    public final /* synthetic */ xqr a;
    public final /* synthetic */ bc6 b;

    public wqr(xqr xqrVar, bc6 bc6Var) {
        this.a = xqrVar;
        this.b = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        xqr xqrVar = this.a;
        Object obj = xqrVar.a;
        bc6 bc6Var = this.b;
        synchronized (obj) {
            xqrVar.b.remove(bc6Var);
        }
        return Unit.a;
    }
}
