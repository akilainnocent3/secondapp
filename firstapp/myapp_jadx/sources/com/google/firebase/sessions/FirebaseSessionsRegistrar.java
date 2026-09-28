package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ao8;
import defpackage.bb30;
import defpackage.bx20;
import defpackage.cmc;
import defpackage.d750;
import defpackage.dg80;
import defpackage.e750;
import defpackage.epg;
import defpackage.fh80;
import defpackage.gze;
import defpackage.hsh;
import defpackage.ih80;
import defpackage.is1;
import defpackage.k5b;
import defpackage.k730;
import defpackage.kj80;
import defpackage.kn8;
import defpackage.msh;
import defpackage.n730;
import defpackage.nsh;
import defpackage.og80;
import defpackage.osh;
import defpackage.psh;
import defpackage.pug0;
import defpackage.q9s;
import defpackage.qdt;
import defpackage.qg80;
import defpackage.qsh;
import defpackage.rmd;
import defpackage.rsh;
import defpackage.sph;
import defpackage.ush;
import defpackage.vf4;
import defpackage.vsh;
import defpackage.wnn;
import defpackage.wsh;
import defpackage.x390;
import defpackage.xsh0;
import defpackage.y390;
import defpackage.yoh;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lkn8;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();
    private static final bb30<Context> appContext = bb30.a(Context.class);
    private static final bb30<yoh> firebaseApp = bb30.a(yoh.class);
    private static final bb30<sph> firebaseInstallationsApi = bb30.a(sph.class);
    private static final bb30<k5b> backgroundDispatcher = new bb30<>(is1.class, k5b.class);
    private static final bb30<k5b> blockingDispatcher = new bb30<>(vf4.class, k5b.class);
    private static final bb30<pug0> transportFactory = bb30.a(pug0.class);
    private static final bb30<msh> firebaseSessionsComponent = bb30.a(msh.class);

    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hsh getComponents$lambda$0(ao8 ao8Var) {
        return ((msh) ao8Var.d(firebaseSessionsComponent)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final msh getComponents$lambda$1(ao8 ao8Var) {
        Object objD = ao8Var.d(appContext);
        objD.getClass();
        Object objD2 = ao8Var.d(backgroundDispatcher);
        objD2.getClass();
        Object objD3 = ao8Var.d(blockingDispatcher);
        objD3.getClass();
        Object objD4 = ao8Var.d(firebaseApp);
        objD4.getClass();
        Object objD5 = ao8Var.d(firebaseInstallationsApi);
        objD5.getClass();
        n730 n730VarC = ao8Var.c(transportFactory);
        n730VarC.getClass();
        cmc cmcVar = new cmc();
        cmcVar.a = wnn.a((yoh) objD4);
        wnn wnnVarA = wnn.a((Context) objD);
        cmcVar.b = wnnVarA;
        cmcVar.c = gze.a(new qdt(wnnVarA));
        cmcVar.d = gze.a(qsh.a.a);
        cmcVar.e = wnn.a((sph) objD5);
        cmcVar.f = gze.a(new nsh(cmcVar.a));
        wnn wnnVarA2 = wnn.a((CoroutineContext) objD3);
        cmcVar.g = wnnVarA2;
        cmcVar.h = gze.a(new d750(wnnVarA2, cmcVar.f));
        cmcVar.i = wnn.a((CoroutineContext) objD2);
        cmcVar.j = gze.a(new ih80(cmcVar.c, gze.a(new e750(cmcVar.d, cmcVar.e, cmcVar.f, cmcVar.h, gze.a(new kj80(cmcVar.i, cmcVar.d, gze.a(new osh(cmcVar.b, cmcVar.g))))))));
        k730<xsh0> k730VarA = gze.a(rsh.a.a);
        cmcVar.k = k730VarA;
        cmcVar.l = gze.a(new qg80(cmcVar.d, k730VarA));
        cmcVar.m = gze.a(new og80(cmcVar.a, cmcVar.e, cmcVar.j, gze.a(new epg(wnn.a(n730VarC))), cmcVar.i));
        cmcVar.n = gze.a(new psh(cmcVar.b, cmcVar.g, gze.a(new dg80(cmcVar.l))));
        k730<x390> k730VarA2 = gze.a(new y390(cmcVar.j, cmcVar.l, cmcVar.m, cmcVar.d, cmcVar.n, gze.a(new bx20(cmcVar.b, cmcVar.k)), cmcVar.i));
        cmcVar.o = k730VarA2;
        cmcVar.p = gze.a(new wsh(cmcVar.a, cmcVar.j, cmcVar.i, gze.a(new fh80(k730VarA2))));
        return cmcVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<? extends Object>> getComponents() {
        kn8.a aVarB = kn8.b(hsh.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.b(firebaseSessionsComponent));
        aVarB.f = new ush();
        aVarB.c(2);
        kn8 kn8VarB = aVarB.b();
        kn8.a aVarB2 = kn8.b(msh.class);
        aVarB2.a = "fire-sessions-component";
        aVarB2.a(rmd.b(appContext));
        aVarB2.a(rmd.b(backgroundDispatcher));
        aVarB2.a(rmd.b(blockingDispatcher));
        aVarB2.a(rmd.b(firebaseApp));
        aVarB2.a(rmd.b(firebaseInstallationsApi));
        aVarB2.a(new rmd(transportFactory, 1, 1));
        aVarB2.f = new vsh();
        return b.k(kn8VarB, aVarB2.b(), q9s.a(LIBRARY_NAME, "3.0.1"));
    }
}
