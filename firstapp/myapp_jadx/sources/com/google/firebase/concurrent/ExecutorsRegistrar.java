package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bb30;
import defpackage.gug;
import defpackage.hld;
import defpackage.hug;
import defpackage.is1;
import defpackage.iug;
import defpackage.jug;
import defpackage.kn8;
import defpackage.kug;
import defpackage.lug;
import defpackage.mug;
import defpackage.nug;
import defpackage.tmy;
import defpackage.ubs;
import defpackage.utr;
import defpackage.vf4;
import defpackage.wch0;
import defpackage.wjc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final utr<ScheduledExecutorService> a = new utr<>(new gug());
    public static final utr<ScheduledExecutorService> b = new utr<>(new hug());
    public static final utr<ScheduledExecutorService> c = new utr<>(new iug());
    public static final utr<ScheduledExecutorService> d = new utr<>(new jug());

    public static hld a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new hld(Executors.newFixedThreadPool(4, new wjc("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<kn8<?>> getComponents() {
        bb30 bb30Var = new bb30(is1.class, ScheduledExecutorService.class);
        bb30[] bb30VarArr = {new bb30(is1.class, ExecutorService.class), new bb30(is1.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(bb30Var);
        for (int i = 0; i < 2; i++) {
            tmy.a(bb30VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, bb30VarArr);
        kn8 kn8Var = new kn8(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new kug(), hashSet3);
        bb30 bb30Var2 = new bb30(vf4.class, ScheduledExecutorService.class);
        bb30[] bb30VarArr2 = {new bb30(vf4.class, ExecutorService.class), new bb30(vf4.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(bb30Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            tmy.a(bb30VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, bb30VarArr2);
        kn8 kn8Var2 = new kn8(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new lug(), hashSet6);
        bb30 bb30Var3 = new bb30(ubs.class, ScheduledExecutorService.class);
        bb30[] bb30VarArr3 = {new bb30(ubs.class, ExecutorService.class), new bb30(ubs.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(bb30Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            tmy.a(bb30VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, bb30VarArr3);
        kn8 kn8Var3 = new kn8(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new mug(), hashSet9);
        kn8.a aVarA = kn8.a(new bb30(wch0.class, Executor.class));
        aVarA.f = new nug();
        return Arrays.asList(kn8Var, kn8Var2, kn8Var3, aVarA.b());
    }
}
