package com.bytedance.sdk.openadsdk.kub;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface vy {
    JSONObject hu();

    String hv();

    HandlerThread hww(String str, int i10);

    ExecutorService hww();

    JSONObject hww(JSONObject jSONObject);

    String sd();

    Context tq();

    Map<String, String> vgm();

    Handler vy();
}
