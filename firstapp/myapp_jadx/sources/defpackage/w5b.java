package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class w5b {
    public static final j1b a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(c9p.b.a) == null) {
            coroutineContext = coroutineContext.plus(i9p.a());
        }
        return new j1b(coroutineContext);
    }

    public static final j1b b() {
        kfe0 kfe0VarA = lfe0.a();
        pfd pfdVar = fse.a;
        return new j1b(CoroutineContext.Element.a.d(kfe0VarA, gku.a));
    }

    public static final void c(v5b v5bVar, CancellationException cancellationException) {
        c9p c9pVar = (c9p) v5bVar.getCoroutineContext().get(c9p.b.a);
        if (c9pVar != null) {
            c9pVar.cancel(cancellationException);
        } else {
            ogf.a(v5bVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final <R> Object d(Function2<? super v5b, ? super v1b<? super R>, ? extends Object> function2, v1b<? super R> v1bVar) {
        vn70 vn70Var = new vn70(v1bVar, v1bVar.getContext());
        Object objA = mdh0.a(vn70Var, true, vn70Var, function2);
        y5b y5bVar = y5b.a;
        return objA;
    }

    public static final boolean e(v5b v5bVar) {
        c9p c9pVar = (c9p) v5bVar.getCoroutineContext().get(c9p.b.a);
        if (c9pVar != null) {
            return c9pVar.isActive();
        }
        return true;
    }
}
