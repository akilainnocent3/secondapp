package ms;

import java.lang.Comparable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class i<T extends Comparable<? super T>> implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final T f115136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final T f115137c;

    public i(@oy.l T start, @oy.l T endInclusive) {
        m0.p(start, "start");
        m0.p(endInclusive, "endInclusive");
        this.f115136b = start;
        this.f115137c = endInclusive;
    }

    @Override // ms.g
    public boolean a(@oy.l T t10) {
        return g.a.a(this, t10);
    }

    @Override // ms.g
    @oy.l
    public T d() {
        return this.f115137c;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return m0.g(m(), iVar.m()) && m0.g(d(), iVar.d());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m().hashCode() * 31) + d().hashCode();
    }

    @Override // ms.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @Override // ms.g
    @oy.l
    public T m() {
        return this.f115136b;
    }

    @oy.l
    public String toString() {
        return m() + ".." + d();
    }
}
