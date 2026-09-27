package eh;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f80921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80924d;

    public b1(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f80922b == b1Var.f80922b && this.f80923c == b1Var.f80923c && this.f80924d == b1Var.f80924d && this.f80921a.equals(b1Var.f80921a);
    }

    public int hashCode() {
        return (((((this.f80921a.hashCode() * 31) + this.f80922b) * 31) + this.f80923c) * 31) + this.f80924d;
    }

    public b1(Surface surface, int i10, int i11, int i12) {
        a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f80921a = surface;
        this.f80922b = i10;
        this.f80923c = i11;
        this.f80924d = i12;
    }
}
