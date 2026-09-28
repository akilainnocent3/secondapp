package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class sb70 {
    public final Throwable a;

    public sb70(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb70) && this.a.equals(((sb70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kox.a("Other(throwable=", ")", this.a);
    }
}
