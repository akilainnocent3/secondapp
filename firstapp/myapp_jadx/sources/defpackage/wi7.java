package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class wi7 {
    public final String a;

    public wi7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi7) && this.a.equals(((wi7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("CheckLastTransactionConfig(reason=", this.a, ")");
    }
}
