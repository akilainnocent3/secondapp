package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g8w implements uov.a {
    public final float a;
    public final float b;

    public g8w(float f, float f2) {
        ly0.a("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g8w.class == obj.getClass()) {
            g8w g8wVar = (g8w) obj;
            if (this.a == g8wVar.a && this.b == g8wVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
