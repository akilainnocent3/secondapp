package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uov {
    public final a[] a;
    public final long b;

    public uov() {
        throw null;
    }

    public uov(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public final uov a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        String str = jrh0.a;
        a[] aVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, objArrCopyOf, aVarArr2.length, aVarArr.length);
        return new uov(this.b, (a[]) objArrCopyOf);
    }

    public final uov b(uov uovVar) {
        return uovVar == null ? this : a(uovVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uov.class == obj.getClass()) {
            uov uovVar = (uov) obj;
            if (Arrays.equals(this.a, uovVar.a) && this.b == uovVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return vkt.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public uov(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public uov(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }

    public interface a {
        default androidx.media3.common.a a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(qjv.a aVar) {
        }
    }
}
