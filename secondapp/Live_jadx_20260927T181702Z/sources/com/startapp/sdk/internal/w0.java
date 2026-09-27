package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Application f75741a;

    public static Context a(Context context) {
        Context applicationContext = f75741a;
        if (applicationContext != null) {
            return applicationContext;
        }
        try {
            if (context instanceof Application) {
                try {
                    f75741a = (Application) context;
                } catch (Throwable unused) {
                }
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    applicationContext = a(baseContext);
                }
            } else if (context != null) {
                applicationContext = context.getApplicationContext();
            }
        } catch (Throwable unused2) {
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        Application application = f75741a;
        if (application == null) {
            synchronized (w0.class) {
                try {
                    application = f75741a;
                    if (application == null) {
                        try {
                            Method declaredMethod = Class.forName(Activity.class.getName().concat("Thread")).getDeclaredMethod("current".concat("Application"), null);
                            declaredMethod.setAccessible(true);
                            application = (Application) declaredMethod.invoke(null, null);
                        } catch (Throwable unused3) {
                        }
                        f75741a = application;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return application == null ? context : application;
    }
}
