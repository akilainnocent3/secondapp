package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class d80 implements pqp {
    public static final Object b = new Object();
    public KeyStore a;

    public d80() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            dad.a(e);
            throw null;
        }
    }

    public static boolean c(String str) {
        d80 d80Var = new d80();
        synchronized (b) {
            try {
                if (d80Var.e(str)) {
                    return false;
                }
                d(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = quh0.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @Override // defpackage.pqp
    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    @Override // defpackage.pqp
    public final synchronized c80 b(String str) {
        c80 c80Var;
        c80Var = new c80(quh0.b(str), this.a);
        byte[] bArrA = kx30.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, c80Var.b(c80Var.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c80Var;
    }

    public final synchronized boolean e(String str) {
        String strB;
        strB = quh0.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("d80", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
                return this.a.containsAlias(strB);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.a.containsAlias(strB);
    }
}
