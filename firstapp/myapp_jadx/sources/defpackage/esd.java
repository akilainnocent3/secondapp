package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class esd {
    public final boolean a;

    public esd(boolean z) {
        this.a = z;
    }

    public static esd a(esd esdVar, boolean z) {
        esdVar.getClass();
        esdVar.getClass();
        return new esd(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esd) && this.a == ((esd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return b6c.a("DepositButtonState(isEnabled=false, isLoading=", ")", this.a);
    }

    public esd() {
        this(false);
    }
}
