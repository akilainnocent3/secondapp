package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface isw extends ytw<Float>, twd0<Float> {
    void A(float f);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.twd0
    default Float getValue() {
        return Float.valueOf(j());
    }

    float j();

    default void r(float f) {
        A(f);
    }

    @Override // defpackage.ytw
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        r(f.floatValue());
    }
}
