package defpackage;

import j$.time.Instant;

/* JADX INFO: loaded from: classes8.dex */
public interface l3h extends qqa0 {
    @Override // defpackage.qqa0
    /* JADX INFO: renamed from: a */
    <T> l3h f(e21<T> e21Var, T t);

    @Override // defpackage.qqa0
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default qqa0 f(e21 e21Var, Object obj) {
        return f((e21<Object>) e21Var, obj);
    }

    @Override // defpackage.qqa0
    default l3h d(Instant instant) {
        return (l3h) super.d(instant);
    }

    @Override // defpackage.qqa0
    l3h e(long j);

    @Override // defpackage.qqa0
    l3h g(wqa0 wqa0Var);

    @Override // defpackage.qqa0
    l3h h(m0b m0bVar);

    @Override // defpackage.qqa0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    default l3h mo101c(wgh0 wgh0Var) {
        super.mo101c(wgh0Var);
        return this;
    }
}
