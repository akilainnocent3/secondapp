package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class jpt extends ktu {
    public static final ptu.b d;
    public static final ptu.b e;
    public final ptu a = new ptu();
    public Map<pg50, Map<oso, List<rqa0>>> b;
    public int c;

    static {
        AtomicInteger atomicInteger = ptu.m;
        d = new ptu.b();
        e = new ptu.b();
    }

    @Override // defpackage.ktu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) throws IOException {
        ptu ptuVar = this.a;
        ptuVar.c = 0;
        ptuVar.f = 0;
        me80Var.H(v0h.a, this.b, ph50.a, ptuVar, e);
    }
}
