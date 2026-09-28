package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class fcb0 {
    public final String a;
    public final boolean b;

    public fcb0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcb0)) {
            return false;
        }
        fcb0 fcb0Var = (fcb0) obj;
        return this.a.equals(fcb0Var.a) && this.b == fcb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpineAnimation(animationName=");
        sb.append(this.a);
        sb.append(", loop=");
        return ruw.a(sb, this.b, ')');
    }
}
