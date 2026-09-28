package defpackage;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public abstract class me80 implements AutoCloseable {
    public static final ptu.b a;

    public static class a<K, V> implements BiConsumer<K, V> {
        public ek1 a;
        public me80 b;
        public xxd0<K, V> c;
        public ptu d;

        @Override // java.util.function.BiConsumer
        public final void accept(K k, V v) {
            try {
                this.b.D0(this.a, this.d.e());
                this.c.b(this.b, k, v, this.d);
                this.b.d0();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    static {
        AtomicInteger atomicInteger = ptu.m;
        a = new ptu.b();
    }

    public abstract void A0(ek1 ek1Var);

    public abstract void D0(ek1 ek1Var, int i);

    public final void F(ek1 ek1Var, m21 m21Var, ptu ptuVar) throws IOException {
        A0(ek1Var);
        if (!m21Var.isEmpty()) {
            a aVar = (a) ptuVar.d(a, new le80());
            aVar.a = ek1Var;
            aVar.b = this;
            aVar.c = f21.a;
            aVar.d = ptuVar;
            try {
                m21Var.forEach(aVar);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        c0();
    }

    public abstract void F0(ek1 ek1Var, String str, int i, ptu ptuVar);

    public abstract <T> void G(ek1 ek1Var, List<? extends T> list, yxd0<T> yxd0Var, ptu ptuVar);

    public abstract void G0(ek1 ek1Var, byte[] bArr);

    public final <K, V> void H(ek1 ek1Var, Map<K, V> map, xxd0<K, V> xxd0Var, ptu ptuVar, ptu.b bVar) throws IOException {
        A0(ek1Var);
        if (!map.isEmpty()) {
            a aVar = (a) ptuVar.d(bVar, new ke80());
            aVar.a = ek1Var;
            aVar.b = this;
            aVar.c = xxd0Var;
            aVar.d = ptuVar;
            try {
                map.forEach(aVar);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        c0();
    }

    public abstract void I0(ek1 ek1Var, String str);

    public final void J(ek1 ek1Var, byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        G0(ek1Var, bArr);
    }

    public void K0(ek1 ek1Var, String str, ptu ptuVar) {
        I0(ek1Var, str);
    }

    public abstract void O0(ek1 ek1Var, int i);

    public final void P(ek1 ek1Var, String str, ptu ptuVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        ptuVar.getClass();
        F0(ek1Var, str, ptuVar.e(), ptuVar);
    }

    public final void V(ek1 ek1Var, int i) {
        if (i == 0) {
            return;
        }
        O0(ek1Var, i);
    }

    public abstract void Y(ek1 ek1Var, boolean z);

    public abstract void Z(ek1 ek1Var, byte[] bArr);

    public abstract void a0(ek1 ek1Var, double d);

    public abstract void b0();

    public abstract void c0();

    public final void d(ek1 ek1Var, dk1 dk1Var) {
        if (dk1Var.a() == 0) {
            return;
        }
        e0(ek1Var, dk1Var);
    }

    public abstract void d0();

    public abstract void e0(ek1 ek1Var, dk1 dk1Var);

    public final void f(ek1 ek1Var, int i) {
        if (i == 0) {
            return;
        }
        f0(ek1Var, i);
    }

    public abstract void f0(ek1 ek1Var, int i);

    public final void g(ek1 ek1Var, long j) {
        if (j == 0) {
            return;
        }
        g0(ek1Var, j);
    }

    public abstract void g0(ek1 ek1Var, long j);

    public abstract void h0(ek1 ek1Var, long j);

    public final void l(ek1 ek1Var, ktu ktuVar) {
        z0(ek1Var, ktuVar.a());
        ktuVar.c(this);
        b0();
    }

    public abstract void l0(String str, byte[] bArr);

    public final <T> void m(ek1 ek1Var, T t, yxd0<T> yxd0Var, ptu ptuVar) {
        z0(ek1Var, ptuVar.e());
        yxd0Var.b(this, t, ptuVar);
        b0();
    }

    public abstract void n0(ek1 ek1Var, String str);

    public final <K, V> void o(ek1 ek1Var, K k, V v, xxd0<K, V> xxd0Var, ptu ptuVar) {
        z0(ek1Var, ptuVar.e());
        xxd0Var.b(this, k, v, ptuVar);
        b0();
    }

    public abstract void u(ek1 ek1Var, ktu[] ktuVarArr);

    public void u0(ek1 ek1Var, String str, ptu ptuVar) {
        n0(ek1Var, str);
    }

    public abstract void z0(ek1 ek1Var, int i);
}
