package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mqv {
    public final int a;

    public mqv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqv) && this.a == ((mqv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "MinTierDepositDialogState(minTier=", ")");
    }
}
