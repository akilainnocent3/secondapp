package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class j0f {
    public final int a;
    public final l2f b;
    public final w2f c;
    public final f3f d;

    public j0f(int i, l2f l2fVar, w2f w2fVar, f3f f3fVar) {
        this.a = i;
        this.b = l2fVar;
        this.c = w2fVar;
        this.d = f3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0f)) {
            return false;
        }
        j0f j0fVar = (j0f) obj;
        return this.a == j0fVar.a && this.b.equals(j0fVar.b) && this.c.equals(j0fVar.c) && this.d == j0fVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        f3f f3fVar = this.d;
        return iHashCode + (f3fVar == null ? 0 : f3fVar.hashCode());
    }

    public final String toString() {
        return "DoubleOrNothingAnimationState(roundNumber=" + this.a + ", kickPointsState=" + this.b + ", kickingVisualState=" + this.c + ", postAnimationType=" + this.d + ")";
    }
}
