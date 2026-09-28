package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rfg0 {
    public final String a;
    public final int b;

    public rfg0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfg0)) {
            return false;
        }
        rfg0 rfg0Var = (rfg0) obj;
        return this.a.equals(rfg0Var.a) && this.b == rfg0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "TournamentTabItem(id=", this.a, ", titleRes=", ")");
    }
}
