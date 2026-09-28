package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class coh extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ u41 a;

    public coh(u41 u41Var) {
        this.a = u41Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a.c.a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference<vd4> weakReference = this.a.a.c.a;
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

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference<vd4> weakReference = this.a.a.c.a;
        if (weakReference.get() != null) {
            vd4 vd4Var = weakReference.get();
            ssw<CharSequence> sswVar = vd4Var.G;
            if (sswVar == null) {
                sswVar = new ssw<>();
                vd4Var.G = sswVar;
            }
            vd4.A1(sswVar, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        u41 u41Var = this.a;
        doh.c cVarF = doh.a.f(doh.a.b(authenticationResult));
        qd4.c cVar = null;
        if (cVarF != null) {
            Cipher cipher = cVarF.b;
            if (cipher != null) {
                cVar = new qd4.c(cipher);
            } else {
                Signature signature = cVarF.a;
                if (signature != null) {
                    cVar = new qd4.c(signature);
                } else {
                    Mac mac = cVarF.c;
                    if (mac != null) {
                        cVar = new qd4.c(mac);
                    }
                }
            }
        }
        u41Var.a.c.b(new qd4.b(cVar, 2));
    }
}
