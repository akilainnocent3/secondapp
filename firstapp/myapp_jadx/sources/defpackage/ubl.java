package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ubl {
    public final float a;
    public final float b;

    public ubl(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubl)) {
            return false;
        }
        ubl ublVar = (ubl) obj;
        return Float.compare(this.a, ublVar.a) == 0 && Float.compare(this.b, ublVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HammerCelebrationState(scale=");
        sb.append(this.a);
        sb.append(", glowAlpha=");
        return h70.a(sb, this.b, ')');
    }
}
