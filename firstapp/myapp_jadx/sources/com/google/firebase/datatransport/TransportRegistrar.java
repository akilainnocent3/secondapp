package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ao8;
import defpackage.bb30;
import defpackage.bm5;
import defpackage.bvg0;
import defpackage.cvg0;
import defpackage.dvg0;
import defpackage.jz80;
import defpackage.kn8;
import defpackage.mug0;
import defpackage.pug0;
import defpackage.q6s;
import defpackage.q9s;
import defpackage.rmd;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ pug0 lambda$getComponents$0(ao8 ao8Var) {
        dvg0.b((Context) ao8Var.a(Context.class));
        return dvg0.a().c(bm5.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ pug0 lambda$getComponents$1(ao8 ao8Var) {
        dvg0.b((Context) ao8Var.a(Context.class));
        return dvg0.a().c(bm5.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ pug0 lambda$getComponents$2(ao8 ao8Var) {
        dvg0.b((Context) ao8Var.a(Context.class));
        return dvg0.a().c(bm5.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        kn8.a aVarB = kn8.b(pug0.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.c(Context.class));
        aVarB.f = new bvg0();
        kn8 kn8VarB = aVarB.b();
        kn8.a aVarA = kn8.a(new bb30(q6s.class, pug0.class));
        aVarA.a(rmd.c(Context.class));
        aVarA.f = new cvg0();
        kn8 kn8VarB2 = aVarA.b();
        kn8.a aVarA2 = kn8.a(new bb30(mug0.class, pug0.class));
        aVarA2.a(rmd.c(Context.class));
        aVarA2.f = new jz80();
        return Arrays.asList(kn8VarB, kn8VarB2, aVarA2.b(), q9s.a(LIBRARY_NAME, "19.0.0"));
    }
}
