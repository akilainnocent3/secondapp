package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class eol0 {
    public final iol0 a;
    public int b = 1;
    public long c = a();

    public eol0(iol0 iol0Var) {
        this.a = iol0Var;
    }

    public final long a() {
        iol0 iol0Var = this.a;
        hm20.h(iol0Var);
        long jLongValue = ((Long) v2l0.v.a(null)).longValue();
        long jLongValue2 = ((Long) v2l0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        iol0Var.e().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
