package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class jjg0 {
    public final int a;
    public final String b;
    public final int c;
    public final a[] d;
    public int e;

    static {
        jrh0.J(0);
        jrh0.J(1);
    }

    public jjg0(String str, a... aVarArr) {
        ly0.b(aVarArr.length > 0);
        this.b = str;
        this.d = aVarArr;
        this.a = aVarArr.length;
        int iH = gqv.h(aVarArr[0].n);
        this.c = iH == -1 ? gqv.h(aVarArr[0].m) : iH;
        String str2 = aVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = aVarArr[0].f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i2 = 1; i2 < aVarArr.length; i2++) {
            String str3 = aVarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i2, "languages", aVarArr[0].d, aVarArr[i2].d);
                return;
            } else {
                if (i != (aVarArr[i2].f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i2, "role flags", Integer.toBinaryString(aVarArr[0].f), Integer.toBinaryString(aVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, String str2, String str3) {
        cft.d("TrackGroup", "", new IllegalStateException(ijg0.a(i, str3, "' (track ", ")", ux5.a("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '"))));
    }

    public final int a(a aVar) {
        int i = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (i >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jjg0.class == obj.getClass()) {
            jjg0 jjg0Var = (jjg0) obj;
            if (this.b.equals(jjg0Var.b) && Arrays.equals(this.d, jjg0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + gmf0.a(527, 31, this.b);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
