package bg;

import ah.d0;
import ah.v;
import androidx.annotation.Nullable;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class n extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21301j;

    public n(v vVar, d0 d0Var, n2 n2Var, int i10, @Nullable Object obj, long j10, long j11, long j12) {
        super(vVar, d0Var, 1, n2Var, i10, obj, j10, j11);
        eh.a.g(n2Var);
        this.f21301j = j12;
    }

    public long e() {
        long j10 = this.f21301j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
