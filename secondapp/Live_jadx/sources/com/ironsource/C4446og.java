package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4446og {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63230b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63231c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f63229a = new a();

    /* JADX INFO: renamed from: com.ironsource.og$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C4346j8.f62121k, Boolean.valueOf(C4446og.this.f63230b == 0));
            put(C4346j8.f62122l, Boolean.valueOf(C4446og.this.f63231c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4346j8.f62123m, bool);
            put(C4346j8.f62124n, bool);
        }
    }

    public void a(String str, int i10, boolean z10) {
        boolean z11 = false;
        if (this.f63229a.containsKey(str)) {
            this.f63229a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f63229a.put(C4346j8.f62123m, Boolean.valueOf(z10));
        if ((this.f63229a.get(C4346j8.f62122l).booleanValue() || this.f63229a.get(C4346j8.f62121k).booleanValue()) && this.f63229a.get(C4346j8.f62123m).booleanValue()) {
            z11 = true;
        }
        this.f63229a.put(C4346j8.f62124n, Boolean.valueOf(z11));
    }

    public JSONObject a() {
        return new JSONObject(this.f63229a);
    }
}
