package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ecb0 {
    public final String a;
    public final boolean b;

    public ecb0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecb0)) {
            return false;
        }
        ecb0 ecb0Var = (ecb0) obj;
        return this.a.equals(ecb0Var.a) && this.b == ecb0Var.b;
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
