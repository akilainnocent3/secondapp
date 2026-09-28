package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class iel0 {
    public int a;
    public long b;
    public Object c;
    public final dgl0 d;
    public int e;

    public iel0(dgl0 dgl0Var) {
        dgl0Var.getClass();
        this.d = dgl0Var;
    }

    public static /* synthetic */ String a(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }
}
