package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class v41 {
    public BiometricPrompt$AuthenticationCallback a;
    public u41 b;
    public final vd4.a c;

    public static class b {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public static class c {
        public void a(int i, CharSequence charSequence) {
            throw null;
        }

        public void b(qd4.b bVar) {
            throw null;
        }
    }

    public v41(vd4.a aVar) {
        this.c = aVar;
    }

    public static class a {
        public static BiometricPrompt$AuthenticationCallback a(c cVar) {
            return new C1201a(cVar);
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }

        /* JADX INFO: renamed from: v41$a$a, reason: collision with other inner class name */
        public class C1201a extends BiometricPrompt$AuthenticationCallback {
            public final /* synthetic */ c a;

            public C1201a(c cVar) {
                this.a = cVar;
            }

            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.a.a(i, charSequence);
            }

            public void onAuthenticationFailed() {
                WeakReference<vd4> weakReference = ((vd4.a) this.a).a;
                if (weakReference.get() == null || !weakReference.get().z) {
                    return;
                }
                vd4 vd4Var = weakReference.get();
                ssw<Boolean> sswVar = vd4Var.H;
                if (sswVar == null) {
                    sswVar = new ssw<>();
                    vd4Var.H = sswVar;
                }
                vd4.A1(sswVar, Boolean.TRUE);
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject cryptoObjectB;
                PresentationSession presentationSessionB;
                IdentityCredential identityCredentialB;
                qd4.c cVar = null;
                if (authenticationResult != null && (cryptoObjectB = a.b(authenticationResult)) != null) {
                    Cipher cipherD = w3c.b.d(cryptoObjectB);
                    if (cipherD != null) {
                        cVar = new qd4.c(cipherD);
                    } else {
                        Signature signatureF = w3c.b.f(cryptoObjectB);
                        if (signatureF != null) {
                            cVar = new qd4.c(signatureF);
                        } else {
                            Mac macE = w3c.b.e(cryptoObjectB);
                            if (macE != null) {
                                cVar = new qd4.c(macE);
                            } else {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 30 && (identityCredentialB = w3c.c.b(cryptoObjectB)) != null) {
                                    cVar = new qd4.c(identityCredentialB);
                                } else if (i >= 33 && (presentationSessionB = w3c.d.b(cryptoObjectB)) != null) {
                                    cVar = new qd4.c(presentationSessionB);
                                }
                            }
                        }
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i2 >= 30) {
                    if (authenticationResult != null) {
                        iA = b.a(authenticationResult);
                    }
                } else if (i2 != 29) {
                    iA = 2;
                }
                this.a.b(new qd4.b(cVar, iA));
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }
        }
    }
}
