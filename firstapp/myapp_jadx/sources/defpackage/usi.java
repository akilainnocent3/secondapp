package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class usi {
    public final boolean a;

    public usi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usi) && this.a == ((usi) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("ForcePasswordResetStatus(isRequired=", ")", this.a);
    }
}
