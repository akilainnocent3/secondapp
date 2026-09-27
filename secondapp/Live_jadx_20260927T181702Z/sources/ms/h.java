package ms;

import java.lang.Comparable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class h<T extends Comparable<? super T>> implements r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final T f115134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final T f115135c;

    public h(@oy.l T start, @oy.l T endExclusive) {
        m0.p(start, "start");
        m0.p(endExclusive, "endExclusive");
        this.f115134b = start;
        this.f115135c = endExclusive;
    }

    @Override // ms.r
    public boolean a(@oy.l T t10) {
        return r.a.a(this, t10);
    }

    @Override // ms.r
    @oy.l
    public T e() {
        return this.f115135c;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return m0.g(m(), hVar.m()) && m0.g(e(), hVar.e());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m().hashCode() * 31) + e().hashCode();
    }

    @Override // ms.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @Override // ms.r
    @oy.l
    public T m() {
        return this.f115134b;
    }

    @oy.l
    public String toString() {
        return m() + "..<" + e();
    }
}
