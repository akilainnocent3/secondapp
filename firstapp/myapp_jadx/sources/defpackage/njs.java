package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class njs<T> {
    public static final Object k = new Object();
    public final Object a;
    public final qr60<lfy<? super T>, njs<T>.d> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (njs.this.a) {
                obj = njs.this.f;
                njs.this.f = njs.k;
            }
            njs.this.m(obj);
        }
    }

    public class b extends njs<T>.d {
        @Override // njs.d
        public final boolean d() {
            return true;
        }
    }

    public class c extends njs<T>.d implements cbs {
        public final ibs e;

        public c(ibs ibsVar, lfy<? super T> lfyVar) {
            super(lfyVar);
            this.e = ibsVar;
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            ibs ibsVar2 = this.e;
            s9s.b bVarB = ibsVar2.getLifecycle().b();
            if (bVarB == s9s.b.a) {
                njs.this.k(this.a);
                return;
            }
            s9s.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = ibsVar2.getLifecycle().b();
            }
        }

        @Override // njs.d
        public final void b() {
            this.e.getLifecycle().d(this);
        }

        @Override // njs.d
        public final boolean c(ibs ibsVar) {
            return this.e == ibsVar;
        }

        @Override // njs.d
        public final boolean d() {
            return this.e.getLifecycle().b().compareTo(s9s.b.d) >= 0;
        }
    }

    public njs() {
        this.a = new Object();
        this.b = new qr60<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (fw0.X().Y()) {
            return;
        }
        ib5.a(tug.a("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(njs<T>.d dVar) {
        if (dVar.b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i = dVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.c = i2;
            dVar.a.u1((Object) this.e);
        }
    }

    public final void c(njs<T>.d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                qr60<lfy<? super T>, njs<T>.d> qr60Var = this.b;
                qr60Var.getClass();
                qr60.d dVar2 = new qr60.d();
                qr60Var.c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T d() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public final boolean e() {
        return this.c > 0;
    }

    public void f(ibs ibsVar, lfy<? super T> lfyVar) {
        njs<T>.d dVar;
        a("observe");
        if (ibsVar.getLifecycle().b() == s9s.b.a) {
            return;
        }
        c cVar = new c(ibsVar, lfyVar);
        qr60<lfy<? super T>, njs<T>.d> qr60Var = this.b;
        qr60.c<lfy<? super T>, njs<T>.d> cVarA = qr60Var.a(lfyVar);
        if (cVarA != null) {
            dVar = cVarA.b;
        } else {
            qr60.c<K, V> cVar2 = new qr60.c<>(lfyVar, cVar);
            qr60Var.d++;
            qr60.c<lfy<? super T>, njs<T>.d> cVar3 = qr60Var.b;
            if (cVar3 == 0) {
                qr60Var.a = cVar2;
                qr60Var.b = cVar2;
            } else {
                cVar3.c = cVar2;
                cVar2.d = cVar3;
                qr60Var.b = cVar2;
            }
            dVar = null;
        }
        njs<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.c(ibsVar)) {
            hb5.a("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            ibsVar.getLifecycle().a(cVar);
        }
    }

    public final void g(lfy<? super T> lfyVar) {
        njs<T>.d dVar;
        a("observeForever");
        b bVar = new b(lfyVar);
        qr60<lfy<? super T>, njs<T>.d> qr60Var = this.b;
        qr60.c<lfy<? super T>, njs<T>.d> cVarA = qr60Var.a(lfyVar);
        if (cVarA != null) {
            dVar = cVarA.b;
        } else {
            qr60.c<K, V> cVar = new qr60.c<>(lfyVar, bVar);
            qr60Var.d++;
            qr60.c<lfy<? super T>, njs<T>.d> cVar2 = qr60Var.b;
            if (cVar2 == 0) {
                qr60Var.a = cVar;
                qr60Var.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                qr60Var.b = cVar;
            }
            dVar = null;
        }
        njs<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            hb5.a("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            bVar.a(true);
        }
    }

    public void j(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            fw0.X().Z(this.j);
        }
    }

    public void k(lfy<? super T> lfyVar) {
        a("removeObserver");
        njs<T>.d dVarB = this.b.b(lfyVar);
        if (dVarB == null) {
            return;
        }
        dVarB.b();
        dVarB.a(false);
    }

    public final void l(ibs ibsVar) {
        a("removeObservers");
        Iterator<Map.Entry<lfy<? super T>, njs<T>.d>> it = this.b.iterator();
        while (true) {
            qr60.e eVar = (qr60.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            if (((d) entry.getValue()).c(ibsVar)) {
                k((lfy) entry.getKey());
            }
        }
    }

    public void m(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }

    public abstract class d {
        public final lfy<? super T> a;
        public boolean b;
        public int c = -1;

        public d(lfy<? super T> lfyVar) {
            this.a = lfyVar;
        }

        public final void a(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            int i = z ? 1 : -1;
            njs njsVar = njs.this;
            int i2 = njsVar.c;
            njsVar.c = i + i2;
            if (!njsVar.d) {
                njsVar.d = true;
                while (true) {
                    try {
                        int i3 = njsVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            njsVar.h();
                        } else if (z3) {
                            njsVar.i();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        njsVar.d = false;
                        throw th;
                    }
                }
                njsVar.d = false;
            }
            if (this.b) {
                njsVar.c(this);
            }
        }

        public boolean c(ibs ibsVar) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void h() {
    }

    public void i() {
    }

    public njs(T t) {
        this.a = new Object();
        this.b = new qr60<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }
}
