package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class po3 {
    public final x53.i a;

    public po3(x53.i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po3) && this.a.equals(((po3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "BetSlipUi(event=" + this.a + ")";
    }
}
