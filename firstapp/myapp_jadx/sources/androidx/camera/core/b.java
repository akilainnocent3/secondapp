package androidx.camera.core;

import android.media.Image;
import defpackage.c9n;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements c {
    public final c b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public interface a {
        void g(b bVar);
    }

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // androidx.camera.core.c
    public int b() {
        return this.b.b();
    }

    @Override // androidx.camera.core.c
    public int c() {
        return this.b.c();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).g(this);
        }
    }

    public final void d(a aVar) {
        synchronized (this.a) {
            this.c.add(aVar);
        }
    }

    @Override // androidx.camera.core.c
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // androidx.camera.core.c
    public c9n m1() {
        return this.b.m1();
    }

    @Override // androidx.camera.core.c
    public final Image t() {
        return this.b.t();
    }

    @Override // androidx.camera.core.c
    public c.a[] y0() {
        return this.b.y0();
    }
}
