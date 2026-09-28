package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ca90 implements id90 {
    public final int a;

    public ca90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca90) && this.a == ((ca90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "ShowMaxPendingDepositsReachedSnackbar(totalOfPendingDeposits=", ")");
    }
}
