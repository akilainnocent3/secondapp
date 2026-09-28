package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a00;
import defpackage.aee0;
import defpackage.ao8;
import defpackage.dmk0;
import defpackage.hm20;
import defpackage.kn8;
import defpackage.p1l0;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.scg0;
import defpackage.urk0;
import defpackage.yoh;
import defpackage.yz;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static yz lambda$getComponents$0(ao8 ao8Var) {
        yoh yohVar = (yoh) ao8Var.a(yoh.class);
        Context context = (Context) ao8Var.a(Context.class);
        aee0 aee0Var = (aee0) ao8Var.a(aee0.class);
        hm20.h(yohVar);
        hm20.h(context);
        hm20.h(aee0Var);
        hm20.h(context.getApplicationContext());
        if (a00.c == null) {
            synchronized (a00.class) {
                try {
                    if (a00.c == null) {
                        Bundle bundle = new Bundle(1);
                        yohVar.a();
                        if ("[DEFAULT]".equals(yohVar.b)) {
                            aee0Var.b(urk0.a, dmk0.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", yohVar.g());
                        }
                        a00.c = new a00(p1l0.e(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a00.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        kn8.a aVarB = kn8.b(yz.class);
        aVarB.a(rmd.c(yoh.class));
        aVarB.a(rmd.c(Context.class));
        aVarB.a(rmd.c(aee0.class));
        aVarB.f = scg0.a;
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), q9s.a("fire-analytics", "23.0.0"));
    }
}
