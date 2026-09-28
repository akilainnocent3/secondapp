package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class keh0 {
    public final boolean a;

    public keh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof keh0) && this.a == ((keh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("UniqueBookingCodeInfoUIState(doNotShowAgain=", ")", this.a);
    }

    public keh0() {
        this(false);
    }
}
