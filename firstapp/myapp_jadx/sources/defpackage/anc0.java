package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class anc0 {
    public final zmc0 a;
    public final String b;

    public anc0(zmc0 zmc0Var, String str) {
        this.a = zmc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anc0)) {
            return false;
        }
        anc0 anc0Var = (anc0) obj;
        return this.a.equals(anc0Var.a) && this.b.equals(anc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsStatsRecordState(resultState=" + this.a + ", resultText=" + this.b + ")";
    }
}
