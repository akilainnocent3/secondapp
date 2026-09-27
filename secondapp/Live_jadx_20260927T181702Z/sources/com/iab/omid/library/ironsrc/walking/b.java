package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0516b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f53524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f53525b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f53525b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0516b
    @h1
    public JSONObject a() {
        return this.f53524a;
    }

    public void b() {
        this.f53525b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0516b
    @h1
    public void a(JSONObject jSONObject) {
        this.f53524a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53525b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f53525b.b(new e(this, hashSet, jSONObject, j10));
    }
}
