package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.async.d;
import com.iab.omid.library.fyber.walking.async.e;
import com.iab.omid.library.fyber.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.fyber.walking.async.b.InterfaceC0507b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f53248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.async.c f53249b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.f53249b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0507b
    @h1
    public JSONObject a() {
        return this.f53248a;
    }

    public void b() {
        this.f53249b.b(new d(this));
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0507b
    @h1
    public void a(JSONObject jSONObject) {
        this.f53248a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53249b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53249b.b(new e(this, hashSet, jSONObject, j10));
    }
}
