package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class tsz<T> implements nxs.d {
    public final long a = tws.c.getAndIncrement();
    public final gqc b;
    public final ozd0 c;
    public final a<? extends T> d;
    public volatile T e;

    public interface a<T> {
        Object a(Uri uri, eqc eqcVar);
    }

    public tsz(zpc zpcVar, gqc gqcVar, a aVar) {
        this.c = new ozd0(zpcVar);
        this.b = gqcVar;
        this.d = aVar;
    }

    @Override // nxs.d
    public final void a() {
        this.c.b = 0L;
        eqc eqcVar = new eqc(this.c, this.b);
        try {
            eqcVar.a.a(eqcVar.b);
            eqcVar.d = true;
            Uri uri = this.c.a.getUri();
            uri.getClass();
            this.e = (T) this.d.a(uri, eqcVar);
        } finally {
            jrh0.g(eqcVar);
        }
    }

    @Override // nxs.d
    public final void b() {
    }
}
