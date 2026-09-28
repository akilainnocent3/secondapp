package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class doh {
    public final Context a;

    public static class a {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, coh cohVar) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, cohVar, null);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static c f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new c(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new c(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new c(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(c cVar) {
            if (cVar == null) {
                return null;
            }
            Mac mac = cVar.c;
            Signature signature = cVar.a;
            Cipher cipher = cVar.b;
            if (cipher != null) {
                return new FingerprintManager.CryptoObject(cipher);
            }
            if (signature != null) {
                return new FingerprintManager.CryptoObject(signature);
            }
            if (mac != null) {
                return new FingerprintManager.CryptoObject(mac);
            }
            return null;
        }
    }

    public static abstract class b {
    }

    public doh(Context context) {
        this.a = context;
    }

    public static class c {
        public final Signature a;
        public final Cipher b;
        public final Mac c;

        public c(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public c(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public c(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }
}
