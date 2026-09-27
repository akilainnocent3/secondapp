package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f65770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f65773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f65774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f65775f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("145"));
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("147"));
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("148"));
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.a("193"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.a("146"));
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f65770a;
    }

    public String c() {
        return this.f65772c;
    }

    public String d() {
        return this.f65773d;
    }

    public String e() {
        return this.f65771b;
    }

    public void b(String str) {
        this.f65775f = str;
    }

    public void c(String str) {
        this.f65772c = str;
    }

    public void d(String str) {
        this.f65773d = str;
    }

    public void e(String str) {
        this.f65771b = str;
    }

    public void a(Context context) {
        this.f65770a = context;
    }

    public String a() {
        return this.f65774e;
    }

    public void a(String str) {
        this.f65774e = str;
    }
}
