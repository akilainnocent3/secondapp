package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class j8c {
    public final boolean a;
    public final boolean b;
    public final int c;

    public j8c(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8c)) {
            return false;
        }
        j8c j8cVar = (j8c) obj;
        return this.a == j8cVar.a && this.b == j8cVar.b && this.c == j8cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return zk1.a(this.c, ")", cwz.a("CustomCodeFlagState(codeWasCreated=", ", codeEditHintWatched=", ", codeCountLimit=", this.a, this.b));
    }
}
