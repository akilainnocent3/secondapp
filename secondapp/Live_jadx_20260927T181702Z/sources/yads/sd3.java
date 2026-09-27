package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj3 f155393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u41 f155394c;

    public sd3(List list, mj3 mj3Var, u41 u41Var) {
        this.f155392a = list;
        this.f155393b = mj3Var;
        this.f155394c = u41Var;
    }

    public final je3 a() {
        return (je3) fr.r0.G2(this.f155392a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return kotlin.jvm.internal.m0.g(this.f155392a, sd3Var.f155392a) && kotlin.jvm.internal.m0.g(this.f155393b, sd3Var.f155393b) && kotlin.jvm.internal.m0.g(this.f155394c, sd3Var.f155394c);
    }

    public final int hashCode() {
        int iHashCode = this.f155392a.hashCode() * 31;
        mj3 mj3Var = this.f155393b;
        int iHashCode2 = (iHashCode + (mj3Var == null ? 0 : mj3Var.hashCode())) * 31;
        u41 u41Var = this.f155394c;
        return iHashCode2 + (u41Var != null ? u41Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f155392a + ", videoSettings=" + this.f155393b + ", preview=" + this.f155394c + gi.j.f86771d;
    }
}
