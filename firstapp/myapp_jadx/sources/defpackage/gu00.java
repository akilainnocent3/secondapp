package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class gu00 {
    public final float a;
    public final float b;

    public gu00(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu00)) {
            return false;
        }
        gu00 gu00Var = (gu00) obj;
        return Float.compare(this.a, gu00Var.a) == 0 && Float.compare(this.b, gu00Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PigBonusReactState(scale=");
        sb.append(this.a);
        sb.append(", brightness=");
        return h70.a(sb, this.b, ')');
    }
}
