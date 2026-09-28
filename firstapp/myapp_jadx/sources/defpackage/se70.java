package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class se70 {
    public final Throwable a;

    public se70(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se70) && this.a.equals(((se70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kox.a("Other(throwable=", ")", this.a);
    }
}
