package defpackage;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class gom implements a2z {
    public static final nbd b = new nbd("http-client-metrics-state");
    public static final Logger c = Logger.getLogger(gom.class.getName());
    public final pze a;

    public static abstract class a {
        public abstract m21 a();

        public abstract long b();
    }

    public gom(fpv fpvVar) {
        qze qzeVarE = fpvVar.d("http.client.request.duration").b("s").a("Duration of HTTP client requests.").e(upm.a);
        if (qzeVarE instanceof m2h) {
            ((m2h) qzeVarE).d(Arrays.asList(xnm.a, xnm.d, lbg.a, vlx.c, vlx.d, xe80.a, xe80.b, upm.b));
        }
        this.a = qzeVarE.build();
    }

    @Override // defpackage.a2z
    public final m0b a(m0b m0bVar, wgh0 wgh0Var, long j) {
        return m0bVar.a(b, new ni1(wgh0Var, j));
    }

    @Override // defpackage.a2z
    public final void b(m0b m0bVar, wgh0 wgh0Var, long j) {
        a aVar = (a) m0bVar.b(b);
        if (aVar == null) {
            c.log(Level.FINE, "No state present when ending context {0}. Cannot record HTTP request metrics.", m0bVar);
            return;
        }
        xw0 builder = aVar.a().toBuilder();
        builder.c(wgh0Var);
        this.a.b((j - aVar.b()) / 1.0E9d, builder.a(), m0bVar);
    }
}
