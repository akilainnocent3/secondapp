package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class if1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr0 f150590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f150591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f150592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f150593e;

    public if1(List list, dr0 dr0Var, List list2, String str, long j10) {
        this.f150589a = list;
        this.f150590b = dr0Var;
        this.f150591c = list2;
        this.f150592d = str;
        this.f150593e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return kotlin.jvm.internal.m0.g(this.f150589a, if1Var.f150589a) && kotlin.jvm.internal.m0.g(this.f150590b, if1Var.f150590b) && kotlin.jvm.internal.m0.g(this.f150591c, if1Var.f150591c) && kotlin.jvm.internal.m0.g(this.f150592d, if1Var.f150592d) && this.f150593e == if1Var.f150593e;
    }

    public final int hashCode() {
        List list = this.f150589a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        dr0 dr0Var = this.f150590b;
        int iA = eb.a(this.f150591c, (iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31, 31);
        String str = this.f150592d;
        return f0.p.a(this.f150593e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.f150589a + ", falseClick=" + this.f150590b + ", trackingUrls=" + this.f150591c + ", url=" + this.f150592d + ", clickableDelay=" + this.f150593e + gi.j.f86771d;
    }
}
