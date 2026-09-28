package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class o1z implements i1z, Closeable {
    public static final Logger f = Logger.getLogger(o1z.class.getName());
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final c b;
    public final b c;
    public final a d;
    public final obd e;

    public static class a implements rgt {
        public final is70 a;

        public a(is70 is70Var) {
            this.a = is70Var;
        }

        @Override // defpackage.rgt
        public final qgt f(String str) {
            return this.a.f(str);
        }
    }

    public static class b implements hpv {
        public final vs70 a;

        public b(vs70 vs70Var) {
            this.a = vs70Var;
        }

        @Override // defpackage.hpv
        public final gpv f(String str) {
            return this.a.f(str);
        }
    }

    public static class c implements bjg0 {
        public final jt70 a;

        public c(jt70 jt70Var) {
            this.a = jt70Var;
        }

        @Override // defpackage.bjg0
        public final zig0 d(String str) {
            return this.a.d(str);
        }

        @Override // defpackage.bjg0
        public final ajg0 f(String str) {
            return this.a.f("io.opentelemetry.okhttp-3.0");
        }
    }

    public o1z(jt70 jt70Var, vs70 vs70Var, is70 is70Var, obd obdVar) {
        this.b = new c(jt70Var);
        this.c = new b(vs70Var);
        this.d = new a(is70Var);
        this.e = obdVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rm8 rm8VarE;
        if (this.a.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.b.a.shutdown());
            arrayList.add(this.c.a.shutdown());
            arrayList.add(this.d.a.shutdown());
            rm8VarE = rm8.e(arrayList);
        } else {
            f.info("Multiple shutdown calls");
            rm8VarE = rm8.e;
        }
        rm8VarE.d(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.i1z
    public final hpv d() {
        return this.c;
    }

    @Override // defpackage.i1z
    public final obd f() {
        return this.e;
    }

    @Override // defpackage.i1z
    public final bjg0 g() {
        return this.b;
    }

    @Override // defpackage.i1z
    public final rgt l() {
        return this.d;
    }

    public final String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.b.a + ", meterProvider=" + this.c.a + ", loggerProvider=" + this.d.a + ", propagators=" + this.e + "}";
    }
}
