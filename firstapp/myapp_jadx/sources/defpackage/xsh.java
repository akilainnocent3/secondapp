package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class xsh {
    public final String a;

    public xsh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsh) && this.a.equals(((xsh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("FirebaseTopic(id=", this.a, ")");
    }
}
