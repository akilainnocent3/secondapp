package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gd3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae1 f149564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f149566d;

    public gd3(String str, ae1 ae1Var, String str2, HashMap map) {
        this.f149563a = str;
        this.f149564b = ae1Var;
        this.f149565c = str2;
        this.f149566d = map;
    }

    @Override // yads.vj3
    public final Map a() {
        return Collections.unmodifiableMap(this.f149566d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd3)) {
            return false;
        }
        gd3 gd3Var = (gd3) obj;
        return kotlin.jvm.internal.m0.g(this.f149563a, gd3Var.f149563a) && kotlin.jvm.internal.m0.g(this.f149564b, gd3Var.f149564b) && kotlin.jvm.internal.m0.g(this.f149565c, gd3Var.f149565c) && kotlin.jvm.internal.m0.g(this.f149566d, gd3Var.f149566d);
    }

    public final int hashCode() {
        int iHashCode = this.f149563a.hashCode() * 31;
        ae1 ae1Var = this.f149564b;
        int iHashCode2 = (iHashCode + (ae1Var == null ? 0 : ae1Var.hashCode())) * 31;
        String str = this.f149565c;
        return this.f149566d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f149563a + ", javaScriptResource=" + this.f149564b + ", parameters=" + this.f149565c + ", events=" + this.f149566d + gi.j.f86771d;
    }
}
