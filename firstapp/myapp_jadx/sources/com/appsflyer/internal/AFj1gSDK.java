package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import defpackage.zi50;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1gSDK implements AFj1jSDK {
    @Override // com.appsflyer.internal.AFj1jSDK
    public final String getRevenue() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            bVar = (String) obj;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = "";
        }
        return (String) bVar;
    }
}
