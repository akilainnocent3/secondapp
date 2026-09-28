package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ava implements vp60, quw {
    public final vp60 a;
    public final quw b;
    public CoroutineContext c;
    public Throwable d;

    public ava(vp60 vp60Var) {
        tuw tuwVarA = uuw.a();
        vp60Var.getClass();
        this.a = vp60Var;
        this.b = tuwVarA;
    }

    @Override // defpackage.vp60
    public final hq60 H1(String str) {
        str.getClass();
        return this.a.H1(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.a.close();
    }

    @Override // defpackage.quw
    public final Object d(v1b v1bVar) {
        return this.b.d(v1bVar);
    }

    @Override // defpackage.quw
    public final void f(Object obj) {
        this.b.f(null);
    }

    public final void g(StringBuilder sb) {
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        CoroutineContext coroutineContext = this.c;
        if (coroutineContext != null) {
            sb.append("\t\tCoroutine: " + coroutineContext);
            sb.append('\n');
        }
        Throwable th = this.d;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = CollectionsKt.O(StringsKt.X(rtg.b(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // defpackage.vp60
    public final boolean s() {
        return this.a.s();
    }

    public final String toString() {
        return this.a.toString();
    }
}
