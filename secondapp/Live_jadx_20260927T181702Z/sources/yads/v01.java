package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v01 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f156698e = new wq() { // from class: yads.gc4
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return v01.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f156700d;

    public v01() {
        this.f156699c = false;
        this.f156700d = false;
    }

    public static v01 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new v01(bundle.getBoolean(Integer.toString(2, 36), false)) : new v01();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return this.f156700d == v01Var.f156700d && this.f156699c == v01Var.f156699c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f156699c), Boolean.valueOf(this.f156700d)});
    }

    public v01(boolean z10) {
        this.f156699c = true;
        this.f156700d = z10;
    }
}
