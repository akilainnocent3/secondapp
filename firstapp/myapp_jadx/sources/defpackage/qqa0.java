package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public interface qqa0 {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    <T> qqa0 f(e21<T> e21Var, T t);

    oqa0 b();

    /* JADX INFO: renamed from: c */
    default void mo101c(wgh0 wgh0Var) {
        if (wgh0Var.isEmpty()) {
            return;
        }
        wgh0Var.forEach(new BiConsumer() { // from class: pqa0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.a.f((e21) obj, obj2);
            }
        });
    }

    default qqa0 d(Instant instant) {
        return instant == null ? this : e(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano()));
    }

    qqa0 e(long j);

    qqa0 g(wqa0 wqa0Var);

    qqa0 h(m0b m0bVar);
}
