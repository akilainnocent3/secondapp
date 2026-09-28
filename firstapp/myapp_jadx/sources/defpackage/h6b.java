package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class h6b implements Function1<Throwable, Unit> {
    public final /* synthetic */ bc6 a;

    public h6b(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        zi50.a aVar = zi50.b;
        th2.getClass();
        this.a.resumeWith(new zi50.b(th2));
        return Unit.a;
    }
}
