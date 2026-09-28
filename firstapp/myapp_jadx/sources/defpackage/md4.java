package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.sportybet.android.gp.tz.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public final class md4 {
    public final c a;
    public final BiometricManager b;
    public final doh c;

    public static class a {
        public static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    public static class b {
        public static int a(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    public static class c {
        public final Context a;

        public c(Context context) {
            this.a = context.getApplicationContext();
        }
    }

    public md4(c cVar) {
        Context context = cVar.a;
        this.a = cVar;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? a.b(context) : null;
        this.c = i <= 29 ? new doh(context) : null;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0158  */
    /* JADX WARN: Code duplicated, block: B:139:0x0160  */
    /* JADX WARN: Code duplicated, block: B:140:0x0163  */
    /* JADX WARN: Code duplicated, block: B:142:0x0169  */
    /* JADX WARN: Code duplicated, block: B:143:0x016e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0174  */
    /* JADX WARN: Code duplicated, block: B:146:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v60 */
    public final int a(int i) {
        int i2;
        int i3;
        KeyguardManager keyguardManagerA;
        boolean zB;
        ?? r0;
        int iB;
        qd4.c cVar;
        int i4 = Build.VERSION.SDK_INT;
        int iA = 1;
        if (i4 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager != null) {
                return b.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        c cVar2 = this.a;
        Context context = cVar2.a;
        if (!w41.c(i)) {
            return -2;
        }
        if (i == 0 || jpp.a(context) == null) {
            return 12;
        }
        if (w41.b(i)) {
            KeyguardManager keyguardManagerA2 = jpp.a(context);
            return keyguardManagerA2 == null ? false : jpp.b(keyguardManagerA2) ? 0 : 11;
        }
        if (i4 != 29) {
            if (i4 != 28) {
                return b();
            }
            if (context == null || context.getPackageManager() == null || !lmz.a(context.getPackageManager())) {
                return 12;
            }
            KeyguardManager keyguardManagerA3 = jpp.a(cVar2.a);
            if (keyguardManagerA3 == null ? false : jpp.b(keyguardManagerA3)) {
                return b() == 0 ? 0 : -1;
            }
            return b();
        }
        if ((i & 255) == 255) {
            BiometricManager biometricManager2 = this.b;
            if (biometricManager2 != null) {
                return a.a(biometricManager2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method methodC = a.c();
        if (methodC != null) {
            Object objInvoke = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                i3 = -1;
                try {
                    KeyGenParameterSpec.Builder builderB = w3c.a.b("androidxBiometric", 3);
                    w3c.a.d(builderB);
                    w3c.a.e(builderB);
                    i2 = 0;
                    try {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        w3c.a.c(keyGenerator, w3c.a.a(builderB));
                        keyGenerator.generateKey();
                        SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher.init(1, secretKey);
                        cVar = new qd4.c(cipher);
                    } catch (IOException e) {
                        e = e;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (KeyStoreException e4) {
                        e = e4;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (NoSuchAlgorithmException e5) {
                        e = e5;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (NoSuchProviderException e6) {
                        e = e6;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (UnrecoverableKeyException e7) {
                        e = e7;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (CertificateException e8) {
                        e = e8;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    } catch (NoSuchPaddingException e9) {
                        e = e9;
                        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                        cVar = null;
                    }
                } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
                    e = e10;
                    i2 = 0;
                }
            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e11) {
                e = e11;
                i2 = 0;
                i3 = -1;
            }
            BiometricPrompt.CryptoObject cryptoObjectA = w3c.a(cVar);
            if (cryptoObjectA != null) {
                if (i4 == 29) {
                    try {
                        objInvoke = methodC.invoke(this.b, cryptoObjectA);
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            }
        } else {
            i2 = 0;
            i3 = -1;
        }
        BiometricManager biometricManager3 = this.b;
        if (biometricManager3 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        } else {
            iA = a.a(biometricManager3);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            String[] stringArray = context.getResources().getStringArray(R.array.assume_strong_biometrics_models);
            int length = stringArray.length;
            for (int i5 = i2; i5 < length; i5++) {
                if (!str.equals(stringArray[i5])) {
                }
            }
            if (iA == 0) {
                keyguardManagerA = jpp.a(cVar2.a);
                if (keyguardManagerA == null) {
                    r0 = i2;
                } else {
                    zB = jpp.b(keyguardManagerA);
                }
                if (r0 == 0) {
                    r0 = zB;
                    iB = b();
                } else {
                    r0 = zB;
                    if (b() == 0) {
                        iB = i2;
                    } else {
                        iB = i3;
                    }
                }
                return iB;
            }
        } else if (iA == 0) {
            keyguardManagerA = jpp.a(cVar2.a);
            if (keyguardManagerA == null) {
                r0 = i2;
            } else {
                zB = jpp.b(keyguardManagerA);
            }
            if (r0 == 0) {
                r0 = zB;
                iB = b();
            } else {
                r0 = zB;
                if (b() == 0) {
                    iB = i2;
                } else {
                    iB = i3;
                }
            }
            return iB;
        }
        return iA;
    }

    public final int b() {
        doh dohVar = this.c;
        if (dohVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = dohVar.a;
        FingerprintManager fingerprintManagerC = doh.a.c(context);
        if (fingerprintManagerC == null || !doh.a.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = doh.a.c(context);
        return (fingerprintManagerC2 == null || !doh.a.d(fingerprintManagerC2)) ? 11 : 0;
    }
}
