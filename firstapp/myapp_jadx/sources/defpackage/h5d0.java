package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class h5d0 implements Serializable {
    public final String a;
    public final String b;

    public h5d0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5d0)) {
            return false;
        }
        h5d0 h5d0Var = (h5d0) obj;
        return this.a.equals(h5d0Var.a) && this.b.equals(h5d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyPenaltyTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
