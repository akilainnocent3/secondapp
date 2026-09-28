package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class xo implements ibe {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final zq20 a;
    public final byte[] b;

    public xo(byte[] bArr) throws GeneralSecurityException {
        if (!byf0.a.a.a()) {
            opp.a("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(zk1.a(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new zq20(bArrCopyOfRange);
    }

    @Override // defpackage.ibe
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            opp.a("plaintext too long");
            return null;
        }
        Cipher cipherA = o6g.b.a.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return tl5.a(bArrC, cipherA.doFinal(bArr));
    }

    @Override // defpackage.ibe
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            opp.a("Ciphertext too short.");
            return null;
        }
        Cipher cipherA = o6g.b.a.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipherA.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrE;
        int length = bArr.length;
        zq20 zq20Var = this.a;
        if (length == 0) {
            return zq20Var.a(16, e);
        }
        byte[] bArrA = zq20Var.a(16, d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = tl5.e(tl9.b(bArrA), zq20Var.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                hb5.a("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrA.length;
            bArrE = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrA.length; i2++) {
                int i3 = length2 + i2;
                bArrE[i3] = (byte) (bArrE[i3] ^ bArrA[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                hb5.a("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrE = tl5.e(bArrCopyOf, tl9.b(bArrA));
        }
        return zq20Var.a(16, bArrE);
    }
}
