package com.iab.omid.library.prebidorg.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zz extends zr {

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    protected final HashSet f53780zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    protected final JSONObject f53781zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    protected final long f53782zu;

    public zz(zr.InterfaceC0523zr interfaceC0523zr, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0523zr);
        this.f53780zs = new HashSet(hashSet);
        this.f53781zt = jSONObject;
        this.f53782zu = j10;
    }
}
