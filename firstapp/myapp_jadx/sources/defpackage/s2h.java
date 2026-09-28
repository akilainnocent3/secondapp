package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public interface s2h extends qft {
    @Override // defpackage.qft
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default qft d(e21 e21Var, Object obj) {
        return d((e21<Object>) e21Var, obj);
    }

    @Override // defpackage.qft
    /* JADX INFO: renamed from: a */
    <T> s2h d(e21<T> e21Var, T t);

    @Override // defpackage.qft
    default s2h b(m21 m21Var) {
        if (m21Var != null && !m21Var.isEmpty()) {
            m21Var.forEach(new BiConsumer() { // from class: r2h
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.a.f((e21) obj, obj2);
                }
            });
        }
        return this;
    }

    /* synthetic */ default void f(e21 e21Var, Object obj) {
        d((e21<Object>) e21Var, obj);
    }

    @Override // defpackage.qft
    s2h g(String str);

    @Override // defpackage.qft
    s2h h();

    @Override // defpackage.qft
    s2h i(long j);
}
