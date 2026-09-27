package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0498b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f52972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f52973b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f52973b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0498b
    @h1
    public JSONObject a() {
        return this.f52972a;
    }

    public void b() {
        this.f52973b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0498b
    @h1
    public void a(JSONObject jSONObject) {
        this.f52972a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52973b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52973b.b(new e(this, hashSet, jSONObject, j10));
    }
}
