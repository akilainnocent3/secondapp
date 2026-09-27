package com.iab.omid.library.prebidorg.walking;

import com.iab.omid.library.prebidorg.walking.async.zv;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zt implements com.iab.omid.library.prebidorg.walking.async.zr.InterfaceC0523zr {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final com.iab.omid.library.prebidorg.walking.async.zs f53802zr;
    private JSONObject zz;

    public zt(com.iab.omid.library.prebidorg.walking.async.zs zsVar) {
        this.f53802zr = zsVar;
    }

    public void zr() {
        this.f53802zr.zr(new com.iab.omid.library.prebidorg.walking.async.zt(this));
    }

    @Override // com.iab.omid.library.prebidorg.walking.async.zr.InterfaceC0523zr
    public JSONObject zz() {
        return this.zz;
    }

    public void zr(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f53802zr.zr(new zv(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.prebidorg.walking.async.zr.InterfaceC0523zr
    public void zz(JSONObject jSONObject) {
        this.zz = jSONObject;
    }

    public void zz(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f53802zr.zr(new com.iab.omid.library.prebidorg.walking.async.zu(this, hashSet, jSONObject, j10));
    }
}
