package com.mbridge.msdk.tracker;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f70458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.t.a f70459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v.b<T> f70460y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f70461z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public com.mbridge.msdk.tracker.network.v.b<T> C() {
        return this.f70460y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", b0.b.f20456k);
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f70458w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.t.a l() {
        return this.f70459x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f70461z = wVar;
    }

    public void a(com.mbridge.msdk.tracker.network.t.a aVar) {
        this.f70459x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f70458w = map;
    }

    public void a(com.mbridge.msdk.tracker.network.v.b<T> bVar) {
        this.f70460y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f70461z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        com.mbridge.msdk.tracker.network.v.b<T> bVarC = C();
        this.f70460y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
