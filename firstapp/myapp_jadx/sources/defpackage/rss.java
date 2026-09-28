package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class rss {
    public jvd0 a;
    public final CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();
    public int c;
    public int d;

    public interface a {
        void a(int i);
    }

    public final void a(int i, nas nasVar) {
        jvd0 jvd0Var = this.a;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = i;
        this.a = ej5.c(nasVar, null, null, new sss(i, this, null), 3);
    }
}
