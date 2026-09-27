package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e63 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f148534e = new wq() { // from class: yads.xz3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return e63.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f148536d;

    public e63() {
        this.f148535c = false;
        this.f148536d = false;
    }

    public static e63 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new e63(bundle.getBoolean(Integer.toString(2, 36), false)) : new e63();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63Var = (e63) obj;
        return this.f148536d == e63Var.f148536d && this.f148535c == e63Var.f148535c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f148535c), Boolean.valueOf(this.f148536d)});
    }

    public e63(boolean z10) {
        this.f148535c = true;
        this.f148536d = z10;
    }
}
