package u4;

import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f138639a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f138640a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f138641b;

        @qj.a
        public b a(int i10) {
            zi.l0.g0(!this.f138641b);
            this.f138640a.append(i10, true);
            return this;
        }

        @qj.a
        public b b(l0 l0Var) {
            for (int i10 = 0; i10 < l0Var.e(); i10++) {
                a(l0Var.d(i10));
            }
            return this;
        }

        @qj.a
        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        @qj.a
        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l0 e() {
            zi.l0.g0(!this.f138641b);
            this.f138641b = true;
            return new l0(this.f138640a);
        }

        @qj.a
        public b f(int i10) {
            zi.l0.g0(!this.f138641b);
            this.f138640a.delete(i10);
            return this;
        }

        @qj.a
        public b g(int... iArr) {
            for (int i10 : iArr) {
                f(i10);
            }
            return this;
        }

        @qj.a
        public b h(int i10, boolean z10) {
            return z10 ? f(i10) : this;
        }
    }

    public boolean a(int i10) {
        return this.f138639a.get(i10);
    }

    public boolean b(l0 l0Var) {
        for (int i10 = 0; i10 < l0Var.e(); i10++) {
            if (a(l0Var.d(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean c(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int d(int i10) {
        zi.l0.C(i10, e());
        return this.f138639a.keyAt(i10);
    }

    public int e() {
        return this.f138639a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f138639a.equals(l0Var.f138639a);
        }
        if (e() != l0Var.e()) {
            return false;
        }
        for (int i10 = 0; i10 < e(); i10++) {
            if (d(i10) != l0Var.d(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f138639a.hashCode();
        }
        int iE = e();
        for (int i10 = 0; i10 < e(); i10++) {
            iE = (iE * 31) + d(i10);
        }
        return iE;
    }

    public l0(SparseBooleanArray sparseBooleanArray) {
        this.f138639a = sparseBooleanArray;
    }
}
