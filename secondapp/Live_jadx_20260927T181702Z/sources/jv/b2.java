package jv;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 {
    @oy.l
    public static final Executor b(@oy.l n0 n0Var) {
        Executor executorZ0;
        z1 z1Var = n0Var instanceof z1 ? (z1) n0Var : null;
        return (z1Var == null || (executorZ0 = z1Var.z0()) == null) ? new k1(n0Var) : executorZ0;
    }

    @cs.j(name = "from")
    @oy.l
    public static final n0 c(@oy.l Executor executor) {
        n0 n0Var;
        k1 k1Var = executor instanceof k1 ? (k1) executor : null;
        return (k1Var == null || (n0Var = k1Var.f100825b) == null) ? new a2(executor) : n0Var;
    }

    @cs.j(name = "from")
    @oy.l
    public static final z1 d(@oy.l ExecutorService executorService) {
        return new a2(executorService);
    }

    @c2
    public static /* synthetic */ void a() {
    }
}
