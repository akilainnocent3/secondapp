package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import defpackage.c9n;
import defpackage.e06;
import defpackage.egc;
import defpackage.f06;
import defpackage.jan;
import defpackage.km20;
import defpackage.pgt;
import defpackage.tz5;
import defpackage.z70;
import defpackage.zi80;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements jan, b.a {
    public final Object a;
    public final a b;
    public int c;
    public final egc d;
    public boolean e;
    public final z70 f;
    public jan.a g;
    public Executor h;
    public final LongSparseArray<c9n> i;
    public final LongSparseArray<c> j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public class a extends tz5 {
        public a() {
        }

        @Override // defpackage.tz5
        public final void b(int i, e06 e06Var) {
            d dVar = d.this;
            synchronized (dVar.a) {
                try {
                    if (dVar.e) {
                        return;
                    }
                    dVar.i.put(e06Var.d(), new f06(e06Var));
                    dVar.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public d(int i, int i2, int i3, int i4) {
        z70 z70Var = new z70(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new a();
        this.c = 0;
        this.d = new egc(this);
        this.e = false;
        this.i = new LongSparseArray<>();
        this.j = new LongSparseArray<>();
        this.m = new ArrayList();
        this.f = z70Var;
        this.k = 0;
        this.l = new ArrayList(f());
    }

    @Override // defpackage.jan
    public final c a() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < this.l.size() - 1; i2++) {
                    if (!this.m.contains(this.l.get(i2))) {
                        arrayList.add((c) this.l.get(i2));
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((c) obj).close();
                }
                int size2 = this.l.size();
                ArrayList arrayList2 = this.l;
                this.k = size2;
                c cVar = (c) arrayList2.get(size2 - 1);
                this.m.add(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jan
    public final int b() {
        int iB;
        synchronized (this.a) {
            iB = this.f.b();
        }
        return iB;
    }

    @Override // defpackage.jan
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.f.c();
        }
        return iC;
    }

    @Override // defpackage.jan
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.l);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((c) obj).close();
                }
                this.l.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jan
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.f.d();
        }
        return iD;
    }

    @Override // defpackage.jan
    public final void e() {
        synchronized (this.a) {
            this.f.e();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    @Override // defpackage.jan
    public final int f() {
        int iF;
        synchronized (this.a) {
            iF = this.f.f();
        }
        return iF;
    }

    @Override // androidx.camera.core.b.a
    public final void g(b bVar) {
        synchronized (this.a) {
            j(bVar);
        }
    }

    @Override // defpackage.jan
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // defpackage.jan
    public final void h(jan.a aVar, Executor executor) {
        synchronized (this.a) {
            aVar.getClass();
            this.g = aVar;
            executor.getClass();
            this.h = executor;
            this.f.h(this.d, executor);
        }
    }

    @Override // defpackage.jan
    public final c i() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i = this.k;
                this.k = i + 1;
                c cVar = (c) arrayList.get(i);
                this.m.add(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(b bVar) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.l.indexOf(bVar);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(bVar);
                if (this.c > 0) {
                    l(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(zi80 zi80Var) {
        final jan.a aVar;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.l.size() < f()) {
                    zi80Var.d(this);
                    this.l.add(zi80Var);
                    aVar = this.g;
                    executor = this.h;
                } else {
                    pgt.a("TAG", "Maximum image number reached.");
                    zi80Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: zov
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(this.a);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public final void l(jan janVar) {
        c cVarI;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= janVar.f()) {
                    pgt.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        cVarI = janVar.i();
                        if (cVarI != null) {
                            this.c--;
                            size++;
                            this.j.put(cVarI.m1().d(), cVarI);
                            m();
                        }
                    } catch (IllegalStateException e) {
                        pgt.b("MetadataImageReader", "Failed to acquire next image.", e);
                        cVarI = null;
                    }
                    if (cVarI == null || this.c <= 0) {
                        break;
                    }
                } while (size < janVar.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    c9n c9nVarValueAt = this.i.valueAt(size);
                    long jD = c9nVarValueAt.d();
                    c cVar = this.j.get(jD);
                    if (cVar != null) {
                        this.j.remove(jD);
                        this.i.removeAt(size);
                        k(new zi80(cVar, null, c9nVarValueAt));
                    }
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    km20.b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < jKeyAt2) {
                                this.j.valueAt(size).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
