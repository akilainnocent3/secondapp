package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public interface qft {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    <T> qft d(e21<T> e21Var, T t);

    default qft b(m21 m21Var) {
        if (m21Var != null && !m21Var.isEmpty()) {
            m21Var.forEach(new BiConsumer() { // from class: pft
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.a.d((e21) obj, obj2);
                }
            });
        }
        return this;
    }

    void c();

    qft g(String str);

    qft h();

    qft i(long j);
}
