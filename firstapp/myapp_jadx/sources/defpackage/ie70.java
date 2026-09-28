package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ie70 {
    public final Throwable a;

    public ie70(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie70) && this.a.equals(((ie70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kox.a("Other(throwable=", ")", this.a);
    }
}
