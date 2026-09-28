package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class dp70 {
    public final float a;
    public final int b;
    public final float c;

    public dp70(int i, float f, float f2) {
        this.a = f;
        this.b = i;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp70)) {
            return false;
        }
        dp70 dp70Var = (dp70) obj;
        return Float.compare(this.a, dp70Var.a) == 0 && this.b == dp70Var.b && Float.compare(this.c, dp70Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + gpp.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollData(itemY=");
        sb.append(this.a);
        sb.append(", itemHeight=");
        sb.append(this.b);
        sb.append(", bottomExtraPadding=");
        return wi1.a(this.c, ")", sb);
    }
}
