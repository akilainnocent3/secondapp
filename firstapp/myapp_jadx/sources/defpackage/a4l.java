package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class a4l {
    public final yoh a;
    public final vov b;
    public final g160 c;
    public final n730<boh0> d;
    public final n730<lil> e;
    public final sph f;

    public a4l(yoh yohVar, vov vovVar, n730<boh0> n730Var, n730<lil> n730Var2, sph sphVar) {
        yohVar.a();
        g160 g160Var = new g160(yohVar.a);
        this.a = yohVar;
        this.b = vovVar;
        this.c = g160Var;
        this.d = n730Var;
        this.e = n730Var2;
        this.f = sphVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new liv(), new z3l());
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        int iB;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        yoh yohVar = this.a;
        yohVar.a();
        bundle.putString("gmp_app_id", yohVar.c.b);
        vov vovVar = this.b;
        synchronized (vovVar) {
            try {
                if (vovVar.d == 0 && (packageInfoC = vovVar.c("com.google.android.gms")) != null) {
                    vovVar.d = packageInfoC.versionCode;
                }
                i = vovVar.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        vov vovVar2 = this.b;
        synchronized (vovVar2) {
            try {
                if (vovVar2.c == null) {
                    vovVar2.e();
                }
                str3 = vovVar2.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        yoh yohVar2 = this.a;
        yohVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(yohVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((snn) Tasks.await(this.f.getToken())).a();
            if (TextUtils.isEmpty(strA)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f.getId()));
        bundle.putString("cliv", "fcm-25.0.0");
        lil lilVar = this.e.get();
        boh0 boh0Var = this.d.get();
        if (lilVar == null || boh0Var == null || (iB = lilVar.b()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(pjh.b(iB)));
        bundle.putString("Firebase-Client", boh0Var.a());
    }

    public final Task<Bundle> c(String str, String str2, final Bundle bundle) {
        int i;
        try {
            b(str, str2, bundle);
            final g160 g160Var = this.c;
            xtl0 xtl0Var = xtl0.a;
            otl0 otl0Var = g160Var.c;
            if (otl0Var.a() < 12000000) {
                return otl0Var.b() != 0 ? g160Var.a(bundle).continueWithTask(xtl0Var, new Continuation() { // from class: jul0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Bundle bundle2;
                        g160 g160Var2 = g160Var;
                        g160Var2.getClass();
                        return (task.isSuccessful() && (bundle2 = (Bundle) task.getResult()) != null && bundle2.containsKey("google.messenger")) ? g160Var2.a(bundle).onSuccessTask(xtl0.a, ptl0.a) : task;
                    }
                }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            zsl0 zsl0VarA = zsl0.a(g160Var.b);
            synchronized (zsl0VarA) {
                i = zsl0VarA.d;
                zsl0VarA.d = i + 1;
            }
            return zsl0VarA.b(new ysl0(i, 1, bundle)).continueWith(xtl0Var, tmk0.a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
