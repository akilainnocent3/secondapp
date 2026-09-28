package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class m7n {
    public final float a;
    public final float b;

    public m7n(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7n)) {
            return false;
        }
        m7n m7nVar = (m7n) obj;
        return Float.compare(this.a, m7nVar.a) == 0 && Float.compare(this.b, m7nVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdleHammerFloatState(translateFraction=");
        sb.append(this.a);
        sb.append(", rotation=");
        return h70.a(sb, this.b, ')');
    }
}
