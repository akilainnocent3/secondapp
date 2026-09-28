package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lq {
    public final boolean a;

    public lq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq) && this.a == ((lq) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("AfricanCupSpeedControllerConfig(enabled=", ")", this.a);
    }
}
