package c5;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22393b;

    public final void a(int i10) {
        this.f22393b = i10 | this.f22393b;
    }

    @k.i
    public void b() {
        this.f22393b = 0;
    }

    public final void c(int i10) {
        this.f22393b = (~i10) & this.f22393b;
    }

    public final boolean d(int i10) {
        return (this.f22393b & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(134217728);
    }

    public final boolean h() {
        return d(1);
    }

    public final boolean i() {
        return d(536870912);
    }

    public final boolean j() {
        return d(67108864);
    }

    public final void k(int i10) {
        this.f22393b = i10;
    }
}
