package vb;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k.a0;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l<R> implements h.b<R>, qc.a.f {
    public static final c A = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f140765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.c f140766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p.a f140767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2.w.a<l<?>> f140768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f140769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f140770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yb.a f140771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yb.a f140772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yb.a f140773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yb.a f140774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f140775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public tb.f f140776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f140777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f140778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f140779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f140780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v<?> f140781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public tb.a f140782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f140783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f140784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f140785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p<?> f140786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h<R> f140787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f140788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f140789z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lc.j f140790b;

        public a(lc.j jVar) {
            this.f140790b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f140790b.g()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f140765b.b(this.f140790b)) {
                            l.this.f(this.f140790b);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lc.j f140792b;

        public b(lc.j jVar) {
            this.f140792b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f140792b.g()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f140765b.b(this.f140792b)) {
                            l.this.f140786w.c();
                            l.this.g(this.f140792b);
                            l.this.s(this.f140792b);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static class c {
        public <R> p<R> a(v<R> vVar, boolean z10, tb.f fVar, p.a aVar) {
            return new p<>(vVar, z10, true, fVar, aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final lc.j f140794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f140795b;

        public d(lc.j jVar, Executor executor) {
            this.f140794a = jVar;
            this.f140795b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f140794a.equals(((d) obj).f140794a);
            }
            return false;
        }

        public int hashCode() {
            return this.f140794a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d> f140796b;

        public e() {
            this(new ArrayList(2));
        }

        public static d e(lc.j jVar) {
            return new d(jVar, pc.f.a());
        }

        public void a(lc.j jVar, Executor executor) {
            this.f140796b.add(new d(jVar, executor));
        }

        public boolean b(lc.j jVar) {
            return this.f140796b.contains(e(jVar));
        }

        public void clear() {
            this.f140796b.clear();
        }

        public e d() {
            return new e(new ArrayList(this.f140796b));
        }

        public void f(lc.j jVar) {
            this.f140796b.remove(e(jVar));
        }

        public boolean isEmpty() {
            return this.f140796b.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f140796b.iterator();
        }

        public int size() {
            return this.f140796b.size();
        }

        public e(List<d> list) {
            this.f140796b = list;
        }
    }

    public l(yb.a aVar, yb.a aVar2, yb.a aVar3, yb.a aVar4, m mVar, p.a aVar5, e2.w.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, A);
    }

    private synchronized void r() {
        if (this.f140776m == null) {
            throw new IllegalArgumentException();
        }
        this.f140765b.clear();
        this.f140776m = null;
        this.f140786w = null;
        this.f140781r = null;
        this.f140785v = false;
        this.f140788y = false;
        this.f140783t = false;
        this.f140789z = false;
        this.f140787x.y(false);
        this.f140787x = null;
        this.f140784u = null;
        this.f140782s = null;
        this.f140768e.b(this);
    }

    @Override // vb.h.b
    public void a(h<?> hVar) {
        j().execute(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vb.h.b
    public void b(v<R> vVar, tb.a aVar, boolean z10) {
        synchronized (this) {
            this.f140781r = vVar;
            this.f140782s = aVar;
            this.f140789z = z10;
        }
        p();
    }

    @Override // vb.h.b
    public void c(q qVar) {
        synchronized (this) {
            this.f140784u = qVar;
        }
        o();
    }

    @Override // qc.a.f
    @NonNull
    public qc.c d() {
        return this.f140766c;
    }

    public synchronized void e(lc.j jVar, Executor executor) {
        try {
            this.f140766c.c();
            this.f140765b.a(jVar, executor);
            if (this.f140783t) {
                k(1);
                executor.execute(new b(jVar));
            } else if (this.f140785v) {
                k(1);
                executor.execute(new a(jVar));
            } else {
                pc.m.b(!this.f140788y, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @a0("this")
    public void f(lc.j jVar) {
        try {
            jVar.c(this.f140784u);
        } catch (Throwable th2) {
            throw new vb.b(th2);
        }
    }

    @a0("this")
    public void g(lc.j jVar) {
        try {
            jVar.b(this.f140786w, this.f140782s, this.f140789z);
        } catch (Throwable th2) {
            throw new vb.b(th2);
        }
    }

    public void h() {
        if (n()) {
            return;
        }
        this.f140788y = true;
        this.f140787x.c();
        this.f140770g.a(this, this.f140776m);
    }

    public void i() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f140766c.c();
                pc.m.b(n(), "Not yet complete!");
                int iDecrementAndGet = this.f140775l.decrementAndGet();
                pc.m.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f140786w;
                    r();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    public final yb.a j() {
        if (this.f140778o) {
            return this.f140773j;
        }
        return this.f140779p ? this.f140774k : this.f140772i;
    }

    public synchronized void k(int i10) {
        p<?> pVar;
        pc.m.b(n(), "Not yet complete!");
        if (this.f140775l.getAndAdd(i10) == 0 && (pVar = this.f140786w) != null) {
            pVar.c();
        }
    }

    @h1
    public synchronized l<R> l(tb.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f140776m = fVar;
        this.f140777n = z10;
        this.f140778o = z11;
        this.f140779p = z12;
        this.f140780q = z13;
        return this;
    }

    public synchronized boolean m() {
        return this.f140788y;
    }

    public final boolean n() {
        return this.f140785v || this.f140783t || this.f140788y;
    }

    public void o() {
        synchronized (this) {
            try {
                this.f140766c.c();
                if (this.f140788y) {
                    r();
                    return;
                }
                if (this.f140765b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f140785v) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f140785v = true;
                tb.f fVar = this.f140776m;
                e eVarD = this.f140765b.d();
                k(eVarD.size() + 1);
                this.f140770g.d(this, fVar, null);
                for (d dVar : eVarD) {
                    dVar.f140795b.execute(new a(dVar.f140794a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void p() {
        synchronized (this) {
            try {
                this.f140766c.c();
                if (this.f140788y) {
                    this.f140781r.a();
                    r();
                    return;
                }
                if (this.f140765b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f140783t) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f140786w = this.f140769f.a(this.f140781r, this.f140777n, this.f140776m, this.f140767d);
                this.f140783t = true;
                e eVarD = this.f140765b.d();
                k(eVarD.size() + 1);
                this.f140770g.d(this, this.f140776m, this.f140786w);
                for (d dVar : eVarD) {
                    dVar.f140795b.execute(new b(dVar.f140794a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean q() {
        return this.f140780q;
    }

    public synchronized void s(lc.j jVar) {
        try {
            this.f140766c.c();
            this.f140765b.f(jVar);
            if (this.f140765b.isEmpty()) {
                h();
                if (this.f140783t || this.f140785v) {
                    if (this.f140775l.get() == 0) {
                        r();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(h<R> hVar) {
        try {
            this.f140787x = hVar;
            (hVar.G() ? this.f140771h : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @h1
    public l(yb.a aVar, yb.a aVar2, yb.a aVar3, yb.a aVar4, m mVar, p.a aVar5, e2.w.a<l<?>> aVar6, c cVar) {
        this.f140765b = new e();
        this.f140766c = qc.c.a();
        this.f140775l = new AtomicInteger();
        this.f140771h = aVar;
        this.f140772i = aVar2;
        this.f140773j = aVar3;
        this.f140774k = aVar4;
        this.f140770g = mVar;
        this.f140767d = aVar5;
        this.f140768e = aVar6;
        this.f140769f = cVar;
    }
}
