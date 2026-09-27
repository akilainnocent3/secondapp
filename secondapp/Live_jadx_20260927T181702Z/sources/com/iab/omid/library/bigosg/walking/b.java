package com.iab.omid.library.bigosg.walking;

import android.support.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.bigosg.walking.a.b.InterfaceC0494b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f52843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.walking.a.c f52844b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.f52844b = cVar;
    }

    public void a() {
        this.f52844b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0494b
    @VisibleForTesting
    public JSONObject b() {
        return this.f52843a;
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0494b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f52843a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52844b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f52844b.b(new f(this, hashSet, jSONObject, j10));
    }
}
