package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class t0l0 extends v0l0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ v0l0 e;

    public t0l0(v0l0 v0l0Var, int i, int i2) {
        this.e = v0l0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.p0l0
    public final Object[] a() {
        return this.e.a();
    }

    @Override // defpackage.p0l0
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // defpackage.p0l0
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // defpackage.p0l0
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j0l0.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.v0l0, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final v0l0 subList(int i, int i2) {
        j0l0.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
