package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class wfj0 implements rfj0 {
    public final boolean a;

    public wfj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfj0) && this.a == ((wfj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("DoneClick(setAsDefault=", ")", this.a);
    }
}
