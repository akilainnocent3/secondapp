package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0491b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f52722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f52723b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f52723b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0491b
    @h1
    public JSONObject a() {
        return this.f52722a;
    }

    public void b() {
        this.f52723b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0491b
    @h1
    public void a(JSONObject jSONObject) {
        this.f52722a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52723b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52723b.b(new e(this, hashSet, jSONObject, j10));
    }
}
