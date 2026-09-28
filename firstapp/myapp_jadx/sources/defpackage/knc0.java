package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class knc0 {
    public final String a;
    public final String b;

    public knc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knc0)) {
            return false;
        }
        knc0 knc0Var = (knc0) obj;
        return this.a.equals(knc0Var.a) && this.b.equals(knc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
