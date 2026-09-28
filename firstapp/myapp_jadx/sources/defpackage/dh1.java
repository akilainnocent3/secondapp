package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dh1 extends ktb.d.a {
    public final String a;
    public final byte[] b;

    public dh1(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // ktb.d.a
    public final byte[] a() {
        return this.b;
    }

    @Override // ktb.d.a
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.d.a)) {
            return false;
        }
        ktb.d.a aVar = (ktb.d.a) obj;
        if (this.a.equals(aVar.b())) {
            return Arrays.equals(this.b, aVar instanceof dh1 ? ((dh1) aVar).b : aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
