package h9;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Comparable<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final String f88015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final String f88016e;

    public g(int i10, int i11, @oy.l String from, @oy.l String to2) {
        m0.p(from, "from");
        m0.p(to2, "to");
        this.f88013b = i10;
        this.f88014c = i11;
        this.f88015d = from;
        this.f88016e = to2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@oy.l g other) {
        m0.p(other, "other");
        int i10 = this.f88013b - other.f88013b;
        return i10 == 0 ? this.f88014c - other.f88014c : i10;
    }

    @oy.l
    public final String b() {
        return this.f88015d;
    }

    public final int c() {
        return this.f88013b;
    }

    public final int d() {
        return this.f88014c;
    }

    @oy.l
    public final String e() {
        return this.f88016e;
    }
}
