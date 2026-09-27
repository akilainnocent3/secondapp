package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import k.h1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.unity3d.walking.async.b.InterfaceC0534b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f54100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f54101b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f54101b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0534b
    @h1
    public JSONObject a() {
        return this.f54100a;
    }

    public void b() {
        this.f54101b.b(new d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0534b
    @h1
    public void a(JSONObject jSONObject) {
        this.f54100a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f54101b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f54101b.b(new e(this, hashSet, jSONObject, j10));
    }
}
