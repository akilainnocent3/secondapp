package x4;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f144507c = new y0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f144508d = new y0(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f144509e = b2.k1(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f144510f = b2.k1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144512b;

    public y0(int i10, int i11) {
        zi.l0.d((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f144511a = i10;
        this.f144512b = i11;
    }

    @m1
    public static y0 a(Bundle bundle) {
        return new y0(bundle.getInt(f144509e, -1), bundle.getInt(f144510f, -1));
    }

    public int b() {
        return this.f144512b;
    }

    public int c() {
        return this.f144511a;
    }

    @m1
    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt(f144509e, this.f144511a);
        bundle.putInt(f144510f, this.f144512b);
        return bundle;
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
            if (this.f144511a == y0Var.f144511a && this.f144512b == y0Var.f144512b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f144512b;
        int i11 = this.f144511a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f144511a + "x" + this.f144512b;
    }
}
