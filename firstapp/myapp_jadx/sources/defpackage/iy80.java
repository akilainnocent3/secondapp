package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iy80 implements a0b {
    public final String a;
    public final int b;
    public final je0 c;
    public final boolean d;

    public iy80(String str, int i, je0 je0Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = je0Var;
        this.d = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new ux80(iotVar, w12Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return rr1.b(sb, this.b, '}');
    }
}
