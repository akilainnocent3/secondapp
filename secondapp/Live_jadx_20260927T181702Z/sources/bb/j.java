package bb;

import androidx.annotation.Nullable;
import com.airbnb.lottie.a1;
import com.airbnb.lottie.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21082c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a e(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f21080a = str;
        this.f21081b = aVar;
        this.f21082c = z10;
    }

    @Override // bb.c
    @Nullable
    public va.c a(z0 z0Var, com.airbnb.lottie.k kVar, cb.b bVar) {
        if (z0Var.w0(a1.MergePathsApi19)) {
            return new va.l(this);
        }
        gb.g.e("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f21081b;
    }

    public String c() {
        return this.f21080a;
    }

    public boolean d() {
        return this.f21082c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f21081b + fw.b.f85383j;
    }
}
