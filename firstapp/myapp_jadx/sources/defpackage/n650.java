package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n650<T> {
    public sik0 a;

    public static class a extends Exception {
    }

    public abstract sik0 a(IBinder iBinder);

    /* JADX WARN: Type inference failed for: r3v11, types: [T, sik0] */
    public final T b(Context context) throws a {
        Context contextCreatePackageContext;
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        hm20.h(context);
        AtomicBoolean atomicBoolean = m5l.a;
        try {
            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            contextCreatePackageContext = null;
        }
        if (contextCreatePackageContext == null) {
            throw new a("Could not get remote context.");
        }
        try {
            ?? r3 = (T) a((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            this.a = r3;
            return r3;
        } catch (ClassNotFoundException e) {
            throw new a("Could not load creator class.", e);
        } catch (IllegalAccessException e2) {
            throw new a("Could not access creator.", e2);
        } catch (InstantiationException e3) {
            throw new a("Could not instantiate creator.", e3);
        }
    }
}
