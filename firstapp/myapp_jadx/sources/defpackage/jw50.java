package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jw50 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public jw50(float f, float f2, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw50)) {
            return false;
        }
        jw50 jw50Var = (jw50) obj;
        return jw50Var.a == this.a && jw50Var.b == this.b && jw50Var.c == this.c && jw50Var.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f87.a(tvh.a(this.b, Float.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return rr1.b(sb, this.d, ')');
    }
}
