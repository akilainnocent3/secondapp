package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dgv {
    public final String a;

    public dgv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgv) && this.a.equals(((dgv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("HasBg(url=", this.a, ")");
    }
}
