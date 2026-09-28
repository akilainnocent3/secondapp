package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class ph50 implements xxd0<pg50, Map<oso, List<rqa0>>> {
    public static final ph50 a = new ph50();
    public static final ptu.b b;
    public static final ptu.b c;

    static {
        AtomicInteger atomicInteger = ptu.m;
        b = new ptu.b();
        c = new ptu.b();
    }

    @Override // defpackage.xxd0
    public final int a(pg50 pg50Var, Map<oso, List<rqa0>> map, ptu ptuVar) {
        pg50 pg50Var2 = pg50Var;
        kh50 kh50VarD = kh50.d(pg50Var2);
        ptuVar.a(kh50VarD);
        return cyd0.e(oh50.c, pg50Var2.c(), ptuVar) + cyd0.d(oh50.b, map, rso.a, ptuVar, c) + qtu.f(oh50.a, kh50VarD);
    }

    @Override // defpackage.xxd0
    public final void b(me80 me80Var, pg50 pg50Var, Map<oso, List<rqa0>> map, ptu ptuVar) throws IOException {
        me80Var.l(oh50.a, (kh50) ptuVar.c(kh50.class));
        me80Var.H(oh50.b, map, rso.a, ptuVar, b);
        me80Var.P(oh50.c, pg50Var.c(), ptuVar);
    }
}
