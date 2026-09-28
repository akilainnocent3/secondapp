package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zkk0 {
    public static zkk0 b;
    public final k1e0 a;

    public zkk0(Context context) {
        String strD;
        k1e0 k1e0VarA = k1e0.a(context);
        this.a = k1e0VarA;
        k1e0VarA.b();
        String strD2 = k1e0VarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = k1e0VarA.d(k1e0.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.G0(strD);
        } catch (JSONException unused) {
        }
    }

    public static synchronized zkk0 a(Context context) {
        zkk0 zkk0Var;
        Context applicationContext = context.getApplicationContext();
        synchronized (zkk0.class) {
            zkk0Var = b;
            if (zkk0Var == null) {
                zkk0Var = new zkk0(applicationContext);
                b = zkk0Var;
            }
        }
        return zkk0Var;
        return zkk0Var;
    }

    public final synchronized void b() {
        k1e0 k1e0Var = this.a;
        ReentrantLock reentrantLock = k1e0Var.a;
        reentrantLock.lock();
        try {
            k1e0Var.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
