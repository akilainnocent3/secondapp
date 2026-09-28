package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ksk0 extends rsk0 {
    public final char[] d;

    public ksk0() {
        jsk0 jsk0Var = new jsk0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
        super(jsk0Var, (Character) null);
        this.d = new char[512];
        char[] cArr = jsk0Var.b;
        if (cArr.length != 16) {
            d580.a();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.rsk0, defpackage.xsk0
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zok0.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.d;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
