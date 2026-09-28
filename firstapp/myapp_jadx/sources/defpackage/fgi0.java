package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class fgi0 {
    public final String a;
    public final String b;

    public fgi0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgi0)) {
            return false;
        }
        fgi0 fgi0Var = (fgi0) obj;
        return this.a.equals(fgi0Var.a) && this.b.equals(fgi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("VirtualLobbyBannerItem(itemName=", this.a, ", imgUrl=", this.b, ")");
    }
}
