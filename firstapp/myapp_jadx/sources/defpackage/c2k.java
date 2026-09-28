package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c2k extends q6n {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public c2k(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2k.class != obj.getClass()) {
            return false;
        }
        c2k c2kVar = (c2k) obj;
        return Objects.equals(this.b, c2kVar.b) && this.c.equals(c2kVar.c) && this.d.equals(c2kVar.d) && Arrays.equals(this.e, c2kVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + gmf0.a(gmf0.a((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
