package yads;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f149011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f149013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f149014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f149015h;

    public f8(boolean z10, boolean z11, String str, long j10, int i10, boolean z12, Set set, Map map) {
        this.f149008a = z10;
        this.f149009b = z11;
        this.f149010c = str;
        this.f149011d = j10;
        this.f149012e = i10;
        this.f149013f = z12;
        this.f149014g = set;
        this.f149015h = map;
    }

    public final boolean a() {
        return this.f149008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f149008a == f8Var.f149008a && this.f149009b == f8Var.f149009b && kotlin.jvm.internal.m0.g(this.f149010c, f8Var.f149010c) && this.f149011d == f8Var.f149011d && this.f149012e == f8Var.f149012e && this.f149013f == f8Var.f149013f && kotlin.jvm.internal.m0.g(this.f149014g, f8Var.f149014g) && kotlin.jvm.internal.m0.g(this.f149015h, f8Var.f149015h);
    }

    public final int hashCode() {
        return this.f149015h.hashCode() + ((this.f149014g.hashCode() + ((g8.a.a(this.f149013f) + nd3.a(this.f149012e, (f0.p.a(this.f149011d) + k4.a(this.f149010c, (g8.a.a(this.f149009b) + (g8.a.a(this.f149008a) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f149008a + ", debug=" + this.f149009b + ", apiKey=" + this.f149010c + ", validationTimeoutInSec=" + this.f149011d + ", usagePercent=" + this.f149012e + ", blockAdOnInternalError=" + this.f149013f + ", enabledAdUnits=" + this.f149014g + ", adNetworksCustomParameters=" + this.f149015h + gi.j.f86771d;
    }
}
