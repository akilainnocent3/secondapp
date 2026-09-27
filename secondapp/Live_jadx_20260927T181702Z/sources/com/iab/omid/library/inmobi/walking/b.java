package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.inmobi.walking.async.b.InterfaceC0512b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f53389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f53390b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f53390b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0512b
    @h1
    public JSONObject a() {
        return this.f53389a;
    }

    public void b() {
        this.f53390b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0512b
    @h1
    public void a(JSONObject jSONObject) {
        this.f53389a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53390b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53390b.b(new e(this, hashSet, jSONObject, j10));
    }
}
