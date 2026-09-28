package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eu00 implements uov.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public eu00(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static eu00 d(nsz nszVar) {
        int iJ = nszVar.j();
        String strM = gqv.m(nszVar.u(nszVar.j(), StandardCharsets.US_ASCII));
        String strU = nszVar.u(nszVar.j(), StandardCharsets.UTF_8);
        int iJ2 = nszVar.j();
        int iJ3 = nszVar.j();
        int iJ4 = nszVar.j();
        int iJ5 = nszVar.j();
        int iJ6 = nszVar.j();
        byte[] bArr = new byte[iJ6];
        nszVar.h(bArr, 0, iJ6);
        return new eu00(iJ, strM, strU, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    @Override // uov.a
    public final void b(qjv.a aVar) {
        aVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eu00.class != obj.getClass()) {
            return false;
        }
        eu00 eu00Var = (eu00) obj;
        return this.a == eu00Var.a && this.b.equals(eu00Var.b) && this.c.equals(eu00Var.c) && this.d == eu00Var.d && this.e == eu00Var.e && this.f == eu00Var.f && this.g == eu00Var.g && Arrays.equals(this.h, eu00Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((gmf0.a(gmf0.a((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
