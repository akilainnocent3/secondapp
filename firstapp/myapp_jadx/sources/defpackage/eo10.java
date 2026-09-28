package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class eo10 {
    public static final eo10 d = new eo10(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        jrh0.J(0);
        jrh0.J(1);
    }

    public eo10(float f, float f2) {
        ly0.b(f > 0.0f);
        ly0.b(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eo10.class == obj.getClass()) {
            eo10 eo10Var = (eo10) obj;
            if (this.a == eo10Var.a && this.b == eo10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = jrh0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
