package yads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g81 implements t00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f149462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh1 f149463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f149464c;

    public /* synthetic */ g81() {
        this(new Object(), new mh1());
    }

    public static final void a(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).j(ua1Var);
        }
    }

    public static final void b(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).h(ua1Var);
        }
    }

    public static final void c(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).g(ua1Var);
        }
    }

    public static final void d(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).f(ua1Var);
        }
    }

    public static final void e(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).d(ua1Var);
        }
    }

    public static final void i(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).b(ua1Var);
        }
    }

    @Override // yads.t00
    public final void f(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.a14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.d(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void g(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.c14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.c(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void h(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.h14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.b(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void j(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.e14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.a(hashSetK, ua1Var);
                }
            });
        }
    }

    public final HashSet k(ua1 ua1Var) {
        HashSet hashSet;
        synchronized (this.f149462a) {
            Set set = (Set) this.f149464c.get(ua1Var);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    public static final void f(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).e(ua1Var);
        }
    }

    public static final void g(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).a(ua1Var);
        }
    }

    public static final void h(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).c(ua1Var);
        }
    }

    public static final void j(Set set, ua1 ua1Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).i(ua1Var);
        }
    }

    @Override // yads.t00
    public final void a(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.d14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.g(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void b(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.j14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.i(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void c(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.g14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.h(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void d(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.b14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.e(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void e(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.k14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.f(hashSetK, ua1Var);
                }
            });
        }
    }

    @Override // yads.t00
    public final void i(final ua1 ua1Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.l14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.j(hashSetK, ua1Var);
                }
            });
        }
    }

    public g81(Object obj, mh1 mh1Var) {
        this.f149462a = obj;
        this.f149463b = mh1Var;
        this.f149464c = new LinkedHashMap();
    }

    @Override // yads.t00
    public final void a(final ua1 ua1Var, final jf3 jf3Var) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.i14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.a(hashSetK, ua1Var, jf3Var);
                }
            });
        }
    }

    public static final void a(Set set, ua1 ua1Var, jf3 jf3Var) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).a(ua1Var, jf3Var);
        }
    }

    @Override // yads.t00
    public final void a(final ua1 ua1Var, final float f10) {
        final HashSet hashSetK = k(ua1Var);
        if (hashSetK != null) {
            this.f149463b.a(new Runnable() { // from class: yads.f14
                @Override // java.lang.Runnable
                public final void run() {
                    g81.a(hashSetK, ua1Var, f10);
                }
            });
        }
    }

    public static final void a(Set set, ua1 ua1Var, float f10) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((t00) it.next()).a(ua1Var, f10);
        }
    }
}
