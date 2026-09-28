package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends q6n {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ep0(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // uov.a
    public final void b(qjv.a aVar) {
        aVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ep0.class != obj.getClass()) {
            return false;
        }
        ep0 ep0Var = (ep0) obj;
        return this.d == ep0Var.d && this.b.equals(ep0Var.b) && Objects.equals(this.c, ep0Var.c) && Arrays.equals(this.e, ep0Var.e);
    }

    public final int hashCode() {
        int iA = gmf0.a((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
