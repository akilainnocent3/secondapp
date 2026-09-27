package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100871b;

    public r1(boolean z10) {
        this.f100871b = z10;
    }

    @Override // jv.h2
    @oy.m
    public a3 c() {
        return null;
    }

    @Override // jv.h2
    public boolean isActive() {
        return this.f100871b;
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append(fw.b.f85383j);
        return sb2.toString();
    }
}
