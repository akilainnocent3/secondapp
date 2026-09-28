package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class l0f0 {
    public final boolean a;
    public final boolean b;

    public l0f0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0f0)) {
            return false;
        }
        l0f0 l0f0Var = (l0f0) obj;
        return this.a == l0f0Var.a && this.b == l0f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGTurboState(editable=");
        sb.append(this.a);
        sb.append(", turboMode=");
        return ruw.a(sb, this.b, ')');
    }

    public /* synthetic */ l0f0(int i) {
        this(true, false);
    }

    public l0f0() {
        this(0);
    }
}
