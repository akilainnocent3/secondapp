package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class on1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj1 f153568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd3 f153569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153570c;

    public on1(oj1 oj1Var, sd3 sd3Var, List list) {
        this.f153568a = oj1Var;
        this.f153569b = sd3Var;
        this.f153570c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on1)) {
            return false;
        }
        on1 on1Var = (on1) obj;
        return kotlin.jvm.internal.m0.g(this.f153568a, on1Var.f153568a) && kotlin.jvm.internal.m0.g(this.f153569b, on1Var.f153569b) && kotlin.jvm.internal.m0.g(this.f153570c, on1Var.f153570c);
    }

    public final int hashCode() {
        oj1 oj1Var = this.f153568a;
        int iHashCode = (oj1Var == null ? 0 : oj1Var.hashCode()) * 31;
        sd3 sd3Var = this.f153569b;
        int iHashCode2 = (iHashCode + (sd3Var == null ? 0 : sd3Var.hashCode())) * 31;
        List list = this.f153570c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.f153568a + ", video=" + this.f153569b + ", imageValues=" + this.f153570c + gi.j.f86771d;
    }
}
