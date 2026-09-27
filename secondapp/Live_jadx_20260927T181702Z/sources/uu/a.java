package uu;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f139772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f139773b;

    public a(T t10, T t11) {
        this.f139772a = t10;
        this.f139773b = t11;
    }

    public final T a() {
        return this.f139772a;
    }

    public final T b() {
        return this.f139773b;
    }

    public final T c() {
        return this.f139772a;
    }

    public final T d() {
        return this.f139773b;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f139772a, aVar.f139772a) && m0.g(this.f139773b, aVar.f139773b);
    }

    public int hashCode() {
        T t10 = this.f139772a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f139773b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @l
    public String toString() {
        return "ApproximationBounds(lower=" + this.f139772a + ", upper=" + this.f139773b + ')';
    }
}
