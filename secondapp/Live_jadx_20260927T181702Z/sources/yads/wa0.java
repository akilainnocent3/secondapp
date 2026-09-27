package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wa0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f157258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f157259d;

    public wa0(String str, String str2, List list, List list2) {
        this.f157256a = str;
        this.f157257b = str2;
        this.f157258c = list;
        this.f157259d = list2;
    }

    @Override // yads.m0
    public final String a() {
        return this.f157256a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return kotlin.jvm.internal.m0.g(this.f157256a, wa0Var.f157256a) && kotlin.jvm.internal.m0.g(this.f157257b, wa0Var.f157257b) && kotlin.jvm.internal.m0.g(this.f157258c, wa0Var.f157258c) && kotlin.jvm.internal.m0.g(this.f157259d, wa0Var.f157259d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f157257b, this.f157256a.hashCode() * 31, 31);
        List list = this.f157258c;
        return this.f157259d.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f157256a + ", fallbackUrl=" + this.f157257b + ", fallbackTrackingUrls=" + this.f157258c + ", preferredPackages=" + this.f157259d + gi.j.f86771d;
    }
}
