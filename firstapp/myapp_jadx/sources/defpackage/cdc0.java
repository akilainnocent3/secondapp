package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cdc0 {
    public final String a;
    public final String b;

    public cdc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdc0)) {
            return false;
        }
        cdc0 cdc0Var = (cdc0) obj;
        return this.a.equals(cdc0Var.a) && this.b.equals(cdc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsLeagueCategoryTabState(id=", this.a, ", name=", this.b, ")");
    }
}
