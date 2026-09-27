package com.mbridge.msdk.config.component.wei.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;
import s7.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f65758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f65759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f65760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f65761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f65762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f65763i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f65758d = str;
    }

    public void b(String str) {
        this.f65757c = str;
    }

    public String c() {
        return this.f65762h;
    }

    public void d(String str) {
        this.f65755a = str;
    }

    public void e(String str) {
        this.f65759e = str;
    }

    public String f() {
        return this.f65756b;
    }

    public String g() {
        return this.f65755a;
    }

    public String h() {
        return this.f65759e;
    }

    public boolean i() {
        return this.f65761g;
    }

    public AdSession a() {
        return this.f65760f;
    }

    public String b() {
        return this.f65758d;
    }

    public void c(String str) {
        this.f65756b = str;
    }

    public String d() {
        return this.f65757c;
    }

    public List<Map<String, Object>> e() {
        return this.f65763i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f65763i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get(c.a("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(d.f129681l) && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                d(strValueOf);
            }
            Object obj2 = map.get(c.a("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.a("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.a("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
