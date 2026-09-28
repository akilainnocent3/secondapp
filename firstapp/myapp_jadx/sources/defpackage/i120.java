package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class i120<T> extends q4<T> {
    public final ygp<T> a;
    public final m2g b = m2g.a;
    public final ttr c = hwr.a(a1s.b, new qbt(this, 1));

    public i120(ygp<T> ygpVar) {
        this.a = ygpVar;
    }

    @Override // defpackage.q4
    public final ygp<T> c() {
        return this.a;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return (pd80) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
