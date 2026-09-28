package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ao8;
import defpackage.bb30;
import defpackage.is1;
import defpackage.jil;
import defpackage.ki3;
import defpackage.kil;
import defpackage.kn8;
import defpackage.nd80;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.rph;
import defpackage.sph;
import defpackage.uph;
import defpackage.vf4;
import defpackage.w53;
import defpackage.yoh;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static sph lambda$getComponents$0(ao8 ao8Var) {
        return new rph((yoh) ao8Var.a(yoh.class), ao8Var.f(kil.class), (ExecutorService) ao8Var.d(new bb30(is1.class, ExecutorService.class)), new nd80((Executor) ao8Var.d(new bb30(vf4.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        kn8.a aVarB = kn8.b(sph.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.c(yoh.class));
        aVarB.a(rmd.a(kil.class));
        aVarB.a(new rmd((bb30<?>) new bb30(is1.class, ExecutorService.class), 1, 0));
        aVarB.a(new rmd((bb30<?>) new bb30(vf4.class, Executor.class), 1, 0));
        aVarB.f = new uph();
        kn8 kn8VarB = aVarB.b();
        w53 w53Var = new w53();
        kn8.a aVarB2 = kn8.b(jil.class);
        aVarB2.e = 1;
        aVarB2.f = new ki3(w53Var);
        return Arrays.asList(kn8VarB, aVarB2.b(), q9s.a(LIBRARY_NAME, "19.0.0"));
    }
}
