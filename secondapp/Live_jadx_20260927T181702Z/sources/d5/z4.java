package d5;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class z4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z4 f78111c = new z4(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78113b;

    public z4(boolean z10) {
        this.f78112a = 0;
        this.f78113b = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z4.class == obj.getClass()) {
            z4 z4Var = (z4) obj;
            if (this.f78112a == z4Var.f78112a && this.f78113b == z4Var.f78113b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f78112a << 1) + (this.f78113b ? 1 : 0);
    }

    public z4(int i10, boolean z10) {
        this.f78112a = i10;
        this.f78113b = z10;
    }
}
