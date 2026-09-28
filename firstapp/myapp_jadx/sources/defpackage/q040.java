package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class q040 implements a75 {
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;

    public q040(Double d, Double d2, Double d3, Double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    @Override // defpackage.a75
    public final p65 a(kb0 kb0Var) {
        return new p65(this.a.doubleValue(), this.b.doubleValue(), this.c.doubleValue(), this.d.doubleValue());
    }
}
