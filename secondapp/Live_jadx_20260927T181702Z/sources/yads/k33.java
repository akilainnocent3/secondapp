package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k33 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f151374e = new wq() { // from class: yads.d34
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return k33.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f151376d;

    public k33(int i10) {
        ni.a("maxStars must be a positive integer", i10 > 0);
        this.f151375c = i10;
        this.f151376d = -1.0f;
    }

    public static k33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new k33(i10) : new k33(i10, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k33)) {
            return false;
        }
        k33 k33Var = (k33) obj;
        return this.f151375c == k33Var.f151375c && this.f151376d == k33Var.f151376d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f151375c), Float.valueOf(this.f151376d)});
    }

    public k33(int i10, float f10) {
        boolean z10 = false;
        ni.a("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        ni.a("starRating is out of range [0, maxStars]", z10);
        this.f151375c = i10;
        this.f151376d = f10;
    }
}
