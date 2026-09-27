package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d3 {
    public abstract void a(za zaVar);

    public final boolean a(Context context, String[] strArr, ya yaVar, Bundle bundle) {
        Class clsAsSubclass;
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (String str : strArr) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(za.class);
            } catch (Throwable unused) {
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(Context.class, ya.class, Bundle.class);
                    declaredConstructor.setAccessible(true);
                    Context contextA = w0.a(context);
                    if (contextA == null) {
                        contextA = context;
                    }
                    a((za) declaredConstructor.newInstance(contextA, yaVar, bundle));
                    z10 = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z10;
    }
}
