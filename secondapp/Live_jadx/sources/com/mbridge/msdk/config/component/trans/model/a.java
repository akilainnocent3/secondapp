package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65717a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.a("118"))) == null) {
            return;
        }
        a(String.valueOf(obj).replace("'", ""));
    }

    public String a() {
        return this.f65717a;
    }

    public void a(String str) {
        this.f65717a = str;
    }
}
