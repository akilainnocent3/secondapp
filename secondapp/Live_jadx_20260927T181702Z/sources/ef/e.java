package ef;

import af.g0;
import eh.t0;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f80875a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends d4 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(g0 g0Var) {
        this.f80875a = g0Var;
    }

    public final boolean a(t0 t0Var, long j10) throws d4 {
        return b(t0Var) && c(t0Var, j10);
    }

    public abstract boolean b(t0 t0Var) throws d4;

    public abstract boolean c(t0 t0Var, long j10) throws d4;

    public abstract void d();
}
