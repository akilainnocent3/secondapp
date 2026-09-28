package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public interface oqa0 extends xcn {
    static oqa0 i(m0b m0bVar) {
        if (m0bVar == null) {
            dp0.a();
            return z530.b;
        }
        oqa0 oqa0Var = (oqa0) m0bVar.b(zre.c);
        return oqa0Var == null ? z530.b : oqa0Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    <T> oqa0 f(e21<T> e21Var, T t);

    ui1 b();

    default void c(wgh0 wgh0Var) {
        if (wgh0Var.isEmpty()) {
            return;
        }
        wgh0Var.forEach(new BiConsumer() { // from class: mqa0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.a.f((e21) obj, obj2);
            }
        });
    }

    @Override // defpackage.xcn
    default m0b d(m0b m0bVar) {
        return m0bVar.a(zre.c, this);
    }

    void end();

    default void g(Throwable th) {
        h(th, vw0.d);
    }

    oqa0 h(Throwable th, m21 m21Var);

    void j(long j);

    oqa0 k();

    default void l(Instant instant) {
        if (instant == null) {
            end();
        } else {
            j(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano()));
        }
    }
}
