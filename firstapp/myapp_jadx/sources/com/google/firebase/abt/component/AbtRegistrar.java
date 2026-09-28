package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ao8;
import defpackage.i5;
import defpackage.kn8;
import defpackage.l5;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.yz;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i5 lambda$getComponents$0(ao8 ao8Var) {
        return new i5((Context) ao8Var.a(Context.class), ao8Var.f(yz.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        kn8.a aVarB = kn8.b(i5.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.c(Context.class));
        aVarB.a(rmd.a(yz.class));
        aVarB.f = new l5();
        return Arrays.asList(aVarB.b(), q9s.a(LIBRARY_NAME, "21.1.1"));
    }
}
