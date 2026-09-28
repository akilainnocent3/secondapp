package defpackage;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends o {
    public final String b;
    public final t5g c;

    public m(t5g t5gVar, String str) {
        super(0);
        this.b = str;
        this.c = t5gVar;
    }

    @Override // defpackage.o
    public final byte[] F(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        bArr.getClass();
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(X(), 2), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr, 16, bArr.length - 16);
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    @Override // defpackage.o
    public final byte[] S(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, ShortBufferException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(X(), 2), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] bArr3 = new byte[(bArr.length + 32) & (-16)];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 16);
        return bArr3;
    }

    @Override // defpackage.o
    public final t5g W() {
        return this.c;
    }

    @Override // defpackage.o
    public final String Y() {
        return this.b;
    }
}
