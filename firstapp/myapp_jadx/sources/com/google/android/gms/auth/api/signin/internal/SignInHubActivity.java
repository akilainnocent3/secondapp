package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import defpackage.esa0;
import defpackage.fsa0;
import defpackage.hkk0;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.klk0;
import defpackage.pxs;
import defpackage.qxs;
import defpackage.x4l;
import defpackage.zkk0;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends e {
    public static boolean f;
    public boolean a = false;
    public SignInConfiguration b;
    public boolean c;
    public int d;
    public Intent e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.a) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                zkk0 zkk0VarA = zkk0.a(this);
                GoogleSignInOptions googleSignInOptions = this.b.b;
                synchronized (zkk0VarA) {
                    zkk0VarA.a.c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.c = true;
                this.d = i2;
                this.e = intent;
                u1();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                v1(intExtra);
                return;
            }
        }
        v1(8);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            v1(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            v1(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.b = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.c = z;
            if (z) {
                this.d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.e = intent2;
                    u1();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f) {
            setResult(0);
            v1(12502);
            return;
        }
        f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            v1(17);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f = false;
    }

    public final void u1() {
        pxs supportLoaderManager = getSupportLoaderManager();
        klk0 klk0Var = new klk0(this);
        qxs qxsVar = (qxs) supportLoaderManager;
        ibs ibsVar = qxsVar.a;
        qxs.c cVar = qxsVar.b;
        boolean z = cVar.b;
        esa0<qxs.a> esa0Var = cVar.a;
        if (z) {
            ib5.a("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ib5.a("initLoader must be called on the main thread");
            return;
        }
        esa0Var.getClass();
        qxs.a aVar = (qxs.a) fsa0.a(esa0Var, 0);
        if (aVar == null) {
            try {
                cVar.b = true;
                Set set = x4l.a;
                synchronized (set) {
                }
                hkk0 hkk0Var = new hkk0(this, set);
                if (hkk0.class.isMemberClass() && !Modifier.isStatic(hkk0.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + hkk0Var);
                }
                qxs.a aVar2 = new qxs.a(hkk0Var);
                esa0Var.d(0, aVar2);
                cVar.b = false;
                qxs.b<D> bVar = new qxs.b<>(aVar2.l, klk0Var);
                aVar2.f(ibsVar, bVar);
                Object obj = aVar2.n;
                if (obj != null) {
                    aVar2.k(obj);
                }
                aVar2.m = ibsVar;
                aVar2.n = bVar;
            } catch (Throwable th) {
                cVar.b = false;
                throw th;
            }
        } else {
            qxs.b<D> bVar2 = new qxs.b<>(aVar.l, klk0Var);
            aVar.f(ibsVar, bVar2);
            Object obj2 = aVar.n;
            if (obj2 != null) {
                aVar.k(obj2);
            }
            aVar.m = ibsVar;
            aVar.n = bVar2;
        }
        f = false;
    }

    public final void v1(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f = false;
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.c);
        if (this.c) {
            bundle.putInt(YAzniTbXHYQ.JWwkDTdhZmIzTF, this.d);
            bundle.putParcelable("signInResultData", this.e);
        }
    }
}
