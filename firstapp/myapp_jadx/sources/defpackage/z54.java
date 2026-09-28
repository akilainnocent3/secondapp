package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z54 extends q6n {
    public final byte[] b;

    public z54(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z54.class != obj.getClass()) {
            return false;
        }
        z54 z54Var = (z54) obj;
        return this.a.equals(z54Var.a) && Arrays.equals(this.b, z54Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + gmf0.a(527, 31, this.a);
    }
}
