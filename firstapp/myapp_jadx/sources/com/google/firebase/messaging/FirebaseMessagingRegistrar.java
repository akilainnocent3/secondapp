package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.aee0;
import defpackage.ao8;
import defpackage.bb30;
import defpackage.boh0;
import defpackage.do8;
import defpackage.kn8;
import defpackage.lil;
import defpackage.mug0;
import defpackage.pug0;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.sph;
import defpackage.vph;
import defpackage.yoh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(bb30 bb30Var, ao8 ao8Var) {
        return new FirebaseMessaging((yoh) ao8Var.a(yoh.class), (vph) ao8Var.a(vph.class), ao8Var.f(boh0.class), ao8Var.f(lil.class), (sph) ao8Var.a(sph.class), ao8Var.c(bb30Var), (aee0) ao8Var.a(aee0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        final bb30 bb30Var = new bb30(mug0.class, pug0.class);
        kn8.a aVarB = kn8.b(FirebaseMessaging.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.c(yoh.class));
        aVarB.a(new rmd(0, 0, vph.class));
        aVarB.a(rmd.a(boh0.class));
        aVarB.a(rmd.a(lil.class));
        aVarB.a(rmd.c(sph.class));
        aVarB.a(new rmd((bb30<?>) bb30Var, 0, 1));
        aVarB.a(rmd.c(aee0.class));
        aVarB.f = new do8() { // from class: gqh
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(bb30Var, hi50Var);
            }
        };
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), q9s.a(LIBRARY_NAME, "25.0.0"));
    }
}
