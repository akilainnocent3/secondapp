package defpackage;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i9p {
    public static e9p a() {
        return new e9p(null);
    }

    public static final void b(CoroutineContext coroutineContext, CancellationException cancellationException) {
        c9p c9pVar = (c9p) coroutineContext.get(c9p.b.a);
        if (c9pVar != null) {
            c9pVar.cancel(cancellationException);
        }
    }

    public static final Object c(c9p c9pVar, x1b x1bVar) {
        c9pVar.cancel((CancellationException) null);
        Object objJoin = c9pVar.join(x1bVar);
        return objJoin == y5b.a ? objJoin : Unit.a;
    }

    public static void d(CoroutineContext coroutineContext) {
        Sequence<c9p> children;
        c9p c9pVar = (c9p) coroutineContext.get(c9p.b.a);
        if (c9pVar == null || (children = c9pVar.getChildren()) == null) {
            return;
        }
        Iterator<c9p> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel((CancellationException) null);
        }
    }

    public static final void e(CoroutineContext coroutineContext) {
        c9p c9pVar = (c9p) coroutineContext.get(c9p.b.a);
        if (c9pVar != null && !c9pVar.isActive()) {
            throw c9pVar.getCancellationException();
        }
    }

    public static final c9p f(CoroutineContext coroutineContext) {
        c9p c9pVar = (c9p) coroutineContext.get(c9p.b.a);
        if (c9pVar != null) {
            return c9pVar;
        }
        ogf.a(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static wse g(c9p c9pVar, j9p j9pVar) {
        return c9pVar instanceof m9p ? ((m9p) c9pVar).O(true, j9pVar) : c9pVar.invokeOnCompletion(j9pVar.k(), true, new h9p(j9pVar));
    }

    public static final boolean h(CoroutineContext coroutineContext) {
        c9p c9pVar = (c9p) coroutineContext.get(c9p.b.a);
        if (c9pVar != null) {
            return c9pVar.isActive();
        }
        return true;
    }
}
