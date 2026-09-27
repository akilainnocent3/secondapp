package com.mbridge.msdk.config.component.load.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65520a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65522c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65525f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f65521b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65523d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65524e = 0;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("116"));
            if (obj != null) {
                this.f65520a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("191"));
            if (obj2 != null) {
                float f10 = Float.parseFloat(String.valueOf(obj2));
                if (f10 <= 0.0f || f10 > 1.0f) {
                    f10 = 1.0f;
                }
                this.f65521b = f10;
            }
            Object obj3 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                this.f65522c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.a("162"));
            if (obj4 != null) {
                int i10 = Integer.parseInt(String.valueOf(obj4));
                if (i10 == 0) {
                    i10 = 30;
                }
                this.f65523d = i10;
            }
            Object obj5 = map.get(c.a("174"));
            if (obj5 != null) {
                this.f65524e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get(c.a("192"));
            if (obj6 != null) {
                this.f65525f = Integer.parseInt(String.valueOf(obj6));
            }
        }
    }

    public float b() {
        return this.f65521b;
    }

    public int c() {
        return this.f65525f;
    }

    public String d() {
        return this.f65520a;
    }

    public int e() {
        return this.f65524e;
    }

    public int f() {
        return this.f65523d * 1000;
    }

    public String a() {
        return this.f65522c;
    }
}
