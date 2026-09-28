package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 extends l36 {
    public final l36.b a;
    public final l36.a b;

    public pg1(l36.b bVar, l36.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // defpackage.l36
    public final l36.a a() {
        return this.b;
    }

    @Override // defpackage.l36
    public final l36.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l36)) {
            return false;
        }
        l36 l36Var = (l36) obj;
        if (!this.a.equals(l36Var.b())) {
            return false;
        }
        l36.a aVar = this.b;
        if (aVar == null) {
            return l36Var.a() == null;
        }
        return aVar.equals(l36Var.a());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        l36.a aVar = this.b;
        return (aVar == null ? 0 : aVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
