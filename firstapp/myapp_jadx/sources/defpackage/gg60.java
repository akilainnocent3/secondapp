package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class gg60 {
    public final boolean a;
    public final boolean b = true;

    public gg60(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg60)) {
            return false;
        }
        gg60 gg60Var = (gg60) obj;
        return this.a == gg60Var.a && this.b == gg60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBTurboState(isTurbo=");
        sb.append(this.a);
        sb.append(", enable=");
        return ruw.a(sb, this.b, ')');
    }
}
