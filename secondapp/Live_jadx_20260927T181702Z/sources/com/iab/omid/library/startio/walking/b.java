package com.iab.omid.library.startio.walking;

import com.iab.omid.library.startio.walking.async.d;
import com.iab.omid.library.startio.walking.async.e;
import com.iab.omid.library.startio.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.startio.walking.async.b.InterfaceC0530b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f53971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.startio.walking.async.c f53972b;

    public b(com.iab.omid.library.startio.walking.async.c cVar) {
        this.f53972b = cVar;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0530b
    public JSONObject a() {
        return this.f53971a;
    }

    public void b() {
        this.f53972b.b(new d(this));
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0530b
    public void a(JSONObject jSONObject) {
        this.f53971a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f53972b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f53972b.b(new e(this, hashSet, jSONObject, j10));
    }
}
