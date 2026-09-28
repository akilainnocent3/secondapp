package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class svh0 implements Serializable {
    public float a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || svh0.class != obj.getClass()) {
            return false;
        }
        svh0 svh0Var = (svh0) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(svh0Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(svh0Var.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + ((Float.floatToIntBits(this.a) + 31) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(",");
        return wi1.a(this.b, ")", sb);
    }
}
