package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class au1 {
    public final int a;
    public final boolean b;

    public au1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au1)) {
            return false;
        }
        au1 au1Var = (au1) obj;
        return this.a == au1Var.a && this.b == au1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BadgeItem(image=" + this.a + ", hasLeftAngle=" + this.b + ")";
    }
}
