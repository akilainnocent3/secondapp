package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class ih50 implements xxd0<pg50, Map<oso, List<rft>>> {
    public static final ih50 a = new ih50();
    public static final ptu.b b;
    public static final ptu.b c;

    static {
        AtomicInteger atomicInteger = ptu.m;
        b = new ptu.b();
        c = new ptu.b();
    }

    @Override // defpackage.xxd0
    public final int a(pg50 pg50Var, Map<oso, List<rft>> map, ptu ptuVar) {
        pg50 pg50Var2 = pg50Var;
        kh50 kh50VarD = kh50.d(pg50Var2);
        ptuVar.a(kh50VarD);
        return cyd0.e(hh50.c, pg50Var2.c(), ptuVar) + cyd0.d(hh50.b, map, pso.a, ptuVar, c) + qtu.f(hh50.a, kh50VarD);
    }

    @Override // defpackage.xxd0
    public final void b(me80 me80Var, pg50 pg50Var, Map<oso, List<rft>> map, ptu ptuVar) throws IOException {
        me80Var.l(hh50.a, (kh50) ptuVar.c(kh50.class));
        me80Var.H(hh50.b, map, pso.a, ptuVar, b);
        me80Var.P(hh50.c, pg50Var.c(), ptuVar);
    }
}
