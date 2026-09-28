package defpackage;

import java.io.Serializable;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class wsh0 implements Comparable<wsh0>, Serializable {
    public static final wsh0 c = new wsh0(0, 0);
    public final long a;
    public final long b;

    public wsh0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(wsh0 wsh0Var) {
        wsh0 wsh0Var2 = wsh0Var;
        wsh0Var2.getClass();
        long j = wsh0Var2.a;
        long j2 = this.a;
        if (j2 != j) {
            nbh0.a aVar = nbh0.b;
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        nbh0.a aVar2 = nbh0.b;
        return Long.compare(this.b ^ Long.MIN_VALUE, wsh0Var2.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsh0)) {
            return false;
        }
        wsh0 wsh0Var = (wsh0) obj;
        return this.a == wsh0Var.a && this.b == wsh0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        sd50.a(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        sd50.a(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        sd50.a(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        sd50.a(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        sd50.a(this.b, bArr, 24, 2, 8);
        return new String(bArr, Charsets.UTF_8);
    }
}
