package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f65706h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f65707i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f65708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f65709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f65710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f65711m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f65712a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f65713b;

        public a(boolean z10) {
            this.f65713b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strA = c.a("triggered_count");
            int i10 = this.f65712a;
            this.f65712a = i10 + 1;
            map.put(strA, Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f65713b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f65706h.get(timeCpt2.f65708j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f65709k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.a("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.a("110"));
                if (obj2 instanceof String) {
                    return this.f65708j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f65068f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.a("110"));
        if (obj != null) {
            this.f65708j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.a("152"));
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f65709k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get(c.a("153"));
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f65710l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.f65711m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f65706h.containsKey(this.f65708j)) {
            handler = (Handler) this.f65706h.get(this.f65708j);
        } else {
            handler = new Handler();
            this.f65706h.put(this.f65708j, handler);
        }
        if (this.f65707i.containsKey(this.f65708j)) {
            aVar = (Runnable) this.f65707i.get(this.f65708j);
        } else {
            aVar = new a(this.f65710l == 1);
            this.f65707i.put(this.f65708j, aVar);
        }
        if (handler == null || aVar == null) {
            return;
        }
        if (c.a("310").equals(this.f65711m) || c.a("335").equals(this.f65711m)) {
            handler.postDelayed(aVar, this.f65709k);
            return;
        }
        if (c.a("311").equals(this.f65711m)) {
            handler.removeCallbacks(aVar);
            this.f65706h.remove(this.f65708j);
        } else if (c.a("316").equals(this.f65711m)) {
            handler.removeCallbacks(aVar);
        }
    }
}
