package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f148303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a03 f148304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f148305c;

    public dp(e00 e00Var, a03 a03Var, Map map) {
        this.f148303a = e00Var;
        this.f148304b = a03Var;
        this.f148305c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.f148303a == dpVar.f148303a && kotlin.jvm.internal.m0.g(this.f148304b, dpVar.f148304b) && kotlin.jvm.internal.m0.g(this.f148305c, dpVar.f148305c);
    }

    public final int hashCode() {
        e00 e00Var = this.f148303a;
        int iHashCode = (e00Var == null ? 0 : e00Var.hashCode()) * 31;
        a03 a03Var = this.f148304b;
        return this.f148305c.hashCode() + ((iHashCode + (a03Var != null ? a03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f148303a + ", sizeInfo=" + this.f148304b + ", parameters=" + this.f148305c + gi.j.f86771d;
    }
}
