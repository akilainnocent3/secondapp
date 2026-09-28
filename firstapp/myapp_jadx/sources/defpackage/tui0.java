package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class tui0 {
    public final boolean a;
    public final boolean b;

    public tui0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tui0)) {
            return false;
        }
        tui0 tui0Var = (tui0) obj;
        return this.a == tui0Var.a && this.b == tui0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDTurboState(editable=");
        sb.append(this.a);
        sb.append(", turboMode=");
        return ruw.a(sb, this.b, ')');
    }

    public /* synthetic */ tui0(int i) {
        this(true, false);
    }

    public tui0() {
        this(0);
    }
}
