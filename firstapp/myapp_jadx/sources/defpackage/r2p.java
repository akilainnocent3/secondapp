package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class r2p {
    public final float a;
    public final int b;

    public r2p(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2p)) {
            return false;
        }
        r2p r2pVar = (r2p) obj;
        return Float.compare(this.a, r2pVar.a) == 0 && this.b == r2pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ItemInterval(start=" + this.a + ", size=" + this.b + ")";
    }

    public /* synthetic */ r2p(int i) {
        this(0, 0.0f);
    }

    public r2p() {
        this(0);
    }
}
