package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4557v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f64310a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f64310a;
    }

    public C4557v8 a(String str, Object obj) {
        if (obj != null) {
            this.f64310a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
