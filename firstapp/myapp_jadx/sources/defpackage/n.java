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
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {
    public final String b;
    public final t5g c;

    public n(t5g t5gVar, String str) {
        super(0);
        this.b = str;
        this.c = t5gVar;
    }

    @Override // defpackage.o
    public final byte[] F(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        bArr.getClass();
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(X(), 2), "AES");
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr, 16, bArr.length - 16);
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    @Override // defpackage.o
    public final byte[] S(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDecode = Base64.decode(X(), 2);
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, gCMParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        bArrDoFinal.getClass();
        byte[] bArr3 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr3, 16, bArrDoFinal.length);
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
