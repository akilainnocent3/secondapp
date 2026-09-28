package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d4g {
    public final j4g a;
    public final byte[] b;

    public d4g(j4g j4gVar, byte[] bArr) {
        if (j4gVar == null) {
            bmy.a("encoding is null");
            throw null;
        }
        if (bArr == null) {
            bmy.a("bytes is null");
            throw null;
        }
        this.a = j4gVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4g)) {
            return false;
        }
        d4g d4gVar = (d4g) obj;
        if (this.a.equals(d4gVar.a)) {
            return Arrays.equals(this.b, d4gVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
