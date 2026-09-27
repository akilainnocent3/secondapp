package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import dr.w2;
import java.util.concurrent.Executor;
import k.h1;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ThreadUtil {

    @l
    public static final ThreadUtil INSTANCE = new ThreadUtil();

    @l
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    @m
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m3244runOnUiThread$lambda0(ds.a tmp0) {
        m0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m3245runOnUiThread$lambda1(ds.a tmp0) {
        m0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @m
    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(@l final ds.a<w2> block) {
        m0.p(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m3245runOnUiThread$lambda1(block);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m3244runOnUiThread$lambda0(block);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(@m Executor executor) {
        uiExecutor = executor;
    }

    @h1
    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
