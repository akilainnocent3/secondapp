package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gam {
    public final float a;
    public final kam b;

    public gam(float f, kam kamVar) {
        kamVar.getClass();
        this.a = f;
        this.b = kamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gam)) {
            return false;
        }
        gam gamVar = (gam) obj;
        return Float.compare(this.a, gamVar.a) == 0 && this.b == gamVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HitData(lastHeight=" + this.a + ", lastWay=" + this.b + ")";
    }
}
