package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f154069d = "com.yandex.mobile.ads.mediation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr1 f154071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154072c;

    public pq1(String str, hr1 hr1Var, List list) {
        this.f154070a = str;
        this.f154071b = hr1Var;
        this.f154072c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq1)) {
            return false;
        }
        pq1 pq1Var = (pq1) obj;
        return kotlin.jvm.internal.m0.g(this.f154070a, pq1Var.f154070a) && this.f154071b == pq1Var.f154071b && kotlin.jvm.internal.m0.g(this.f154072c, pq1Var.f154072c);
    }

    public final int hashCode() {
        return this.f154072c.hashCode() + ((this.f154071b.hashCode() + (this.f154070a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.f154070a + ", id=" + this.f154071b + ", adapters=" + this.f154072c + gi.j.f86771d;
    }
}
