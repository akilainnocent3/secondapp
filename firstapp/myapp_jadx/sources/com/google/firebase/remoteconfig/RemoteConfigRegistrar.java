package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import defpackage.ao8;
import defpackage.bb30;
import defpackage.d650;
import defpackage.do8;
import defpackage.hoh;
import defpackage.i5;
import defpackage.kn8;
import defpackage.nrh;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.sph;
import defpackage.vf4;
import defpackage.yoh;
import defpackage.yz;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static d650 lambda$getComponents$0(bb30 bb30Var, ao8 ao8Var) {
        hoh hohVar;
        Context context = (Context) ao8Var.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ao8Var.d(bb30Var);
        yoh yohVar = (yoh) ao8Var.a(yoh.class);
        sph sphVar = (sph) ao8Var.a(sph.class);
        i5 i5Var = (i5) ao8Var.a(i5.class);
        synchronized (i5Var) {
            try {
                if (!i5Var.a.containsKey("frc")) {
                    i5Var.a.put("frc", new hoh(i5Var.b));
                }
                hohVar = (hoh) i5Var.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new d650(context, scheduledExecutorService, yohVar, sphVar, hohVar, ao8Var.f(yz.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        final bb30 bb30Var = new bb30(vf4.class, ScheduledExecutorService.class);
        kn8.a aVar = new kn8.a(d650.class, nrh.class);
        aVar.a = LIBRARY_NAME;
        aVar.a(rmd.c(Context.class));
        aVar.a(new rmd((bb30<?>) bb30Var, 1, 0));
        aVar.a(rmd.c(yoh.class));
        aVar.a(rmd.c(sph.class));
        aVar.a(rmd.c(i5.class));
        aVar.a(rmd.a(yz.class));
        aVar.f = new do8() { // from class: j650
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return RemoteConfigRegistrar.lambda$getComponents$0(bb30Var, hi50Var);
            }
        };
        aVar.c(2);
        return Arrays.asList(aVar.b(), q9s.a(LIBRARY_NAME, "23.0.0"));
    }
}
