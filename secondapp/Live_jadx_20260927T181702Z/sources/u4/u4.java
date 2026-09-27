package u4;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f139045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f139049e;

    public u4(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.f139046b == u4Var.f139046b && this.f139047c == u4Var.f139047c && this.f139048d == u4Var.f139048d && this.f139049e == u4Var.f139049e && this.f139045a.equals(u4Var.f139045a);
    }

    public int hashCode() {
        return (((((((this.f139045a.hashCode() * 31) + this.f139046b) * 31) + this.f139047c) * 31) + this.f139048d) * 31) + (this.f139049e ? 1 : 0);
    }

    public u4(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public u4(Surface surface, int i10, int i11, int i12, boolean z10) {
        zi.l0.e(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f139045a = surface;
        this.f139046b = i10;
        this.f139047c = i11;
        this.f139048d = i12;
        this.f139049e = z10;
    }
}
