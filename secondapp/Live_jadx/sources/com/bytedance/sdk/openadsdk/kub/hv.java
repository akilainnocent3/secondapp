package com.bytedance.sdk.openadsdk.kub;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import fw.b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements vy {
    Handler hww = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private vy f37453tq;

    public hv(vy vyVar) {
        this.f37453tq = vyVar;
    }

    private Context ok() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public JSONObject hu() {
        vy vyVar = this.f37453tq;
        if (vyVar != null) {
            return vyVar.hu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public String hv() {
        vy vyVar = this.f37453tq;
        if (vyVar != null) {
            return vyVar.hv();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public ExecutorService hww() {
        vy vyVar = this.f37453tq;
        return (vyVar == null || vyVar.hww() == null) ? Executors.newCachedThreadPool() : this.f37453tq.hww();
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public String sd() {
        vy vyVar = this.f37453tq;
        return (vyVar == null || TextUtils.isEmpty(vyVar.sd())) ? b.f85379f : this.f37453tq.sd();
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public Context tq() {
        vy vyVar = this.f37453tq;
        return (vyVar == null || vyVar.tq() == null) ? ok() : this.f37453tq.tq();
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public Map<String, String> vgm() {
        vy vyVar = this.f37453tq;
        return (vyVar == null || vyVar.vgm() == null) ? new HashMap() : this.f37453tq.vgm();
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public Handler vy() {
        vy vyVar = this.f37453tq;
        if (vyVar != null && vyVar.vgm() != null) {
            return this.f37453tq.vy();
        }
        Handler handler = new Handler(hww("pag_strategy", -1).getLooper());
        this.hww = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public JSONObject hww(JSONObject jSONObject) {
        vy vyVar = this.f37453tq;
        return vyVar != null ? vyVar.hww(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.kub.vy
    public HandlerThread hww(String str, int i10) {
        HandlerThread handlerThreadHww;
        vy vyVar = this.f37453tq;
        if (vyVar != null && (handlerThreadHww = vyVar.hww(str, i10)) != null) {
            return handlerThreadHww;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
