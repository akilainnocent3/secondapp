package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class sl5 {
    public final byte[] a;

    public sl5(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static sl5 a(byte[] bArr) {
        if (bArr != null) {
            return new sl5(bArr.length, bArr);
        }
        bmy.a("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl5) {
            return Arrays.equals(((sl5) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + hjl.b(this.a) + ")";
    }
}
