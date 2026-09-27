package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f150467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f150468e;

    public i8(int i10, boolean z10, boolean z11, LinkedHashMap linkedHashMap, Set set) {
        this.f150464a = i10;
        this.f150465b = z10;
        this.f150466c = z11;
        this.f150467d = linkedHashMap;
        this.f150468e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f150464a == i8Var.f150464a && this.f150465b == i8Var.f150465b && this.f150466c == i8Var.f150466c && kotlin.jvm.internal.m0.g(this.f150467d, i8Var.f150467d) && kotlin.jvm.internal.m0.g(this.f150468e, i8Var.f150468e);
    }

    public final int hashCode() {
        return this.f150468e.hashCode() + ((this.f150467d.hashCode() + ((g8.a.a(this.f150466c) + ((g8.a.a(this.f150465b) + (this.f150464a * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.f150464a + ", enabled=" + this.f150465b + ", blockAdOnInternalError=" + this.f150466c + ", adNetworksCustomParameters=" + this.f150467d + ", enabledAdUnits=" + this.f150468e + gi.j.f86771d;
    }
}
