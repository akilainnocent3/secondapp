package sq;

import cs.o;
import oy.l;
import oy.m;
import qq.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final b f135500a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public static volatile e0 f135501b;

    @o
    public static final void a() {
        e0 e0Var = f135501b;
        if (e0Var != null) {
            e0Var.a();
        }
    }

    @o
    public static final void b(@m e0 e0Var) {
        f135501b = e0Var;
    }
}
