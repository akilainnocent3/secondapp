package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dnx {
    public final da a;
    public final da b;

    public dnx(da daVar, da daVar2) {
        this.a = daVar;
        this.b = daVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnx)) {
            return false;
        }
        dnx dnxVar = (dnx) obj;
        return this.a == dnxVar.a && this.b == dnxVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkMismatchWarning(selectedType=" + this.a + ", userAccountType=" + this.b + ")";
    }
}
