package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class jpq {
    public final ipq a;
    public final boolean b;

    public jpq(ipq ipqVar, boolean z) {
        ipqVar.getClass();
        this.a = ipqVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpq)) {
            return false;
        }
        jpq jpqVar = (jpq) obj;
        return this.a == jpqVar.a && this.b == jpqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNLobbyTagState(tag=" + this.a + ", isSelected=" + this.b + ")";
    }
}
