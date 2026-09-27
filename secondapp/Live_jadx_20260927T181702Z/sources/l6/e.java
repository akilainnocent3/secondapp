package l6;

import f6.f1;
import u4.p1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f103623a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends p1 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(f1 f1Var) {
        this.f103623a = f1Var;
    }

    public final boolean a(v0 v0Var, long j10) throws p1 {
        return b(v0Var) && c(v0Var, j10);
    }

    public abstract boolean b(v0 v0Var) throws p1;

    public abstract boolean c(v0 v0Var, long j10) throws p1;

    public abstract void d();
}
