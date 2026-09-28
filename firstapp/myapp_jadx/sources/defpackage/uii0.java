package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uii0 {
    public final String a;
    public final String b;

    public uii0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uii0)) {
            return false;
        }
        uii0 uii0Var = (uii0) obj;
        return this.a.equals(uii0Var.a) && this.b.equals(uii0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("VirtualLobbyGetStartedCallToActionContext(redirectUrl=", this.a, ", updateRequiredAppVersion=", this.b, ")");
    }
}
