package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class v0s extends jvd0 {
    public final v1b<Unit> e;

    public v0s(CoroutineContext coroutineContext, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.e = yzo.a(this, this, function2);
    }

    @Override // defpackage.m9p
    public final void d0() throws Throwable {
        try {
            v1b v1bVarB = yzo.b(this.e);
            zi50.a aVar = zi50.b;
            zre.b(v1bVarB, Unit.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof vre) {
                th = ((vre) th).a;
            }
            zi50.a aVar2 = zi50.b;
            resumeWith(new zi50.b(th));
            throw th;
        }
    }
}
