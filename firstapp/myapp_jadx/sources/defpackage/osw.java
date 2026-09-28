package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface osw extends ytw<Integer>, twd0<Integer> {
    int D();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.twd0
    default Integer getValue() {
        return Integer.valueOf(D());
    }

    void k(int i);

    default void q(int i) {
        k(i);
    }

    @Override // defpackage.ytw
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        q(num.intValue());
    }
}
