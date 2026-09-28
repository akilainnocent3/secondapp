package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class trf0 {
    public final int a;
    public final float b;

    public trf0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trf0)) {
            return false;
        }
        trf0 trf0Var = (trf0) obj;
        return this.a == trf0Var.a && Float.compare(this.b, trf0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TierMenuData(currentSelection=" + this.a + ", percent=" + this.b + ")";
    }

    public /* synthetic */ trf0(int i) {
        this(0, 0.0f);
    }

    public trf0() {
        this(0);
    }
}
