package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class ah {
    private static z a;

    public static synchronized z a(Context context) {
        z zVarB;
        zVarB = a;
        if (zVarB == null) {
            y yVar = new y(null);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            yVar.a(context);
            zVarB = yVar.b();
            a = zVarB;
        }
        return zVarB;
    }
}
