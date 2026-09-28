package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bft<Z> implements qg50<Z>, v7h.d {
    public static final v7h.c e = v7h.a(20, new a());
    public final vxd0.a a = new vxd0.a();
    public qg50<Z> b;
    public boolean c;
    public boolean d;

    public class a implements v7h.b<bft<?>> {
        @Override // v7h.b
        public final bft<?> a() {
            return new bft<>();
        }
    }

    @Override // defpackage.qg50
    public final int a() {
        return this.b.a();
    }

    @Override // v7h.d
    public final vxd0.a b() {
        return this.a;
    }

    @Override // defpackage.qg50
    public final synchronized void c() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.c();
            this.b = null;
            e.a(this);
        }
    }

    @Override // defpackage.qg50
    public final Class<Z> d() {
        return this.b.d();
    }

    public final synchronized void e() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            c();
        }
    }

    @Override // defpackage.qg50
    public final Z get() {
        return this.b.get();
    }
}
