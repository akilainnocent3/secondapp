package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ig0 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f150625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f150626d;

    static {
        new wq() { // from class: yads.n24
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ig0.a(bundle);
            }
        };
    }

    public ig0(int i10, int i11, int i12) {
        this.f150624b = i10;
        this.f150625c = i11;
        this.f150626d = i12;
    }

    public static ig0 a(Bundle bundle) {
        return new ig0(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return this.f150624b == ig0Var.f150624b && this.f150625c == ig0Var.f150625c && this.f150626d == ig0Var.f150626d;
    }

    public final int hashCode() {
        return ((((this.f150624b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f150625c) * 31) + this.f150626d;
    }
}
