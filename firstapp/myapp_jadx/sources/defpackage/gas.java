package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gas {
    public static final Object f = new Object();
    public static gas g;
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque<ibs> d = new ArrayDeque<>();
    public o16 e;

    public static abstract class a {
        public abstract k26 a();

        public abstract int b();
    }

    public static class b implements hbs {
        public final gas a;
        public final ibs b;

        public b(ibs ibsVar, gas gasVar) {
            this.b = ibsVar;
            this.a = gasVar;
        }

        @hoy(s9s.a.ON_DESTROY)
        public void onDestroy(ibs ibsVar) {
            this.a.k(ibsVar);
        }

        @hoy(s9s.a.ON_START)
        public void onStart(ibs ibsVar) {
            this.a.f(ibsVar);
        }

        @hoy(s9s.a.ON_STOP)
        public void onStop(ibs ibsVar) {
            this.a.g(ibsVar);
        }
    }

    public final void a(z9s z9sVar, e6s e6sVar, o16 o16Var) {
        synchronized (this.a) {
            try {
                boolean z = true;
                km20.b(!e6sVar.e.isEmpty());
                this.e = o16Var;
                ibs ibsVarJ = z9sVar.j();
                b bVarC = c(ibsVarJ);
                if (bVarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(bVarC);
                o16 o16Var2 = this.e;
                if (o16Var2 == null || ((qw5) o16Var2).b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        z9s z9sVar2 = (z9s) this.b.get((a) it.next());
                        z9sVar2.getClass();
                        if (!z9sVar2.equals(z9sVar) && !z9sVar2.k().isEmpty()) {
                            synchronized (z9sVar2.a) {
                            }
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                    }
                }
                try {
                    z9sVar.d(e6sVar);
                    if (ibsVarJ.getLifecycle().b().compareTo(s9s.b.d) < 0) {
                        z = false;
                    }
                    if (z) {
                        f(ibsVarJ);
                    }
                } catch (v36.a e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z9s b(ibs ibsVar, v36 v36Var) {
        synchronized (this.a) {
            try {
                km20.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new ij1(System.identityHashCode(ibsVar), v36Var.d)) == null);
                z9s z9sVar = new z9s(ibsVar, v36Var);
                if (((ArrayList) v36Var.x()).isEmpty()) {
                    z9sVar.q();
                }
                if (ibsVar.getLifecycle().b() == s9s.b.a) {
                    return z9sVar;
                }
                e(z9sVar);
                return z9sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b c(ibs ibsVar) {
        synchronized (this.a) {
            try {
                for (b bVar : this.c.keySet()) {
                    if (ibsVar.equals(bVar.b)) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(ibs ibsVar) {
        synchronized (this.a) {
            try {
                b bVarC = c(ibsVar);
                if (bVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    z9s z9sVar = (z9s) this.b.get((a) it.next());
                    z9sVar.getClass();
                    if (!z9sVar.k().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(z9s z9sVar) {
        synchronized (this.a) {
            try {
                ibs ibsVarJ = z9sVar.j();
                ij1 ij1Var = new ij1(System.identityHashCode(ibsVarJ), z9sVar.c.d);
                b bVarC = c(ibsVarJ);
                Set hashSet = bVarC != null ? (Set) this.c.get(bVarC) : new HashSet();
                hashSet.add(ij1Var);
                this.b.put(ij1Var, z9sVar);
                if (bVarC == null) {
                    b bVar = new b(ibsVarJ, this);
                    this.c.put(bVar, hashSet);
                    ibsVarJ.getLifecycle().a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ibs ibsVar) {
        synchronized (this.a) {
            try {
                if (d(ibsVar)) {
                    if (this.d.isEmpty()) {
                        this.d.push(ibsVar);
                    } else {
                        o16 o16Var = this.e;
                        if (o16Var == null || ((qw5) o16Var).b() != 2) {
                            ibs ibsVarPeek = this.d.peek();
                            if (!ibsVar.equals(ibsVarPeek)) {
                                h(ibsVarPeek);
                                this.d.remove(ibsVar);
                                this.d.push(ibsVar);
                            }
                        }
                    }
                    l(ibsVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(ibs ibsVar) {
        synchronized (this.a) {
            try {
                this.d.remove(ibsVar);
                h(ibsVar);
                if (!this.d.isEmpty()) {
                    l(this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(ibs ibsVar) {
        synchronized (this.a) {
            try {
                b bVarC = c(ibsVar);
                if (bVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    z9s z9sVar = (z9s) this.b.get((a) it.next());
                    z9sVar.getClass();
                    z9sVar.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                z9s z9sVar = (z9s) this.b.get((a) it.next());
                if (z9sVar != null) {
                    synchronized (z9sVar.a) {
                        v36 v36Var = z9sVar.c;
                        v36Var.C((ArrayList) v36Var.x());
                        z9sVar.e = null;
                    }
                    g(z9sVar.j());
                }
            }
        }
    }

    public final void j(z9s z9sVar) {
        synchronized (this.a) {
            try {
                ibs ibsVarJ = z9sVar.j();
                ij1 ij1Var = new ij1(System.identityHashCode(ibsVarJ), z9sVar.c.d);
                this.b.remove(ij1Var);
                HashSet hashSet = new HashSet();
                for (b bVar : this.c.keySet()) {
                    if (ibsVarJ.equals(bVar.b)) {
                        Set set = (Set) this.c.get(bVar);
                        set.remove(ij1Var);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k((ibs) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ibs ibsVar) {
        synchronized (this.a) {
            try {
                b bVarC = c(ibsVar);
                if (bVarC == null) {
                    return;
                }
                g(ibsVar);
                Iterator it = ((Set) this.c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((a) it.next());
                }
                this.c.remove(bVarC);
                bVarC.b.getLifecycle().d(bVarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ibs ibsVar) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(ibsVar))).iterator();
                while (it.hasNext()) {
                    z9s z9sVar = (z9s) this.b.get((a) it.next());
                    z9sVar.getClass();
                    if (!z9sVar.k().isEmpty()) {
                        z9sVar.r();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
