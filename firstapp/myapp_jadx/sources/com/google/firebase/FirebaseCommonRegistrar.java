package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bb30;
import defpackage.boh0;
import defpackage.bph;
import defpackage.cph;
import defpackage.csp;
import defpackage.do8;
import defpackage.dph;
import defpackage.eph;
import defpackage.is1;
import defpackage.jil;
import defpackage.kil;
import defpackage.kn8;
import defpackage.lil;
import defpackage.o9s;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.vid;
import defpackage.yoh;
import defpackage.zcd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<kn8<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        kn8.a aVarB = kn8.b(boh0.class);
        aVarB.a(new rmd(2, 0, o9s.class));
        aVarB.f = new vid();
        arrayList.add(aVarB.b());
        final bb30 bb30Var = new bb30(is1.class, Executor.class);
        kn8.a aVar = new kn8.a(zcd.class, kil.class, lil.class);
        aVar.a(rmd.c(Context.class));
        aVar.a(rmd.c(yoh.class));
        aVar.a(new rmd(2, 0, jil.class));
        aVar.a(new rmd(1, 1, boh0.class));
        aVar.a(new rmd((bb30<?>) bb30Var, 1, 0));
        aVar.f = new do8() { // from class: xcd
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return new zcd((Context) hi50Var.a(Context.class), ((yoh) hi50Var.a(yoh.class)).d(), hi50Var.e(bb30.a(jil.class)), hi50Var.f(boh0.class), (Executor) hi50Var.d(bb30Var));
            }
        };
        arrayList.add(aVar.b());
        arrayList.add(q9s.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(q9s.a("fire-core", "22.0.0"));
        arrayList.add(q9s.a("device-name", a(Build.PRODUCT)));
        arrayList.add(q9s.a("device-model", a(Build.DEVICE)));
        arrayList.add(q9s.a("device-brand", a(Build.BRAND)));
        arrayList.add(q9s.b("android-target-sdk", new bph()));
        arrayList.add(q9s.b("android-min-sdk", new cph()));
        arrayList.add(q9s.b("android-platform", new dph()));
        arrayList.add(q9s.b("android-installer", new eph()));
        try {
            csp.c.getClass();
            str = "2.4.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(q9s.a("kotlin", str));
        }
        return arrayList;
    }
}
