package defpackage;

import com.google.protobuf.Reader;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class pn implements xen {
    public static final a d = new a();
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return o6g.b.a.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                dad.a(e);
                return null;
            }
        }
    }

    public pn(int i, byte[] bArr) throws GeneralSecurityException {
        if (!byf0.a.b.a()) {
            opp.a("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        quh0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = d.get().getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            opp.a("invalid IV size");
            throw null;
        }
        this.b = i;
    }

    @Override // defpackage.xen
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length > Reader.READ_DONE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Reader.READ_DONE - i));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrA = kx30.a(i);
        System.arraycopy(bArrA, 0, bArr2, 0, i);
        c(bArr, 0, bArr.length, bArr2, this.b, bArrA, true);
        return bArr2;
    }

    @Override // defpackage.xen
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length < i) {
            opp.a("ciphertext too short");
            return null;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.b;
        byte[] bArr3 = new byte[length2 - i2];
        c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        opp.a("stored output's length does not match input's length");
    }
}
