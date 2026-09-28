package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zq20 implements yq20 {
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public zq20(byte[] bArr) throws GeneralSecurityException {
        quh0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (!byf0.a.a.a()) {
            opp.a("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipherA = o6g.b.a.a("AES/ECB/NoPadding");
        cipherA.init(1, secretKeySpec);
        byte[] bArrB = tl9.b(cipherA.doFinal(new byte[16]));
        this.b = bArrB;
        this.c = tl9.b(bArrB);
    }

    @Override // defpackage.yq20
    public final byte[] a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrE;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!byf0.a.a.a()) {
            opp.a("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipherA = o6g.b.a.a("AES/ECB/NoPadding");
        cipherA.init(1, this.a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrE = tl5.d(bArr, (iMax - 1) * 16, this.b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                hb5.a("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrE = tl5.e(bArrCopyOf, this.c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherA.doFinal(tl5.d(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherA.doFinal(tl5.e(bArrE, bArrDoFinal)), i);
    }
}
