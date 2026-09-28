package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class q15 {
    public boolean[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q15) {
            q15 q15Var = (q15) obj;
            int i = this.b;
            if (i == q15Var.b) {
                boolean[] zArr = this.a;
                boolean[] zArr2 = q15Var.a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (zArr[i2] == zArr2[i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean[] zArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + (zArr[i3] ? 1231 : 1237);
        }
        return i2;
    }

    public final String toString() {
        if (this.b == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        boolean[] zArr = this.a;
        j9e0 j9e0Var = new j9e0(32);
        j9e0Var.b('[');
        j9e0Var.c(zArr[0] ? "true" : "false");
        for (int i = 1; i < this.b; i++) {
            j9e0Var.c(", ");
            j9e0Var.c(zArr[i] ? "true" : "false");
        }
        j9e0Var.b(']');
        return j9e0Var.toString();
    }
}
