package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class osy {
    public final psy a;
    public final boolean b;

    public osy(psy psyVar, boolean z) {
        this.a = psyVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osy)) {
            return false;
        }
        osy osyVar = (osy) obj;
        return this.a.equals(osyVar.a) && this.b == osyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OneUpExperimentSessionState(token=" + this.a + ", resolved=" + this.b + ")";
    }
}
