package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.vungle.walking.async.b.InterfaceC0539b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f54241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f54242b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f54242b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0539b
    @h1
    public JSONObject a() {
        return this.f54241a;
    }

    public void b() {
        this.f54242b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0539b
    @h1
    public void a(JSONObject jSONObject) {
        this.f54241a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f54242b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f54242b.b(new e(this, hashSet, jSONObject, j10));
    }
}
