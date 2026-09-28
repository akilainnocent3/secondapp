package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wr0 implements uov.a {
    public final int a;
    public final String b;

    public wr0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return uf80.a(sb, this.b, ")");
    }
}
