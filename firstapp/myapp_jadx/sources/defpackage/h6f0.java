package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

/* JADX INFO: loaded from: classes2.dex */
public final class h6f0 {
    public final b4l a;
    public final int b;

    public h6f0(b4l b4lVar, int i) {
        this.a = b4lVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6f0)) {
            return false;
        }
        h6f0 h6f0Var = (h6f0) obj;
        return this.a == h6f0Var.a && this.b == h6f0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamGoal(goalSymbol=" + this.a + LGxrN.LWK + this.b + ")";
    }
}
