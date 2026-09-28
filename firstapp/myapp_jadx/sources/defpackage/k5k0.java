package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class k5k0 {
    public final boolean a;

    public k5k0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5k0) && this.a == ((k5k0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("WorldCupSpeedControllerConfig(enabled=", ")", this.a);
    }
}
