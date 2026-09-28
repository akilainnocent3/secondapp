package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fg80 {
    public final rg80 a;
    public final xu0 b;

    public fg80(rg80 rg80Var, xu0 xu0Var) {
        nrg nrgVar = nrg.SESSION_START;
        this.a = rg80Var;
        this.b = xu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg80)) {
            return false;
        }
        fg80 fg80Var = (fg80) obj;
        nrg nrgVar = nrg.SESSION_START;
        return this.a.equals(fg80Var.a) && this.b.equals(fg80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (nrg.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + nrg.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
