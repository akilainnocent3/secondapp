package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class jt70 implements bjg0, Closeable {
    public static final Logger d = Logger.getLogger(jt70.class.getName());
    public final cjg0 a;
    public final bp8<dt70> b;
    public final tn70.b c;

    public jt70(pg50 pg50Var, kt70 kt70Var, ss60 ss60Var, ArrayList arrayList, tn70.b bVar, gcd gcdVar, ks70 ks70Var) {
        tx30 tx30Var = tx30.a;
        this.a = new cjg0(pg50Var, kt70Var, ss60Var, arrayList, gcdVar, new ht70(ks70Var));
        this.b = new bp8<>(new Function() { // from class: it70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                oso osoVar = (oso) obj;
                jt70 jt70Var = this.a;
                cjg0 cjg0Var = jt70Var.a;
                jt70Var.c.apply(osoVar);
                ll1 ll1Var = ll1.b;
                return dt70.e ? new k3h(cjg0Var, osoVar, ll1Var) : new dt70(cjg0Var, osoVar, ll1Var);
            }
        });
        this.c = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().d(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.bjg0
    public final zig0 d(String str) {
        return ((et70) f(str)).build();
    }

    @Override // defpackage.bjg0
    public final ajg0 f(String str) {
        if (str.isEmpty()) {
            d.fine("Tracer requested without instrumentation scope name.");
            str = "";
        }
        return new et70(this.b, str);
    }

    public final rm8 shutdown() {
        if (this.a.h != null) {
            d.log(Level.INFO, "Calling shutdown() multiple times.");
            return rm8.e;
        }
        cjg0 cjg0Var = this.a;
        synchronized (cjg0Var.a) {
            try {
                if (cjg0Var.h != null) {
                    return cjg0Var.h;
                }
                cjg0Var.h = cjg0Var.e.shutdown();
                return cjg0Var.h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        cjg0 cjg0Var = this.a;
        cjg0Var.getClass();
        sb.append(eqe0.b);
        sb.append(", idGenerator=");
        sb.append(tx30.a);
        sb.append(", resource=");
        sb.append(cjg0Var.c);
        sb.append(", spanLimitsSupplier=");
        sb.append(ara0.a);
        sb.append(", sampler=");
        sb.append(cjg0Var.d);
        sb.append(", spanProcessor=");
        sb.append(cjg0Var.e);
        sb.append(", tracerConfigurator=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
