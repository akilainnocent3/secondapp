package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface fsw extends ytw<Double>, twd0<Double> {
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.twd0
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    default void s(double d) {
        t(d);
    }

    @Override // defpackage.ytw
    /* bridge */ /* synthetic */ default void setValue(Double d) {
        s(d.doubleValue());
    }

    void t(double d);
}
