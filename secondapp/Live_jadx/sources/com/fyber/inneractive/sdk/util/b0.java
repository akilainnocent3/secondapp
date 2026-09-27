package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f47849a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f47851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f47852d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (b0Var) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.f47850b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.f47850b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.f47850b), Integer.valueOf(b0Var.f47849a.size()));
            for (a0 a0Var : b0Var.f47849a) {
                boolean z10 = b0Var.f47850b;
                com.fyber.inneractive.sdk.renderers.l lVar = (com.fyber.inneractive.sdk.renderers.l) a0Var;
                lVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(lVar), Boolean.valueOf(z10));
                if (z10) {
                    lVar.c(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = lVar.f47677y;
                    if (dVar != null && dVar.f47651g) {
                        dVar.f47651g = false;
                        r.f47892b.removeCallbacks(dVar.f47654j);
                    }
                } else {
                    lVar.O();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = lVar.f47677y;
                    if (dVar2 != null && !dVar2.f47652h && !dVar2.f47651g && dVar2.f47650f != 0) {
                        dVar2.f47650f = 0L;
                        dVar2.f47651g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
