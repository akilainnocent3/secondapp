package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n6n implements uov.a {
    public final byte[] a;
    public final String b;
    public final String c;

    public n6n(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // uov.a
    public final void b(qjv.a aVar) {
        String str = this.b;
        if (str != null) {
            aVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n6n.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((n6n) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zk1.a(this.a.length, "\"", ux5.a("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
