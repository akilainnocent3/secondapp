package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class bb {
    private static ac a;

    public static synchronized ac a(Context context, boolean z) {
        ac acVarB;
        acVarB = a;
        if (acVarB == null) {
            ab abVar = new ab(null);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            abVar.a(context);
            acVarB = abVar.b();
            a = acVarB;
        }
        return acVarB;
    }
}
