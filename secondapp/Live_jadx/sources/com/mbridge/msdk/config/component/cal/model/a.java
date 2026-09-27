package com.mbridge.msdk.config.component.cal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import fw.b;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f65086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f65087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f65088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f65090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f65091h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj != null) {
                this.f65084a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("106"));
            if (obj2 != null) {
                this.f65085b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.a("103"));
            if (obj3 instanceof Map) {
                this.f65086c = (Map) obj3;
            }
            Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_IO_ERROR));
            if (obj4 != null) {
                this.f65087d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.a("102"));
            if (obj5 != null) {
                this.f65088e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.a("104"));
            if (obj6 instanceof String) {
                this.f65089f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f65089f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.a("115"));
            if (obj7 instanceof String) {
                this.f65090g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get(c.a("init_status")));
            if (strValueOf.equalsIgnoreCase(b.f85379f)) {
                a(1);
            } else {
                a(Integer.parseInt(strValueOf));
            }
        }
    }

    public String b() {
        return this.f65084a;
    }

    public String c() {
        return this.f65088e;
    }

    public int d() {
        return this.f65091h;
    }

    public int e() {
        return this.f65089f;
    }

    public Map<String, Object> f() {
        return this.f65086c;
    }

    public String g() {
        return this.f65085b;
    }

    public String a() {
        return this.f65090g;
    }

    public void a(int i10) {
        this.f65091h = i10;
    }
}
