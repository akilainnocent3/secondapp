package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.jpb.tq;
import com.bytedance.sdk.openadsdk.jpb.tq.hww;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class BusMonitorDependWrapper implements tq {
    private tq hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Handler f35167tq;

    public BusMonitorDependWrapper(tq tqVar) {
        this.hww = tqVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public Context getContext() {
        tq tqVar = this.hww;
        return (tqVar == null || tqVar.getContext() == null) ? getReflectContext() : this.hww.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public Handler getHandler() {
        tq tqVar = this.hww;
        if (tqVar != null && tqVar.getHandler() != null) {
            return this.hww.getHandler();
        }
        if (this.f35167tq == null) {
            this.f35167tq = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.f35167tq;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public int getOnceLogCount() {
        tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public int getOnceLogInterval() {
        tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        tq tqVar = this.hww;
        if (tqVar != null && (safeHandlerThread = tqVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        tq tqVar = this.hww;
        if (tqVar == null || (uploadIntervalTime = tqVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public boolean isMonitorOpen() {
        tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.tq
    public void onMonitorUpload(List<hww> list) {
        tq tqVar = this.hww;
        if (tqVar != null) {
            tqVar.onMonitorUpload(list);
        }
    }
}
