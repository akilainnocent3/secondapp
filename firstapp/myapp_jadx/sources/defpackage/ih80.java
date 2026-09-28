package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ih80 implements k730 {
    public final m730<zl80> a;
    public final k730 b;

    public ih80(k730 k730Var, k730 k730Var2) {
        this.a = k730Var;
        this.b = k730Var2;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new hh80(this.a.get(), (zl80) this.b.get());
    }
}
