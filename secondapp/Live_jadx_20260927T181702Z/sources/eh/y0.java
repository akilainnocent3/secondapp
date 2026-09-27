package eh;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f81259c = new y0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f81260d = new y0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81262b;

    public y0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f81261a = i10;
        this.f81262b = i11;
    }

    public int a() {
        return this.f81262b;
    }

    public int b() {
        return this.f81261a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f81261a == y0Var.f81261a && this.f81262b == y0Var.f81262b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f81262b;
        int i11 = this.f81261a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f81261a + "x" + this.f81262b;
    }
}
