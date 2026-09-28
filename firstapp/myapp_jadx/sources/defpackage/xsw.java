package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface xsw extends ytw<Long>, twd0<Long> {
    void K(long j);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.twd0
    default Long getValue() {
        return Long.valueOf(u());
    }

    default void p(long j) {
        K(j);
    }

    @Override // defpackage.ytw
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        p(l.longValue());
    }

    long u();
}
