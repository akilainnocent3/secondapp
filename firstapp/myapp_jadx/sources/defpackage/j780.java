package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j780 {
    public final int a;
    public final int b;
    public final int c;
    public final ukf0 d;

    public j780(int i, int i2, int i3, ukf0 ukf0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ukf0Var;
    }

    public final s780.a a(int i) {
        return new s780.a(jh8.a(this.d, i), i, 1L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
        int i = this.a;
        sb.append(i);
        sb.append('-');
        ukf0 ukf0Var = this.d;
        sb.append(jh8.a(ukf0Var, i));
        sb.append(',');
        int i2 = this.b;
        sb.append(i2);
        sb.append('-');
        sb.append(jh8.a(ukf0Var, i2));
        sb.append("), prevOffset=");
        return rr1.b(sb, this.c, ')');
    }
}
