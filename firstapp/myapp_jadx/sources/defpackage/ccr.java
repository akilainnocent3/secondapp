package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ccr {
    public final nvp a;

    public ccr(nvp nvpVar) {
        this.a = nvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccr) && this.a.equals(((ccr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LNSharedEvent(rootAction=" + this.a + ")";
    }
}
