package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0520b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f53659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f53660b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f53660b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0520b
    @h1
    public JSONObject a() {
        return this.f53659a;
    }

    public void b() {
        this.f53660b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0520b
    @h1
    public void a(JSONObject jSONObject) {
        this.f53659a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53660b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53660b.b(new e(this, hashSet, jSONObject, j10));
    }
}
