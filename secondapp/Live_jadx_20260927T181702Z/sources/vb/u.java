package vb;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class u<Z> implements v<Z>, qc.a.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e2.w.a<u<?>> f140831f = qc.a.e(20, new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.c f140832b = qc.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v<Z> f140833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f140834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f140835e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements qc.a.d<u<?>> {
        @Override // qc.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u<?> a() {
            return new u<>();
        }
    }

    @NonNull
    public static <Z> u<Z> e(v<Z> vVar) {
        u<Z> uVar = (u) pc.m.e(f140831f.a());
        uVar.c(vVar);
        return uVar;
    }

    private void f() {
        this.f140833c = null;
        f140831f.b(this);
    }

    @Override // vb.v
    public synchronized void a() {
        this.f140832b.c();
        this.f140835e = true;
        if (!this.f140834d) {
            this.f140833c.a();
            f();
        }
    }

    @Override // vb.v
    @NonNull
    public Class<Z> b() {
        return this.f140833c.b();
    }

    public final void c(v<Z> vVar) {
        this.f140835e = false;
        this.f140834d = true;
        this.f140833c = vVar;
    }

    @Override // qc.a.f
    @NonNull
    public qc.c d() {
        return this.f140832b;
    }

    public synchronized void g() {
        this.f140832b.c();
        if (!this.f140834d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f140834d = false;
        if (this.f140835e) {
            a();
        }
    }

    @Override // vb.v
    @NonNull
    public Z get() {
        return this.f140833c.get();
    }

    @Override // vb.v
    public int getSize() {
        return this.f140833c.getSize();
    }
}
