package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nfz {
    public final boolean a;

    public nfz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfz) && this.a == ((nfz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Integer.hashCode(0) * 31);
    }

    public final String toString() {
        return b6c.a("OverrideSettingEntity(id=0, enabled=", ")", this.a);
    }
}
