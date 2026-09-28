package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qsk0 extends rsk0 {
    public qsk0(String str, String str2) {
        jsk0 jsk0Var = new jsk0(str, str2.toCharArray());
        super(jsk0Var, (Character) '=');
        if (jsk0Var.b.length == 64) {
            return;
        }
        d580.a();
        throw null;
    }

    @Override // defpackage.rsk0, defpackage.xsk0
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zok0.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            jsk0 jsk0Var = this.b;
            char[] cArr = jsk0Var.b;
            char[] cArr2 = jsk0Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            c(sb, bArr, i2, i - i2);
        }
    }
}
