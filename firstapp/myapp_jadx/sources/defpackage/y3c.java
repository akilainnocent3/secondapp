package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.sporty.android.core.model.crypto.EncryptDataResult;
import com.sporty.android.core.model.crypto.ValidationResult;
import com.sporty.android.core.model.security.biometric.CryptoException;
import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import com.sportygames.crash.models.header.snc.OdQr;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class y3c implements x3c {
    public static void a() throws CryptoException.KeyGenerationException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("DefEncDecKey", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            builder.setUserAuthenticationRequired(true);
            builder.setInvalidatedByBiometricEnrollment(true);
            builder.setKeySize(256);
            KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
            keyGenParameterSpecBuild.getClass();
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey().getClass();
        } catch (Exception e) {
            throw new CryptoException.KeyGenerationException(e);
        }
    }

    @Override // defpackage.x3c
    public final ValidationResult c() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.isKeyEntry("DefEncDecKey")) {
            try {
                a();
                return ValidationResult.Ok;
            } catch (Exception e) {
                itf0.a.f(e, "generateTargetKey fail", new Object[0]);
                return ValidationResult.KeyInitFail;
            }
        }
        try {
            byte[] bArr = new byte[16];
            lx30.INSTANCE.getClass();
            lx30.b.h().nextBytes(bArr);
            d(CryptoPurpose.Decryption, bArr);
            return ValidationResult.Ok;
        } catch (KeyPermanentlyInvalidatedException unused) {
            itf0.a.d("KeyPermanentlyInvalidatedException ", new Object[0]);
            return ValidationResult.KeyPermanentlyInvalidate;
        } catch (Exception e2) {
            itf0.a.f(e2, "warmup unknown error", new Object[0]);
            return ValidationResult.ValidationFail;
        }
    }

    @Override // defpackage.x3c
    public final qd4.c d(CryptoPurpose cryptoPurpose, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        cryptoPurpose.getClass();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("DefEncDecKey", null);
        key.getClass();
        SecretKey secretKey = (SecretKey) key;
        if (cryptoPurpose == CryptoPurpose.Decryption) {
            cipher.init(2, secretKey, new IvParameterSpec(bArr));
        } else {
            cipher.init(1, secretKey);
        }
        return new qd4.c(cipher);
    }

    @Override // defpackage.x3c
    public final String e(byte[] bArr, qd4.c cVar) throws CryptoException.CipherOperationException {
        cVar.getClass();
        try {
            Cipher cipher = cVar.b;
            if (cipher == null) {
                cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.getClass();
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            bArrDoFinal.getClass();
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (Exception e) {
            itf0.a.f(e, "Decryption failed", new Object[0]);
            throw new CryptoException.CipherOperationException(e);
        }
    }

    @Override // defpackage.x3c
    public final EncryptDataResult g(String str, qd4.c cVar) throws CryptoException.CipherOperationException {
        str.getClass();
        cVar.getClass();
        try {
            Cipher cipher = cVar.b;
            if (cipher == null) {
                cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.getClass();
            }
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] iv = cipher.getIV();
            bArrDoFinal.getClass();
            return new EncryptDataResult(bArrDoFinal, iv);
        } catch (Exception e) {
            itf0.a.f(e, "Encryption failed", new Object[0]);
            throw new CryptoException.CipherOperationException(e);
        }
    }

    @Override // defpackage.x3c
    public final void f() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        String str = OdQr.ZWagCxzMp;
        KeyStore keyStore = KeyStore.getInstance(str);
        keyStore.load(null);
        if (keyStore.isKeyEntry("DefEncDecKey")) {
            KeyStore keyStore2 = KeyStore.getInstance(str);
            keyStore2.load(null);
            keyStore2.deleteEntry("DefEncDecKey");
        }
    }
}
