package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158465c;

    public yr1(long j10, String str, List list) {
        this.f158463a = str;
        this.f158464b = list;
        this.f158465c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        yr1 yr1Var = (yr1) obj;
        return kotlin.jvm.internal.m0.g(this.f158463a, yr1Var.f158463a) && kotlin.jvm.internal.m0.g(this.f158464b, yr1Var.f158464b) && this.f158465c == yr1Var.f158465c;
    }

    public final int hashCode() {
        return f0.p.a(this.f158465c) + eb.a(this.f158464b, this.f158463a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f158463a + ", networks=" + this.f158464b + ", loadTimeoutMillis=" + this.f158465c + gi.j.f86771d;
    }
}
